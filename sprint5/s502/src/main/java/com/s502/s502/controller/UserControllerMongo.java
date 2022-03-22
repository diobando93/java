package com.s502.s502.controller;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.s502.s502.models.GameModel;
import com.s502.s502.models.GameModelMongo;
import com.s502.s502.models.Ranking;
import com.s502.s502.models.RankingMongo;
import com.s502.s502.models.UserModel;
import com.s502.s502.models.UserModelMongo;
import com.s502.s502.services.GameService;
import com.s502.s502.services.GameServiceMongo;
import com.s502.s502.services.UserServiceMongo;


@RestController
@RequestMapping("/playersm")
public class UserControllerMongo {
	
	@Autowired
	UserServiceMongo userService;
	@Autowired
	GameServiceMongo gameService;
	
	@PostMapping()
	public ResponseEntity createUser(@RequestBody UserModelMongo user) {
		String responseText = userService.verifyUserData(user);
		if(responseText.equals("Created")) {
			userService.createUser(user);
			return (ResponseEntity.status(HttpStatus.OK))
					.body(user);
		}else {
			return (ResponseEntity.status(HttpStatus.BAD_REQUEST))
					.body(responseText);
		}
	}
	
	@PutMapping(path = "/{id}")
	public ResponseEntity updateUserName(@RequestBody UserModel userFind, @PathVariable("id") String id) {
		//leer token, comparar con el id que se ingresa
		UserModelMongo user = userService.findById(id);
		if(user != null) {
			String nombreNuevo = userFind.getNombre();
			user.setNombre(nombreNuevo);
			userService.saveUser(user);
			return (ResponseEntity.status(HttpStatus.OK))
					.body("Actualizado");
		}else {
			return (ResponseEntity.status(HttpStatus.NO_CONTENT))
					.body("No existe el usuario");
		}
		
	}
	
	@GetMapping()
	public ResponseEntity readUsers() {
		ArrayList <UserModelMongo> users;
		users = userService.readUsers();
		if(users != null) {
			return (ResponseEntity.status(HttpStatus.OK))
					.body(users);
		}else {
			return (ResponseEntity.status(HttpStatus.NO_CONTENT))
					.body("No existen usuarios registrados");
		}
	}
	
	@PostMapping(path="/{id}/games")
	public ResponseEntity createGames(@RequestBody GameModelMongo game, @PathVariable("id") String id) {
		//leer token, comparar con el id que se ingresa
		boolean ok = gameService.verifyGameData(game);
		if(game != null && ok == true && id != null) {
			double successPercentaje = gameService.percentaje(game);
			game.setSuccessPercentaje(successPercentaje);
			game.setIdUser(id);
			gameService.createGame(game);
			return (ResponseEntity.status(HttpStatus.OK))
					.body(game);
		}else if(id == null){
			return (ResponseEntity.status(HttpStatus.OK))
					.body("Missing id");
		}else if(ok == false) {
			return (ResponseEntity.status(HttpStatus.OK))
					.body("Points out of the range");
		}else {
			return (ResponseEntity.status(HttpStatus.OK))
					.body("Missing game data");
		}
	}
	
	@GetMapping(path = "/{id}/games")
	public ResponseEntity readGames(@PathVariable("id") String id) {
		//leer token, comparar con el id que se ingresa
		Optional<UserModelMongo> user;
		ArrayList<GameModelMongo> game;
		user = userService.findUserById(id);
		game = gameService.findByUserId(id);
		if(game != null && user != null) {
			return (ResponseEntity.status(HttpStatus.OK))
					.body(game);
		}else if(user == null) {
			return (ResponseEntity.status(HttpStatus.OK))
					.body("No se ha registrado este usuario");
		}else {
			return (ResponseEntity.status(HttpStatus.OK))
					.body("No existen juegos para este usuario");
		}
	}
	
	@GetMapping(path = "ranking")
	public ResponseEntity readRanking() {
		ArrayList<GameModelMongo> game;
		game = gameService.readUser();
		//System.out.println(game);
		ArrayList<RankingMongo> ranking = new ArrayList<>();
		ranking = gameService.ranking(game);
		return (ResponseEntity.status(HttpStatus.OK))
				.body(ranking);
	}
	
	@GetMapping(path = "ranking/loser")
	public ResponseEntity readLoserGamer() {
		
		ArrayList<GameModelMongo> games;
		games = gameService.readUser();
		RankingMongo ranking;
		ranking = gameService.worstGamer(games);
		return (ResponseEntity.status(HttpStatus.OK))
				.body(ranking);
		
	}
	
	@GetMapping(path = "ranking/winner")
	public ResponseEntity readWinnerGamer() {
		ArrayList<GameModelMongo> games;
		games = gameService.readUser();
		RankingMongo ranking;
		ranking = gameService.bestGamer(games);
		return (ResponseEntity.status(HttpStatus.OK))
				.body(ranking);
		
	}

}
