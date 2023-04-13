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
		
		return iTrabajadorDao.findAll();
	}

	@Override
	public Trabajador guardarTrabajador(Trabajador trabajador) {
	
		return iTrabajadorDao.save(trabajador);
	}

	@Override
	public Trabajador verTrabajador(int id) {
		
		return iTrabajadorDao.findById(id).get();
	}

	@Override
	public Trabajador actualizarTrabajador(Trabajador trabajador) {
		
		return iTrabajadorDao.save(trabajador);
	}

	@Override
	public void eliminarTrabajador(int id) {
		
		iTrabajadorDao.deleteById(id);
	}

}
