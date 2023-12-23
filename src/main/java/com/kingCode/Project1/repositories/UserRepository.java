package com.kingCode.Project1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kingCode.Project1.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
