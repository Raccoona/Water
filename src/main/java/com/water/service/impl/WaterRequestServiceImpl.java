package com.water.service.impl;

import com.water.model.Bottle;
import com.water.model.User;
import com.water.model.WaterRequest;
import com.water.model.enums.WaterRequestStatus;
import com.water.repository.BottleRepository;
import com.water.repository.WaterRequestRepository;
import com.water.service.UserService;
import com.water.service.WaterRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Date;
import java.util.List;

@Transactional
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
        request.setBottle(bottle);
        request.setFrom(from);
        request.setTo(userService.getProvider(from.getId()));
        request.setStatus(WaterRequestStatus.NEW);
        waterRequestRepository.save(request);
    }

    @Override
    public void removeRequest(Long bottleId) {
        Bottle bottle = bottleRepository.findOne(bottleId);
        List<WaterRequest> waterRequests = waterRequestRepository.findByBottle(bottle);
        for (WaterRequest request : waterRequests) {
            request.setStatus(WaterRequestStatus.CLOSED);
            waterRequestRepository.save(request);
        }
    }

    @Override
    public void updateRequest(Long id, Date date) {
        WaterRequest waterRequest = waterRequestRepository.findOne(id);
        waterRequest.setStatus(WaterRequestStatus.ACCEPTED);
        waterRequest.setDate(date);
        waterRequestRepository.save(waterRequest);
    }
}
