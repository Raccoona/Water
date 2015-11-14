package com.water.service;

import com.water.model.User;
import com.water.util.form.UserRegistrationForm;

import java.util.List;

/**
 * Created by aleksandrpliskin on 14.11.15.
 */
public interface UserService {

    List<User> getClients(User provider);

    User getProvider(User client);

    User getByName(String name);

    void saveNewUser(UserRegistrationForm form);

}
