/*
 * Descripción: Mostrar X veses un numero X. Usando Arrays
 * Autor: Gabriel Guzmán
 * Fecha: 23/10/2025
 */

package ejercicio6;

import java.util.Scanner;

public class Ejercicio6 { 

	public static void main(String[] args) {
		
		Scanner pedido = new Scanner(System.in);
		
		int numeroN;
		int numeroM;
		
		System.out.println("------------------------------------");
		System.out.println("GOARDA Y MUESTRA N VESES EL NUMERO M");
		System.out.println("------------------------------------");
		
		System.out.print("Dime cuantas veses quieres que se repita un numero (N): ");
		numeroN = pedido.nextInt();
		
		System.out.print("Dime el numero que se repetira (M): ");
		numeroM = pedido.nextInt();
		
		System.out.println("--------------------------------");
		System.out.print(numeroN + " Veses " + numeroM + ": ");
		
		int [] numeros;
		numeros = new int [numeroN];
		
		for (int i = 0; i < numeroN; i ++) {
			
			numeros [i] = numeroM;
			
			System.out.print(numeros [i] + " ");
			
		}
		
	}
}
