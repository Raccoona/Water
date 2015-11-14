package com.water.controller;


import com.water.model.User;
import com.water.service.ExcelService;
import com.water.util.Security;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class ExcelController {

    @Autowired
    ExcelService excelService;

    @RequestMapping(value = "/excel", method = RequestMethod.GET)
    public String goToExcel(ModelMap map) {

        User user = Security.getCurrentUser();
        map.addAttribute("user", user);
        return "excelPage";
    }

    @RequestMapping(value = "/excel/{user_id}_{begin_date}_{end_date}", method = RequestMethod.POST)
    public void getExcel(@PathVariable("user_id") Long id,
                         @PathVariable("begin_date") String beginDate,
                         @PathVariable("end_date") String endDate) throws ParseException {
        DateFormat format = new SimpleDateFormat("yyyy-mm-dd");
        Date beginDateD = format.parse(beginDate);
        Date endDateD = format.parse(endDate);
        excelService.getExcel(id, beginDateD, endDateD);
    }
}
