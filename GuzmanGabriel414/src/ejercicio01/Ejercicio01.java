/*
 * Descripción: utilizamos metodos para multiplicar dos numeros.
 * Autor: Gabriel Guzmán
 * Fecha: 18/11/2025
 */

package ejercicio01;

import java.util.Scanner;

public class Ejercicio01 { 

	public static void main(String[] args) {
		
		Scanner pedido = new Scanner(System.in);
		
		double num1;
		double num2;
		double resultado;
		
		System.out.println("----------------------");
		System.out.println("MULTIPLICA DOS NUMEROS");
		System.out.println("----------------------");
		
		System.out.print("Numero 1: ");
		num1 = pedido.nextDouble();
		
		System.out.print("Numero 2: ");
		num2 = pedido.nextDouble();
		
		resultado = multiclicar (num1 , num2);
		
		System.out.println("-----------------------------");
		System.out.println("El resultado es: " + resultado);
		
	}
		
	
	// multiclicar: multiplica dos numeros reales. double
		public static double multiclicar (double num1 , double num2) {
			
			double resultado;
			
			resultado = num1 * num2;
			
			return resultado;	
				
		}
		
}
