package com.water.repository;

import com.water.model.UserStat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.List;

public interface ExcelRepository extends JpaRepository<UserStat, Long> {

    @Query(value = "select stat from UserStat stat where stat.user.id = :userId and stat.day >= :startDate and stat.day <= :endDate")
    List<UserStat> findAllByUserBetweenPeriod(@Param("userId") Long userId, @Param("startDate") Date startDate, @Param("endDate") Date endDate);
}
