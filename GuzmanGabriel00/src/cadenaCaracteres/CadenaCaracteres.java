/*
 * Descripción: 
 * Autor: Gabriel Guzmán
 * Fecha: 23/10/2025
 */

package cadenaCaracteres;

import java.util.Scanner;

public class CadenaCaracteres {

	public static void main(String[] args) {
			
		Scanner pedido = new Scanner(System.in);
			
		String nombre;
			
		System.out.println("------------------------------------------------------");
		System.out.println("DIME TU NOMBRE");
		System.out.println("----------------------------------------------------------");
		
		System.out.print("Dame tu nombre: ");
		nombre = pedido.nextLine();
		
		int tamayo = nombre.length(); // Para sacar la longitud del texto
		
		System.out.println("----------------------------------------------------------");
		System.out.println("El tamayo es: " + tamayo);
		
		String primeraLetra = nombre.substring(0, 1);
		
		String primeraLetraMayuscula = primeraLetra.toUpperCase();
		
		String letrasMinisculas = nombre.substring(1);
		
		System.out.println("----------------------------------------------------------");
		System.out.println("El tamayo es: " + primeraLetraMayuscula + letrasMinisculas);
		
	}
}
