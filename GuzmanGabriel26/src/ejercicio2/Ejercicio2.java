/*
 * Descripción: Comprieva si el usuario comple los requisitos para estudiar
 * Autor: Gabriel Guzmán
 * Fecha: 3/10/2025
 */

package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		Scanner pedido = new Scanner(System.in);
		
		String nombre;
		byte edad;
		double notaAcademica;
		
		System.out.println("--------------------");
		System.out.println("SOLICITUD DE ESTUDIO");
		System.out.println("--------------------");
		
		System.out.print("Dame tu nombre: ");
		nombre = pedido.next();
		
		System.out.print("Dame tu edad: ");
		edad = pedido.nextByte();
		
		System.out.print("Dame tu nota academican: ");
		notaAcademica = pedido.nextDouble();
		
		System.out.println("----------");
		System.out.println("RESULTADOS");
		System.out.println("----------");
		
		if (notaAcademica <=10 && notaAcademica >= 0){
			
			if (edad >= 18 && notaAcademica >= 7) {
				
				System.out.println( nombre + ", usted ha sido admitido en el curso, cumple las condiciones requeridas");
				
			} else { 
				
				System.out.println( nombre + ", lo sentimos, no ha sido admitido en el curso ya que no cumple los requisitos mínimos");
			
			}
			
		} else { 
			
			System.out.println( "As puesto mal los datos");
		}
		
	}
	
}

