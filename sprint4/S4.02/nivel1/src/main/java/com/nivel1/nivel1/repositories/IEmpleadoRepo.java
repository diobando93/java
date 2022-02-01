package com.nivel1.nivel1.repositories;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nivel1.nivel1.models.Empleado;

public interface IEmpleadoRepo extends JpaRepository<Empleado, Long>{
	
	public abstract ArrayList<Empleado> findByEmpleo(String empleo);
	
}
