package com.water.controller;

import com.water.model.User;
import com.water.service.UserService;
import com.water.util.Security;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;


@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/main")
    public String getMainPage() {
        return "main";
    }

    @RequestMapping("/home")
    @ResponseBody
    public ModelAndView getHomePage(Model model) {
        User user = Security.getCurrentUser();
        model.addAttribute("user", user);
        return new ModelAndView("home");
    }

    @RequestMapping("/clients/get")
    @ResponseBody
    public ModelAndView getClients(Model model) {
        User user = Security.getCurrentUser();
        List<User> clients = userService.getClients(user);
        model.addAttribute("clients", clients);
        return new ModelAndView("clients");
    }

    @RequestMapping("/providers/get")
    @ResponseBody
    public ModelAndView getProvider(Model model) {
        User user = Security.getCurrentUser();
        User provider = userService.getProvider(user);
        model.addAttribute("provider", provider);
        return new ModelAndView("provider");
    }

    @RequestMapping(name = "/recJson", method = RequestMethod.POST)
    @ResponseBody
    public void getJson(@RequestBody(required = false) Test s) {
        String str = s.toString();
        System.out.println("TEST");
        System.out.println(str);
    }

    class Test {
        private Object[] ids;

        public Object[] getIds() {
            return ids;
        }

        public void setIds(Object[] ids) {
            this.ids = ids;
        }
    }


}
