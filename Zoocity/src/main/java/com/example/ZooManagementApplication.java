package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.model.User;
import com.example.repository.UserRepository;

@SpringBootApplication
public class ZooManagementApplication implements CommandLineRunner {
	
	@Autowired
	private UserRepository userRepo;
	
	public static void main(String[] args) {
		SpringApplication.run(ZooManagementApplication.class, args);
		System.out.println("zoo management system");
	}

	@Override
	public void run(String... args) throws Exception {
		User user = new User(0,"name","email","password");
		userRepo.save(user);
	}
	

}
