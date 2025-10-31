/*
 * Descripción: Pide una nota y indicale su calificacion
 * Autor: Gabriel Guzmán
 * Fecha: 9/10/2025
 */

package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		Scanner pedido = new Scanner(System.in);
		
		int nota;
		String resultado;
		
		System.out.println("--------------------");
		System.out.println("CALIFICACIÓN DE NOTA");
		System.out.println("--------------------");
		
		System.out.print("Dame tu nota: ");
		nota = pedido.nextInt();
		
		System.out.println("----------");
		System.out.println("RESULTADOS");
		System.out.println("----------");

		
		switch (nota) {
		
		case 0: case 1: case 2: case 3: case 4: case 5: {
			
			resultado = "INSUFICIENTE";
			
			System.out.println("Tu nota es: " + resultado);
			
			break;
			}
		
		case 6: {
			
			resultado = "SUFICIENTE";
			
			System.out.println("Tu nota es: " + resultado);
			
			break;
			}
		
		case 7: case 8:{
			
			resultado = "BIEN";
			
			System.out.println("Tu nota es: " + resultado);
			
			break;
			}
		
		case 9:{
			
			resultado = "NOTABLE";
			
			System.out.println("Tu nota es: " + resultado);
			
			break;
			}
		
		case 10: {
			
			resultado = "SOBRESALIENTE";
			
			System.out.println("Tu nota es: " + resultado);
			
			break;
			}
		
		default:{
			
			System.out.println("Nota introducida incorectamente");
			
			}
			
		}
	
	}
	
}
