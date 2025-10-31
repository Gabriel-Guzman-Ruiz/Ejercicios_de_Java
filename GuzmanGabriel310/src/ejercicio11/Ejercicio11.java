/*
 * Descripción: Mostramos un arrays con los numeros del 1 al 100 y otro con los numeros del 100 al 1.
 * Autor: Gabriel Guzmán
 * Fecha: 24/10/2025
 */

package ejercicio11;

public class Ejercicio11 { 

	public static void main(String[] args) {
		
		
		int [] numeros;
		int [] numerosInvertidos;
		
		final int TOTAL_NUM = 100;
		
		System.out.println("--------------------------------------------------------------------");
		System.out.println("GOARDA Y MUESTRA LOS NUMEROS DEL 1 AL 100 Y LOS NUMEROS DEL 100 AL 1");
		System.out.println("--------------------------------------------------------------------");

		numeros = new int [TOTAL_NUM];
		numerosInvertidos = new int [TOTAL_NUM];
		
		for (int i = 0; i < TOTAL_NUM; i ++) {
			
			numeros [i] = i + 1;
	
		}
		
		int i2 = 0; 
		
		for (int i = 99 ; i >= 0; i -- , i2++) {
			
			numerosInvertidos [i2] = numeros [i];
	
		}
		
		System.out.println("------------------------");
		System.out.println("Los numeros del 1 al 100: ");
		
		for (int i = 0; i < TOTAL_NUM; i ++) {
				
			System.out.print(numeros [i] + " ");
			
		}
		
		System.out.println("");
		System.out.println("------------------------");
		System.out.println("Los numeros del 100 al 1: ");
		
		for (int i = 0; i < TOTAL_NUM; i ++) {
				
			System.out.print(numerosInvertidos [i] + " ");
			
		}
	
	}
}
