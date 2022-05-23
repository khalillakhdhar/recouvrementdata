package com.demo.controller.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.model.User;
import com.demo.model.repository.UserRepository;

@Service
public class UserServiceImplement implements UserInterfaceService {
@Autowired
UserRepository userRepository;
	@Override
	public User addOneUser(User user) {
		// TODO Auto-generated method stub
		return userRepository.save(user);
	}

	@Override
	public List<User> findUsers() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

	@Override
	public Optional<User> findOneUser(String id) {
		// TODO Auto-generated method stub
		return userRepository.findById(id);
	}

	@Override
	public void deleteUser(String id) {
		// TODO Auto-generated method stub
		userRepository.deleteById(id);
	}

}
