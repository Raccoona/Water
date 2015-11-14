package com.water.repository;


import com.water.model.User;
import com.water.model.WaterRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WaterRequestRepository extends JpaRepository<WaterRequest, Long> {

    List<WaterRequest> findByFrom(User from);

    List<WaterRequest> findByTo(User from);

}
