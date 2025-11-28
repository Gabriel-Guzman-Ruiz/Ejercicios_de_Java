/*
 * Descripción: calcula la media de 4 notas y si aprobo de un estudiante, que se pueda hacer con N estudiantes.
 * Autor: Gabriel Guzmán
 * Fecha: 26/11/2025
 */

package guzman;

import java.util.Scanner;

public class Ejercicio1 { 
	
	public static void main(String[] args) {
		
		Scanner pedido = new Scanner(System.in);
		
		String estudiante;
		String respuesta;
		
		double notas;
		double sumaNotas = 0;
		double mediasNotas;
		
		String aprobado;
		
		int numeroEstudiantes = 0;
		
		System.out.println("------------------------------------");
		System.out.println("CALCULA SI LOS ESTUDIANTES APROBARON");
		System.out.println("------------------------------------");
		
		do {
			mediasNotas = 0;
			sumaNotas = 0;
			
			numeroEstudiantes ++;
			
			System.out.print("Nombre del estudiante (" + numeroEstudiantes +"): ");
			estudiante = pedido.next();
			
			for (int i = 1; i <= 4 ; i ++) {
				
				System.out.print("Nota (" + i +"): ");
				notas = pedido.nextDouble();
				
				if (notas <= 10 && notas >= 0) {
					
					sumaNotas = sumaNotas + notas;
					
				} else {
					
					System.out.println("--------------------");
					System.out.println("La nota no es valida");
					
					i --;
					
				}
				
			}
			
			mediasNotas = sumaNotas / 4;
			
			if (mediasNotas < 5) {
				
				aprobado = "Suspenso";
				
			} else {
				
				aprobado = "Aprobado";
				
			}
			
			System.out.println("--------------------");
			System.out.println("Estudiante: " + estudiante);
			System.out.println("Media aritmética de las notas del estudiante: " + mediasNotas);
			System.out.println("Estado: " + aprobado);
			
				System.out.println("--------------------");
				System.out.print("Terminar el proseso ( fin = terminar): ");
				respuesta = pedido.next();
				System.out.println("--------------------");
				
		} while (!respuesta.equals("fin"));
			
		System.out.println("-------------------------------------------");
		System.out.println("Numero de estudiantes: " + numeroEstudiantes);
		
	}
		
}
