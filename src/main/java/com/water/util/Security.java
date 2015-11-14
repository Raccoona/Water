package com.water.util;

import com.water.model.User;
import org.springframework.security.core.context.SecurityContextHolder;

public class Security {

    public static User getCurrentUser() {
        return (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
    }

}
