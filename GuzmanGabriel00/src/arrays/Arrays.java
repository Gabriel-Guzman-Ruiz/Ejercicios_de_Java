/*
 * Descripción: Practicas con el codigo Array
 * Autor: Gabriel Guzmán
 * Fecha: 17/10/2025
 */

package arrays;

import java.util.Scanner;

public class Arrays { 

	public static void main(String[] args) {
		
		Scanner pedido = new Scanner(System.in);
		
		final int TOTAL_NUM = 20;
		
		int [] numeros;
		numeros = new int [TOTAL_NUM];
		
		for (int i = 0; i < TOTAL_NUM; i ++) {
			
			numeros [i] = (int) (Math.random() * 50);
			
		}
		
		numeros[3] = 5;
		
		for (int i = 0; i < TOTAL_NUM; i ++) {
			
			System.out.println("El valor en la pocicion " + i + " es: " + numeros[i]);
			
		}
			
	}
}
