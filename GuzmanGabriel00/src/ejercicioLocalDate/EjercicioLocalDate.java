/*
	 * Descripción: Creamos un metodo que calcule el descuento de un producto y despues lo mostramos por pantalla.
	 * Autor: Gabriel Guzmán
	 * Fecha: 25/11/2025
	 */

	

package ejercicioLocalDate;

import java.time.LocalDate;
import java.time.Period;
import java.util.InputMismatchException;
import java.util.Scanner;

public class EjercicioLocalDate {

		
		public static void main(String[] args) {
			
			Scanner pedido = new Scanner(System.in);
			
			System.out.println("-----------------------------------");
			String fechaNacimiento = pedido.nextLine();
				
				LocalDate fechaNacimiento2 = LocalDate.parse(fechaNacimiento);
				
				LocalDate fechaHoy = LocalDate.now();
				
				Period tiempoTrascurido = Period.between(fechaNacimiento2, fechaHoy);
				
			System.out.println("-----------------------------------");
			System.out.println(tiempoTrascurido);
			System.out.println("-----------------------------------");
			
		}
		
}
