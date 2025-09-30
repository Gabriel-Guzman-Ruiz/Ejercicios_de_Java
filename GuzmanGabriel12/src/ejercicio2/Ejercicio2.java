/*
 * Descripción: Piendo datos de un equipo y mostandolos de una manera en espesifico
 * Autor: Gabriel Guzmán
 * Fecha: 30/09/2025
 */

package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		Scanner pedido = new Scanner(System.in);
		
		String equipo;
		int fundado;
		String estadio;
		String capitan;
		
		System.out.println("-----------------------------------");
		System.out.println("Rellena datos del equipo de fútbol:");
		System.out.println("-----------------------------------");
		
		System.out.print("Nombre del equipo: ");
		equipo = pedido.nextLine();
		
		System.out.print("Nombre sel estadio: ");
		estadio = pedido.nextLine();
		
		System.out.print("Nombre del capitán del equipo: ");
		capitan = pedido.nextLine();
		
		System.out.print("Fecha de fundacion del equipo: ");
		fundado = pedido.nextInt();
		
		System.out.println("---------------------");
		System.out.println("Los datos del equipo:");
		System.out.println("---------------------");
		System.out.println("****************************************************************************");
		System.out.println("******* Nombre del Equipo: " + equipo + " **********************************");
		System.out.println("******* Fundado en: " + fundado + " ****************************************");
		System.out.println("******* Estadio: " + estadio + " *******************************************");
		System.out.println("******* Capitán: " + capitan + " *******************************************");


	}

}