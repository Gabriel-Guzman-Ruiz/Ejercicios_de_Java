/*
 * Descripción: Matriz de tamaño N x M y con valores introdizidos por teclado, mostramos la cantodad de numeros que sean iguales, mayores y menores a 0.
 * Autor: Gabriel Guzmán
 * Fecha: 29/10/2025
 */

package expresionRegular;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpresionRegular { 

	public static void main(String[] args) {
		
		// Creampos el patron para comparar
		
		Pattern patron=Pattern.compile("[0-9]{8}[a-z]");
		
		Scanner pedido = new Scanner(System.in);
		
		String dni;
		
		System.out.println("------------------");
		System.out.println("COMPROVADOR DE DNI");
		System.out.println("------------------");
		
		System.out.print("Dame tu DNI:");
		dni = pedido.next();
		
		// Preparamos la cadena para comparar
		
		Matcher texto = patron.matcher(dni);
		
		// Comprovamos la comparacion
		
		if (texto.matches()) {
			
			System.out.println("-----------------");
			System.out.println("El formato del DNI es corecto");
		
		} else {
			
			System.out.println("--------------------");
			System.out.println("El formato del DNI no es corecto");
			
		}
		  
	}
}
