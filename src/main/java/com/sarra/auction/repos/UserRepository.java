package com.sarra.auction.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sarra.auction.entities.User;

public interface UserRepository extends JpaRepository <User, Long>{
	

	User findByUsername(String username);
}
