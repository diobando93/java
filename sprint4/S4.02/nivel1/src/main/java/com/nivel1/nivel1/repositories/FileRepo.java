package com.nivel1.nivel1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nivel1.nivel1.models.FotoModel;

public interface FileRepo extends JpaRepository <FotoModel, String>{
	

}
