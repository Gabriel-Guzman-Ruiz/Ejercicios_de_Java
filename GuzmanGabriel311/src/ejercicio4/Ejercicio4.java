/*
 * Descripción: Calculamos la nota minima, maxima y la media de la nota de 4 estudiantes.
 * Autor: Gabriel Guzmán
 * Fecha: 31/10/2025
 */

package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 { 

	public static void main(String[] args) {
		
		Scanner pedido = new Scanner(System.in);
		
		double nota;
		
		double notaMinima = 10;
		double notaMaxima = 0;
		double notaSuma = 0;
		double notaMedia;
		
		final int ALUMNOS = 4;
		final int ASIGNATURAS = 5;
		
		double [] [] matriz;
		
		matriz = new double [ALUMNOS] [ASIGNATURAS];
		
		System.out.println("----------------------------------------------------");
		System.out.println("MEDIA, NIMIMA Y MAXIMA DE LAS NOTAS DE 4 ESTUDIANTES");
		System.out.println("----------------------------------------------------");
			
		for (int i = 0; i < ALUMNOS; i ++) {
			
			for (int y = 0; y < ASIGNATURAS; y ++) {
				
				System.out.print("Nota se la asignatira " + (y + 1) + " del alumno " + (i + 1) + " es: ");
				nota = pedido.nextDouble();	
				
				matriz [i] [y]  = nota;
			
			}
			
			System.out.println("---------------------------------------------------");
			
		}
		
		for (int i = 0; i < ALUMNOS; i ++) {
			
			notaMinima = 10;
			notaMaxima = 0;
			notaSuma = 0;
			
			for (int y = 0; y < ASIGNATURAS; y ++) {
				
				if (matriz [i] [y] >= notaMaxima) {
					
					notaMaxima = matriz [i] [y];
					
				}
				
				if (matriz [i] [y] <= notaMinima) {
					
					notaMinima = matriz [i] [y];
					
				} 
				
				notaSuma =  notaSuma + matriz [i] [y];
			
			}
			
			notaMedia = notaSuma / ASIGNATURAS;
			
			System.out.println("-----------------------------------------------------------");
			System.out.println("Nota minima de el alumnos " + (i + 1) + " es: " + notaMinima);
			System.out.println("Nota maxima de el alumnos " + (i + 1) + " es: " + notaMaxima);
			System.out.println("La media de las notas del alumnos " + (i + 1) + " es: " + notaMedia);
			
		} 
	}
}