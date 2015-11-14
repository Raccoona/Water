package com.water.repository;

import com.water.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long>{

    Client findByName(String name);

    Client findByAdress(String adress);

    List<Client> findByProvider(String provider);

}
