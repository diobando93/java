package com.s501.s501.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.s501.s501.models.CuadrosModel;
import com.s501.s501.models.TiendaModel;
import com.s501.s501.services.CuadrosServices;
import com.s501.s501.services.TiendaServices;

@RestController
@RequestMapping("/shops")
public class TiendaController {
	
	@Autowired
	TiendaServices tiendaService;
	@Autowired
	CuadrosServices cuadroService;
	
	
	/*
	@PostMapping()
	public TiendaModel crearTienda(@RequestBody TiendaModel tienda) {
		return tiendaService.crearTienda(tienda);
	}
	*/
	
	@GetMapping()
	public ArrayList<TiendaModel> mostrarTiendas(){
		return tiendaService.mostrarTiendas();
	}
	
	
	
	@PostMapping(path ="/{id}/pictures")
	public CuadrosModel crearCuadro(@RequestBody CuadrosModel cuadro, @PathVariable("id") Long id) {
		System.out.println(cuadro.getAutor());
		cuadro.setIdTienda(id);
		return cuadroService.crearCuadro(cuadro);
	}
	
	@GetMapping(path="{id_tienda}/pictures")
	public ArrayList<CuadrosModel> mostrarCuadros(@PathVariable("id_tienda") Long id_tienda){
		return cuadroService.findByIdTienda(id_tienda);
	}
	
	@DeleteMapping(path = "/{idTienda}/pictures")
	public boolean eliminarCuadros(@PathVariable("idTienda") Long idTienda){
		boolean ok = cuadroService.eliminarCuadros(idTienda);
		return ok;
	}
	

}
