package com.water.controller;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import com.water.model.Bottle;
import com.water.model.User;
import com.water.model.WaterRequest;
import com.water.model.enums.WaterRequestStatus;
import com.water.repository.WaterRequestRepository;
import com.water.service.BottleService;
import com.water.service.UserService;
import com.water.service.WaterRequestService;
import com.water.util.Security;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.*;


@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private BottleService bottleService;

    @Autowired
    private UserService userService;

    @Autowired
    WaterRequestService waterRequestService;

    @Autowired
    private WaterRequestRepository waterRequestRepository;

    @RequestMapping("/main")
    public String getMainPage(Model model) {
        model.addAttribute("user", Security.getCurrentUser());
        List<WaterRequest> requests = waterRequestRepository.findByFrom(Security.getCurrentUser());
        Collections.sort(requests, new Comparator<WaterRequest>() {
            @Override
            public int compare(WaterRequest o1, WaterRequest o2) {
                List<WaterRequestStatus> statuses = new ArrayList<WaterRequestStatus>() {{
                    add(WaterRequestStatus.NEW);
                    add(WaterRequestStatus.ACCEPTED);
                    add(WaterRequestStatus.CLOSED);
                }};
                return statuses.indexOf(o1.getStatus()) - statuses.indexOf(o2.getStatus());
            }
        });
        model.addAttribute("waterRequests", requests);
        return "main";
    }

    @RequestMapping("/home")
    public String getHomePage(Model model) {
        User user = Security.getCurrentUser();
        model.addAttribute("user", user);
        return "home";
    }

    @RequestMapping(name = "/request/update")
    public String updateWaterRequest(@RequestParam("waterReqId") Long waterReqId, @RequestParam("date") Date date) {
        waterRequestService.updateRequest(waterReqId, date);

        try {
            HttpResponse<JsonNode> jsonResponse = Unirest.post("http://localhost:20000/date")
                    .header("accept", "application/json")
                    .body(date)
                    .asJson();
            System.out.println(jsonResponse.getStatusText());
        } catch (UnirestException e) {
            e.printStackTrace();
        }

        return "redirect:/user/home";
    }

    @RequestMapping("/clients/get")
    public String getClients(Model model) {
        User user = Security.getCurrentUser();
        List<User> clients = userService.getClients(user);
        model.addAttribute("clients", clients);
        model.addAttribute("user", user);
        return "clients";
    }

    @RequestMapping("/client")
    public String getClientInfo(@RequestParam("clientId") String clientId, Model model) {
        List<Bottle> bottles = bottleService.getBottlersByUser(userService.getClient(Long.parseLong(clientId)));
        model.addAttribute("user", Security.getCurrentUser());
        model.addAttribute("bottles", bottles);
        return "client";
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
