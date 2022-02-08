package com.nivel1.nivel1.services;

import java.util.ArrayList;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import com.nivel1.nivel1.repositories.IEmpleadoRepo;


import java.util.List;
import java.util.Optional;

import com.nivel1.nivel1.constants.FileErrors;
import com.nivel1.nivel1.exceptions.FileNotFoundException;
import com.nivel1.nivel1.exceptions.FileSaveException;
import com.nivel1.nivel1.models.EmpleadoModel;
import com.nivel1.nivel1.models.FotoModel;
import com.nivel1.nivel1.models.SueldoModel;
import com.nivel1.nivel1.constants.FileErrors;
import com.nivel1.nivel1.exceptions.FileNotFoundException;
import com.nivel1.nivel1.exceptions.FileSaveException;

@Service	
public class EmpleadoService {
	
	@Autowired
	IEmpleadoRepo empleadoRepo;
	

	
	public ArrayList<EmpleadoModel> obtenerEmpleados(){
		return (ArrayList<EmpleadoModel>) empleadoRepo.findAll();
	}
	
	public EmpleadoModel guradarEmpleado(EmpleadoModel empleado) {
		return empleadoRepo.save(empleado);
	}
	
	public ArrayList<EmpleadoModel> findByEmpleo(String empleo){
		return empleadoRepo.findByEmpleo(empleo);
	}
	

	
	public boolean eliminarEmpleado(Long id){
		try {
			empleadoRepo.deleteById(id);
			return true;
		}catch(Exception err){
			return false;
		}
	}
	
	public double calcularSueldo(String empleo) {

		double sueldo_otros = 800.322;
		double sueldo = sueldo_otros;
		List<SueldoModel> listaEmpleos = new ArrayList<SueldoModel>();
		listaEmpleos.add(new SueldoModel("gamer", 343.23));
		listaEmpleos.add(new SueldoModel("youtuber", 546.32));
		listaEmpleos.add(new SueldoModel("pintor", 653.65));

		for (int i = 0; i < listaEmpleos.size(); i++) {
			if(empleo.equals(listaEmpleos.get(i).getEmpleo())) {
				sueldo = listaEmpleos.get(i).getSueldo();
			}
		}
		
		return sueldo;	
	}
	
	
    public EmpleadoModel saveFoto(MultipartFile file, Long id, String nombre, String apellido, String empleo, double sueldo) {
    	
        String filename = StringUtils.cleanPath(file.getOriginalFilename());
        

        try {

            if (filename.contains("...")) {
                throw new FileSaveException(FileErrors.INVALID_FILE + filename);
            }

            EmpleadoModel empleado = new EmpleadoModel(id, nombre, apellido, empleo, sueldo, file.getBytes(), filename);
            return empleadoRepo.save(empleado);

        } catch (Exception e) {

            throw new FileSaveException(FileErrors.FILE_NOT_STORED, e);
        }

    }
    
    public Optional<EmpleadoModel> getFoto(Long id) {
    	return empleadoRepo.findById(id);
        //return empleadoRepo.findByNombre(Nombre);//.orElseThrow(() -> new FileNotFoundException(FileErrors.FILE_NOT_FOUND + fileId));
    }

    
	

}
