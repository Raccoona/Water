package com.water.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/home")
    public String getHomePage() {
        return "home";
    }

}
