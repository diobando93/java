package com.s501.s501.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.s501.s501.repositories.TiendaRepo;
import com.s501.s501.models.TiendaModel;

@Service
public class TiendaServices {
	
	@Autowired
	TiendaRepo tiendaRepo;
	
	public ArrayList<TiendaModel> mostrarTiendas(){
		return (ArrayList<TiendaModel>) tiendaRepo.findAll();
	}
	
	public TiendaModel crearTienda(TiendaModel tienda) {
		return tiendaRepo.save(tienda);
	}
	
}
