/*
 * Descripción: Mostrar el numero menor y mayor de 10 numeros introducidos. Usando Arrays
 * Autor: Gabriel Guzmán
 * Fecha: 21/10/2025
 */

package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 { 

	public static void main(String[] args) {
		
		Scanner pedido = new Scanner(System.in);
		
		double numero;
		double maximo;
		double minimo;
		
		final int TOTAL_NUM = 10;
		
		double [] numeros;
		numeros = new double [TOTAL_NUM];
		
		System.out.println("--------------------------------------------------");
		System.out.println("GOARDA Y MUESTRA EL MENOR Y EL MAYOR DE 10 NUMEROS");
		System.out.println("--------------------------------------------------");
		
		for (int i = 0; i < TOTAL_NUM; i ++) {
			
			System.out.print("Dame el numero: ");
			numero = pedido.nextDouble();
			
			numeros [i] = numero;
			
		}
		
		maximo = numeros [0];
		minimo = numeros [0];
		
		for (int i = 0; i < TOTAL_NUM; i ++) {
				
			if (numeros [i] > maximo) {
					
				maximo = numeros [i];
					
			} else if ( numeros [i] < minimo) {
					
				minimo = numeros [i];	
			}
			
		}
		
		System.out.println("--------------------------------------------------------");
		System.out.println("El numero mas alto de la secuencia de numeros: " + maximo);
		System.out.println("El numero mas vajo de la secuencia de numeros: " + minimo);
			
	}
}
