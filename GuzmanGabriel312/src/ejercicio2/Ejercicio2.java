/*
 * Descripción: compara dos cadenas de caracteres sin importar las mayusculas y muestra si son iguales o no. 
 * Autor: Gabriel Guzmán
 * Fecha: 06/11/2025
 */

package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 { 

	public static void main(String[] args) {
		
		Scanner pedido = new Scanner(System.in);
		
		String texto1;
		String texto2;
		boolean iguales;
		
		System.out.println("---------------------------------");
		System.out.println("COMPARA SI DOS TEXTOS SON IGUALES");
		System.out.println("---------------------------------");
		
		System.out.print("Primer texto: ");
		texto1 = pedido.nextLine();
		
		System.out.print("Segundo texto: ");
		texto2 = pedido.nextLine();
			
		texto1 = texto1.toLowerCase();
		
		texto2 = texto2.toLowerCase();
		
		iguales = texto1.equals(texto2);
		
		if (iguales == true) {
			
			System.out.println("----------------------");
			System.out.println("Los textos son iguales");
			
		} else {
			
			System.out.println("-------------------------");
			System.out.println("Los textos no son iguales");
			
		}	
			
	}
}

