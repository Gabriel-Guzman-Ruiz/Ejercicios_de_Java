/*
 * Descripción: Trasformador de euros a pesetas y de pesetas a euros
 * Autor: Gabriel Guzmán
 * Fecha: 1/10/2025
 */

package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		Scanner pedido = new Scanner(System.in);
		
		double euros;
		double pesetas;
		
		System.out.println("Combertidor de euros a pesetas y de pesetas a euros:");
		System.out.println("----------------------------------------------------");
		
		System.out.print("Dame la cantidad de euros: ");
		euros = pedido.nextDouble();
		
		pesetas = euros * 166.386;
		
		System.out.println("-----------------------------------------");
		System.out.println( euros + " euros a pesetas son: " + pesetas + " pesetas");
		
		System.out.println("---------------------------");
		System.out.println("---------------------------");
		
		System.out.print("Dame la cantidad de pesetas: ");
		pesetas = pedido.nextDouble();
		
		euros = pesetas / 166.386;
		
		System.out.println("-----------------------------------------");
		System.out.println( pesetas + " pesetas a euros son: " + euros + " euros");

	}

}
