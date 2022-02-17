package com.s501.s501.repositories;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;

import com.s501.s501.models.CuadrosModel;
import com.s501.s501.models.TiendaModel;

public interface CuadrosRepo extends JpaRepository<CuadrosModel, Long>{
	
	public abstract ArrayList<CuadrosModel> findByIdTienda(Long idTienda);
	
}
