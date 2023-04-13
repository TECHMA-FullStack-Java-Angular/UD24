package com.example.demo.dto;

import org.hibernate.annotations.Formula;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="trabajador")

public class Trabajador {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	private String nombre;
	private String apellido;
	private int dni;
	@Enumerated(EnumType.STRING)
	private Trabajo trabajo;
	@Formula(value = "calcularSalario(trabajo)")
	private float salario;
	
	



	//Constructor
	public Trabajador(Long id, String nombre, String apellido, int dni, Trabajo trabajo, float salario) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.trabajo = trabajo;
		this.salario = salario;
	}


	//getters & setters
	public Trabajador() {
		super();
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
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


	public float getSalario() {
		return salario;
	}


	public void setSalario(float salario) {
		this.salario = salario;
	}


	//Metodo impresion por consola
	@Override
	public String toString() {
		return "Trabajador [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", trabajo="
				+ trabajo + ", salario=" + salario + "]";
	}
	 
	//Metodo asignacion de salario segun trabajo
	 public float calcularSalario(Trabajo trabajo) {
	        switch (trabajo) {
	            case ADMINISTRATIVO:
	                return 1500;
	            case COMERCIAL:
	                return 2000;
	            case JURIDICO:
	                return 2500;
	            default:
	                return 0;
	        }
	 }
	 
	 
	

}
