package com.s502.s502.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.s502.s502.models.GameModel;
import com.s502.s502.models.GameModelMongo;
import com.s502.s502.models.Percentaje;
import com.s502.s502.models.PercentajeMongo;
import com.s502.s502.models.UserModel;
import com.s502.s502.models.UserModelMongo;
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
	
	
	public ArrayList<PercentajeMongo> userPercentaje(ArrayList<UserModelMongo> users){
		
		ArrayList<PercentajeMongo> userPercentaje = new ArrayList<PercentajeMongo>();
		ArrayList<GameModelMongo> userGames = null;
		double suma = 0;
		double percentaje = 0;
		for(int aux = 0; aux < users.size(); aux++) {
			userGames = findByUserId(users.get(aux).getId());
			for(int k = 0; k < userGames.size(); k++) {
				if(userGames.get(k).getItem().equals("gano")) {
					suma = suma + 1;
				}
			}
			percentaje = suma / userGames.size();
			PercentajeMongo entryData1 = new PercentajeMongo(null, null, null);
			entryData1.setId(users.get(aux).getId());
			entryData1.setName(users.get(aux).getNombre());
			entryData1.setPercentaje(percentaje);
			userPercentaje.add(aux, entryData1);
			suma = 0;
			userGames = null;
			
		}
		return userPercentaje;
	}
	
	public ArrayList<PercentajeMongo> ranking(ArrayList<UserModelMongo> users) {
		ArrayList<PercentajeMongo> userPercentajeRanking = new ArrayList<PercentajeMongo>();
		userPercentajeRanking =  userPercentaje(users);
		Collections.sort(userPercentajeRanking);
		return userPercentajeRanking;
	}
	
	
	public PercentajeMongo worstGamer(ArrayList<UserModelMongo> users) {
		
		ArrayList<PercentajeMongo> userPercentajeRanking = new ArrayList<PercentajeMongo>();
		userPercentajeRanking =  userPercentaje(users);
		Collections.sort(userPercentajeRanking);
	    return userPercentajeRanking.get(0);
	    
	}
	
	public PercentajeMongo bestGamer(ArrayList<UserModelMongo> users) {
		
		ArrayList<PercentajeMongo> userPercentajeRanking = new ArrayList<PercentajeMongo>();
		userPercentajeRanking =  userPercentaje(users);
		Collections.sort(userPercentajeRanking);
	    return userPercentajeRanking.get(userPercentajeRanking.size()-1);
	}
	
	public boolean verifyGameData(GameModelMongo game) {
		
		boolean ok = true;
		if(game.getShotOne() >= 0 && game.getShotOne() <= 7 && game.getShotTwo() >= 0 && game.getShotTwo() <= 7) {
			return ok;
		}else {
			ok = false;
			return ok;
		}
		
		
	}
	
	public String percentaje(GameModelMongo game) {
		
		int shotOne = game.getShotOne();
		int shotTwo = game.getShotTwo();
		int sum = shotOne + shotTwo;
		String percentaje = "perdio";
		
		if(sum == 7) {
			percentaje = "gano";
		}else {
			return percentaje;
		}
		
		return percentaje;
	}

}
