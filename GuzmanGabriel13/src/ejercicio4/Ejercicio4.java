/*
 * Descripción: Redondeo de un nuumero decimal con la clase "Math"
 * Autor: Gabriel Guzmán
 * Fecha: 1/10/2025
 */

package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		Scanner pedido = new Scanner(System.in);
		
		double num1;
		int redondeo;
		int mayorentero;
		int menorentero;
		
		System.out.println("------------------------------");
		System.out.println("Redondeo de un numero decimal:");
		System.out.println("------------------------------");
		
		System.out.print("Dame un numero decimal: ");
		num1 = pedido.nextDouble();
		
		redondeo = (int) Math.round(num1);
		mayorentero = (int) Math.ceil(num1);
		menorentero = (int) Math.floor(num1);
		
		System.out.println("-------------------------------------------------");
		System.out.println("El numero redondeado es: " + redondeo);
		System.out.println("El numero redondeado a la alta es: " + mayorentero);
		System.out.println("El numero redondeado a la baja es: " + menorentero);
		System.out.println("-------------------------------------------------");


	}

}
