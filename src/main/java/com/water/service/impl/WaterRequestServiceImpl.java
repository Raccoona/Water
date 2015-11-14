package com.water.service.impl;

import com.water.model.Bottle;
import com.water.model.User;
import com.water.model.WaterRequest;
import com.water.model.enums.WaterRequestStatus;
import com.water.repository.BottleRepository;
import com.water.repository.WaterRequestRepository;
import com.water.service.ProviderService;
import com.water.service.UserService;
import com.water.service.WaterRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WaterRequestServiceImpl implements WaterRequestService {

    @Autowired
    BottleRepository bottleRepository;

    @Autowired
    WaterRequestRepository waterRequestRepository;

    @Autowired
    UserService userService;

    @Override
    public void addRequest(Long bottleId) {
        Bottle bottle = bottleRepository.findOne(bottleId);
        WaterRequest request = new WaterRequest();
        User from = bottle.getUser();
        request.setFrom(from);
        request.setTo(userService.getProvider(from.getId()));
        request.setStatus(WaterRequestStatus.NEW);
        waterRequestRepository.save(request);
    }
}