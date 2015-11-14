package com.water.service.impl;

import com.water.model.Client;
import com.water.repository.ClientRepository;
import com.water.repository.ProviderRepository;
import com.water.service.ClientService;
import com.water.util.ClientRegFormToClientTrans;
import com.water.util.form.ClientRegistrationForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class ClientServiceImpl implements ClientService {

    @Autowired
    private ProviderRepository providerRepository;

    @Autowired
    private ClientRepository clientRepository;


    @Override
    public void saveNewClient(ClientRegistrationForm form) {
        clientRepository.save(ClientRegFormToClientTrans.transform(form));
    }

    @Override
    public Client getClientByName(String client) {
        return clientRepository.findByLogin(client);
    }

    @Override
    public Client getClientByAdress(String address) {
        return clientRepository.findByAddress(address);
    }

    @Override
    public List<Client> getClientsByProvider(String provider) {
        return clientRepository.findByProvider(provider);
    }
}
