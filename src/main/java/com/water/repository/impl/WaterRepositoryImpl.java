package com.water.repository.impl;

import com.water.model.WaterRequest;
import com.water.model.enums.WaterRequestStatus;
import com.water.repository.WaterRepositoryCustom;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.Date;

@Transactional
public class WaterRepositoryImpl implements WaterRepositoryCustom {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void updateRequest(WaterRequest waterRequest, Date date) {
        waterRequest = entityManager.merge(waterRequest);
        waterRequest.setDate(date);
        waterRequest.setStatus(WaterRequestStatus.ACCEPTED);
    }
}
