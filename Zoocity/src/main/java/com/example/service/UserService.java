package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.User;
import com.example.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;

	public User login(User user) {
		User user1 = null;
		if (repository.findByUsernameAndPassword(user.getUsername(), user.getPassword()) != null) {
			return repository.findByUsernameAndPassword(user.getUsername(), user.getPassword());
		}else if(repository.findByEmailAndPassword(user.getEmail(), user.getPassword()) != null){
			return repository.findByEmailAndPassword(user.getEmail(), user.getPassword());
		}else {
			return user1;
		}
	}
}