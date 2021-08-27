package com.tipre.personal.backend.personalbackend.service.implementation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tipre.personal.backend.personalbackend.dao.IEmpleadoDao;
import com.tipre.personal.backend.personalbackend.model.Empleado;
import com.tipre.personal.backend.personalbackend.service.IEmpleadoService;

@Service
public class EmpleadoServiceImp implements IEmpleadoService{

	@Autowired
	private IEmpleadoDao empleadoDao;
	
	@Override
	public List<Empleado> buscar() {
		return empleadoDao.findAll();
	}

	@Override
	public Empleado buscarPorId(String id) {
		
		Optional<Empleado> empleado = empleadoDao.findById(id);
		if(empleado.isPresent()) {
			return empleado.get();
		}
		return null; 
	}

	@Override
	public Empleado guardar(Empleado empleado) {
		return empleadoDao.save(empleado);
	}

	@Override
	public void eliminar(String id) {
		empleadoDao.deleteById(id);
	}

}
