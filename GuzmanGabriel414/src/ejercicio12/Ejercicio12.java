/*
 * Descripción: calcula con un metodo cuantas millas son x kilometros y despues muestralo por pantalla.
 * Autor: Gabriel Guzmán
 * Fecha: 25/11/2025
 */

package ejercicio12;

import java.util.Scanner;

public class Ejercicio12 { 
	
	public static void main(String[] args) {
		
		Scanner pedido = new Scanner(System.in);
		
		double kilometros;
		
		double millas;
		
		System.out.println("------------------------------------");
		System.out.println("La tabla de multiplicar de un numero");
		System.out.println("------------------------------------");
		
		System.out.print("Numero: ");
		kilometros = pedido.nextDouble();
			
		millas = kilometrosAmillas(kilometros);
			
		System.out.println("----------------------");
		System.out.println(kilometros + "kilometros en millas es: " + millas);
		
	}
	
	// kilometrosAmillas: . double
	public static double kilometrosAmillas (double kilometros) {
			
		double millas = 0.621371;
		
		millas = millas * kilometros;
			
		return millas;	
				
	}
		
}
