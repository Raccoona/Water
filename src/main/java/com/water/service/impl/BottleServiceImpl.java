package com.water.service.impl;

import com.water.model.Bottle;
import com.water.model.User;
import com.water.repository.BottleRepository;
import com.water.service.BottleService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by aleksandrpliskin on 14.11.15.
 */
public class BottleServiceImpl implements BottleService {

    @Autowired
    private BottleRepository bottleRepository;

    @Override
    public List<Bottle> getBottlersByUser(User user) {
        return bottleRepository.findByUser(user);
    }
}
