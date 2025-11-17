/*
 * Descripción: Cuenta los numeros y la media de estos de cada desima del 1 al 100 de los numeros untrodusidos por el usuario.
 * Autor: Gabriel Guzmán
 * Fecha: 12/11/2025
 */

package guzman;

import java.util.Scanner;

public class Ejercicio1 { 

	public static void main(String[] args) {
		
		Scanner pedido = new Scanner(System.in);
		
		int numero;
		int numeroNumeras = 0;
		int pocicion = 0;
		
		double [] numeros;
		
		int numeros1_9 = 0;
		int numeros10_19 = 0;
		int numeros20_29 = 0;
		int numeros30_39 = 0;
		int numeros40_49 = 0;
		int numeros50_59 = 0;
		int numeros60_69 = 0;
		int numeros70_79 = 0;
		int numeros80_89 = 0;
		int numeros90_99 = 0;
		int numeros100 = 0;
		
		int suma1_9 = 0;
		int suma10_19 = 0;
		int suma20_29 = 0;
		int suma30_39 = 0;
		int suma40_49 = 0;
		int suma50_59 = 0;
		int suma60_69 = 0;
		int suma70_79 = 0;
		int suma80_89 = 0;
		int suma90_99 = 0;
		
		double media1_9 = 0;
		double media10_19 = 0;
		double media20_29 = 0;
		double media30_39 = 0;
		double media40_49 = 0;
		double media50_59 = 0;
		double media60_69 = 0;
		double media70_79 = 0;
		double media80_89 = 0;
		double media90_99 = 0;
		double media100 = 0;

		
		System.out.println("------------------------------");
		System.out.println("CONTADOR DE DESENAS DE NUMEROS");
		System.out.println("------------------------------");
		
		do {
		
			System.out.print("Dame un numero (Escrive 0 para terminar): ");
			numero = pedido.nextInt();
			
			if (numero != 0 && numero > 0 && numero < 101){
				
				numeroNumeras ++;
				
				numeros = new double [numeroNumeras];
			
				numeros [pocicion] = numero;
				
				pocicion ++;
				
				if (numero < 10) {
					
					numeros1_9 ++;
					
					suma1_9 = suma1_9 + numero;
					
					media1_9 = suma1_9/numeros1_9;
					
				} else if (numero < 20) {
					
					numeros10_19 ++;
					
					suma10_19 = suma10_19 + numero;
					
					media10_19 = suma10_19/numeros10_19;
					
				} else if (numero < 30) {
					
					numeros20_29 ++;
					
					suma20_29 = suma20_29 + numero;
					
					media20_29 = suma20_29/numeros20_29;
					
				} else if (numero < 40) {
					
					numeros30_39 ++;
					
					suma30_39 = suma30_39 + numero;
					
					media30_39 = suma30_39/numeros30_39;
					
				} else if (numero < 50) {
					
					numeros40_49 ++;
					
					suma40_49 = suma40_49 + numero;
					
					media40_49 = suma40_49/numeros40_49;
					
				} else if (numero < 60) {
					
					numeros50_59 ++;
					
					suma50_59 = suma50_59 + numero;
					
					media50_59 = suma50_59/numeros50_59;
					
				} else if (numero < 70) {
					
					numeros60_69 ++;
					
					suma60_69 = suma60_69 + numero;
					
					media60_69 = suma60_69/numeros60_69;
				
				} else if (numero < 80) {
					
					numeros70_79 ++;
					
					suma70_79 = suma70_79 + numero;
					
					media70_79 = suma70_79/numeros70_79;
					
				} else if (numero < 90) {
					
					numeros80_89 ++;
					
					suma80_89 = suma80_89 + numero;
					
					media80_89 = suma80_89/numeros80_89;
					
				} else if (numero < 100) {
					
					numeros90_99 ++;
					
					suma90_99 = suma90_99 + numero;
					
					media90_99 = suma90_99/numeros90_99;
					
				}else if (numero == 100) {
					
					numeros100 ++;
					
					media100 = 100;
					
				}	
				
			} else if (numero == 0){
				
				System.out.println("-------------------------------");
				System.out.println("Se termina la fase de preguntas");
				
			} else {
				System.out.println("----------------------------------------------------");
				System.out.println("El numero tiene que estar comprendido de 1 hasta 100");
			}
	
		
		} while (numero != 0);
		
		System.out.println("--------------------------------");
		System.out.println( "Cantidad de numeros de la primera decena: " + numeros1_9 );
		System.out.println( "La media de la primera decena: " + media1_9 );
		
		System.out.println("--------------------------------");
		System.out.println( "Cantidad de numeros de la primera decena: " + numeros10_19 );
		System.out.println( "La media de la primera decena: " + media10_19 );
		
		System.out.println("--------------------------------");
		System.out.println( "Cantidad de numeros de la primera decena: " + numeros20_29 );
		System.out.println( "La media de la primera decena: " + media20_29 );
		
		System.out.println("--------------------------------");
		System.out.println( "Cantidad de numeros de la primera decena: " + numeros30_39 );
		System.out.println( "La media de la primera decena: " + media30_39 );
		
		System.out.println("--------------------------------");
		System.out.println( "Cantidad de numeros de la primera decena: " + numeros40_49 );
		System.out.println( "La media de la primera decena: " + media40_49 );
		
		System.out.println("--------------------------------");
		System.out.println( "Cantidad de numeros de la primera decena: " + numeros50_59 );
		System.out.println( "La media de la primera decena: " + media60_69 );
		
		System.out.println("--------------------------------");
		System.out.println( "Cantidad de numeros de la primera decena: " + numeros70_79 );
		System.out.println( "La media de la primera decena: " + media70_79 );
		
		System.out.println("--------------------------------");
		System.out.println( "Cantidad de numeros de la primera decena: " + numeros80_89 );
		System.out.println( "La media de la primera decena: " + media80_89 );
		
		System.out.println("--------------------------------");
		System.out.println( "Cantidad de numeros de la primera decena: " + numeros90_99 );
		System.out.println( "La media de la primera decena: " + media90_99 );
		
		System.out.println("--------------------------------");
		System.out.println( "Cantidad de numeros de la primera decena: " + numeros100 );
		System.out.println( "La media de la primera decena: " + media100 );
		
	}
}
