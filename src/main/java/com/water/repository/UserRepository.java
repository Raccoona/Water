package com.water.repository;

import com.water.model.Client;
import com.water.model.User;

import java.util.List;

/**
 * Created by aleksandrpliskin on 14.11.15.
 */
public interface UserRepository {

    User findByLogin(String name);

    User findByAddress(String address);

    List<User> findByProvider(String provider);

    User findByClient(String client);

}
