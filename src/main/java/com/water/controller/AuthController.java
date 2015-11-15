package com.water.controller;

import com.water.model.Bottle;
import com.water.service.UserService;
import com.water.util.form.UserRegistrationForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;
import java.util.List;

@Controller
public class AuthController {

    @Autowired
    private UserService userService;

    @RequestMapping("/guest")
    public String getHello(@RequestParam(value = "error", required = false) Boolean error, Model model) {
//            List<Bottle> bottles = bottleRepository.findAll();
//            model.addAttribute("bottles", bottles);
            model.addAttribute("userform", new UserRegistrationForm());
            if (Boolean.TRUE.equals(error)) {
                model.addAttribute("error", error);
            }
            return "guest";
    }

    @RequestMapping("/login")
    public String getLoginPage(@RequestParam(value = "error", required = false) Boolean error, Model model) {
        if (Boolean.TRUE.equals(error)) {
            model.addAttribute("error", error);
        }
        return "login";
    }

//    @RequestMapping("/registration")
//    public String getRegistrationPage(Model model) {
//        model.addAttribute("userform", new UserRegistrationForm());
//        return "registration";
//    }

    @RequestMapping(value = "/registration", method = RequestMethod.POST)
    public String processRegistrationPage(@ModelAttribute("userform") @Valid UserRegistrationForm userRegistrationForm,
                                          BindingResult bindingResult,
                                          Model model) {
        //validator.validate(userRegistrationForm, bindingResult);
        if (bindingResult.hasErrors()) {
            model.addAttribute("errorReg",1);
            return "index";
        }
        userService.saveNewUser(userRegistrationForm);
        return "redirect:/index";
    }

    /*
    @RequestMapping("/registration-client")
    public String getClientRegistrationPage(Model model) {
        model.addAttribute("clientform", new ClientRegistrationForm());
        return "registration-client";
    }

    @RequestMapping("/registration-provider")
    public String getProviderRegistrationPage(Model model) {
        model.addAttribute("providerform", new ProviderRegistrationForm());
        return "registration-provider";
    }

    @RequestMapping(name = "/registration-client", method = RequestMethod.POST)
    public String processClientRegistrationPage(@ModelAttribute("clientform") @Valid ClientRegistrationForm clientRegistrationForm,
                                                BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "registration-client";
        }
        clientService.saveNewClient(clientRegistrationForm);
        return "redirect:/login";
    }
    */
}
