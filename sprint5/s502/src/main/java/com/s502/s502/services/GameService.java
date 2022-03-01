package com.s502.s502.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Comparator;

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
	
	public ArrayList<Ranking> ranking(ArrayList<GameModel> games) {
		
		ArrayList<Ranking> ranking = new ArrayList<Ranking>();
		for(int aux = 0; aux < games.size(); aux++) {
			Ranking entryData = new Ranking(null, null);
			entryData.setId(games.get(aux).getIdUser());
			entryData.setSuccessPercentaje(games.get(aux).getSuccessPercentaje());
			ranking.add(aux, entryData);
		}
		return ranking;
	}
	
	public Ranking worstGamer(ArrayList<GameModel> games) {
		
		ArrayList<Ranking> rankingGamers = new ArrayList<Ranking>();
		rankingGamers = ranking(games);
		System.out.println(Arrays.asList(rankingGamers));
	    Collections.sort(rankingGamers);
	    System.out.println(Arrays.asList(rankingGamers));
	    return rankingGamers.get(0);
	    
	}
	
	public Ranking bestGamer(ArrayList<GameModel> games) {
		
		ArrayList<Ranking> rankingGamers = new ArrayList<Ranking>();
		rankingGamers = ranking(games);
		System.out.println(Arrays.asList(rankingGamers));
	    Collections.sort(rankingGamers);
	    System.out.println(Arrays.asList(rankingGamers));
	    return rankingGamers.get(rankingGamers.size()-1);
	}
		
	
	public boolean verifyGameData(GameModel game) {
		boolean ok = true;
		return ok;
	}
	


}
