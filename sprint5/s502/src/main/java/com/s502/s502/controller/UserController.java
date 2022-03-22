package com.s502.s502.controller;

import java.util.ArrayList;
import java.util.HashMap;
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
import com.s502.s502.models.Percentaje;
import com.s502.s502.models.Ranking;
import com.s502.s502.models.UserModel;
import com.s502.s502.services.GameService;
import com.s502.s502.services.UserServiceMongo;
import com.s502.s502.services.UserServices;

@RestController
@RequestMapping("/players")
public class UserController {
	
	@Autowired
	UserServices userService;
	@Autowired
	GameService gameService;
	
	@PostMapping()
	public ResponseEntity createUser(@RequestBody UserModel user) {
		
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
	public ResponseEntity updateUserName(@RequestBody UserModel userFind, @PathVariable("id") Long id) {
		UserModel user = userService.findById(id);
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
		ArrayList<UserModel> users = userService.readUsers();
		ArrayList <Percentaje> userPoints;
		userPoints = gameService.userPercentaje(users);
		if(userPoints != null) {
			return (ResponseEntity.status(HttpStatus.OK))
					.body(userPoints);
		}else {
			return (ResponseEntity.status(HttpStatus.NO_CONTENT))
					.body("No existen usuarios registrados");
		}
	}
	
	@PostMapping(path="/{id}/games")
	public ResponseEntity createGames(@RequestBody GameModel game, @PathVariable("id") Long id) {
		//leer token, comparar con el id que se ingresa
		UserModel user = userService.findById(id);
		if(user != null) {
			boolean ok = gameService.verifyGameData(game);
			if(game != null && id != null && ok == true) {
				
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
					body("no existe la tienda del id");
		}
		
	}
	
	
	@GetMapping(path = "/{id}/games")
	public ResponseEntity readGames(@PathVariable("id") Long id) {
		//leer token, comparar con el id que se ingresa
		Optional<UserModel> user;
		ArrayList<GameModel> game;
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
		
		ArrayList<UserModel> users;
		users = userService.readUsers();
		ArrayList<Percentaje> ranking = new ArrayList<>();
		ranking = gameService.ranking(users);
		return (ResponseEntity.status(HttpStatus.OK))
				.body(ranking);
	}
	
	@GetMapping(path = "ranking/loser")
	public ResponseEntity readLoserGamer() {
		
		ArrayList<UserModel> users;
		users = userService.readUsers();
		Percentaje loser;
		loser = gameService.worstGamer(users);
		return (ResponseEntity.status(HttpStatus.OK))
				.body(loser);
		
	}
	
	@GetMapping(path = "ranking/winner")
	public ResponseEntity readWinnerGamer() {
		ArrayList<UserModel> users;
		users = userService.readUsers();
		Percentaje winner;
		winner = gameService.bestGamer(users);
		return (ResponseEntity.status(HttpStatus.OK))
				.body(winner);
		
	}
	
	
	
}
