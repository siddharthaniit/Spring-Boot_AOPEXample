package com.example.service;

import org.springframework.stereotype.Service;

import com.example.model.User;

@Service
public class UserService {
	
	User user1 = new User();

	public User save(int id,String name) {
		
		user1.setId(id);;
		user1.setName(name);
		//user1.setName(email);
		//user1.setPassword(password);
		return user1;
	}

	public User save1(int id, String email,String name) {
		User user2 = new User();

		user2.setId(1);
		user2.setName(name);
		user2.setEmail(email);
		
		return user2;
	}

	public User save2(User user) {
		
		User user3 = new User();
		user3.setId(user.getId());
		user3.setName(user.getName());
		user3.setEmail(user.getEmail());
		user3.setPassword(user.getPassword());
		return user3;
	}

	

	
}
