package com.water.service.impl;

import com.water.model.Client;
import com.water.repository.ClientRepository;
import com.water.repository.ProviderRepository;
import com.water.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class ClientServiceImpl implements ClientService {

    @Qualifier("providerRepository")
    @Autowired
    private ProviderRepository providerRepository;

    @Qualifier("clientRepository")
    @Autowired
    private ClientRepository clientRepository;


    @Override
    public Client getClientByName(String client) {
        return clientRepository.findByName(client);
    }

    @Override
    public Client getClientByAdress(String adress) {
        return clientRepository.findByAdress(adress);
    }

    @Override
    public List<Client> getClientsByProvider(String provider) {
        return clientRepository.findByProvider(provider);
    }
}
