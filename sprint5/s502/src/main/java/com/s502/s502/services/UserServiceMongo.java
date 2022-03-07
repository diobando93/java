package com.s502.s502.services;

import java.util.ArrayList;
import java.util.Date;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.s502.s502.models.UserModel;
import com.s502.s502.models.UserModelMongo;
import com.s502.s502.repositories.UserRepoMongo;

@Service
public class UserServiceMongo {
	@Autowired
	UserRepoMongo userRepo;
	
	public UserModelMongo createUser(UserModelMongo user) {
		return userRepo.save(user);
	}
	
	public ArrayList<UserModelMongo> readUsers(){
		return (ArrayList<UserModelMongo>) userRepo.findAll();
	}
	
	public Optional<UserModelMongo> findUserById(String id) {
		return userRepo.findById(id);
	}
	
	public UserModelMongo findByEmail(String email) {
		return userRepo.findByEmail(email);
	}
	
	public UserModelMongo saveUser(UserModelMongo user) {
		return userRepo.save(user);
	}
	
	
	public UserModelMongo findById(String id) {
		return userRepo.getById(id);
	}
	
	
	public String verifyUserData(UserModelMongo user) {
		user.setDate(new Date());
		UserModelMongo verifyUser;
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
