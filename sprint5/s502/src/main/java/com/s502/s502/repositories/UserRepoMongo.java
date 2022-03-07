package com.s502.s502.repositories;
import org.springframework.data.mongodb.repository.MongoRepository;


import com.s502.s502.models.UserModelMongo;

public interface UserRepoMongo extends MongoRepository<UserModelMongo, String>{
	public abstract UserModelMongo findByEmail(String email);
	public abstract UserModelMongo getById(String id);
	

}
