/*
 * Descripción: 
 * Autor: Gabriel Guzmán
 * Fecha: 30/09/2025
 */

package estructuraCondicional;

import java.util.Scanner;

public class EstricturaCondicional {

	public static void main(String[] args) {
		
		Scanner pedido = new Scanner(System.in);
		
		int edad;
		
		System.out.print("Dame tu edad: ");
		edad = pedido.nextInt();
		
		if (edad > 17) {
			
			System.out.println("Eres machor de edad");
			
		}
		
		if (edad < 18) {
			
			System.out.println("Eres menor de edad");
			
		}

	}
}
