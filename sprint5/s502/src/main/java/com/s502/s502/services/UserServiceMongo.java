package com.s502.s502.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.s502.s502.models.UserModelMongo;
import com.s502.s502.repositories.UserRepoMongo;

@Service
public class UserServiceMongo {
	@Autowired
	UserRepoMongo userRepo;
	
	public UserModelMongo createUser(UserModelMongo user) {
		return userRepo.save(user);
	}
	
}
