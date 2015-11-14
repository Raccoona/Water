package com.water.repository;

import com.water.model.UserStat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserStatRepository extends JpaRepository<UserStat, Long> {
}
