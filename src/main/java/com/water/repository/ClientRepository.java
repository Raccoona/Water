package com.water.repository;

import com.water.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long>{

    Client findByLogin(String name);

    Client findByAddress(String address);

    List<Client> findByProvider(String provider);

}
