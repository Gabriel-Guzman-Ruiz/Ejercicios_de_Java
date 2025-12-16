/*
 Descripción: 
 Autor: Gabriel Guzmán
 Fecha: 12/12/2025
 */

package ejercicio02;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio02 {
	
	public static void main(String[] args) {
		
		Scanner pedido = new Scanner(System.in);
		
		//parte 1
		
		System.out.println("-----------------");
		System.out.println("1. PEDIMOS EL AÑO");
		System.out.println("-----------------");
		
		int año = 0;
		int mes = 1;
		int dia = 1;
		
		boolean fallo = false;
		
		LocalDate fechaActual = LocalDate.now();
		LocalDate fechaDada = null;
		do {
		
			try {
			
				System.out.printf("Dime el año (entre 1900 y %d): " ,fechaActual.getYear() );
				año = pedido.nextInt();
				
				fallo = false;
			
				if (año > fechaActual.getYear() || año < 1900) {
					
					System.out.println("-------------------------------");
					System.out.println("El año que pusiste no es valido");
					System.out.println("-------------------------------");
					
					fallo = true;
					
					pedido.nextLine();
					
				}
			
			} catch (InputMismatchException ex1){
				
				System.out.println("-------------------------------");
				System.out.println("El año que pusiste no es valido");
				System.out.println("-------------------------------");
				
				fallo = true;
				
				pedido.nextLine();
				
			} catch (IllegalStateException ex2){
				
				System.out.println("-------------------------------");
				System.out.println("El año que pusiste no es valido");
				System.out.println("-------------------------------");
				
				fallo = true;
				
				pedido.nextLine();
				
			}
			
		} while (fallo == true);
		
		fechaDada =LocalDate.of(año, mes, dia);
		
		//parte 2
		
		System.out.println("-----------------");
		System.out.println("2. PEDIMOS EL MES");
		System.out.println("-----------------");
	
		do {
			
			try {
			
				System.out.print("Dime el mes (entre 1 y 12): ");
				mes = pedido.nextInt();
				
				fallo = false;
			
				if (mes > 12 || mes < 1) {
					
					System.out.println("-------------------------------");
					System.out.println("El mes que pusiste no es valido");
					System.out.println("-------------------------------");
					
					fallo = true;
					
					pedido.nextLine();
					
				}
			
			} catch (InputMismatchException ex1){
				
				System.out.println("-------------------------------");
				System.out.println("El mes que pusiste no es valido");
				System.out.println("-------------------------------");
				
				fallo = true;
				
				pedido.nextLine();
				
			} catch (IllegalStateException ex2){
				
				System.out.println("-------------------------------");
				System.out.println("El mes que pusiste no es valido");
				System.out.println("-------------------------------");
				
				fallo = true;
				
				pedido.nextLine();
				
			}
			
		} while (fallo == true);
		
		fechaDada =LocalDate.of(año, mes, dia);
		
		//parte 3
		
		System.out.println("-----------------");
		System.out.println("3. PEDIMOS EL DIA");
		System.out.println("-----------------");
		
		do {
			
			try {
			
				System.out.print("Dime el dia: ");
				dia = pedido.nextInt();
				
				fallo = false;
			
				if (dia > 31 || dia < 1) {
					
					System.out.println("-------------------------------");
					System.out.println("El dia que pusiste no es valido");
					System.out.println("-------------------------------");
					
					fallo = true;
					
					pedido.nextLine();
					
				} else if (dia == 31 && (mes == 4 || mes == 6 || mes == 9 || mes == 11)) {
					
					System.out.println("-------------------------------------");
					System.out.println("El mes que pusiste solo tiene 30 dias");
					System.out.println("-------------------------------------");
					
					fallo = true;
					
					pedido.nextLine();
					
				} else if (dia > 28 && mes == 2) {
					
					if (!fechaDada.isLeapYear() && dia >= 29) {
						
						System.out.println("---------------------------------------------------------");
						System.out.println("El mes que pusiste solo tiene 28 dias, no es año bisiesto");
						System.out.println("---------------------------------------------------------");
						
						fallo = true;
						
						pedido.nextLine();	
						
					} else if (fechaDada.isLeapYear() && dia > 29) {
						
						System.out.println("------------------------------------------------------");
						System.out.println("El mes que pusiste solo tiene 29 dias, es año bisiesto");
						System.out.println("------------------------------------------------------");
						
						fallo = true;
						
						pedido.nextLine();	
						
					}
					
				}
			
			} catch (InputMismatchException ex1){
				
				System.out.println("-------------------------------");
				System.out.println("El dia que pusiste no es valido");
				System.out.println("-------------------------------");
				
				fallo = true;
				
				pedido.nextLine();
				
			} catch (IllegalStateException ex2){
				
				System.out.println("-------------------------------");
				System.out.println("El dia que pusiste no es valido");
				System.out.println("-------------------------------");
				
				fallo = true;
				
				pedido.nextLine();
				
			}
			
		} while (fallo == true);
		
		fechaDada =LocalDate.of(año, mes, dia);
		
		//parte 4
		
		System.out.println("------------------------------------------------------------------------");
		System.out.println("4. MOSTRAMOS LA FECHA, EL DIA QUE CAE Y CUANTAS VESES A CAIDO EN ESE DIA");
		System.out.println("------------------------------------------------------------------------");
		
		DayOfWeek diaCompleaños = fechaDada.getDayOfWeek();
		
		String diaCompleañosEpanol = "";
		
		int numeroDiaCompleaños = 0;
		
		switch (diaCompleaños.toString()) {
		
			case "MONDAY":
				
				diaCompleañosEpanol = "Lunes";
				
				break;
				
			case "TUESDAY":
				
				diaCompleañosEpanol = "Martes";
				
				break;
				
			case "WEDNESDAY":
				
				diaCompleañosEpanol = "Miercoles";
				
				break;
				
			case "THURSDAY":
				
				diaCompleañosEpanol = "Jueves";
				
				break;
				
			case "FRIDAY":
				
				diaCompleañosEpanol = "Viernes";
				
				break;
				
			case "SATURDAY":
				
				diaCompleañosEpanol = "Savado";
				
				break;
				
			case "SUNDAY":
				
				diaCompleañosEpanol = "Domingo";
				
				break;
		
		}
		
		System.out.printf("El compleaños es el: %s %n" , fechaDada.toString());
		System.out.printf("El dia en que nacio fue el: %s %n" , diaCompleañosEpanol);
		System.out.printf("Los compleaños an caido un %s los años: %n" , diaCompleañosEpanol);
		
		long contadorAños = 1;
		LocalDate fechaDada2;
		
		do {
			
			fechaDada2 = fechaDada.plusYears(contadorAños);
			
			DayOfWeek diaIgual = fechaDada2.getDayOfWeek();
			
			if (diaIgual == diaCompleaños) {
				
				System.out.printf("%d/%d/%d %n" , fechaDada2.getDayOfMonth(), fechaDada2.getMonthValue(), fechaDada2.getYear());
				
			}
			
			contadorAños ++;
			
			
		} while (fechaDada2.getYear() < fechaActual.getYear());
		
		

		
		
	}

}
