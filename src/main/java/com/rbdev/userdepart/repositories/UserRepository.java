package com.rbdev.userdepart.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rbdev.userdepart.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
