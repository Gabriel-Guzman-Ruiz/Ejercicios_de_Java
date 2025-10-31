/*
 * Descripción: Codigo que le pide al usuario que adivine un numero aleatorio entre 0 y 50.
 * Autor: Gabriel Guzmán
 * Fecha: 15/10/2025
 */

package ejercicio7;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio7 { 

	public static void main(String[] args) {
		
		Scanner pedido = new Scanner(System.in);
		Random random = new Random();
		
		int numero = -1;
		int numeroAleatorio = 0;
		int intentos = 1;
		int maximo = 50;
		
		System.out.println("------------------------------------------");
		System.out.println("ADIVINA EL NUMERO N ALEATORIO ENTRE 0 Y 50");
		System.out.println("------------------------------------------");
		
		
		numeroAleatorio = random.nextInt( maximo + 1);
				
		do {
			
			System.out.print("Dame un numero entre 0 y 50: ");
			numero = pedido.nextInt();
			
			if (numero < numeroAleatorio) {
				
				System.out.println("---------------------------------------");
				System.out.println("El numero " + numero + " es menor que N");
				
			} else if (numero > numeroAleatorio) {
				
				System.out.println("---------------------------------------");
				System.out.println("El numero " + numero + " es mayor que N");
				
			} else {
				
				System.out.println("---------------------------------------");
				System.out.println("FELICIDADES, N es: " + numero + ". Te a tomado intentos " + intentos + " para encontrarlo");
				
			}
			
			intentos ++;
		
		} while (numero != numeroAleatorio);
			
		System.out.println("--------------------------");
		System.out.println("La ejecucion se a detenido");
	}
					
}
	
