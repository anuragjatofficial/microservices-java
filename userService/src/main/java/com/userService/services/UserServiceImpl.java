package com.userService.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.userService.exceptions.InvalidUserException;
import com.userService.modal.User;
import com.userService.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public User getUser(Long id) {
		
		if (id == null)
			throw new InvalidUserException("please provide the correct id");
		
		return userRepository
				.findById(id)
				.orElseThrow(
						() -> new InvalidUserException("Can't find any user with id " + id)
				);
	}

	@Override
	public User addUser(User user) {
		if(user == null)
			throw new InvalidUserException("please provide the correct id");
		return userRepository.save(user);
	}

}
