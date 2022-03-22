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

import com.s502.s502.models.GameModelMongo;
import com.s502.s502.models.PercentajeMongo;
import com.s502.s502.models.UserModel;
import com.s502.s502.models.UserModelMongo;
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
		
		ArrayList <UserModelMongo> users = userService.readUsers();
		ArrayList <PercentajeMongo> userPoints;
		userPoints = gameService.userPercentaje(users);
		
		if(users != null) {
			return (ResponseEntity.status(HttpStatus.OK))
					.body(userPoints);
		}else {
			return (ResponseEntity.status(HttpStatus.OK))
					.body("No existen usuarios registrados");
		}
	}
	
	@PostMapping(path="/{id}/games")
	public ResponseEntity createGames(@RequestBody GameModelMongo game, @PathVariable("id") String id) {
		
		Optional<UserModelMongo> user = userService.findUserById(id);
		
		if(!user.isEmpty()) {
			boolean ok = gameService.verifyGameData(game);
			if(game != null && ok == true && id != null) {
				String successPercentaje = "";
				successPercentaje = gameService.percentaje(game);
				game.setItem(successPercentaje);
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
			
		}else {
			return (ResponseEntity.status(HttpStatus.BAD_REQUEST)).
					body("no existe el usario del id");
		}
	}
	
	@GetMapping(path = "/{id}/games")
	public ResponseEntity readGames(@PathVariable("id") String id) {

		Optional<UserModelMongo> user;
		ArrayList<GameModelMongo> game;
		user = userService.findUserById(id);
		
		if(user.isEmpty()) {
			return (ResponseEntity.status(HttpStatus.OK))
					.body("No se ha registrado este usuario");
		}else {
			game = gameService.findByUserId(id);
			if(game.size() > 0) {
				return (ResponseEntity.status(HttpStatus.OK))
						.body(game);
			}else {
				return (ResponseEntity.status(HttpStatus.OK))
						.body("no existen juegos registrados de este usuario");
			}
			
		}
	}
	
	@GetMapping(path = "ranking")
	public ResponseEntity readRanking() {
		
		ArrayList<UserModelMongo> users;
		users = userService.readUsers();
		ArrayList<PercentajeMongo> ranking = new ArrayList<>();
		ranking = gameService.ranking(users);
		
		return (ResponseEntity.status(HttpStatus.OK))
				.body(ranking);
	}
	
	@GetMapping(path = "ranking/loser")
	public ResponseEntity readLoserGamer() {
		
		ArrayList<UserModelMongo> users;
		users = userService.readUsers();
		PercentajeMongo loser;
		loser = gameService.worstGamer(users);
		
		return (ResponseEntity.status(HttpStatus.OK))
				.body(loser);
		
	}
	
	
	@GetMapping(path = "ranking/winner")
	public ResponseEntity readWinnerGamer() {
		
		ArrayList<UserModelMongo> users;
		users = userService.readUsers();
		PercentajeMongo winner;
		winner = gameService.bestGamer(users);
		
		return (ResponseEntity.status(HttpStatus.OK))
				.body(winner);
		
	}

}
