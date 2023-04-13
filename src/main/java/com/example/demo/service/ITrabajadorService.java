package com.example.demo.service;
import java.util.List;

import com.example.demo.dto.Trabajador;
import com.example.demo.dto.Trabajo;

public interface ITrabajadorService {
	
	//metodos CRUD
	
	public List<Trabajador> listarTrabajadores(); //Listar todos 
	
	public Trabajador guardarTrabajador(Trabajador trabajador); //create
	
	public Trabajador verTrabajador(int id); //Read
	
	public Trabajador actualizarTrabajador(Trabajador trabajador); //update
	
	public void eliminarTrabajador(int id); //Delete por id
	
	public List<Trabajador> listarTrabajadorTrabajo(Trabajo trabajo);//Listar Trabajador por campo trabajo
}
