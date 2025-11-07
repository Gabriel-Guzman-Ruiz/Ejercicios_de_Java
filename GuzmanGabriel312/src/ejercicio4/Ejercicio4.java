/*
 * Descripción: 
 * Autor: Gabriel Guzmán
 * Fecha: 06/11/2025
 */

package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 { 

	public static void main(String[] args) {
		
		Scanner pedido = new Scanner(System.in);
		
		String texto;
		
		int numeroA = 0;
		int numeroE = 0;
		int numeroI = 0;
		int numeroO = 0;
		int numeroU = 0;
		
		System.out.println("---------------------------------------------------");
		System.out.println("CREA UN CODIGO DE USUARIO CON EL NOMBRE Y APELLIDOS");
		System.out.println("---------------------------------------------------");
		
		System.out.print("Tu nombre: ");
		texto = pedido.nextLine();
			
		
			
		System.out.println("----------------------");
		System.out.println("El codigo es:" + codigo);	
			
	}
	
	// contarIgual
		public static int contarIgual (String texto, char vocal) {	
						
			texto = texto.toLowerCase();
			
			int cantidad = 0;
			int largo;
			
			largo = texto.length();
			
						
			return cantidad;		
		}
}