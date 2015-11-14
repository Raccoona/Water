package com.water.service.impl;

import com.water.model.User;
import com.water.repository.UserRepository;
import com.water.service.UserService;
import com.water.util.UserRegFormToUserTransf;
import com.water.util.form.UserRegistrationForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * Created by aleksandrpliskin on 14.11.15.
 */
@Service
@Transactional
public class UserServiceimpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User getByName(String name) {
        return null;
    }

    @Override
    public void saveNewUser(UserRegistrationForm form) {
        userRepository.save(UserRegFormToUserTransf.transform(form));
    }
}