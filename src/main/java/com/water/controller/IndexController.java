package com.water.controller;

import com.water.model.Bottle;
import com.water.repository.BottleRepository;
import com.water.service.WaterRequestService;
import com.water.util.form.UserRegistrationForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
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
    public String index(@RequestParam(value = "error", required = false) Boolean error, Model model) {
        List<Bottle> bottles = bottleRepository.findAll();
        model.addAttribute("bottles", bottles);
        model.addAttribute("userform", new UserRegistrationForm());
        if (Boolean.TRUE.equals(error)) {
            model.addAttribute("error", error);
        }
        return "index";
    }

    @RequestMapping(value = "/water_request", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.OK)
    public void addRequest(@RequestParam("id") Long bottleId) {
        waterRequestService.addRequest(bottleId);
    }

    @RequestMapping(value = "/remove_request", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.OK)
    public void removeRequest(@RequestParam("id") Long bottleId) {
        waterRequestService.removeRequest(bottleId);
    }

}
