/*
 * Descripción: Mostrar la suma de 10 numeros introducidos. Usando Arrays
 * Autor: Gabriel Guzmán
 * Fecha: 21/10/2025
 */

package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 { 

	public static void main(String[] args) {
		
		Scanner pedido = new Scanner(System.in);
		
		double numero;
		double suma = 0;
		
		final int TOTAL_NUM = 10;
		
		double [] numeros;
		numeros = new double [TOTAL_NUM];
		
		System.out.println("--------------------------------------");
		System.out.println("GOARDA Y MUESTRA LA SUMA DE 10 NUMEROS");
		System.out.println("--------------------------------------");
		
		for (int i = 0; i < TOTAL_NUM; i ++) {
			
			System.out.print("Dame el numero: ");
			numero = pedido.nextDouble();
			
			numeros [i] = numero;
			
			suma = suma + numeros [i];
			
		}
		
		System.out.println("-----------------------------------");
		System.out.println("La suma de la secuencia de numeros es: " + suma);
			
	}
}


