/*
 * Descripción: separa una cadena de caracteres y los guarda en un Arrays.
 * Autor: Gabriel Guzmán
 * Fecha: 04/11/2025
 */

package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 { 

	public static void main(String[] args) {
		
		Scanner pedido = new Scanner(System.in);
		
		String texto;
		int NumeroPartes;
		
		String [] partes;
		
		System.out.println("----------------------------------");
		System.out.println("SEPARA LAS PALABRAS EN UNA ORACION");
		System.out.println("----------------------------------");
		
		System.out.print("Texto que quieres partir: ");
		texto = pedido.nextLine();
			
		partes = texto.split(" ");
		
		NumeroPartes = partes.length;
		
		System.out.println("------------------");
		System.out.println("El texto partido: ");
		
		for (int i = 0; i < NumeroPartes; i ++) {
			
			System.out.println(partes [i]);	
			
		}
		
		
			
	}
}
