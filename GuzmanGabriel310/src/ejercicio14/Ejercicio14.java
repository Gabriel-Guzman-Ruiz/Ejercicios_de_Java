/*
 * Descripción: repetir N una cantidad N de veses con los numeros del 1 al 10. Usando Arrays
 * Autor: Gabriel Guzmán
 * Fecha: 24/10/2025
 */

package ejercicio14;

public class Ejercicio14 { 

	public static void main(String[] args) {
		
		int numero = 1;
		int repeticiones = 0;

		final int TOTAL_NUM = 55;
		
		int [] numeros;
		numeros = new int [TOTAL_NUM];
		
		System.out.println("--------------------------------------");
		System.out.println("REPITE UN NUMERO POR EL MISMO HASTA 10");
		System.out.println("--------------------------------------");	
	
		System.out.println("-----------------------");	
		System.out.print("La cadena de numeros es: ");
		
		for (int i = 0; i < TOTAL_NUM; i++ ) {
			
			repeticiones ++;
			
			numeros [i] = numero;
			
			if (repeticiones == numero) {
				
				numero++;
				
				repeticiones = 0;
				
			}
			
			
			System.out.print(numeros [i] + ", ");
			
		}
	
	}
}
