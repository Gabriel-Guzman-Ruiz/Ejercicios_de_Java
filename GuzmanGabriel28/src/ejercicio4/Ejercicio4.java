/*
 * Descripción: Codigo que muestra la media se la suma de una cantidad x de numeros pedidos.
 * Autor: Gabriel Guzmán
 * Fecha: 15/10/2025
 */

package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 { 

	public static void main(String[] args) {
		
		Scanner pedido = new Scanner(System.in);
		
		double numero;
		int cantidadNumeros = 0;
		double suma = 0;
		double media;
		
		
		System.out.println("----------------------------------------");
		System.out.println("La Media de la suma de numeros positivos");
		System.out.println("----------------------------------------");
		
		System.out.print("Dame un numero (Escrive 0 para parar el sistema): ");
		numero = pedido.nextDouble();
		
		if (numero >= 0) {
			
			while (numero != 0) {
				
				suma = numero + suma;
				
				cantidadNumeros ++;
				
				System.out.print("Dame un numero (Escrive 0 para parar el sustema): ");
				numero = pedido.nextDouble();
				
			}
			
			media = suma / cantidadNumeros;
			
			System.out.println("-----------------------------------------------------------------");
			System.out.println("La media de los " + cantidadNumeros + " introducidos es: " + media);
			
		} else {
			
			System.out.println("-------------------------------");
			System.out.println("No se aseptan numeros negativos");
		}
			
			
	}
		
}
