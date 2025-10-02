/*
 * Descripción: 
 * Autor: Gabriel Guzmán
 * Fecha: 30/09/2025
 */

package pruevas;

import java.util.Scanner;

public class Pruevas {

	public static void main(String[] args) {
		
		Scanner pedido = new Scanner(System.in);
		
		int num1;
		int num2;
		
		
		System.out.print("Dame tu salario bruto: ");
		num1 = pedido.nextInt();
		
		System.out.print("Dame tu numero de años travajando: ");
		num2 = pedido.nextInt();
		
		int num3 = num2 *2;
			
		double num4 = num3;
		
		double num5 = num4 /100;
		
		double num6 = num1 * (num4/100);
		
		System.out.println(" -- " + num1 + " -- " + num2 + " -- " + num3 + " -- " + num4 + " -- " + num5 + " -- " + num6);

	}
}