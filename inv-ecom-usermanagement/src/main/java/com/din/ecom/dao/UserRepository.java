package com.din.ecom.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.din.ecom.domain.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
