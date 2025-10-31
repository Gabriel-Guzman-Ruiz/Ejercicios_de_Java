/*
 * Descripción: Crea un secuencia arimetica segun las indicaciones del usuario. Usando Arrays
 * Autor: Gabriel Guzmán
 * Fecha: 28/10/2025
 */

package ejercicio13;

import java.util.Scanner;

public class Ejercicio13 { 

	public static void main(String[] args) {
		
		Scanner pedido = new Scanner(System.in);
		
		double numeroInicial;
		double incremento;
		int repeticiones;
		
		double [] numeros;
		
		System.out.println("--------------------------------------------------------");
		System.out.println("GUARDAR Y MUESTRA UNA SECUENSIA ARITMETICA CREADA POR TI");
		System.out.println("--------------------------------------------------------");	
		
		System.out.print("Numero inicial: ");
		numeroInicial = pedido.nextInt();
		
		System.out.print("Incremento de los numeros: ");
		incremento = pedido.nextInt();
		
		System.out.print("Cantidad de numeros en la secuencia: ");
		repeticiones = pedido.nextInt();
		
		numeros = new double [repeticiones];
		
		System.out.println("--------------------------------------------------------");	
		System.out.print("La secuencia aritmética es: ");
		
		for (int i = 0; i < repeticiones; i++ ) {
			
			numeros [i] = numeroInicial;
			
			numeroInicial = numeroInicial + incremento;
			
			System.out.print(numeros [i] + " ");
			
		}
	
	}
}