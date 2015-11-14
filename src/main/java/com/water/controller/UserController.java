package com.water.controller;

import com.water.model.User;
import com.water.repository.WaterRequestRepository;
import com.water.service.UserService;
import com.water.util.Security;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    WaterRequestRepository waterRequestRepository;

    @RequestMapping("/main")
    public String getMainPage(Model model) {
        model.addAttribute("user", Security.getCurrentUser());
        model.addAttribute("waterRequests", waterRequestRepository.findByFrom(Security.getCurrentUser()));
        return "main";
    }

    @RequestMapping("/home")
    public String getHomePage(Model model) {
        User user = Security.getCurrentUser();
        model.addAttribute("user", user);
        return "home";
    }

    @RequestMapping("/clients/get")
    public String getClients(Model model) {
        User user = Security.getCurrentUser();
        List<User> clients = userService.getClients(user);
        model.addAttribute("clients", clients);
        return "clients";
    }

    @RequestMapping("/client")
    public String getClientInfo(@RequestParam("clientId") String clientId,  Model model) {
        return "";
    }

    @RequestMapping("/providers/get")
    public String getProvider(Model model) {
        User user = Security.getCurrentUser();
        User provider = userService.getProvider(user);
        model.addAttribute("provider", provider);
        model.addAttribute("user", user);
        return "provider";
    }

    @RequestMapping("/providers/getAll")
    public String getProviders(Model model) {
        User user = Security.getCurrentUser();
        List<User> providers = userService.getProviders(user);
        return "";
    }

//    @RequestMapping(name = "/providers/add", method = RequestMethod.POST)
//    public String addProvider(@RequestParam("providerId") String providerId, Model model) {
//        User client = Security.getCurrentUser();
//        User provider = userService.getProvider(Long.parseLong(Parser.parseId(providerId)));
//        userService.addProvider(client, provider);
//        return "";
//    }

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
