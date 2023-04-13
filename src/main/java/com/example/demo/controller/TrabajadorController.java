package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Trabajador;
import com.example.demo.service.TrabajadorServiceImpl;

@RestController
@RequestMapping("/api")
public class TrabajadorController {
	
	@Autowired
	TrabajadorServiceImpl trabajadorServiceImpl;
	
	@GetMapping("/trabajadores")
	public List<Trabajador> listarTrabajadores(){
		return trabajadorServiceImpl.listarTrabajadores();
	}

	@PostMapping("/trabajadores")
	public Trabajador salvarTrabajador(@RequestBody Trabajador trabajador) {
		return trabajadorServiceImpl.guardarTrabajador(trabajador);
	}
	
	@GetMapping("/trabajadores/{id}")
	public Trabajador verTrabajadores(@PathVariable(name="id")int id) {
		
		Trabajador trabajadorId= new Trabajador();
		
		trabajadorId=trabajadorServiceImpl.verTrabajador(id);
		
		System.out.println("Trabajador por id:"+trabajadorId);
		
		return trabajadorId;
	}
	
	@PutMapping("/trabajadores/{id}")
	public Trabajador actualizarTrabajador(@PathVariable(name="id")int id, @RequestBody Trabajador trabajador) {
		
		Trabajador trabajadorSeleccionado = new Trabajador();
		Trabajador trabajadorActualizado = new Trabajador();
		
		trabajadorSeleccionado=trabajadorServiceImpl.verTrabajador(id);
		
		trabajadorSeleccionado.setNombre(trabajador.getNombre());
		trabajadorSeleccionado.setApellido(trabajador.getApellido());
		trabajadorSeleccionado.setDni(trabajador.getDni());
		trabajadorSeleccionado.setTrabajo(trabajador.getTrabajo());
		
		trabajadorActualizado = trabajadorServiceImpl.actualizarTrabajador(trabajadorSeleccionado);
		
		System.out.println("El trabajador actualizado es: "+ trabajadorActualizado);
		
		return trabajadorActualizado;
	}
	
	@DeleteMapping("/trabajadores/{id}")
	public void eliminarTrabajador(@PathVariable(name="id")int id) {
		trabajadorServiceImpl.eliminarTrabajador(id);
	}
}
