/*
 * Descripción: Codigo que muestra la media de 10 numeros negativos, positivos y la cantidad de seros introducidos.
 * Autor: Gabriel Guzmán
 * Fecha: 15/10/2025
 */

package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 { 

	public static void main(String[] args) {
		
		Scanner pedido = new Scanner(System.in);
		
		double numero;
		int ceros = 0;
		int positivos = 0;
		int negativos = 0;
		double mediaPositivo = 0;
		double mediaNegativa = 0;
		double sumaPositivos = 0;
		double sumaNegativo = 0;
		
		System.out.println("----------------------------------------------------");
		System.out.println("La Media de la suma de numeros positivos y negativos");
		System.out.println("----------------------------------------------------");
				
		for (int numeroBucles = 0; numeroBucles < 10; numeroBucles ++) {
			
			System.out.print("Dame un numero (Esta que me des 10 numeros): ");
			numero = pedido.nextDouble();
		
			if (numero > 0) {
				
				sumaPositivos = numero + sumaPositivos;
				
				positivos ++;
				
			} else if (numero < 0) {
				
				sumaNegativo = numero + sumaNegativo;
				
				negativos ++;
				
			} else {
				
				ceros ++;
			}
			
		}
			
		mediaPositivo = sumaPositivos / positivos;
		
		mediaNegativa = sumaNegativo / negativos;
			
		System.out.println("-----------------------------------------------------------------");
		System.out.println("La media de los " + positivos + " positivos introducidos es: " + mediaPositivo);
		System.out.println("-----------------------------------------------------------------");
		System.out.println("La media de los " + negativos + " negativos introducidos es: " + mediaNegativa);
		System.out.println("-----------------------------------------------------------------");
		System.out.println("La cantidad de seros introducidos fueron: " + ceros);
	}
					
}
		

