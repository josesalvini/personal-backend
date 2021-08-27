package com.tipre.personal.backend.personalbackend.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.tipre.personal.backend.personalbackend.model.Empleado;

public interface IEmpleadoDao extends MongoRepository<Empleado, String> {

}
