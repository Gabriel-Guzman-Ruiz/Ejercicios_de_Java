/*
 * Descripción: Intercamvio de valores de variables
 * Autor: Gabriel Guzmán
 * Fecha: 1/10/2025
 */

package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		Scanner pedido = new Scanner(System.in);
		
		double num1;
		double num2;
		double num3;
		
		System.out.println("--------------------------------------------------");
		System.out.println("Indique los dos numeros que se van a intercambiar:");
		System.out.println("--------------------------------------------------");
		
		System.out.print("Dame el valor de el primer numero: ");
		num1 = pedido.nextDouble();

		System.out.print("Dame el valor de el segundo numero: ");
		num2 = pedido.nextDouble();
		
		num3 = num1;
		num1 = num2;
		num2 = num3;
		
		System.out.println("-----------------------------------------------------------------------");
		System.out.println("Ahora el primer numero es " + num2 + " y el segundo numero es " + num1);
		System.out.println("-----------------------------------------------------------------------");


	}

}
