package com.pradeep.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pradeep.demo.model.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
