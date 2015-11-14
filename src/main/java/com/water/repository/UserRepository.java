package com.water.repository;

import com.water.model.User;
import com.water.model.enums.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User findByLogin(String name);

    List<User> findByUserRole(UserRole userRole);

}
