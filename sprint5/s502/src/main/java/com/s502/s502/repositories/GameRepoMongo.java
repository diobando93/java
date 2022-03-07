package com.s502.s502.repositories;

import java.util.ArrayList;

import org.springframework.data.mongodb.repository.MongoRepository;


import com.s502.s502.models.GameModelMongo;


public interface GameRepoMongo extends MongoRepository<GameModelMongo, String>{
	
	public abstract ArrayList<GameModelMongo> findByIdUser(String id);

}
