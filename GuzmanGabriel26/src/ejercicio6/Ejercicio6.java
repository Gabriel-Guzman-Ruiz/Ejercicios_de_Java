/*
 * Descripción: Creador de ficha de nota de escuela, con mensaje por si no introdusen bien la nota
 * Autor: Gabriel Guzmán
 * Fecha: 3/10/2025
 */

package ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		Scanner pedido = new Scanner(System.in);
		
		String nombre;
		String apellido;
		String cicloFormativo;
		double nota;
		String resultado;
		String notaMal = "";
		
		System.out.println("--------------------------------");
		System.out.println("Creador de ficha nota de escuela");
		System.out.println("--------------------------------");
		
		System.out.print("Dame tu Nombre: ");
		nombre = pedido.nextLine();
		
		System.out.print("Dame tu apellido: ");
		apellido = pedido.nextLine();
		
		System.out.print("Dame el Ciclo Formativo: ");
		cicloFormativo = pedido.nextLine();
		
		System.out.print("Dame la nota académica: ");
		nota = pedido.nextDouble();
		
		if (nota >= 0 && nota <= 10) {
			
			if ( nota < 5) {
				
				resultado = "Insificiente";
				
			} else if ( nota < 6) {
					
				resultado = "Suficiente";
				
			} else if ( nota < 7) {
						
				resultado = "Bien";
						
			} else if ( nota < 9) {
							
				resultado = "Notable";
			
			} else if (nota < 10){
	
				resultado = "Sobresaliente";
							
			} else {
								
				resultado = "Matrícula de Honor";
								
			}
			
		} else {
			
			notaMal = "La nota académica indicada es incorrecta";
			resultado = "No es valido";
		}
		
		System.out.println("----------");
		System.out.println("RESULTADOS");
		System.out.println("----------");
		
		System.out.println("Nombre: " + nombre);
		System.out.println("Apellido: " + apellido);
		System.out.println("Ciclo Formativo: " + cicloFormativo);
		System.out.println("Nota académica: " + nota + " (" + resultado + ")");
		System.out.println("------------------------------------------------");
		System.out.println(notaMal);
		
	}
}
