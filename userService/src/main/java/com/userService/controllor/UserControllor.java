package com.userService.controllor;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.userService.modal.User;
import com.userService.services.UserService;

@RestController
public class UserControllor {
	@Autowired
	private UserService userService;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/users/{uuid}")
	public ResponseEntity<User> getUser(@PathVariable Long uuid){
		User user = userService.getUser(uuid);
		user.setContacts(new ArrayList<>()); // resetting the contact list to make sure our other api is working
		List contacts = this.restTemplate.getForObject("http://contact-service/contact/user/"+uuid, List.class);
		user.setContacts(contacts);
		System.out.println(contacts);
		return new ResponseEntity<User>(user,HttpStatus.OK);
	}
	
	@PostMapping("/users")
	public ResponseEntity<User> addUser(@RequestBody User user){
		return new ResponseEntity<User>(userService.addUser(user), HttpStatus.CREATED);
	}
}
