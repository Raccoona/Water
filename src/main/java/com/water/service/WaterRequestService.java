package com.water.service;

import java.util.Date;

/**
 * Created by Maxim Ignatiev on 14.11.15.
 */
public interface WaterRequestService {

    void addRequest(Long bottleId);

    void removeRequest(Long bottleId);

    void updateRequest(Long id, Date date);
}
