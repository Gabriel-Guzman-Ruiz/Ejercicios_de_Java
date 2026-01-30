/*
Descripción: Ejercicio B1 – Punto - incluimos un contructor
Autor: Gabriel Guzmán
Fecha: 15/01/2026
*/

package ejercicio01;

import java.time.LocalDate;
import java.lang.Math;

public class Punto {

	// ATRIBUTOS
	
	// Atributos de objeto
	
	private double x;
	private double y;
	
	// CONTRUCTOR
	
	public Punto (double x, double y){
		
		this.x = x;
		this.y = y;
	}
	
	public Punto (){
		
		this ((int) (Math.random()*100), (int) (Math.random()*100));
		
	}
	
	// METODOS DE OBJETOS
	
	//toString: Mustra los datos del objeto. String
	public String toString() {
	     return "Punto [X = " + this.x + ", Y = " + this.y + "]";
	 }
	
	//getX: muestra la cordenada X del punto. int
	public double getX () {
			
		return this.x;
					
	}
	
	//getY: muestra la cordenada y del punto. int
	public double getY () {
				
		return this.y;
						
	}
	
	//setX: cambia la cordenada X del punto.
	public void setX (double x) {
				
		this.x = x;
						
	}
	
	//setY: cambia la cordenada Y del punto.
	public void setY (double y) {
					
		this.y = y;
							
	}
	
	//imprime: Imprime por pantalla las coordenadas.
	public void imprime () {
						
		System.out.printf("(%d, %d) %n", this.x, this.y);
								
	}
		
	// setXY: Modifica ambas coordenadas. Es como un setter doble.
	public void setXY (double x, double y) {
						
		this.x = x;
		
		this.y = y;
										
	}
	
		
	//desplaza: Desplaza el punto la cantidad (dx,dy) indicada.
	public void desplaza (double dx, double dy) {
		
		this.x =this.x + dx;
		
		this.y =this.y + dy;
								
												
	}	
	
	
	//distancia: Calcula y devuelve la distancia entre dos puntos.
	public int distancia (Punto p) {
		
		int distancia;
		
		distancia = (int) Math.sqrt(
				((Math.pow((this.x - p.getX()), 2))) + 
				((Math.pow((this.y - p.getY()), 2))));
		
		return distancia;
												
	}
	
	// METODOS DE CONTRUCTORES
}

