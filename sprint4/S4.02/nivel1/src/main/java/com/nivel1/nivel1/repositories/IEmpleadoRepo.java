package com.nivel1.nivel1.repositories;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nivel1.nivel1.models.EmpleadoModel;

public interface IEmpleadoRepo extends JpaRepository<EmpleadoModel, Long>{
	
	public ArrayList<EmpleadoModel> findByEmpleo(String empleo);
	public EmpleadoModel findByNombre(String nombre);

	
}
