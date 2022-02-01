package com.nivel1.nivel1.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nivel1.nivel1.repositories.IEmpleadoRepo;
import java.util.List;
import com.nivel1.nivel1.models.Empleado;
import com.nivel1.nivel1.models.SueldoModel;


@Service	
public class EmpleadoService {
	
	@Autowired
	IEmpleadoRepo empleadoRepo;
	
	public ArrayList<Empleado> obtenerEmpleados(){
		return (ArrayList<Empleado>) empleadoRepo.findAll();
	}
	
	public Empleado guradarEmpleado(Empleado empleado) {
		return empleadoRepo.save(empleado);
	}
	
	public ArrayList<Empleado> findByEmpleo(String empleo){
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
		int aux;
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

}
