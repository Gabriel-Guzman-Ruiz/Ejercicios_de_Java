/*
 * Descripción: 
 * Autor: Gabriel Guzmán
 * Fecha: 12/11/2025
 */

package guzman;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio2 { 

	public static void main(String[] args) {
		
		Scanner pedido = new Scanner(System.in);	
		
		int numero;
		
		final int TOTAL_LINEAS = 3;
		final int TOTAL_COLUMNAS = 10;
		
		int [] [] numeros;
		numeros = new int [TOTAL_LINEAS] [TOTAL_COLUMNAS];
		
		System.out.println("------------------------------------");
		System.out.println("GOARDA Y MUESTRA N VESES EL NUMERO M");
		System.out.println("------------------------------------");
		
		for (int i = 0; i < TOTAL_LINEAS; i ++) {
			
			for (int y = 0; y < TOTAL_COLUMNAS; y ++) {
				
				numeros [i] [y]  = (int) Math.random() * 100;
			
			}
		}
		
		for (int i = 0; i < TOTAL_LINEAS; i++) {
			
            System.out.println(Arrays.toString(numeros [i]));
        
		}
		
	}
}

