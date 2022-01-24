package com.s41.nivel3.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Saludo {
	@RequestMapping("/")
	public String hola() {
		return "Hola mundo soy Israel nivel 3 proyecto Maven";
	}
	@PostMapping("/")
	public String holaNombre(@RequestBody String nombre) {
		return "hola desde un proyecto creado con Maven " + nombre;
	}
}
