/*
 * Descripción: Codifo que le permite aal usuario guardar, modificar y ver 10 numeros enteros. Usando Arrays
 * Autor: Gabriel Guzmán
 * Fecha: 24/10/2025
 */

package ejercicio12;

import java.util.Scanner;

public class Ejercicio12 { 

	public static void main(String[] args) {
		
		Scanner pedido = new Scanner(System.in);
		
		String eleccion;
		
		int [] numeros;
		
		final int TOTAL_NUM = 10;
		
		numeros = new int [TOTAL_NUM];
		
		System.out.println("-----------------------------------------------");
		System.out.println("GUARDAR, MODIFICAR O MOSTRAR 10 NUMEROS ENTEROS");
		System.out.println("-----------------------------------------------");
		System.out.println("a. Mostrar valores");
		System.out.println("b. Introducir valor");
		System.out.println("c. Salir");
		
		
		do {
			
			System.out.println("");
			System.out.println("-----");
			System.out.print("Elige: ");
			eleccion = pedido.next();
		
			switch (eleccion) { 
			
			case "a": case "A": {
				
				System.out.println("-----------------------------");
				System.out.println("Los numeros almasenados son: ");
				
				for (int i = 0; i < TOTAL_NUM; i ++) {
					
					System.out.print(numeros [i] + " ");
					
				}
	 
			break; }
	
			case "b": case "B": {
				 
				int pocicionP;
				int numeroV;
				
				System.out.println("-----------------------------");
				System.out.print("Numero que quieras introdusir: ");
				numeroV = pedido.nextInt();
				
				System.out.print("La pocicion donde quieres que se guarde el numero: ");
				pocicionP = pedido.nextInt();
				
				numeros [pocicionP -1] = numeroV; // el -1 es para que al poner 1 se reyene el espacio 0.
				
				break;}
			
				case "c": case "C": {
					
					System.out.println("--------------------------");
					System.out.println("Se a terminado el programa");
					
					break;}	
			}
			
		} while (! eleccion.equalsIgnoreCase("c"));
	
	}
}
