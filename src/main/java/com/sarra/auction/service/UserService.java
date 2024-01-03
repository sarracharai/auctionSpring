package com.sarra.auction.service;

import java.util.List;

import com.sarra.auction.entities.User;

public interface UserService {
	 	User getUserById(Long userId);
	    List<User> getAllUsers();
	    User createUser(User user);
	   // User updateUser(Long userId, User user);
	   // void deleteUser(Long userId);
		User getUser(Long id);
		//User updateUser(User user);
		//void deleteUserById(Long id);
	

}
