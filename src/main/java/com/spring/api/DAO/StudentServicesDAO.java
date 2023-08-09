package com.spring.api.DAO;

import com.spring.api.entities.Student;
import com.spring.api.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface StudentServicesDAO extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
}
