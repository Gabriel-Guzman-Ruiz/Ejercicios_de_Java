/*
 * Descripción: Mostrar la suma de los negativos y positivos de 20 numeros enteros introducidos. Usando Arrays
 * Autor: Gabriel Guzmán
 * Fecha: 21/10/2025
 */

package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 { 

	public static void main(String[] args) {
		
		Scanner pedido = new Scanner(System.in);
		
		int numero;
		int sumaNegativos = 0;
		int sumaPositivos = 0;
		
		final int TOTAL_NUM = 20;
		
		int [] numeros;
		numeros = new int [TOTAL_NUM];
		
		System.out.println("------------------------------------------------------------------------");
		System.out.println("GOARDA Y MUESTRA LA SUMA LOS POSITIVOS Y NEGATIVOS DE 10 NUMEROS ENTEROS");
		System.out.println("------------------------------------------------------------------------");
		
		for (int i = 0; i < TOTAL_NUM; i ++) {
			
			System.out.print("Dame el numero entero: ");
			numero = pedido.nextInt();
			
			numeros [i] = numero;
			
			if (numeros [i] > 0) {
				
				sumaPositivos = sumaPositivos + numeros [i];
					
			} else if ( numeros [i] < 0) {
					
				sumaNegativos = sumaNegativos + numeros [i];	
			}
			
		}
		
		
		System.out.println("---------------------------------------------------------------------------");
		System.out.println("La suma de todos los positivos de la secuencia de numeros: " + sumaPositivos);
		System.out.println("La suma de todos los negativos de la secuencia de numeros: " + sumaNegativos);
			
	}
}
