package com.s502.s502.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.s502.s502.models.GameModel;
import com.s502.s502.models.GameModelMongo;
import com.s502.s502.models.Ranking;
import com.s502.s502.models.RankingMongo;
import com.s502.s502.repositories.GameRepoMongo;

@Service
public class GameServiceMongo {
	
	@Autowired
	GameRepoMongo gameRepo;
	
	public GameModelMongo createGame(GameModelMongo game) {
		return gameRepo.save(game);
	}
	
	public ArrayList<GameModelMongo> findByUserId(String id){
		return gameRepo.findByIdUser(id);
	}
	
	public ArrayList<GameModelMongo> readUser(){
		return (ArrayList<GameModelMongo>) gameRepo.findAll();
	}
	
	
	public ArrayList<RankingMongo> ranking(ArrayList<GameModelMongo> games) {
		
		ArrayList<RankingMongo> ranking = new ArrayList<RankingMongo>();
		for(int aux = 0; aux < games.size(); aux++) {
			RankingMongo entryData = new RankingMongo(null, null);
			entryData.setId(games.get(aux).getIdUser());
			entryData.setSuccessPercentaje(games.get(aux).getSuccessPercentaje());
			ranking.add(aux, entryData);
		}
		return ranking;
	}
	
	public RankingMongo worstGamer(ArrayList<GameModelMongo> games) {
		
		ArrayList<RankingMongo> rankingGamers = new ArrayList<RankingMongo>();
		rankingGamers = ranking(games);
		System.out.println(Arrays.asList(rankingGamers));
	    Collections.sort(rankingGamers);
	    System.out.println(Arrays.asList(rankingGamers));
	    return rankingGamers.get(0);
	    
	}
	
	public RankingMongo bestGamer(ArrayList<GameModelMongo> games) {
		
		ArrayList<RankingMongo> rankingGamers = new ArrayList<RankingMongo>();
		rankingGamers = ranking(games);
		System.out.println(Arrays.asList(rankingGamers));
	    Collections.sort(rankingGamers);
	    System.out.println(Arrays.asList(rankingGamers));
	    return rankingGamers.get(rankingGamers.size()-1);
	}
	
	public boolean verifyGameData(GameModelMongo game) {
		boolean ok = true;
		return ok;
	}

}
