/*
 * Descripción:
 * Autor: Gabriel Guzmán
 * Fecha: 6/10/2025
 */

package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		Scanner pedido = new Scanner(System.in);
		
		int numero = 1;
		
		System.out.println("--------------------------");
		System.out.println("Detactor de numeros primos");
		System.out.println("--------------------------");
		
		if (numero ==1) {
			System.out.println("--------------------------");
			System.out.println(numero + " es un numero primo.");
		} else{ 
			System.out.println("--------------------------");
			System.out.println(numero + " no es un numero primo.");
		}
	}
}