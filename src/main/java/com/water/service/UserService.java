package com.water.service;

import com.water.model.User;
import com.water.util.form.UserRegistrationForm;

/**
 * Created by aleksandrpliskin on 14.11.15.
 */
public interface UserService {

    User getByName(String name);

    void saveNewUser(UserRegistrationForm form);

}
