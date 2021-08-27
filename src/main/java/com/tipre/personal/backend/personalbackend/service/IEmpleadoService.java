package com.tipre.personal.backend.personalbackend.service;

import java.util.List;

import com.tipre.personal.backend.personalbackend.model.Empleado;

public interface IEmpleadoService {
	
	List<Empleado> buscar();
	Empleado buscarPorId(String id);
	Empleado guardar(Empleado empleado);
	void eliminar(String id);
	

}
