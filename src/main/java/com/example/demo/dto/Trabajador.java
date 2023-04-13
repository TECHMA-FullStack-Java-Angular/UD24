package com.example.demo.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "trabajador")
public class Trabajador {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nombre;
	private String apellido;
	private int dni;
	@Enumerated(EnumType.STRING)
	private Trabajo trabajo;
	private int salario;

	// Constructor
	public Trabajador(int id, String nombre, String apellido, int dni, Trabajo trabajo, int salario) {

		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.trabajo = trabajo;
		this.salario = trabajo.getSalario();// asignacion de salario segun trabajo;
	}

	// getters & setters
	public Trabajador() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public Trabajo getTrabajo() {
		return trabajo;
	}

	public void setTrabajo(Trabajo trabajo) {
		this.trabajo = trabajo;
	}

	public int getSalario() {
		return trabajo.getSalario();// asignacion de salario segun trabajo
	}

	// Metodo impresion por consola
	@Override
	public String toString() {
		return "Trabajador [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", trabajo="
				+ trabajo + ", salario=" + salario + "]";
	}

}
