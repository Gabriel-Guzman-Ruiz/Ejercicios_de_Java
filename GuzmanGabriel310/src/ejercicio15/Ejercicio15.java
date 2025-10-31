/*
 * Descripción: Mostrar X veses un numero X. Usando los metodos de la clase Arrays
 * Autor: Gabriel Guzmán
 * Fecha: 28/10/2025
 */

package ejercicio15;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio15 { 

	public static void main(String[] args) {
		
		Scanner pedido = new Scanner(System.in);
		
		int numeroN;
		double numeroM;
		
		System.out.println("------------------------------------");
		System.out.println("GOARDA Y MUESTRA N VESES EL NUMERO M");
		System.out.println("------------------------------------");
		
		System.out.print("Dime cuantas veses quieres que se repita un numero (N): ");
		numeroN = pedido.nextInt();
		
		System.out.print("Dime el numero que se repetira (M): ");
		numeroM = pedido.nextDouble();
		
		System.out.println("--------------------------------");
		System.out.print(numeroN + " Veses " + numeroM + ": ");
		
		double [] numeros;
		numeros = new double [numeroN];
		
		Arrays.setAll(numeros, i -> numeroM); //Permite repenar todos los espacios de un Arrays sin la nesesidad de un for
		
		for (int i = 0; i < numeroN; i ++) {
			
			System.out.print(numeros [i] + " ");
			
		}
		
	}
}