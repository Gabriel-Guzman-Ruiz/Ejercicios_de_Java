/*
 * Descripción: Mostrar todos los numeros desde X asta X numero. Usando Arrays
 * Autor: Gabriel Guzmán
 * Fecha: 23/10/2025
 */

package ejercicio7;

import java.util.Scanner;

public class Ejercicio7 { 

	public static void main(String[] args) {
		
		Scanner pedido = new Scanner(System.in);
		
		int numeroP;
		int numeroQ;
		int resta;
		int numerosEntrePQ;
		
		int [] numeros;
		
		System.out.println("----------------------------------------------");
		System.out.println("GOARDA Y MUESTRA TODOS LOS NUMEROS DESDE P A Q");
		System.out.println("----------------------------------------------");
		
		System.out.print("Primer numero (P): ");
		numeroP = pedido.nextInt();
		
		System.out.print("Segundo numero (Q): ");
		numeroQ = pedido.nextInt();
		
		resta = numeroP - numeroQ;
		numerosEntrePQ = Math.abs(resta) + 1; // El +1 se aplicapara que incluya el primer numero en la lista final.
		
		System.out.println("-------------------------------------------------------");
		System.out.print("Los numeros desde " + numeroP + " y " + numeroQ + " Son: ");
		
		numeros = new int [numerosEntrePQ];
		
		if (numeroP <= numeroQ) {
			
			for (int i = 0; i < numerosEntrePQ; i ++) {
				
				numeros [i] = numeroP;
				
				numeroP ++;
				
				System.out.print(numeros [i] + " ");
				
			}
			
		} else {
			
			for (int i = 0; i < numerosEntrePQ; i ++) {
				
				numeros [i] = numeroP;
				
				numeroP --;
				
				System.out.print(numeros [i] + " ");
				
			}
			
		}
		
	}
}