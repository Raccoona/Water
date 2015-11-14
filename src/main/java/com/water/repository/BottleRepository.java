package com.water.repository;

import com.water.model.Bottle;
import com.water.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by Maxim Ignatiev on 14.11.15.
 */
public interface BottleRepository extends JpaRepository<Bottle, Long> {


    List<Bottle> findByUser(User user);

}
