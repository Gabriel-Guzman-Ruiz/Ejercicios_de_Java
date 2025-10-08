/*
 * Descripción: Muestra el numero mas grande entre dos
 * Autor: Gabriel Guzmán
 * Fecha: 3/10/2025
 */

package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		Scanner pedido = new Scanner(System.in);
		
		double num1;
		double num2;
		
		System.out.println("--------------------");
		System.out.println("CUAL NUMERO ES MAYOR");
		System.out.println("--------------------");
		
		System.out.print("Dame el primer numeron: ");
		num1 = pedido.nextDouble();
		
		System.out.print("Dame el segundo numeron: ");
		num2 = pedido.nextDouble();
		
		System.out.println("----------");
		System.out.println("RESULTADOS");
		System.out.println("----------");
		
		if (num1 == num2 ) {
			
			System.out.println("Los dos numeros son iguales");
			
		} else {
			
			if (num1 > num2 ) {
				
				System.out.println("El primer numero (" + num1 + ") es mayor que el segundo (" + num2 + ")");
				
			} else {
				
				System.out.println("El segundo numero (" + num2 + ") es mayor que el primero (" + num1 + ")");
				
			}
			
		}
		
	}
	
}
