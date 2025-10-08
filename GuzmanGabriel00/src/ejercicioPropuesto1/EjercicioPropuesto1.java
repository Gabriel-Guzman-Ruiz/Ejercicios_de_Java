/*
 * Descripción: COMPROVADOR DE CALIFICACIONES DE EXAMEN DE TIPO TEST
 * Autor: Gabriel Guzmán
 * Fecha: 7/10/2025
 */

package ejercicioPropuesto1;

import java.util.Scanner;

public class EjercicioPropuesto1 { 

	public static void main(String[] args) {
		
		Scanner pedido = new Scanner(System.in);
		
		int aciertos;
		int fallos;
		String resultado = "nada";
		
		System.out.println("----------------------------------------------------");
		System.out.println("COMPROVADOR DE CALIFICACIONES DE EXAMEN DE TIPO TEST");
		System.out.println("----------------------------------------------------");
		
		System.out.print("Introduse el numero de preguntas acertadas: ");
		aciertos = pedido.nextInt();
		
		System.out.print("Introduse el numero de preguntas falladas: ");
		fallos = pedido.nextInt();
		
		System.out.println("----------");
		System.out.println("RESULTADOS");
		System.out.println("----------");
		
		int numPreguntas = aciertos + fallos;
		
		if (numPreguntas >= 0 && numPreguntas <= 20) {
			
			double puntosAciertos = aciertos * 0.5;
			
			double puntosFallos = fallos * 0.25;
			
			double nota =  puntosAciertos - puntosFallos;
			
			if (nota < 0) {
				
				nota = 0;
				
			} else if ( nota < 5) {
				
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
		
			System.out.println("La nota es: " + nota + " (" + resultado + ")");
			System.out.println("--------------------------------------------");
			
		} else {
			
			System.out.println("Datos erróneos");
			System.out.println("--------------");
			
		}
		
	}
	
}