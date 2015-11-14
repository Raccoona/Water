package com.water.service;

import com.water.model.User;
import com.water.util.ClientRegistrationForm;

import java.util.List;

/**
 * Created by aleksandrpliskin on 14.11.15.
 */
public interface UserService {

    User getByName(String name);

    User getByAdress(String adress);

    List<User> getByProvider(String provider);

    User getByClient(String client);

    void saveNewUser(UserRegistrationForm form);

}
