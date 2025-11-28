/*
 * Descripción: Creando un medodo que calcule el ária y perímetro de un rectángulo.
 * Autor: Gabriel Guzmán
 * Fecha: 19/11/2025
 */

package ejercicio07;

import java.util.Scanner;

public class Ejercicio07 { 
	
	public static void main(String[] args) {
		
		Scanner pedido = new Scanner(System.in);
		
		double ancho;
		double alto;

		double aria;
		double perimetro;
		
		System.out.println("--------------------------------------------");
		System.out.println("CALCULA EL ÁRIA Y PERÍMETRO DE UN RECTÁNGULO");
		System.out.println("--------------------------------------------");
		
		System.out.print("Ancho del triangulo: ");
		ancho = pedido.nextDouble();
		
		System.out.print("Altura del triangulo: ");
		alto = pedido.nextDouble();
				
		aria = areaRectangulo (ancho, alto );
		
		perimetro = perimetroRectangulo (ancho, alto);
		
		System.out.println("----------------------------------");
		System.out.println("El ária del rectángulo es: " + aria);
		System.out.println("El perímetro del rectángulo es: " + perimetro);
		
	}
	
		// areaRectangulo: Calcula el ária de un rectángulo. double
		public static double areaRectangulo (double ancho, double alto) {
			
			double aria;
			
			aria = ancho * alto;
			
			return aria;	
				
		}
		
		// perimetroRectangulo: Calcula el perímetro de un rectángulo. double
		public static double perimetroRectangulo (double ancho, double alto) {
			
			double perimetro;
			
			perimetro = 2 * (ancho * alto);
			
			return perimetro;	
				
		}
		
}