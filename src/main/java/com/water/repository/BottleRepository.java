package com.water.repository;

import com.water.model.Bottle;
import com.water.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BottleRepository extends JpaRepository<Bottle, Long> {


    List<Bottle> findByUser(User user);

}
