package com.database.db_project.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public List<User> findAll(User entity) {
		return UserRepository.findAll(entity);
	}
	
	public User findOne(User entity) {
		return UserRepository.findOne(entity);
	}
}
