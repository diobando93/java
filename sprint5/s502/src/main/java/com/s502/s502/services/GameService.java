package com.s502.s502.services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

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
	
	public ArrayList<GameModel> readUser(){
		return (ArrayList<GameModel>) gameRepo.findAll();
	}
	
	public HashMap<Long, Double> ranking(ArrayList<GameModel> game) {
		int aux = 0;
		HashMap<Long, Double> ranking = new HashMap<>();
		while(aux == game.size()) {
			ranking.put(game.get(aux).getIdUser(), game.get(aux).getSuccessPercentaje());
			aux = aux + 1;
		}
		return ranking;
	}
	
	public boolean verifyGameData(GameModel game) {
		boolean ok = true;
		return ok;
	}

}
