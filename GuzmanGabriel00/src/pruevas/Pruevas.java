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
		
		double nota;
		String resultado = "nada";
		
		System.out.println("-----------------------------");
		System.out.println("COMPROVADOR DE CALIFICACIONES");
		System.out.println("-----------------------------");
		
		System.out.print("Introduse la nota de el examen: ");
		nota = pedido.nextDouble();
		
		System.out.println("----------");
		System.out.println("RESULTADOS");
		System.out.println("----------");
		
		if (nota >= 0 && nota <= 10) {
			
			if ( nota < 5) {
				
				resultado = "INSUFICIENTE";
				
			} else if ( nota < 6) {
					
				resultado = "SUFICIENTE";
				
			} else if ( nota < 7) {
						
				resultado = "BIEN";
						
			} else if ( nota < 9) {
							
				resultado = "NOTABLE";
							
			} else {
								
				resultado = "SOBRESALIENTE";
								
			}
			
		} else {
			
			resultado = "No es valido";
		}
		
		System.out.println("Tu calificación es: " + resultado);
		
	}
	
}