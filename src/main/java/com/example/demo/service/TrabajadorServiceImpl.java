package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ItrabajadorDao;
import com.example.demo.dto.Trabajador;

@Service
public class TrabajadorServiceImpl implements ITrabajadorService{
	
	//Anotacion para utilizar los metodos de la interficie ItrabajadorDao como si la instanciaramos
	@Autowired
	ItrabajadorDao iTrabajadorDao;

	@Override
	public List<Trabajador> listarTrabajadores() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Trabajador guardarTrabajador(Trabajador trabajador) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Trabajador verTrabajador(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Trabajador actualizarTrabajador(Trabajador trabajador) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void eliminarTrabajador(Long id) {
		// TODO Auto-generated method stub
		
	}

}
