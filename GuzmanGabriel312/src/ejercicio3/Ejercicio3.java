/*
 * Descripción: Crea un codigo convinando tres cadenas de caracteres recortadas.
 * Autor: Gabriel Guzmán
 * Fecha: 06/11/2025
 */

package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 { 

	public static void main(String[] args) {
		
		Scanner pedido = new Scanner(System.in);
		
		String nombre;
		String apellido1;
		String apellido2;
		
		String parte1;
		String parte2;
		String parte3;
		String parte12;
		
		String codigo;
		
		System.out.println("---------------------------------------------------");
		System.out.println("CREA UN CODIGO DE USUARIO CON EL NOMBRE Y APELLIDOS");
		System.out.println("---------------------------------------------------");
		
		System.out.print("Tu nombre: ");
		nombre = pedido.nextLine();
		
		System.out.print("Tu primer apellido: ");
		apellido1 = pedido.nextLine();
		
		System.out.print("Tu segundo apellido: ");
		apellido2 = pedido.nextLine();
			
		nombre = nombre.toUpperCase();
		
		apellido1 = apellido1.toUpperCase();
		
		apellido2 = apellido2.toUpperCase();
		
		parte1 = nombre.substring(0, 3);
		
		parte2 = apellido1.substring(0, 3);
		
		parte3 = apellido2.substring(0, 3);
		
		parte12 = parte1.concat(parte2);
		
		codigo = parte12.concat(parte3);
			
		System.out.println("----------------------");
		System.out.println("El codigo es:" + codigo);	
			
	}
}