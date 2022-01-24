package com.s41.nivel2.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Saludo {
	@RequestMapping("/")
	public String hola() {
		return "Hola mundo soy Israel, proyecto generado con Gradle";
	}
	@PostMapping("/")
	public String holaNombre(@RequestBody String nombre) {
		return "hola nivel 2 proyecto generado con Gradle " + nombre;
	}
}
