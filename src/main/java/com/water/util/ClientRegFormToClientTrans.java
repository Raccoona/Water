package com.water.util;

import com.water.model.Client;
import com.water.model.enums.UserRole;
import com.water.util.form.ClientRegistrationForm;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class ClientRegFormToClientTrans {

    static BCryptPasswordEncoder encoder;

    public static Client transform(ClientRegistrationForm form) {
        Client client = new Client();
        client.setAddress(form.getAddress());
        client.setLogin(form.getLogin());
        client.setUserRole(UserRole.ROLE_CLIENT);
        client.setPassword(encoder.encode(form.getPassword()));
        return client;
    }

}
