/*
 * Descripción: Metodo que calcula si una fecha es valida o no. y lo mostramos por pantalla.
 * Autor: Gabriel Guzmán
 * Fecha: 25/11/2025
 */

package ejercicio10;

import java.util.Scanner;

public class Ejercicio10 { 
	
	public static void main(String[] args) {
		
		Scanner pedido = new Scanner(System.in);
		
		int dia;
		int mes;
		int anno;
		
		boolean fechaCorecta;
		
		System.out.println("---------------------");
		System.out.println("Camprovador de fechas");
		System.out.println("---------------------");
		
		System.out.print("Dia: ");
		dia = pedido.nextInt();
		
		System.out.print("Mes: ");
		mes = pedido.nextInt();
		
		System.out.print("Año: ");
		anno = pedido.nextInt();
			
		fechaCorecta = fechaCorecta(dia , mes , anno);
			
		if (fechaCorecta == true) {
			
			System.out.println("-------------------");
			System.out.println("La fecha es corecta");
			
		} else {
			
			System.out.println("----------------------");
			System.out.println("La fecha no es corecta");
			
		}
		
	}
	
	// fechaCorecta: Identifica si una fecha es valida o no. boolean
	public static boolean fechaCorecta (int dia , int mes , int anno) {
			
		boolean fechaCorecta = true;
		boolean annoBisiesto = false;
			
		if (mes <= 12 && mes >= 1){
			
			if (anno >= 1 ) {
				
				if ((anno % 4 == 0) && (anno % 100 != 0 || anno % 400 == 0)) {
					
					annoBisiesto = true;
					
				}
				
				if (dia >= 1 && dia <= 31) {
					
					// para saver si es un mes con 30 dias.
					if ((mes == 4 || mes == 6 || mes == 9 || mes == 10) && dia > 30) {
							
						fechaCorecta = false;	
						
						//para saver si es un año bisiesto.
					} else if (mes == 2 && dia > 28) {
						
						fechaCorecta = false;
						
						if (dia == 29 && annoBisiesto == true) {
							
							fechaCorecta = true;
							
						}
								
					} 
					
				} else {
					
					fechaCorecta = false;
				}
				
			} else {
				
				fechaCorecta = false;
			}
			
		} else {
			
			fechaCorecta = false;
		}
			
		return fechaCorecta;	
				
	}
		
}