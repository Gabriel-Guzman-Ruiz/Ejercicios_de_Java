/*
 * Descripción: Matriz de tamaño N x M y con valores introdizidos por teclado, mostramos la cantodad de numeros que sean iguales, mayores y menores a 0.
 * Autor: Gabriel Guzmán
 * Fecha: 31/10/2025
 */

package ejercicio3;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio3 { 

	public static void main(String[] args) {
		
		Scanner pedido = new Scanner(System.in);
		
		int filas;
		int colupnas;
		int numero;
		
		int mayores = 0;
		int menores = 0;
		int iguales = 0;
		
		int [] [] matriz;
		
		System.out.println("----------------------------------------------------------------------");
		System.out.println("CUANTOS NUMEROS MAYORES, MENORES E IGIALES A 0 HAY EN UNA MATRIZ N X M");
		System.out.println("----------------------------------------------------------------------");
		
		System.out.print("Cuantas filas quieres que tenga la matriz: ");
		filas = pedido.nextInt();
		
		System.out.print("Cuantas colupnas quieres que tenga la matriz: ");
		colupnas = pedido.nextInt();
		
		matriz = new int [filas] [colupnas];
		
		for (int i = 0; i < filas; i ++) {
			
			for (int y = 0; y < colupnas; y ++) {
				
				System.out.print("Dame un numero para el espacio (" + (i + 1) + " x " + (y + 1) + ") de la matriz: ");
				numero = pedido.nextInt();
				
				matriz [i] [y]  = numero;
				
			
			}
			
		}
		
		for (int i = 0; i < filas; i ++) {
			
			for (int y = 0; y < colupnas; y ++) {
				
				if (matriz [i] [y] > 0) {
					
					mayores ++;
					
				} else if (matriz [i] [y] < 0) {
					
					menores ++;
					
				} else {
					
					iguales ++;
					
				}	
			
			}
			
		}
		
		System.out.println("-------------------------------");
		System.out.println("Nomeros mayores a 0: " + mayores);
		System.out.println("Nomeros menores a 0: " + menores);
		System.out.println("Nomeros iguales a 0: " + iguales);
		  
	}
}