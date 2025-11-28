/*
 * Descripción: Creando un metodo que demuestra que alquien es mayor de edad.
 * Autor: Gabriel Guzmán
 * Fecha: 18/11/2025
 */

package ejercicio02;

import java.util.Scanner;

public class Ejercicio02 { 

	public static void main(String[] args) {
		
		Scanner pedido = new Scanner(System.in);
		
		int edad;
		boolean resultado;
		
		System.out.println("--------------------");
		System.out.println("¿ERES MAYOR DE EDAD?");
		System.out.println("--------------------");
		
		System.out.print("Tu edad: ");
		edad = pedido.nextInt();
			
		resultado = esMayorEdad (edad);
		
		if (resultado == true) {
			
			System.out.println("------------------");
			System.out.println("Eres mayor de edad");
			
		} else {
			
			System.out.println("------------------");
			System.out.println("Eres menor de edad");
			
		}
		
	}
		
	
	// esMayorEdad: demuestra si una persona es mayor de edad. boolean
		public static boolean esMayorEdad (int edad) {
			
			boolean resultado = false;
			
			if (edad >= 18)  {
				
				resultado = true;
				
			}
			
			return resultado;	
				
		}
		
}
