package com.water.controller;


import com.water.model.User;
import com.water.service.ExcelService;
import com.water.util.Security;
import jxl.write.WriteException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletResponse;
import java.io.*;
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

    @RequestMapping(value = "/excel", method = RequestMethod.POST)
    public void getExcel(@RequestParam("userId") Long id,
                         @RequestParam("begin_date") String beginDate,
                         @RequestParam("end_date") String endDate, HttpServletResponse response) throws ParseException, IOException {
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date beginDateD = format.parse(beginDate);
        Date endDateD = format.parse(endDate);
        try {
            excelService.getExcel(id, beginDateD, endDateD);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (WriteException e) {
            e.printStackTrace();
        }
        File file = new File("C:\\Users\\Aidar_2\\Desktop\\IoT\\Water\\Water\\src\\main\\resources\\users_output.xls");
        InputStream is = new FileInputStream(file);
        response.setContentType("application/octet-stream");
        response.setHeader("Content-Disposition", "attachment; filename=\""
                + file.getName() + "\"");
        OutputStream os = response.getOutputStream();
        byte[] buffer = new byte[1024];
        int len;
        while ((len = is.read(buffer)) != -1) {
            os.write(buffer, 0, len);
        }
        os.flush();
        os.close();
        is.close();
    }
}
