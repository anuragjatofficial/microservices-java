package com.userService.services;

import com.userService.modal.User;

public interface UserService {
	User getUser(Long id);

	User addUser(User user);
}
