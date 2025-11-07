/*
 * Descripción:
 * Autor: Gabriel Guzmán
 * Fecha: 05/11/2025
 */

package metodos;

import java.util.Scanner;

public class Metodos { 

	public static void main(String[] args) {
		
		Scanner pedido = new Scanner(System.in);
		
		double numero;
		double numero2;
		String operador;
		
		double resultado;
		
		System.out.print("Numero 1: ");
		numero = pedido.nextDouble();
		
		System.out.print("Numero 2: ");
		numero2 = pedido.nextDouble();
		
		System.out.print("Operador: ");
		operador = pedido.next();
		
		char operadorChar = operador.charAt(0);
		
		resultado = operacion (numero, numero2, operadorChar);
		
		System.out.println(resultado);	
			
	}
	
	// esPar calcula si un valor es par. Devuelve un tipo booleano
	public static boolean esPar (int numero) {	
		boolean par;
		if (numero % 2 == 0) {
			par = true;
		} else {
			par = false;
		}
		return par;	
	}
	
	// esInpar calcula si un valor es inpar. Devuelve un tipo booleano
	public static boolean esImpar (int numero) {	
			
		return !esPar(numero);	
	}
		
	// factorial calcula el numero factorial de un valor. Devuelve un tipo entero
	public static long factorial (int numero) {	
		long factorial = 1;
		for (int pasos = numero; pasos > 0; pasos ++) {
			factorial = pasos * factorial;
		}
		return factorial;		
	}
		
	// factorial calcula el numero factorial de un valor. Devuelve un tipo entero
	public static double operacion (double num1, double num2, char aperador) {	
					
		double resultado = 0;
					
		switch (aperador) { 
		case '+': {
						
			resultado = num1 + num2;
					
		break; }

		case '-': {
					
			resultado = num1 - num2;
						
		break; }
					
		case '*': {
						
			resultado = num1 * num2;
						
		break; }
					
		case '/': {
						
			resultado = num1 / num2;
						
		break; }
					
		case '%': {
						
			resultado = num1 % num2;
						
		break; }
		}
					
		return resultado;		
	}
	
	// esPar calcula si un valor es par. Devuelve un tipo booleano
	public static void iniVector (int [] paramVector) {	
		paramVector [0] = 50;
		paramVector [1] = 100;
		
	}
				
}
