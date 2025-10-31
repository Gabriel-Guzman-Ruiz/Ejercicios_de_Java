/*
 * Descripción: De 100 numeros aleatorios entre 0 y 1 Mostrar los numeros que son superiores o iguales que R . Usando Arrays
 * Autor: Gabriel Guzmán
 * Fecha: 23/10/2025
 */

package ejercicio8;

import java.util.Scanner;

public class Ejercicio8 { 

	public static void main(String[] args) {
		
		Scanner pedido = new Scanner(System.in);
		
		double numeroR;
		
		double [] numeros;
		
		final int TOTAL_NUM = 100;
		
		
		System.out.println("----------------------------------------------");
		System.out.println("GOARDA Y MUESTRA TODOS LOS NUMEROS DESDE P A Q");
		System.out.println("----------------------------------------------");
		
		
		System.out.print("Numero real (R): ");
		numeroR = pedido.nextDouble();
		
		numeros = new double [TOTAL_NUM];
		
		for (int i = 0; i < TOTAL_NUM; i ++) {
			
			numeros [i] = Math.random();
			
		}
		
		System.out.println("-------------------------------------------------------");
		System.out.println("De los 100 numeros entre 0 y 1 que son mayores o iguales a " + numeroR + " son: ");
		
		for (int i = 0; i < TOTAL_NUM; i ++) {
			
			if (numeros [i] >= numeroR) {
				
				System.out.println(numeros [i] + " ");
			}
			
		}
		
	}
}
