package com.s502.s502.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.s502.s502.models.UserModel;
import com.s502.s502.services.UserServices;

@RestController
@RequestMapping("/players")
public class UserController {
	
	@Autowired
	UserServices userService;
	
	@PostMapping()
	public ResponseEntity createUser(@RequestBody UserModel user) {
		
		String responseText = userService.verifyUserData(user);
		if(responseText.equals("Created")) {
			userService.createUser(user);
			return (ResponseEntity.status(HttpStatus.OK))
					.body(user);
		}else {
			return (ResponseEntity.status(HttpStatus.BAD_REQUEST))
					.body(responseText);
		}
	}
	
	@GetMapping()
	public ResponseEntity readUsers() {
		ArrayList <UserModel> users;
		users = userService.readUsers();
		if(users != null) {
			return (ResponseEntity.status(HttpStatus.OK))
					.body(users);
		}else {
			return (ResponseEntity.status(HttpStatus.NO_CONTENT))
					.body("No existen usuarios registrados");
		}
	}
	
}
