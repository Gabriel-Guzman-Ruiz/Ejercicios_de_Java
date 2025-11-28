/*
 * Descripción: Creando un metodo que encuentre el menor de dos numeros.
 * Autor: Gabriel Guzmán
 * Fecha: 25/11/2025
 */

package ejercicio09;

import java.util.Scanner;

public class Ejercicio09 { 
	
	public static void main(String[] args) {
		
		Scanner pedido = new Scanner(System.in);
		
		int numero1;
		int numero2;
		int numero3;
		
		int numeroMinimo;
		
		System.out.println("-----------------------");
		System.out.println("El numero menor de tres");
		System.out.println("-----------------------");
		
		System.out.print("Numero (1): ");
		numero1 = pedido.nextInt();
		
		System.out.print("Numero (2): ");
		numero2 = pedido.nextInt();
		
		System.out.print("Numero (3): ");
		numero3 = pedido.nextInt();
		
		if (numero1 >= numero2) {
			
			numeroMinimo = numeroMinimo(numero2 , numero3);
			
		} else {
			
			numeroMinimo = numeroMinimo(numero1 , numero3);
			
		}
		
		System.out.println("-----------------------------------------");
		System.out.println("El numero mas pequeño es: " + numeroMinimo);
	
	}
	
	// numeroMinimo: Calcula el numero mas pequeño de dos. int
	public static int numeroMinimo (int numero1o2 , int numero3) {
			
		int numeroMinimo;
			
		if (numero1o2 <= numero3){
			
			numeroMinimo = numero1o2;
			
		} else {
			
			numeroMinimo = numero3;
			
		}
			
		return numeroMinimo;	
				
	}
		
}
