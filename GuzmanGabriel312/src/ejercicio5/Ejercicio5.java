/*
 * Descripción: Comando que identifica si un texto es un palindromo.
 * Autor: Gabriel Guzmán
 * Fecha: 06/11/2025
 */

package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 { 

	public static void main(String[] args) {
		
		Scanner pedido = new Scanner(System.in);
		
		String texto;
		
		boolean palintromo;
		
		System.out.println("---------------------------------------");
		System.out.println("IDENTIFICA SI UN TEXTO ES UN PALÍNDROMO");
		System.out.println("---------------------------------------");
		
		System.out.print("Texto: ");
		texto = pedido.nextLine();
		
		palintromo = esPalindromo(texto);
			
			
		if (palintromo == true){
				
			System.out.println("----------------------------");
			System.out.println("El texto si es un palíntromo");	
				
		} else {
			
			System.out.println("----------------------------");
			System.out.println("El texto no es un palíntromo");		
			
		}
			
	}
	
	// esPalindromo 
		public static boolean esPalindromo (String texto) {
			
			boolean verdadero = true;
			int largo;
			int contadorInicial = 0;
			int contadorFinal;
			
			char vocalInicial;
			char vocalFinal;
			
			texto = texto.toLowerCase();
			
			largo = texto.length();
			
			contadorFinal = largo -1;
			
			for (int i = 0 ; i < largo/2; i++) {
				
				vocalInicial = texto.charAt(contadorInicial);
				vocalFinal = texto.charAt(contadorFinal);
				
				contadorInicial ++;
				contadorFinal --;
				
				if (vocalInicial != vocalFinal && vocalInicial !=' ' && vocalFinal !=' ') {
					
					verdadero = false;
					
				}
				
			}
			
			return verdadero;	
				
		}
		
}
