package com.certiware.dbms.dao.user;

import com.certiware.dbms.model.user.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
    
}
