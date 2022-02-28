package com.s502.s502.services;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.s502.s502.models.GameModel;
import com.s502.s502.models.Ranking;
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
	
	public ArrayList<Ranking>[] ranking(ArrayList<GameModel> games) {
		int aux = 0;
		Ranking entryData = new Ranking(null, null);
		//HashMap<Long, Double> ranking2 = new HashMap<>();
		ArrayList<Ranking>[] ranking = new ArrayList[games.size()];
		System.out.println(games.size());
		while(aux < games.size()) {
			entryData.setId(games.get(aux).getIdUser());
			entryData.setSuccessPercentaje(games.get(aux).getSuccessPercentaje());
			
			//ranking.add(aux, entryData);
			aux = aux + 1;
		}
		System.out.println(entryData);
		return ranking;
	}
	
	public HashMap<Long, Double> worstGamer(ArrayList<GameModel> game){
		HashMap <Long, Double> worstGamer = new HashMap<>();
		Double[] percentaje = null ; 
		for(int i = game.size() - 1; i > 0; i--) {
			for(int j = 0; j < i; j++) {
				if(game.get(j).getSuccessPercentaje() > game.get(j+1).getSuccessPercentaje()) {
					swap(percentaje, j, j+1);
				}
			}
		}
		System.out.println(percentaje);
		return worstGamer;
	}
	
	public boolean verifyGameData(GameModel game) {
		boolean ok = true;
		return ok;
	}
	
	public void swap(Double[] array, int a, int b) {
		Double temp = array[a];
		array[a] = array[b];
		array[b] = temp;
	}

}
