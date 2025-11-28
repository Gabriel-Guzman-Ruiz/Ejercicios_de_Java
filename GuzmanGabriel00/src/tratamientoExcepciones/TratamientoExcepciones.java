	/*
	 * Descripción: Creamos un metodo que calcule el descuento de un producto y despues lo mostramos por pantalla.
	 * Autor: Gabriel Guzmán
	 * Fecha: 25/11/2025
	 */

	

package tratamientoExcepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TratamientoExcepciones {

		
		public static void main(String[] args) {
			
			Scanner pedido = new Scanner(System.in);
			
			int entero;
			
			boolean error;
			
			System.out.println("-----------------------------------");
			System.out.println("Calcula el descuento de un producto");
			System.out.println("-----------------------------------");
			
			
			
			do {
				
				System.out.print("Precio con descuento: ");
				try {
					
					//pedido.close();
					entero = pedido.nextInt();
					
					error = false;
					
				} catch (InputMismatchException ex1) {
					
					System.out.println("---------------");
					System.out.println("No es un entero");
					System.out.println("---------------");
					
					error = true;
					entero = 0;
					
					pedido.nextLine();
					
				} catch (IllegalStateException ex2) {
					
					System.out.println("---------------");
					System.out.println("No es un entero");
					System.out.println("---------------");
					
					error = true;
					entero = 0;
					
					
					
				} /*catch (Exception ex3) {
					
					System.out.println("-----------------");
					System.out.println("Error desconosido");
					System.out.println("-----------------");
					
					error = true;
					entero = 0;
					
					Scanmer pedidobis = new Scanner(System.in);
					
					entero = pedidobis.nextInt();
				}*/ 
				
			} while (error == true );
				
			System.out.println("--------------------------------------------");
			System.out.println(entero);
		
			
		}
		
}

