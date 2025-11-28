/*
 * Descripción: Creando un medodo que entre dos numeros diga cual es menor.
 * Autor: Gabriel Guzmán
 * Fecha: 18/11/2025
 */

package ejercicio03;

import java.util.Scanner;

public class Ejercicio03 { 

	public static void main(String[] args) {
		
		Scanner pedido = new Scanner(System.in);
		
		int num1;
		int num2;
		int resultado;
		
		System.out.println("----------------------");
		System.out.println("EL NUMERO MENOR DE DOS");
		System.out.println("----------------------");
		
		System.out.print("Numero 1: ");
		num1 = pedido.nextInt();
		
		System.out.print("Numero 2: ");
		num2 = pedido.nextInt();
		
		resultado = minimo (num1 , num2);
		
		System.out.println("-----------------------------------");
		System.out.println("El numero mas vajo es: " + resultado);
		
	}
		
	
	// minimo: muestra el numero menor de dos. int
		public static int minimo (int num1 , int num2) {
			
			int resultado;
			
			if (num1 >= num2) {
				
				resultado = num2;
				
			} else {
				
				resultado = num1;
				
			}
			
			return resultado;	
				
		}
		
}
