package com.water.repository;

import com.water.model.Cooperation;
import com.water.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CooperationRepository extends JpaRepository<Cooperation, Long> {

    public List<Cooperation> findByProvider(User provider);

    public List<Coope>

}
