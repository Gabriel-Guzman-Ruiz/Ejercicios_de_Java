/*
 * Descripción: Muestra un Arrays con 30 numeros del 0 al 9 aaleatorios y ordenados. Usando los metodos de la clase Arrays
 * Autor: Gabriel Guzmán
 * Fecha: 29/10/2025
 */

package ejercicio18;

import java.util.Arrays;

public class Ejercicio18 { 

	public static void main(String[] args) {
		
		final int TOTAL_NUM = 30;
		
		int [] numeros;
		
		numeros = new int [TOTAL_NUM];
		
		System.out.println("-------------------------------");
		System.out.println("30 UMEROS ALEATORIOS DEL 0 AL 9");
		System.out.println("-------------------------------");
		
		Arrays.setAll(numeros, i -> (int) (Math.random()*10));
		
		Arrays.sort(numeros);
			
		System.out.println("----------------------------------------------------------------------------");
		System.out.println("La secuensia de numeros aleatorios ordenados es: " + Arrays.toString(numeros));
	}
}