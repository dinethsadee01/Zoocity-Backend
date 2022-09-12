package com.example.repository;


import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;

import com.example.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
	
	abstract public User findByUsernameAndPassword(String username, String password);
	
	abstract public User findByEmailAndPassword(String username, String password);
	
	abstract public User findByEmail(String username);
	
	abstract public User findByUsername(String username);
	
	abstract public User findByPassword(String password);

}