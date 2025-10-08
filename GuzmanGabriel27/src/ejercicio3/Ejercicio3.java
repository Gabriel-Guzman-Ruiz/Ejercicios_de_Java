/*
 * Descripción: Pidiendo datos para aseptar o denegar solisitudes de travajo
 * Autor: Gabriel Guzmán
 * Fecha: 8/10/2025
 */

package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		Scanner pedido = new Scanner(System.in);
		
		int nombre;
		String apellidos;
		
		System.out.println("---------------------");
		System.out.println("ENTREVISTA DE TRAVAJO");
		System.out.println("---------------------");
		
		System.out.print("Dame tu nombre: ");
		nombre = pedido.nextLine();
		
		System.out.print("Dame tus apellidos: ");
		apellidos = pedido.nextLine();
		
		System.out.println("----------");
		System.out.println("RESULTADOS");
		System.out.println("----------");

		
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
	
	}
	
}
