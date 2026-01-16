/*
 Descripción: Ejercicio B1 – Punto - incluimos un contructor
 Autor: Gabriel Guzmán
 Fecha: 15/01/2026
 */

package ejercicio1;

public class Principal {
	public static void main(String[] args) {
		
		Punto p1 = new Punto(5,0);
		Punto p2 = new Punto(10,10);
		Punto p3 = new Punto(3,7);
		
		System.out.println("punto 1: x = "+ p1.x + " y = "+ p1.y);
		System.out.println("punto 2: x = "+ p2.x + " y = "+ p2.y);
		System.out.println("punto 3: x = "+ p3.x + " y = "+ p2.y);
		
	}
	
}
