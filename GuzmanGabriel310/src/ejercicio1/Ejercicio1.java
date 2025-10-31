/*
 * Descripción: Mostrar en orden 10 numeros introducidos. Usando Arrays
 * Autor: Gabriel Guzmán
 * Fecha: 21/10/2025
 */

package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 { 

	public static void main(String[] args) {
		
		Scanner pedido = new Scanner(System.in);
		
		double numero;
		
		final int TOTAL_NUM = 10;
		
		double [] numeros;
		numeros = new double [TOTAL_NUM];
		
		System.out.println("---------------------------");
		System.out.println("GOARDA Y MUESTRA 10 NUMEROS");
		System.out.println("---------------------------");
		
		for (int i = 0; i < TOTAL_NUM; i ++) {
			
			System.out.print("Dame el numero: ");
			numero = pedido.nextDouble();
			
			numeros [i] = numero;
			
		}
		
		System.out.println("-------------------------------------------------------");
		System.out.print("La secuencia de numeros es: ");
		
		for (int i = 0; i < TOTAL_NUM; i ++) {
			
		System.out.print(numeros [i] + " ");
			
		}
			
	}
}

