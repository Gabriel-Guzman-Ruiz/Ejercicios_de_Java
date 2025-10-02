/*
 * Descripción: Realisando ecuaciones con la clase Math
 * Autor: Gabriel Guzmán
 * Fecha: 1/10/2025
 */

package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		Scanner pedido = new Scanner(System.in);
		
		double num1;
		double num2;
		
		System.out.println("------------------------------");
		System.out.println("Escrive dos números para que: \r\n"
				+ "1. Qué número es menor, y lo muestre por pantalla.\r\n"
				+ "2. Calcule el valor del primer número elevado al segundo y lo muestre por pantalla.\r\n"
				+ "3. Calcule la raíz cuadrada del primer número y la muestre por pantalla.\r\n"
				+ "4. Calcule un valor random del segundo número y lo muestre por pantalla.");
		System.out.println("------------------------------");
		
		System.out.print("Dame el primer numero: ");
		num1 = pedido.nextDouble();
		
		System.out.print("Dame el segundo numero: ");
		num2 = pedido.nextDouble();
		
		double mayor12 =Math.min (num1, num2);
		double elevado12 =Math.pow (num1, num2);
		double raiz1 =Math.sqrt (num1);
		double random2 =Math.random () * num2;
		
		System.out.println("-------------------------------------------------");
		System.out.println("El número mas bajo es: " + mayor12);
		System.out.println( num1 + " elevado a " + num2 + " es igual a: " + elevado12);
		System.out.println("La raíz cuatrada de el primer número es: " + raiz1);
		System.out.println("Un valor aleatorio de el segundo número es: " + random2);
		System.out.println("-------------------------------------------------");


	}

}