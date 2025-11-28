/*
 * Descripción: Calcula la tabla de un numero con un metodo y luego mustralo por pantalla.
 * Autor: Gabriel Guzmán
 * Fecha: 25/11/2025
 */

package ejercicio11;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio11 { 
	
	public static void main(String[] args) {
		
		Scanner pedido = new Scanner(System.in);
		
		double numero;
		
		double [] tableMultiplicar;
		
		System.out.println("------------------------------------");
		System.out.println("La tabla de multiplicar de un numero");
		System.out.println("------------------------------------");
		
		System.out.print("Numero: ");
		numero = pedido.nextDouble();
			
		tableMultiplicar = tableMultiplicar(numero);
			
		System.out.println("----------------------");
		System.out.println("La tabla de multiplicar de " + numero + " es: " + Arrays.toString(tableMultiplicar));
		
	}
	
	// tableMultiplicar: Saca la tabla de multiplicar de un numero. double Arrays
	public static double [] tableMultiplicar (double numero) {
			
		double [] tableMultiplicar;
		
		final int TABLA = 11;
		
		tableMultiplicar = new double [TABLA];
		
		for (int i = 0; i <= 10 ; i ++) {
			
			tableMultiplicar [i] = numero * i;
			
		}
			
		return tableMultiplicar;	
				
	}
		
}
