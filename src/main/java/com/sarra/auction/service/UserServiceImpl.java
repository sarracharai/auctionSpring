package com.sarra.auction.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import com.sarra.auction.entities.User;

import com.sarra.auction.repos.UserRepository;

public class UserServiceImpl implements UserService{
	
	@Autowired
	UserRepository userRepository;

	@Override
	public User getUser(Long id) {
		 return userRepository.findById(id).get();
    }
	

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }

  
   //@Override
    //public User updateUser( User user) {
    //	return userRepository.save(user);
   // }
    

   // @Override
   // public void deleteUserById(Long id) {
    //    userRepository.deleteById(id);
   // } 

	@Override
	public User getUserById(Long userId) {
		// TODO Auto-generated method stub
		return null;
	}


	
}