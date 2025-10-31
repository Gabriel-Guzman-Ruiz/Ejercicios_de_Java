/*
 * Descripción: 
 * Autor: Gabriel Guzmán
 * Fecha: 7/10/2025
 */

package estructuraRepetitivaWhile;

import java.util.Scanner;

public class EstructuraRepetitivaWhile { 

	public static void main(String[] args) {
		
		Scanner pedido = new Scanner(System.in);
		
		double numero;
		double suma = 0;
		int limite = 0;
		
		System.out.println("----------------------------------------------------");
		System.out.println("C");
		System.out.println("----------------------------------------------------");
		
		System.out.print("Dame un numero: ");
		numero = pedido.nextDouble();
		
		while (numero != 0 && limite < 8) {
			
			suma = suma + numero; //Un acumulador
			
			System.out.print("Dame un numero: ");
			numero = pedido.nextDouble();
			
			limite = limite + 1;
		}
		
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
			
			int pasos = inicio - 1;
			
			System.out.println("----------");
			System.out.println("RESULTADOS");
			System.out.println("----------");
		
			System.out.println("Secuencia de numeros desde " + inicio + " hasta " + fin);
			
			if (inicio <= fin) {
				
				pasos = inicio - 1;
				
				while (pasos < fin) {
					
					pasos = pasos + 1;
					
					System.out.print(pasos + " ");
							
				}
			
			}else {
				
				pasos = inicio + 1;
				
				while (pasos > fin) {
					
					pasos = pasos - 1;
					
					System.out.print(pasos + " ");
							
				}
				
			}
		}
		
	}
	
}

