/*
 * Descripción: Crea unaa matriz que contenga la tabla de multiplicar del 1 al 10.
 * Autor: Gabriel Guzmán
 * Fecha: 31/10/2025
 */

package ejercicio2;

import java.util.Arrays;

public class Ejercicio2 { 

	public static void main(String[] args) {
		
		int multiplo1 = 1;
		int multiplo2 = 1;
		
		final int TOTAL_NUM = 10;
		
		int [] [] numeros;

		numeros = new int [TOTAL_NUM] [TOTAL_NUM];
		
		System.out.println("-----------------------------------");
		System.out.println("LA TABLA DE MULTIPLICAR DEL 1 AL 10");
		System.out.println("-----------------------------------");
		
		for (int i = 0; i < TOTAL_NUM; i ++) {
			
			multiplo2 = 1;
			
			for (int y = 0; y < TOTAL_NUM; y ++) {
				
				numeros [i] [y]  = multiplo1 * multiplo2;
				
				multiplo2 ++;
			
			}
			
			multiplo1 ++;
		}
		
		System.out.println("----------------------");
		System.out.println("Tabla de multiplicar: ");
		  
		for (int i = 0; i < TOTAL_NUM; i++) {
			
            System.out.println(Arrays.toString(numeros [i]));
        
		}	

	}
}