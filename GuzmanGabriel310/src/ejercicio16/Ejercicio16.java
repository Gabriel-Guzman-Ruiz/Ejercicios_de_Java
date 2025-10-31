/*
 * Descripción: repetir N una cantidad N de veses con los numeros del 1 al 10. Usando los metodos de la clase Arrays
 * Autor: Gabriel Guzmán
 * Fecha: 24/10/2025
 */

package ejercicio16;

import java.util.Arrays;

public class Ejercicio16 { 

	public static void main(String[] args) {
		
		int numero = 1;
		int inicio = 0;
		int finall = 1;

		final int TOTAL_NUM = 55;
		
		int [] numeros;
		numeros = new int [TOTAL_NUM];
		
		System.out.println("--------------------------------------");
		System.out.println("REPITE UN NUMERO POR EL MISMO HASTA 10");
		System.out.println("--------------------------------------");	
	
		System.out.println("-----------------------");	
		System.out.print("La cadena de numeros es: ");
		
		
		for (int i = 0; i < 10; i++ ) {
			
			Arrays.fill(numeros, inicio, finall, numero);
			
			inicio = inicio + numero;
			
			numero ++;
			
			finall = finall + numero;
			
		}
		
		for (int i = 0; i < TOTAL_NUM; i++ ) {
			
			System.out.print(numeros [i] + ", ");
		}
	
	}
}