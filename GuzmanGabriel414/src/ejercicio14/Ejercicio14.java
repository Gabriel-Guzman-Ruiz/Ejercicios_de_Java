/*
 * Descripción: Creamos un metodo que calcule el descuento de un producto y despues lo mostramos por pantalla.
 * Autor: Gabriel Guzmán
 * Fecha: 25/11/2025
 */

package ejercicio14;

import java.util.Scanner;

public class Ejercicio14 { 
	
	public static void main(String[] args) {
		
		Scanner pedido = new Scanner(System.in);
		
		String caracter;
		int linias;
		
		int pasos = 0;
		
		System.out.println("-----------------------------------");
		System.out.println("Calcula el descuento de un producto");
		System.out.println("-----------------------------------");
		
		System.out.print("Precio sin descuento: ");
		caracter = pedido.next();
		
		System.out.print("Precio con descuento: ");
		linias = pedido.nextInt();
			
		System.out.println("--------------------------------------------");
		
		for (int i = 1; i <= linias; i++) {
			
			pasos = linias;
			
			while (pasos != i) {
				
				System.out.print(" ");
				
				pasos --;
				
			}
			
			pasos = 1;
			
			if (i == 1) {
				
				System.out.println(caracter);
				
			} else if (i > 1) {
				
				System.out.print(caracter);
				
				while (pasos < i) {
					System.out.print(caracter);
					System.out.print(caracter);
					
					pasos ++;
				
				}
				
				System.out.println("");
				
			}	
		}
		
		int [] [] triangulo;
		
		triangulo = triangulo(linias);
			
		System.out.println("--------------------------------------------");
		
		for (int i = 0 ; i < linias; i++) {
			
			for (int i2 = 0 ; i2 < (linias + 2); i2 ++) {
				
				System.out.print(triangulo [i][i2]);
				
			}
			
			System.out.println("");
		}
		
	}
	
	// triangulo: . int [] [] Arrays
	public static int [] [] triangulo (int linias) {
		
		int [] [] triangulo;
		
		// 0 2 2 2 2 = 8
		// 1 3 5 7 9
		int pasos = linias + (2 * (linias - 1));
		
		int pasoCaracter  = pasos;
		
		triangulo = new int [linias] [pasos];
		
		for (int i = 0; i < linias ; i ++) {
			
			for (int i2 = 0 ; i2 < pasos; i2 ++) {
				
				if (i2 >= pasoCaracter) {
					
					triangulo [i][i2] = 1;
					
				}	
				
			}
			
			pasoCaracter --;
			
		}
		
			
		return triangulo;	
				
	}
		
}
