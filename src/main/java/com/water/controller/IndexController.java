package com.water.controller;

import com.water.model.Bottle;
import com.water.repository.BottleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class IndexController {

    @Autowired
    BottleRepository bottleRepository;

    @RequestMapping("/")
    public String index(Model model) {
        List<Bottle> bottles = bottleRepository.findAll();
        model.addAttribute("bottles", bottles);
        return "index";
    }

}
