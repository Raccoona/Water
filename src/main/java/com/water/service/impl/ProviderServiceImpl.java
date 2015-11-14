package com.water.service.impl;


import com.water.model.Provider;
import com.water.repository.ClientRepository;
import com.water.repository.ProviderRepository;
import com.water.service.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;


@Service
@Transactional
public class ProviderServiceImpl implements ProviderService {

    @Autowired
    private ProviderRepository providerRepository;

    @Autowired
    private ClientRepository clientRepository;

    @Override
    public Provider getByName(String provider) {
        return providerRepository.findByName(provider);
    }
}
