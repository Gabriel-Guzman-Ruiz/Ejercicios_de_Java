/*
 * Descripción: Pidiando las datos del usuario y ensecharlos en pantalla
 * Autor: Gabriel Guzmán
 * Fecha: 30/09/2025
 */

package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		Scanner pedido = new Scanner(System.in);
		
		String nombre;
		String apellidos;
		byte edad;
		String direcion;
		double altura;
		double peso;
		
		System.out.println("-----------------------------");
		System.out.println("Rellena tus datos personales: ");
		System.out.println("-----------------------------");
		
		System.out.print("Dame tu nombre: ");
		nombre = pedido.nextLine();
		
		System.out.print("Dame tu apellidos: ");
		apellidos = pedido.nextLine();
		
		System.out.print("Dame tu direción: ");
		direcion = pedido.nextLine();
		
		System.out.print("Dame tu edad: ");
		edad = pedido.nextByte();
		
		System.out.print("Dame tu altura: ");
		altura = pedido.nextDouble();
		
		System.out.print("Dame tu peso: ");
		peso = pedido.nextDouble();
		
		System.out.println("---------------------");
		System.out.println("Tus datos personales:");
		System.out.println("---------------------");
		System.out.println("Nombre: " + nombre);
		System.out.println("Apellidos: " + apellidos);
		System.out.println("Edad: " + edad);
		System.out.println("Direción: " + direcion);
		System.out.println("Altura: " + altura);
		System.out.println("Peso: " + peso);

	}

}
