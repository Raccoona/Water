package com.water.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AuthController {

    @RequestMapping("/")
    public String getHello() {
        return "hello";
    }

}
