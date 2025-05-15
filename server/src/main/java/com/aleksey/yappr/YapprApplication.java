package com.aleksey.yappr;

import com.aleksey.yappr.entity.User;
import com.aleksey.yappr.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;

@SpringBootApplication
public class YapprApplication implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(YapprApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		userRepository.deleteAll();

		// Create test users
		userRepository.save(new User("user1", "pw1", new ArrayList<>()));
		userRepository.save(new User("user2", "pw2", new ArrayList<>()));

		// fetch all users
		System.out.println("Users found with findAll():");
		for(User user: userRepository.findAll()) {
			System.out.println(user);
		}

		System.out.println("Fetch user1 individually");
		System.out.println(userRepository.findByUsername("user1"));

	}

}
