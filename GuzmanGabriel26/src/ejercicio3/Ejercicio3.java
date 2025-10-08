/*
 * Descripción: Comprieva si el usuario comple los requisitos para estudiar
 * Autor: Gabriel Guzmán
 * Fecha: 3/10/2025
 */

package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		Scanner pedido = new Scanner(System.in);
		
		String nombre;
		byte edad;
		String apellido;
		
		System.out.println("--------------------");
		System.out.println("SOLICITUD DE ESTUDIO");
		System.out.println("--------------------");
		
		System.out.print("Dame tu edad: ");
		edad = pedido.nextByte();
		
		System.out.println("----------");
		System.out.println("RESULTADOS");
		System.out.println("----------");
		
		if (edad >= 18){
			
			System.out.print("Dame tu nombre: ");
			nombre = pedido.next();
			
			System.out.print("Dame tu apellido: ");
			apellido = pedido.next();
			
			System.out.println("--------------------------");
			System.out.println("Nombre: " + nombre + "\r\n"
					+ "Apellidos: "  + apellido + "\r\n"
					+ "Edad: "  + edad + "\r\n"
					+ "Usted ha sido admitido");
			
		} else { 
			
			System.out.println( "No tiene la edad requerida para realizar estos estudios.");
		}
		
	}
	
}

