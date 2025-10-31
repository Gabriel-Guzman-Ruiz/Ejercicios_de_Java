/*
 * Descripción: Codigo que muestra todos los numeros del 100 al 1. Usando do-while
 * Autor: Gabriel Guzmán
 * Fecha: 14/10/2025
 */

package ejercicio3;

public class Ejercicio3 { 

	public static void main(String[] args) {
		
		int numero = 101;
		
		System.out.println("------------------------------");
		System.out.println("TODOS LOS NUMEROS DEL 100 AL 1");
		System.out.println("------------------------------");
		
		do {
		
			numero --;
			
			System.out.print(numero + " ");
		
		} while (numero > 1);	
			
	}
		
}
	
