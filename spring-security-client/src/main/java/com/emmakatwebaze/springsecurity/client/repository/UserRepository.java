package com.emmakatwebaze.springsecurity.client.repository;

import com.emmakatwebaze.springsecurity.client.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
