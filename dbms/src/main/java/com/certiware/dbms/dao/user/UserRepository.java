package com.certiware.dbms.repository;

import com.certiware.dbms.model.user;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
    
}
