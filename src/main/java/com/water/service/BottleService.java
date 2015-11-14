package com.water.service;

import com.water.model.Bottle;
import com.water.model.User;

import java.util.List;

/**
 * Created by aleksandrpliskin on 14.11.15.
 */
public interface BottleService {

    List<Bottle> getBottlersByUser(User user);

}
