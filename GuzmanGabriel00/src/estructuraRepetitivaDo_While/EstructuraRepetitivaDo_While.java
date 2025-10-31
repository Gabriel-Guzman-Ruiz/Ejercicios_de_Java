/*
 * Descripción: 
 * Autor: Gabriel Guzmán
 * Fecha: 7/10/2025
 */

package estructuraRepetitivaDo_While;

import java.util.Scanner;

public class EstructuraRepetitivaDo_While { 

	public static void main(String[] args) {
		
		Scanner pedido = new Scanner(System.in);
		
		double numero;
		double suma = 0;
		int limite = 0;
		
		System.out.println("----------------------------------------------------");
		System.out.println("Suma hasta 8 numeros (Escribe 0 para terminar)");
		System.out.println("----------------------------------------------------");
		
		do {
			
			System.out.print("Dame un numero: ");
			numero = pedido.nextDouble();
			
			suma = suma + numero; //Un acumulador
			
			limite = limite + 1;
			
		}while (numero != 0 && limite < 8); 
		
		System.out.println("----------");
		System.out.println("RESULTADOS");
		System.out.println("----------");
		
		System.out.println("La suma es: " + suma);
	
		{
			//Ejercicio Resuelto While
			
			int inicio;
			int fin = 0;
			
			System.out.println("----------------------------------------------------");
			System.out.println("C");
			System.out.println("----------------------------------------------------");
			
			System.out.print("Dame un inicio: ");
			inicio = pedido.nextInt();
			
			System.out.print("Dame un final: ");
			fin = pedido.nextInt();
			
			int pasos = inicio;
			
			System.out.println("----------");
			System.out.println("RESULTADOS");
			System.out.println("----------");
		
			System.out.println("Secuencia de numeros desde " + inicio + " hasta " + fin);
			
			if (inicio <= fin) {
				
				pasos = inicio - 1; // - 1 para que al contar los numeros este incliodo el valor inicial de inicio
				
				do {
					
					pasos = pasos + 1;
					
					System.out.print(pasos + " ");
							
				} while (pasos < fin);
			
			} else {
				
				pasos = inicio + 1; // + 1 para que al contar los numeros este incliodo el valor inicial de inicio
				
				do {
					
					pasos = pasos - 1;
					
					System.out.print(pasos + " ");
					
				} while (pasos > fin);
			}
			
		}
		
	}
	
}
