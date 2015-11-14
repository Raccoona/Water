package com.water.controller;

import com.water.model.Client;
import com.water.model.Provider;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/home")
    public String getHomePage(Model model) {
        Client user1;
        Provider user2;
        try {
            user1 = (Client) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
            model.addAttribute("role", "client");
            model.addAttribute("principal", user1);
        } catch (Exception e) {
            user2 = (Provider) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
            model.addAttribute("role", "provider");
            model.addAttribute("principal", user2);
        }
        return "home";
    }
}
