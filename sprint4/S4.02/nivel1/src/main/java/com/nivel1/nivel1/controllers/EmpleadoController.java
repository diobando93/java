package com.nivel1.nivel1.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nivel1.nivel1.models.Empleado;
import com.nivel1.nivel1.services.EmpleadoService;

@RestController
@RequestMapping("/empleado")
public class EmpleadoController {
	
	@Autowired 
	EmpleadoService empleadoService;
	
	@GetMapping()
	public ArrayList<Empleado> obternerEmpleados(){
		return empleadoService.obtenerEmpleados();
	}
	
	@GetMapping(path = "/query")
	public ArrayList<Empleado> obtenerEmpleadoPorEmpleo(@RequestParam("empleo") String empleo){
		return this.empleadoService.findByEmpleo(empleo);
	}
	
	@PostMapping()
	public Empleado guardarEmpleado(@RequestBody Empleado empleado) {
		empleado.setSueldo(empleadoService.calcularSueldo(empleado.getEmpleo()));
		return empleadoService.guradarEmpleado(empleado);
	}
	
	@DeleteMapping(path = "/{id}")
	public String eliminarPorId(@PathVariable("id") Long id) {
		boolean ok = empleadoService.eliminarEmpleado(id);
		if(ok == true) {
			return "Usuario eliminado con exito, id: " + id;
		}else {
			return "No se encontro usuario, no se elimino id:" + id;
		}
		
	}

}
