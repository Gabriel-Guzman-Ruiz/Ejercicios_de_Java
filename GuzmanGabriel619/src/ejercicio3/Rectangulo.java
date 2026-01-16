/*
 Descripción: Ejercicio B3 – Rectángulo – incluimos un contructor
 Autor: Gabriel Guzmán
 Fecha:  15/01/2026
 */

package ejercicio3;

public class Rectangulo {
	
	// ATRIBUTOS

	// Atributos de objeto

	public int x1;
	public int y1;
	public int x2;
	public int y2;

	// CONTRUCTOR
	
	public Rectangulo(int x1, int y1, int x2, int y2){ 
		
		if (x1 >= x2 || y1 >= y2){
		
			throw new IllegalArgumentException (
			   ("Dato invalidad: x1 tiene que ser menor que x2 y y1 tiene que ser menor que y2"));
		
		}
		
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	
	}
	
	public Rectangulo(){ 
		
		 this (1, 1, 2, 2);
		 
		 System.out.println("Se creo un objeto con los datos predeterminados: (x1 = 1, y1 = 1, x2 = 2, y2 = 2)");
		
	}

	// METODOS DE OBJETOS

	// METODOS DE CONTRUCTORES
}
