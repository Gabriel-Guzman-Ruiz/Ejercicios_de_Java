/*
 * Descripción: Creamos una matris de 5 x 5 y la rellenamos con numeros del 1 al 25
 * Autor: Gabriel Guzmán
 * Fecha: 31/10/2025
 */

package ejercicio1;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio1 { 

	public static void main(String[] args) {
		
		int contador = 1;
		
		final int TOTAL_NUM = 5;
		
		int [] [] numeros;

		numeros = new int [TOTAL_NUM] [TOTAL_NUM];
		
		System.out.println("---------------------------------------");
		System.out.println("MATRIZ DE 5 X 5 CON NUMEROS DEL 1 AL 25");
		System.out.println("---------------------------------------");
		
		for (int i = 0; i < TOTAL_NUM; i ++) {
			
			for (int y = 0; y < TOTAL_NUM; y ++) {
				
				numeros [i] [y]  = contador;
				
				contador ++;
			
			}
		}
		
		System.out.println("--------------");
		System.out.println("La matriz es: ");
		  
		for (int i = 0; i < TOTAL_NUM; i++) {
			
            System.out.println(Arrays.toString(numeros [i]));
        
		}	

	}
}