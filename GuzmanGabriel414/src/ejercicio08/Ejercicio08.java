/*
 * Descripción: Creando un metodo que calcule la suma, la multiplicacion y la media de los valores de 1 hasta N.
 * Autor: Gabriel Guzmán
 * Fecha: 18/11/2025
 */

package ejercicio08;

import java.util.Scanner;

public class Ejercicio08 { 
	
	public static void main(String[] args) {
		
		Scanner pedido = new Scanner(System.in);
		
		int numero;

		int suma_1aN;
		int producto_1aN;
		double numeroIntermedio_1aN;
		
		System.out.println("----------------------------------------------------------------");
		System.out.println("CALCULA LA SUMA, EL PRODUCTO Y EL NUMERO INTERMEDIO DE 1 HASTA N");
		System.out.println("----------------------------------------------------------------");
		
		System.out.print("Numero (N): ");
		numero = pedido.nextInt();
		
		suma_1aN = suma1aN(numero);
		
		producto_1aN = producto1aN(numero);
		
		numeroIntermedio_1aN = intermedio1aN(numero);
		
		System.out.println("------------------------------------------------------------------");
		System.out.println("La suma de todos los numeros del 1 a " + numero + " es: " + suma_1aN);
		System.out.println("El producto de todos los numeros del 1 a " + numero + " es: " + producto_1aN);
		System.out.println("El valor untermedio de del 1 a " + numero + " es: " + numeroIntermedio_1aN);
		
	}
	
	// suma1aN: suma todos los valores de 1 hasta N. int
	public static int suma1aN (int numero) {
			
		int suma_1aN = 0;
			
		for (int i = 0; i <= numero; i++) {
				
			suma_1aN = suma_1aN + i;
				
		}
			
		return suma_1aN;	
				
	}
	
	// producto1aN: El producto de de los valores de 1 hasta N. int
	public static int producto1aN (int numero) {
				
		int producto_1aN = 1;
				
		for (int i = 1; i <= numero; i++) {
					
			producto_1aN = producto_1aN * i;
					
		}
				
		return producto_1aN;	
					
	}
		
	// intermedio1aN: la media de los valores de 1 hasta N. int
	public static double intermedio1aN (int numero) {
				
		double numeroIntermedio_1aN = 1;
		
		double sumaMedia;
					
		sumaMedia = (numeroIntermedio_1aN + numero) / 2;
				
		return sumaMedia;	
					
	}
		
}
