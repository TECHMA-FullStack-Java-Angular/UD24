package com.example.demo.dao;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.dto.Trabajador;
import com.example.demo.dto.Trabajo;

public interface ItrabajadorDao extends JpaRepository<Trabajador, Integer>{
	
	//Listar empleados por campo trabajo
		public List<Trabajador> findByTrabajo(Trabajo trabajo);

}
