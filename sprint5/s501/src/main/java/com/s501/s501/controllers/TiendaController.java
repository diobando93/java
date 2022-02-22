package com.s501.s501.controllers;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
	
	@PostMapping()
	public ResponseEntity<TiendaModel> crearTienda(@RequestBody TiendaModel tienda){
		if(tienda == null) {
			return (ResponseEntity.status(HttpStatus.BAD_REQUEST)).
						body(tienda);		
		}else {
			return (ResponseEntity.status(HttpStatus.OK)).
						body(tiendaService.crearTienda(tienda));
		}
			
	}
	/*
	@PostMapping()
	public TiendaModel crearTienda(@RequestBody TiendaModel tienda) {
		return tiendaService.crearTienda(tienda);
	}
	*/
	
	@GetMapping()
	public ResponseEntity<ArrayList<TiendaModel>> mostrarTiendas(){
		ArrayList<TiendaModel> tiendas;
		tiendas = tiendaService.mostrarTiendas();
		if(tiendas.size() == 0) {
			return (ResponseEntity.status(HttpStatus.NO_CONTENT)).
					body(tiendas);
		}else {
			return (ResponseEntity.status(HttpStatus.OK)).
					body(tiendas);
		}
	}
	
	
	/*
	@GetMapping()
	public ArrayList<TiendaModel> mostrarTiendas(){
		return tiendaService.mostrarTiendas();
	}
	*/
	
	@PostMapping(path="/{id}/pictures")
	public ResponseEntity crearCuadro(@RequestBody CuadrosModel cuadro, @PathVariable("id") Long id){
		Optional<TiendaModel> tienda = tiendaService.buscarTiendaId(id);
		int capacidad = tienda.get().getCapacidad();
		ArrayList <CuadrosModel> cuadrosExistentes = cuadroService.findByIdTienda(id);
		int capacidadOcupada = cuadrosExistentes.size();
		if(cuadro != null && id != null && tienda != null && capacidadOcupada < capacidad) {
			cuadro.setIdTienda(id);
			return (ResponseEntity.status(HttpStatus.OK)).
					body(cuadroService.crearCuadro(cuadro));
		}else if(cuadro == null){
			return (ResponseEntity.status(HttpStatus.NO_CONTENT)).
					body("faltan datos sobre el cuadro");
		}else if(id == null) {
			return (ResponseEntity.status(HttpStatus.BAD_REQUEST)).
					body("se necesita un id");
		}else if(tienda == null) {
			return (ResponseEntity.status(HttpStatus.BAD_REQUEST)).
					body("no existe la tienda del id");
		}else {
			return (ResponseEntity.status(HttpStatus.INSUFFICIENT_STORAGE)).
					body("Ya no caben mas cuadros");
		}
		
	}
	
	/*
	@PostMapping(path ="/{id}/pictures")
	public CuadrosModel crearCuadro(@RequestBody CuadrosModel cuadro, @PathVariable("id") Long id) {
		System.out.println(cuadro.getAutor());
		cuadro.setIdTienda(id);
		return cuadroService.crearCuadro(cuadro);
	}
	*/
	
	@GetMapping(path="{id}/pictures")
	public ResponseEntity<ArrayList<CuadrosModel>> mostrarCuadros(@PathVariable("id") Long id){
		ArrayList<CuadrosModel> cuadros;
		cuadros = cuadroService.findByIdTienda(id);
		if(cuadros.size() == 0) {
			return ResponseEntity.status(HttpStatus.NO_CONTENT).
					body(cuadros);
		}else {
			return ResponseEntity.status(HttpStatus.OK).
					body(cuadros);
		}
	}
	
	/*
	@GetMapping(path="{id_tienda}/pictures")
	public ArrayList<CuadrosModel> mostrarCuadros(@PathVariable("id_tienda") Long id_tienda){
		return cuadroService.findByIdTienda(id_tienda);
	}
	*/
	
	@DeleteMapping(path = "/{id}/pictures")
	public ResponseEntity<String> eliminarCuadros(@PathVariable("id") Long id){
		boolean ok = cuadroService.eliminarCuadros(id);
		if(ok == true) {
			return (ResponseEntity.status(HttpStatus.OK)).
					body("No existen cuadros");
		}else {
			return (ResponseEntity.status(HttpStatus.NO_CONTENT)).
					body("No existen cuadros con esa url");
		}
	}
	
	/*
	@DeleteMapping(path = "/{idTienda}/pictures")
	public boolean eliminarCuadros(@PathVariable("idTienda") Long idTienda){
		boolean ok = cuadroService.eliminarCuadros(idTienda);
		return ok;
	}
	*/
	

}
