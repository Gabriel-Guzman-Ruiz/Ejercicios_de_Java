/*
 * Descripción: Codigo que muestra el cuatrado de una x cantidad de numeros.
 * Autor: Gabriel Guzmán
 * Fecha: 15/10/2025
 */

package ejercicio6;

import java.util.Scanner;

public class Ejercicio6 { 

	public static void main(String[] args) {
		
		Scanner pedido = new Scanner(System.in);
		
		double numero = 0;
		double cuatrado;
		
		System.out.println("--------------------------------");
		System.out.println("EL CUATRADO DE NUMEROS POSITIVOS");
		System.out.println("--------------------------------");
		
		do {
			
			System.out.print("Dame un numero (Pon un numero negativo para terminar la ejecucion): ");
			numero = pedido.nextDouble();
			
			if (numero >= 0) {
			
				cuatrado = numero * numero;
				
				System.out.println("-----------------------------------------------------------------");
				System.out.println("El cuatrado de " + numero + " es: " + cuatrado);
				System.out.println("-----------------------------------------------------------------");
			
			}
		
		} while (numero >= 0);
			
		System.out.println("--------------------------");
		System.out.println("La ejecucion se a detenido");
	}
					
}
		
