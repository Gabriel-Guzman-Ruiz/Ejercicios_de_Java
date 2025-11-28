/*
 * Descripción: Creando un medodo que identifique si un numero es negativo, positivo o cero.
 * Autor: Gabriel Guzmán
 * Fecha: 18/11/2025
 */

package ejercicio04;

import java.util.Scanner;

public class Ejercicio04 { 

	public static void main(String[] args) {
		
		Scanner pedido = new Scanner(System.in);
		
		int num1;
		int resultado;
		
		System.out.println("----------------------------");
		System.out.println("ES POSITIVO, NEGATIVO O CERO");
		System.out.println("----------------------------");
		
		System.out.print("Numero: ");
		num1 = pedido.nextInt();
		
		resultado = dimeSigno (num1);
		
		if (resultado == 1) {
			
			System.out.println("-------------------");
			System.out.println(num1 + " es positivo");
			
		}else if (resultado == -1) {
			
			System.out.println("-------------------");
			System.out.println(num1 + " es negativo");
			
		} else {
			
			System.out.println("---------------");
			System.out.println(num1 + " es cero");
			
		}
		
	}
	
	// dimeSigno: dise si el numero es positivo, negarivo o 0. int
		public static int dimeSigno (int num1) {
			
			int resultado;
			
			if (num1 > 0) {
				
				resultado = 1;
				
			} else if (num1 < 0){
				
				resultado = -1;
				
			} else {
				
				resultado = 0;
				
			}
			
			return resultado;	
				
		}
		
}
