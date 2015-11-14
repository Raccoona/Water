package com.water.controller;

import com.water.model.Bottle;
import com.water.repository.BottleRepository;
import com.water.service.WaterRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.List;

@Controller
public class IndexController {

    @Autowired
    BottleRepository bottleRepository;

    @Autowired
    WaterRequestService waterRequestService;

    @RequestMapping("/")
    public String index(Model model) {
        List<Bottle> bottles = bottleRepository.findAll();
        model.addAttribute("bottles", bottles);
        return "index";
    }

    @RequestMapping(value = "/water_request")
    @ResponseStatus(HttpStatus.OK)
    public void addRequest() {
        waterRequestService.addRequest(3L);
    }

    @RequestMapping(value = "/remove_request")
    @ResponseStatus(HttpStatus.OK)
    public void removeRequest() {
        waterRequestService.removeRequest(3L);
    }

}
