package com.water.service.impl;

import com.water.model.Cooperation;
import com.water.model.User;
import com.water.repository.CooperationRepository;
import com.water.repository.UserRepository;
import com.water.service.UserService;
import com.water.util.UserRegFormToUserTransf;
import com.water.util.form.UserRegistrationForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by aleksandrpliskin on 14.11.15.
 */
@Service
@Transactional
public class UserServiceimpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private CooperationRepository cooperationRepository;

    @Override
    public List<User> getClients(User provider) {
        List<Cooperation> cooperations = cooperationRepository.findByProvider(provider);
        List<User> clients = new ArrayList<>();
        for (Cooperation c : cooperations) {
            clients.add(c.getClient());
        }
        return clients;
    }

    @Override
    public User getProvider(User client) {
        Cooperation cooperation = cooperationRepository.findByClient(client);
        return cooperation!=null? cooperation.getProvider() : null;
    }

    @Override
    public User getByName(String name) {
        return null;
    }

    @Override
    public void saveNewUser(UserRegistrationForm form) {
        userRepository.save(UserRegFormToUserTransf.transform(form));
    }
}
