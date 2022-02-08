package com.nivel1.nivel1.controllers;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.ResponseEntity.BodyBuilder;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.nivel1.nivel1.models.EmpleadoModel;
import com.nivel1.nivel1.models.FotoModel;
import com.nivel1.nivel1.response.FileResponse;
import com.nivel1.nivel1.services.EmpleadoService;
import com.nivel1.nivel1.services.FileService;

@RestController
@RequestMapping("/empleado")
public class EmpleadoController {
	
	@Autowired 
	EmpleadoService empleadoService;
	
	
	@GetMapping()
	public ResponseEntity<ArrayList<EmpleadoModel>> obternerEmpleados(){
		ArrayList<EmpleadoModel> empleados;
		empleados = empleadoService.obtenerEmpleados();
		if(empleados.size() == 0) {
			return (ResponseEntity.status(HttpStatus.NO_CONTENT)).
					body(empleados);
		}else {
			return (ResponseEntity.ok()).
					body(empleados);
		}

	}
	
	/*
	
	@GetMapping()
	public ArrayList<EmpleadoModel> obternerEmpleados(){
		
		return empleadoService.obtenerEmpleados();
	}
	*/
	
	@GetMapping(path = "/query")
	public ResponseEntity<ArrayList<EmpleadoModel>> obtenerEmpleadoPorEmpleo(@RequestParam("empleo") String empleo){
		ArrayList<EmpleadoModel> empleos;
		empleos = empleadoService.findByEmpleo(empleo);
		if (empleos.size() == 0) {
			return (ResponseEntity.status(HttpStatus.NO_CONTENT)).
					body(empleos); 
		}else {
			return (ResponseEntity.ok()).
					body(empleos);
		}
	}
	
	/*
	@GetMapping(path = "/query")
	public ArrayList<EmpleadoModel> obtenerEmpleadoPorEmpleo(@RequestParam("empleo") String empleo){
		return this.empleadoService.findByEmpleo(empleo);
	}
	*/
	
	@PostMapping()
	public ResponseEntity<EmpleadoModel> guardarEmpleado(@RequestBody EmpleadoModel empleado){
		
		
		if (empleado == null) {
			return (ResponseEntity.status(HttpStatus.BAD_REQUEST)).
					body(empleado);
		}else {
			empleado.setSueldo(empleadoService.calcularSueldo(empleado.getEmpleo()));
			return (ResponseEntity.ok()).
					body(empleadoService.guradarEmpleado(empleado));
		}
			
	}
	
	/*
	
	@PostMapping()
	public EmpleadoModel guardarEmpleado(@RequestBody EmpleadoModel empleado) {
		empleado.setSueldo(empleadoService.calcularSueldo(empleado.getEmpleo()));
		return empleadoService.guradarEmpleado(empleado);
	}
	*/
	
	
	@PostMapping("/fotoupload")
	public ResponseEntity <EmpleadoModel> guardarFotoEmpleado(@RequestPart("file") MultipartFile file, @RequestPart EmpleadoModel empleado){
		if(empleado == null || file == null) {
			return (ResponseEntity.status(HttpStatus.BAD_REQUEST)).
					body(empleado);
		}else {
			empleado.setSueldo(empleadoService.calcularSueldo(empleado.getEmpleo()));
			return (ResponseEntity.ok()).
					body(empleadoService.saveFoto(file, empleado.getId(), empleado.getNombre(), empleado.getApellido(), empleado.getEmpleo(), empleado.getSueldo()));
		}
	}
	
	
	/*
	@PostMapping("/fotupload")
	public EmpleadoModel guardarFotoEmpleado(@RequestPart("file") MultipartFile file, @RequestPart EmpleadoModel empleado) {
		
		empleado.setSueldo(empleadoService.calcularSueldo(empleado.getEmpleo()));
		
		return empleadoService.saveFoto(file, empleado.getId(), empleado.getNombre(), empleado.getApellido(), empleado.getEmpleo(), empleado.getSueldo());
	
	}
	*/
	
	@GetMapping(path = "/download/{id}")
    public ResponseEntity<ByteArrayResource> downloadFile(@PathVariable Long id) {
		
		Optional<EmpleadoModel> model = empleadoService.getFoto(id);
		
		if (model == null) {
			return (ResponseEntity<ByteArrayResource>) (ResponseEntity.status(HttpStatus.BAD_REQUEST));
		}
    	
        return ResponseEntity.ok().
                header(HttpHeaders.CONTENT_DISPOSITION, "attachment;filename=\"" + model.get().getFileName() + "\"").
                body(new ByteArrayResource(model.get().getFileData()));


    }
	
		
	@DeleteMapping(path = "/{id}")
	public ResponseEntity <String> eliminarPorId(@PathVariable("id") Long id) {
		boolean ok = empleadoService.eliminarEmpleado(id);
		if(ok == true) {
			return ResponseEntity.ok().
					body("Usuario eliminado con exito, id: " + id);
		}else {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).
					body("No se encontro usuario, no se elimino id:" + id);
		}
		
	}

}
