package com.water.repository;


import com.water.model.Bottle;
import com.water.model.User;
import com.water.model.WaterRequest;
import com.water.model.enums.WaterRequestStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WaterRequestRepository extends JpaRepository<WaterRequest, Long> {

    List<WaterRequest> findByFrom(User from);

    List<WaterRequest> findByTo(User from);

    List<WaterRequest> findByBottle(Bottle bottle);

    int countByBottleAndStatus(Bottle bottle, WaterRequestStatus status);

}
