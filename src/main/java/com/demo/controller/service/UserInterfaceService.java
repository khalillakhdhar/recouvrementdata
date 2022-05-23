package com.demo.controller.service;

import java.util.List;
import java.util.Optional;

import com.demo.model.User;

public interface UserInterfaceService {
	public User addOneUser(User user);
	public List<User> findUsers();
	public Optional<User> findOneUser(String id);
	public void deleteUser(String id);

}
