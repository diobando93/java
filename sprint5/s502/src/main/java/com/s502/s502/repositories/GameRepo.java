package com.s502.s502.repositories;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;

import com.s502.s502.models.GameModel;

public interface GameRepo extends JpaRepository<GameModel, Long>{
	
	public abstract ArrayList<GameModel> findByIdUser(Long id);

}
