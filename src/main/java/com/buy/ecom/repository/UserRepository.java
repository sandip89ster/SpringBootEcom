package com.buy.ecom.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.buy.ecom.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
