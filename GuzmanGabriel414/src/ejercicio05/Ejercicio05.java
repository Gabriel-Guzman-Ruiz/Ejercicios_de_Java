/*
 * Descripción: Creando un medodo que miestre la equivalencia de millas a kilometros.
 * Autor: Gabriel Guzmán
 * Fecha: 18/11/2025
 */

package ejercicio05;

import java.util.Scanner;

public class Ejercicio05 { 

	public static void main(String[] args) {
		
		Scanner pedido = new Scanner(System.in);
		
		int millas;
		double resultado;
		
		System.out.println("-----------------------------------");
		System.out.println("EQUIVALENCIA SE MILLAS A KILOMETROS");
		System.out.println("-----------------------------------");
		
		System.out.print("Millas: ");
		millas = pedido.nextInt();
		
		resultado = millas_a_kilometros (millas);
		
		System.out.println("-------------------------------------------------");
		System.out.println(millas + " millas son " + resultado + " kilometros");
		
	}
	
	// millas_a_kilometros: miestra la equivalencia de millas a kilometros. double
		public static double millas_a_kilometros (int millas) {
			
			double resultado;
			
			resultado = millas * 1.60934;
			
			return resultado;	
				
		}
		
}
