package com.example.demo.dto;

public enum Trabajo {
	ADMINISTRATIVO(1500), COMERCIAL(2000), JURIDICO(2500);
	
	int salario;
	
	//Constructor que acepte el parametro salario
	  Trabajo(int salario) {
	        this.salario = salario;
	    }

	    public int getSalario() {
	        return salario;
	    }

		
	    
}
