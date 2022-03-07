package com.s502.s502.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.s502.s502.models.UserLoginModel;
import com.s502.s502.models.UserModel;
import com.s502.s502.models.UserModelMongo;
import com.s502.s502.services.JWTService;
import com.s502.s502.services.UserServiceMongo;
import com.s502.s502.services.UserServices;

@RestController
@RequestMapping("/login")
public class UserLoginController {
	
	@Autowired 
	JWTService jwtService;
	@Autowired
	//UserServices userService;
	UserServiceMongo userService;
	
	@PostMapping()
	public ResponseEntity login(@RequestParam("user") String username) {
		try {
			//UserModel readUser = userService.findByEmail(username);
			UserModelMongo readUser = userService.findByEmail(username);
			String token = jwtService.getJWTToken(username);
			UserLoginModel user = new UserLoginModel();
			user.setUser(username);
			user.setToken(token);
			if(user.getUser().equals(readUser.getEmail())) {
				return (ResponseEntity.status(HttpStatus.OK))
						.body(user);
			}else {
				return (ResponseEntity.status(HttpStatus.BAD_REQUEST))
						.body("User no existe");
			}
		} catch(NullPointerException e){
			return (ResponseEntity.status(HttpStatus.BAD_REQUEST))
					.body("User no existe");
			
		}
		

	}

}
