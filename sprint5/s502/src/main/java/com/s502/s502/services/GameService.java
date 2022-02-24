package com.s502.s502.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.s502.s502.models.GameModel;
import com.s502.s502.repositories.GameRepo;

@Service
public class GameService {
	
	@Autowired 
	GameRepo gameRepo;
	
	public GameModel createGame(GameModel game) {
		return gameRepo.save(game);
	}
	
	public ArrayList<GameModel> findByUserId(Long id){
		return gameRepo.findByIdUser(id);
	}

}
