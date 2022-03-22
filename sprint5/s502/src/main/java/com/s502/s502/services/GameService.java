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

import org.aspectj.apache.bcel.classfile.Module.Uses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.s502.s502.models.GameModel;
import com.s502.s502.models.Percentaje;
import com.s502.s502.models.UserModel;
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
	
	public ArrayList<Percentaje> userPercentaje(ArrayList<UserModel> users){
		
		ArrayList<Percentaje> userPercentaje = new ArrayList<Percentaje>();
		ArrayList<GameModel> userGames = null;
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
			Percentaje entryData1 = new Percentaje(null, null, null);
			entryData1.setId(users.get(aux).getId());
			entryData1.setName(users.get(aux).getNombre());
			entryData1.setPercentaje(percentaje);
			userPercentaje.add(aux, entryData1);
			suma = 0;
			userGames = null;
			
		}
		return userPercentaje;
	}
	
	public ArrayList<Percentaje> ranking(ArrayList<UserModel> users) {
		ArrayList<Percentaje> userPercentajeRanking = new ArrayList<Percentaje>();
		userPercentajeRanking =  userPercentaje(users);
		Collections.sort(userPercentajeRanking);
		return userPercentajeRanking;
	}
	
	
	public Percentaje worstGamer(ArrayList<UserModel> users) {
		
		ArrayList<Percentaje> userPercentajeRanking = new ArrayList<Percentaje>();
		userPercentajeRanking =  userPercentaje(users);
		Collections.sort(userPercentajeRanking);
	    return userPercentajeRanking.get(0);
	    
	}
	
	public Percentaje bestGamer(ArrayList<UserModel> users) {
		
		ArrayList<Percentaje> userPercentajeRanking = new ArrayList<Percentaje>();
		userPercentajeRanking =  userPercentaje(users);
		Collections.sort(userPercentajeRanking);
	    return userPercentajeRanking.get(userPercentajeRanking.size()-1);
	}
	
	
	public boolean verifyGameData(GameModel game) {
		
		boolean ok = true;
		if(game.getShotOne() >= 0 && game.getShotOne() <= 7 && game.getShotTwo() >= 0 && game.getShotTwo() <= 7) {
			return ok;
		}else {
			ok = false;
			return ok;
		}
		
	}
	
	public String percentaje(GameModel game) {
		
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
