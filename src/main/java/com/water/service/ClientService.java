package com.water.service;

import com.water.model.Client;
import com.water.model.Provider;

import java.util.List;

/**
 * Created by aleksandrpliskin on 14.11.15.
 */
public interface ClientService {

    Client getClientByName(String client);

    Client getClientByAdress(String adress);

    List<Client> getClientsByProvider(String provider);

}
