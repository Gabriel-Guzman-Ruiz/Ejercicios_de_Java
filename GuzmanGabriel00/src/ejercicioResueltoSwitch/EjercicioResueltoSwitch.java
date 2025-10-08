/*
 * Descripción: COMPROVADOR DE CALIFICACIONES DE EXAMEN DE TIPO TEST
 * Autor: Gabriel Guzmán
 * Fecha: 7/10/2025
 */

package ejercicioResueltoSwitch;

import java.util.Scanner;

public class EjercicioResueltoSwitch { 

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
			
			int noteTedondeado = (int) Math.floor(nota);
			
			switch (noteTedondeado) {
			
			case 0: case 1: case 2: case 3: case 4: case 5: {
				
				resultado = "INSUFICIENTE";
				
				break;
				}
			
			case 6: {
				
				resultado = "SUFICIENTE";
				
				break;
				}
			
			case 7: case 8:{
				
				resultado = "BIEN";
				
				break;
				}
			
			case 9:{
				
				resultado = "NOTABLE";
				
				break;
				}
			
			case 10: {
				
				resultado = "SOBRESALIENTE";
				
				break;
				}
			
			default:{
				
				nota = 0;
				
				resultado = "INSUFICIENTE";
				}
				
			}
		
			System.out.println("La nota es: " + noteTedondeado + " (" + resultado + ")");
			System.out.println("--------------------------------------------");
			
		} else {
			
			System.out.println("Datos erróneos");
			System.out.println("--------------");
			
		}
		
	}
	
}
