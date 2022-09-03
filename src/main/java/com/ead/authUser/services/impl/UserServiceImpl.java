package com.ead.authUser.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ead.authUser.models.UserModel;
import com.ead.authUser.repositorys.UserRepository;
import com.ead.authUser.services.UserService;

@Service
public final class UserServiceImpl implements UserService{

	@Autowired
	UserRepository userRepository;
	
	@Override
	public boolean existsUserByUserName(String userName) {
		// TODO Auto-generated method stub
		
		return userRepository.existsUserByUserName(userName);
	}

	@Override
	public boolean existsByEmail(String email) {
		// TODO Auto-generated method stub
		
		return userRepository.existsByEmail(email);
	}

	@Override
	public void save(UserModel userModel) {
		// TODO Auto-generated method stub
		
		userRepository.save(userModel);
	}

	@Override
	public Optional<List<UserModel>> findAll() {
		// TODO Auto-generated method stub
		
		return Optional.of(userRepository.findAll());
	}

}
