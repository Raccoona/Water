package com.water.service.impl;

import com.water.model.Bottle;
import com.water.model.User;
import com.water.repository.BottleRepository;
import com.water.service.BottleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;


@Service
@Transactional
public class BottleServiceImpl implements BottleService {

    @Autowired
    private BottleRepository bottleRepository;

    @Override
    public List<Bottle> getBottlersByUser(User user) {
        return bottleRepository.findByUser(user);
    }
}
