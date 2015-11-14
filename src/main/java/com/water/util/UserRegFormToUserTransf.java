package com.water.util;

import com.water.model.User;
import com.water.model.enums.UserRole;
import com.water.util.form.UserRegistrationForm;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class UserRegFormToUserTransf {

    static BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

    public static User transform(UserRegistrationForm userRegistrationForm) {
        User user = new User();
        user.setLogin(userRegistrationForm.getLogin());
        user.setPassword(encoder.encode(userRegistrationForm.getPassword()));
        user.setUserRole(UserRole.getUserRole(userRegistrationForm.getUserRole()));
        user.setName(userRegistrationForm.getName());
        user.setCity(userRegistrationForm.getCity());
        user.setMobilePhone(userRegistrationForm.getMobilePhone());
        user.setEmail(userRegistrationForm.getEmail());
        return user;
    }

}
