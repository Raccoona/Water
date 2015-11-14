package com.water.repository;

import com.water.model.WaterRequest;

import java.util.Date;

public interface WaterRepositoryCustom {

    public void updateRequest(WaterRequest waterRequest, Date date);

}
