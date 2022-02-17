package com.s501.s501.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.s501.s501.models.CuadrosModel;
import com.s501.s501.repositories.CuadrosRepo;

@Service
public class CuadrosServices {
	
	@Autowired
	CuadrosRepo cuadroRepo;
	
	public CuadrosModel crearCuadro(CuadrosModel cuadro) {
		return cuadroRepo.save(cuadro);
	}
	
	public ArrayList<CuadrosModel> findByIdTienda(Long idTienda){
		return cuadroRepo.findByIdTienda(idTienda);
	}
	
	public boolean eliminarCuadros(Long idTienda) {
		
		ArrayList<CuadrosModel> cuadro;
		cuadro = cuadroRepo.findByIdTienda(idTienda);
		try {
			for(int i = 0; i < cuadro.size(); i ++) {
				cuadroRepo.delete(cuadro.get(i));
			}
			return true;
		}catch(Exception err){
			return false;
		}
	}
	
}
