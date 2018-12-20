package com.jpatuto.demo.Repositories;

import com.jpatuto.demo.Entities.JwtUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JwtUserRepository extends JpaRepository<JwtUser, Integer> {

    JwtUser findByUsername(String username);
    boolean existsByUsername(String username);
}
