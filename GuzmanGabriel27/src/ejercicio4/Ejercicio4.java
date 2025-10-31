/*
 * Descripción: Calcular la nota media.
 * Autor: Gabriel Guzmán
 * Fecha: 9/10/2025
 */

package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		Scanner pedido = new Scanner(System.in);
		
		double nota1;
		double nota2;
		double nota3;
		double nota4;
		double media;
		
		System.out.println("-------------");
		System.out.println("MEDIA DE NOTA");
		System.out.println("-------------");
		
		System.out.print("Dame tu primera nota: ");
		nota1 = pedido.nextDouble();
		
		System.out.print("Dame tu segunda nota: ");
		nota2 = pedido.nextDouble();
		
		System.out.print("Dame tu tersera nota: ");
		nota3 = pedido.nextDouble();
		
		System.out.print("Dame tu cuarta nota: ");
		nota4 = pedido.nextDouble();
		
		System.out.println("----------");
		System.out.println("RESULTADOS");
		System.out.println("----------");

		media = (nota1 + nota2 + nota3 + nota4) / 4;
		int mediaArriba = (int) Math.ceil(media);
		int mediaAbajo = (int) Math.floor(media);
		
		if (media >= 8) {
			
			System.out.println("Tu nota media es: " + media + " (puedes acceder a estudios superiores)");
			
			
		} else {
			
			System.out.println("Tu nota media es: " + media + " (puedes acceder a los estudios que deseas)");
			
		}
			
	}
	
}
	