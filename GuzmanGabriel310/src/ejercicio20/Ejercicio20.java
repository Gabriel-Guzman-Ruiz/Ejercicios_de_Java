/*
 * Descripción: . Usando los metodos de la clase Arrays
 * Autor: Gabriel Guzmán
 * Fecha: 29/10/2025
 */

package ejercicio20;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio20 { 

	public static void main(String[] args) {
		
		Scanner pedido = new Scanner(System.in);
		
		int puntuacion;
		int pocicion = 7;
		
		final int TOTAL_NUM = 8;
		
		int [] puntuaciones;
		int [] puntuacionesOrdenadas;

		puntuaciones = new int [TOTAL_NUM];
		puntuacionesOrdenadas = new int [TOTAL_NUM];
		
		System.out.println("------------------------------------------------");
		System.out.println("RODENA LA MONTUACION DE AJETRES DE MAYOR A MENOR");
		System.out.println("------------------------------------------------");
		
		for (int i = 0; i < TOTAL_NUM; i ++) {
			
			System.out.print("Dime la puntuacion de un jugador (" + (i + 1) + " de 8): ");
			puntuacion = pedido.nextInt();
			
			puntuaciones [i] = puntuacion;
			
		}
		
		Arrays.sort(puntuaciones);
		
		for (int i = 0; i < TOTAL_NUM; i ++) {
			
			puntuacionesOrdenadas [i] = puntuaciones [pocicion];
			
			pocicion --;
			
		}
			
			System.out.println("-----------------------------------------------------------------------");
			System.out.println("La lista de puntuaciones es: " +  Arrays.toString(puntuacionesOrdenadas));

	}
}