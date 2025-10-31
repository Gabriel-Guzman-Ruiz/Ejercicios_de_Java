/*
 * Descripción: Programa de una calculadora simple de dos numeros
 * Autor: Gabriel Guzmán
 * Fecha: 10/10/2025
 */

package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		Scanner pedido = new Scanner(System.in);
		
		double num1;
		double num2;
		int operacion;
		double resultado;
		
		System.out.println("-------------");
		System.out.println("Calculadora simple");
		System.out.println("-------------");
		
		System.out.print("Introduzca el valor 1: ");
		num1 = pedido.nextDouble();
		
		System.out.print("Introduzca el valor 2: ");
		num2 = pedido.nextDouble();
		
		System.out.println("-------------------");
		System.out.println("(1)  Suma");
		System.out.println("(2)  Resta");
		System.out.println("(3)  Multiplicación");
		System.out.println("(4)  División");
		
		System.out.println("------------------------------------------------------------");
		System.out.print(" Indique la operación que quiere realizar (Inserte un número):");
		operacion = pedido.nextInt();
		
		switch (operacion) {
		
		case 1: {
			
			resultado = num1 + num2;
			
			break;
			}
		
		case 2: {
			
			resultado = num1 - num2;
			
			break;
			}
		
		case 3: {
			
			resultado = num1 * num2;
			
			break;
			}
		
		case 4: {
			
			resultado = num1 / num2;
			
			break;
			}
		
		default: {
			
			resultado = 0;
			
			System.out.println("----------------------------------");
			System.out.println("NO AS INTRODICIDO UN NUMERO VALIDO");		
			System.out.println("----------------------------------");
			}
			
			
			
			
		}
		
		System.out.println("-----------------------");
		System.out.println("Resultado: " + resultado);
			
	}
	
}
