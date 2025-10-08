/*
 * Descripción: Pidiendo datos para aseptar o denegar solisitudes de travajo, muestra el salario que persivira
 * Autor: Gabriel Guzmán
 * Fecha: 8/10/2025
 */

package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		Scanner pedido = new Scanner(System.in);
		
		String nombre;
		String apellidos;
		int edad;
		double salarioDeseado;
		int experiencia;
		int numeroProyectos;
		
		System.out.println("---------------------");
		System.out.println("ENTREVISTA DE TRAVAJO");
		System.out.println("---------------------");
		
		System.out.print("Dame tu nombre: ");
		nombre = pedido.nextLine();
		
		System.out.print("Dame tus apellidos: ");
		apellidos = pedido.nextLine();
		
		System.out.print("Dame tu edad: ");
		edad = pedido.nextInt();
		
		System.out.print("Dame tu salario deseado: ");
		salarioDeseado = pedido.nextDouble();
		
		System.out.println("----------");
		System.out.println("RESULTADOS");
		System.out.println("----------");

		
		if (salarioDeseado <= 30000 && edad <= 45) {
			
			System.out.print("Dame tus años de experiencia laboral: ");
			experiencia = pedido.nextInt();
			
			System.out.print("Dame tu numero de proyectos trabajados anteriormente: ");
			numeroProyectos = pedido.nextInt();
				
			if (experiencia >= 2 && numeroProyectos >= 3) {
				
				System.out.println("--------------------------------");
				System.out.println( "Enhorabuena. Ha sido contratado");
				
				if (experiencia > 5 || numeroProyectos > 5) {
					
					System.out.println( "Su salario sera de 30.00 euros");
					
				} else {
					
					System.out.println( "Su salario sera de 25.00 euros");
					
				}
				
			} else {
				
				System.out.println( "Lo sentimos pero no cumple nuestro perfil");
			}
			
			
		} else {
			
			System.out.println( "Lo sentimos pero no cumple nuestro perfil");
		}
	
	}
	
}