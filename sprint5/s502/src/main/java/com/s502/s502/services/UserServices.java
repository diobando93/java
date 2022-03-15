package com.s502.s502.services;

import java.util.ArrayList;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.s502.s502.models.UserModel;

import com.s502.s502.repositories.UserRepo;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class UserServices {
	
	private final UserRepo userRepo ;
	
	
	
	public UserServices(UserRepo userRepo) {
		this.userRepo = userRepo;
	}

	public UserModel createUser(UserModel user) {
		return userRepo.save(user);
	}
	
	public ArrayList<UserModel> readUsers(){
		return (ArrayList<UserModel>) userRepo.findAll();
	}
	
	public Optional<UserModel> findUserById(Long id) {
		return userRepo.findById(id);
	}
	
	public UserModel findByEmail(String email) {
		return userRepo.findByEmail(email);
	}
	
	public UserModel saveUser(UserModel user) {
		return userRepo.save(user);
	}
	
	public UserModel findById(Long id) {
		return userRepo.getById(id);
	}
	
	public String verifyUserData(UserModel user) {
		user.setDate(new Date());
		UserModel verifyUser;
		verifyUser = userRepo.findByEmail(user.getEmail());
		if(verifyUser == null && user.getEmail() != null ) {
			if(user.getNombre() == null) {
				user.setNombre("anonimo");
			}
			return "Created";
		}else if(user.getEmail() == null) {
			return "Falta email";
		}else {
			return "User exist";
		}
		
	}
	

	
	
	
}
