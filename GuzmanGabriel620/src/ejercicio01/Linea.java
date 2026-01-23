package ejercicio01;

import java.time.LocalDate;

public class Linea {
	
	// ATRIBUTOS
	
	// Atributos de objeto
	
	private Punto puntoA;
	private double puntoB;
	
	// CONTRUCTOR
	
	public Linea(double puntoA, double puntoB) {
		
		this.puntoA = puntoA;
		this.puntoB = puntoB;
		
	}
		
	public Linea(){ 
		
		 this ();
			 
		 System.out.printf("Se creo un objeto con los datos predeterminados: (fecha = %s) %n", LocalDate.now());
			
	}

}
