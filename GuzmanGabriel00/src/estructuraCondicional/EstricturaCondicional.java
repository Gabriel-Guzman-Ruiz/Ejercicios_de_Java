/*
 * Descripción: Provando estructuras condicional
 * Autor: Gabriel Guzmán
 * Fecha: 30/09/2025
 */

package estructuraCondicional;

import java.util.Scanner;

public class EstricturaCondicional {

	public static void main(String[] args) {
		
		Scanner pedido = new Scanner(System.in);
		
		int edad;
		
		System.out.print("Dame tu edad: ");
		edad = pedido.nextInt();
		
		if (edad > 17 && edad < 30) {
			
			System.out.println("Eres Joven");
			
		}
		
		if (edad > 29) {
			
			System.out.println("Eres machor de edad");
			
		}
		
		if (edad < 18) {
			
			System.out.println("Eres menor de edad");
			
		}
	
	{
		// Le pedimos que escriva el dia de hoy y lo corovoramos
		
		String diaSemana;
		
		System.out.print("Dame el dia de la semana: ");
		diaSemana = pedido.next();
		
		diaSemana = diaSemana.toLowerCase(); //Pone la palabra en minuscula
		
		boolean esJueves;
		esJueves = diaSemana.equals("jueves"); //Comparamos la variable (nos da como resultado un true o false)
				
		if (esJueves == true) {
			
			System.out.println("Si, hoy es " + diaSemana);
			
		}
		
		if (esJueves != true) {
			
			System.out.println("No, Hoy es Jueves");
			
		}
	}
		
	{
		// La edad pero con Estructura condicional compuesta
			
		System.out.print("Dame tu edad: ");
		edad = pedido.nextInt();
		
		if (edad > 17 && edad < 30) {
			
			System.out.println("Eres Joven");
				
		}
			
		if (edad > 29) {
				
			System.out.println("Eres machor de edad");
				
		}
			
		else {
				
			System.out.println("Eres menor de edad");
				
		}
	}
		
	{
		// El dia pero con Estructura condicional compuesta
							
		String diaSemana;
		int hora;
		
		System.out.print("Dame un dia de clase: ");
		diaSemana = pedido.next();
		
		System.out.print("Hora de clase: ");
		hora = pedido.nextInt();
				
		diaSemana = diaSemana.toLowerCase(); 
				
		boolean hayProgramacion;
		hayProgramacion = (diaSemana.equals("martes") && (hora == 5 || hora == 6)) ||
						  (diaSemana.equals("miercoles") && (hora == 3 || hora == 4)) ||
						  (diaSemana.equals("jueves") && (hora == 5 || hora == 6)) ||
						  (diaSemana.equals("viernes") && (hora == 2 || hora == 3));
						
		if (hayProgramacion == true) {
					
			System.out.println("Si, hoy el " + diaSemana + " a las " + hora + " hay programación");
				
		}			
		else {

			System.out.println("No hay programacion");
					
		}
	}
	
	{
		double nota;
		String resultado = "nada";
		
		System.out.println("-----------------------------");
		System.out.println("COMPROVADOR DE CALIFICACIONES");
		System.out.println("-----------------------------");
		
		System.out.print("Introduse la nota de el examen: ");
		nota = pedido.nextDouble();
		
		System.out.println("----------");
		System.out.println("RESULTADOS");
		System.out.println("----------");
		
		if (nota >= 0 && nota <= 10) {
			
			if ( nota < 5) {
				
				resultado = "INSUFICIENTE";
				
			} else if ( nota < 6) {
					
				resultado = "SUFICIENTE";
				
			} else if ( nota < 7) {
						
				resultado = "BIEN";
						
			} else if ( nota < 9) {
							
				resultado = "NOTABLE";
							
			} else {
								
				resultado = "SOBRESALIENTE";
								
			}
			
		} else {
			
			resultado = "No es valido";
		}
		
		System.out.println("Tu calificación es: " + resultado);

	}
	
	{
		double numero;
		
		System.out.println("-----------------------------");
		System.out.println("COMPROVADOR DE CALIFICACIONES");
		System.out.println("-----------------------------");
		
		System.out.print("Introduse la nota de el examen: ");
		numero = pedido.nextDouble();
		
		System.out.println("----------");
		System.out.println("RESULTADOS");
		System.out.println("----------");
		
		if (numero > 0) {
			
			System.out.println("Numero es positovo");
			
			if (numero >= 50) {
				
				System.out.println("Numero es mayor de 50");
				
			}
			
		} else {
			
			if (numero == 0) {
				
				System.out.println("Numero es igual a 0");
				
			} else {
				
				System.out.println("Numero es negativo");
			}
		}
	}
		
	}
	
}

