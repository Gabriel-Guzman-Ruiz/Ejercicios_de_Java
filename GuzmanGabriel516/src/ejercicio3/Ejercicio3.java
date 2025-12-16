/*
 Descripción:.
 Autor: Gabriel Guzmán
 Fecha: 3/12/2025
 */

package ejercicio3;
	
import java.time.DateTimeException;
import java.time.LocalTime;
import java.time.format.DateTimeParseException;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;
	
public class Ejercicio3 {

	public static void main(String[] args) {
		
		Scanner pedido = new Scanner(System.in);
		
		//parte 1
		
		System.out.println("------------------------------------------------");
		System.out.println("1. INICIALIZAMOS LA HORA DE INICIO DE LAS CLASES");
		System.out.println("------------------------------------------------");
		
		LocalTime inicioClases;
		
		try {
		
			inicioClases = LocalTime.of(8,00);
		
		} catch (DateTimeException ex1) {
			
			System.out.println("--------------------");
			System.out.println("La hora no es valida");
			System.out.println("--------------------");	
			
			inicioClases = LocalTime.of(0,00);
		
		}
		
		System.out.printf("La hora de inicio de clase es: %s %n", inicioClases.toString());
		
		//parte 2
		
		System.out.println("--------------------------------------------");
		System.out.println("2. LE POR TECLADO UNA HORA Y MINUTOS VALIDAS");
		System.out.println("--------------------------------------------");
		
		//parte 2.1
		
		boolean fallo = false;
		int hora = 0;
		
		do {
		
			try {
				
				System.out.print("Dime una hora (entre 0 y 23): ");
				hora = pedido.nextInt();
				
				if  (hora > 23 || hora < 0){
					
					fallo = true;
					
					System.out.println("---------------------");
					System.out.println("La hora no es valida.");
					System.out.println("---------------------");
					
				} else {
					
					fallo = false;
					
					System.out.println("----------------------");
					System.out.printf("La hora es: %d %n", hora);
					System.out.println("----------------------");
					
				}
				
			} catch (InputMismatchException ex3) {
				
				System.out.println("---------------------");
				System.out.println("La hora no es valida.");
				System.out.println("---------------------");	
			
				fallo = true;
				
				pedido.nextLine();
		
			} catch (NoSuchElementException ex1) {
					
				System.out.println("---------------------");
				System.out.println("La hora no es valida.");
				System.out.println("---------------------");	
				
				fallo = true;
				
				pedido.nextLine();
			
			} catch (IllegalStateException ex2) {
				
				System.out.println("---------------------");
				System.out.println("La hora no es valida.");
				System.out.println("---------------------");	
			
				fallo = true;
				
				pedido.nextLine();
		
			}
	
		} while (fallo == true);
		
		//parte 2.2
		
		int minutos = 0;
		
		do {
			
			try {
				
				System.out.print("Dime los minutos (entre 0 y 59): ");
				minutos = pedido.nextInt();
				
				if  (minutos > 59 || minutos < 0){
					
					fallo = true;
					
					System.out.println("-------------------------");
					System.out.println("Los minutos no es valida.");
					System.out.println("-------------------------");
					
				} else {
					
					fallo = false;
					
					System.out.println("-----------------------------");
					System.out.printf("Los minutos es: %d %n", minutos);
					System.out.println("-----------------------------");
					
				}
				
			} catch (InputMismatchException ex3) {
				
				System.out.println("-------------------------");
				System.out.println("Los minutos no es valida.");
				System.out.println("-------------------------");	
			
				fallo = true;
				
				pedido.nextLine();
		
			} catch (NoSuchElementException ex1) {
					
				System.out.println("-------------------------");
				System.out.println("Los minutos no es valida.");
				System.out.println("-------------------------");	
				
				fallo = true;
				
				pedido.nextLine();
			
			} catch (IllegalStateException ex2) {
				
				System.out.println("-------------------------");
				System.out.println("Los minutos no es valida.");
				System.out.println("-------------------------");	
			
				fallo = true;
				
				pedido.nextLine();
		
			}
	
		} while (fallo == true);
		
		//parte 3
		
		System.out.println("----------------------------------------------------");
		System.out.println("3. CREAMOS EL OBJETO CON LOS DATOS DADOS POR TECLADO");
		System.out.println("----------------------------------------------------");
		
		LocalTime horaDada = LocalTime.of(hora, minutos);
		
		System.out.printf("La hora dada es: %s %n", horaDada.toString());
		
		//parte 4 y parte 5
		
		System.out.println("-----------------------------------------------------------------------------");
		System.out.println("4 y 5. MARCAMOS EN QUE CLASE ESTA LA PERSONA CON LA FECHA DADA Y LO MISTRAMOS");
		System.out.println("-----------------------------------------------------------------------------");
		
		//parte 4.1
		
		if (horaDada.isBefore(inicioClases)) {
			
			int hora1 = horaDada.getHour();
			int hora2 = inicioClases.getHour();
			int minutos1 = horaDada.getMinute();
			
			int hora3 = hora2 - hora1;
			
			int minutosTotales = (hora3 * 60) + minutos1;
			
			//parte 5.1
			
			System.out.printf("La hora es: %d %n", hora);
			
			//parte 5.2
			
			System.out.printf("Aún no han comenzado las clases, falta "
					+ "%d minutos para que comiensen las clases %n"
					, minutosTotales);
			
		} 
		
		//parte 4.2
		
		else if ( horaDada.isBefore((inicioClases.plusHours(2)))) {
			
			//parte 5.1
			
			System.out.printf("La hora es: %d %n", hora);
			
			//parte 5.2
			
			System.out.println("estamos en clase de Programación");
			
		}
		
		
		//parte 4.3
		
		else if ( horaDada.isBefore((inicioClases.plusHours(4)))) {
			
			//parte 5.1
			
			System.out.printf("La hora es: %d %n", hora);
			
			//parte 5.2
			
			System.out.println("estamos en clase de Sistemas Informáticos");
			
		}
		
		//parte 4.4
					
		else if ( horaDada.isBefore((inicioClases.plusHours(6)))) {
			
			//parte 5.1
			
			System.out.printf("La hora es: %d %n", hora);
			
			//parte 5.2
			
			System.out.println("estamos en clase de Entornos de Desarrollo");
			
		}
		
		//parte 4.5
					
		else {
			
			LocalTime horaFinalClases = inicioClases.plusHours(6);
			
			int hora1 = horaDada.getHour();
			int hora2 = horaFinalClases.getHour();
			int minutos1 = horaDada.getMinute();
			
			int hora3 = hora1 - hora2;
			
			int minutosTotales = (hora3 * 60) + minutos1;
			
			//parte 5.1
			
			System.out.printf("La hora es: %d %n", hora);
			
			//parte 5.2
			
			System.out.printf("Ya han finalizado las clases, hace "
					+ "%d minutos terminaron las clases %n"
					, minutosTotales);
			
		} 		
		
	}
}
