/*
 Descripción:
 Autor: Gabriel Guzmán
 Fecha: 17/12/2025
 */

package guzman;

import java.lang.IllegalArgumentException;

import libtarea3.CuentaBancaria;

public class Ejercicio02 {

public static void main(String[] args) {
		
		//parte 2

		
		
		CuentaBancaria guzman_1, guzman_2, guzman_3;
		
		//parte 3
		
		System.out.println("------------------------");
		System.out.println("Creamos las tres cuentas");
		System.out.println("------------------------");
		
		System.out.println("Primera cuenta");
		System.out.println("--------------");
		
		int saldoAleatorio = saldoAleatorio();
		
		System.out.printf("Saldo: %d %n", saldoAleatorio);
		
		try {
			
			guzman_1 = new CuentaBancaria(saldoAleatorio);
			
			System.out.printf("La cuenta tiene los siquientes datos: %s %n", guzman_1.toString());
			
		} catch (IllegalArgumentException ex1) {
			
			guzman_1 = new CuentaBancaria();
			
			System.out.printf("El saldo no era valido, la cienta tomo los valores predeterminados: %s %n", guzman_1.toString());
		}
		
		System.out.println("--------------");
		System.out.println("Segunda cuenta");
		System.out.println("--------------");
		
		saldoAleatorio = saldoAleatorio();
		
		System.out.printf("Saldo: %d %n", saldoAleatorio);
		
		try {
			
			guzman_2 = new CuentaBancaria(saldoAleatorio);
			
			System.out.printf("La cuenta tiene los siquientes datos: %s %n", guzman_2.toString());
			
		} catch (IllegalArgumentException ex1) {
			
			guzman_2 = new CuentaBancaria();
			
			System.out.printf("El saldo no era valido, la cienta tomo los valores predeterminados: %s %n", guzman_2.toString());
		}
		
		System.out.println("--------------");
		System.out.println("Tersera cuenta");
		System.out.println("--------------");
		
		saldoAleatorio = saldoAleatorio();
		
		System.out.printf("Saldo: %d %n", saldoAleatorio);
		
		try {
			
			guzman_3 = new CuentaBancaria(saldoAleatorio);
			
			System.out.printf("La cuenta tiene los siquientes datos: %s %n", guzman_3.toString());
			
		} catch (IllegalArgumentException ex1) {
			
			guzman_3 = new CuentaBancaria();
			
			System.out.printf("El saldo no era valido, la cienta tomo los valores predeterminados: %s %n", guzman_3.toString());
		}

		//parte 4
		
		System.out.println("---------------------------");
		System.out.println("Cual cuenta tiene mas saldo");
		System.out.println("---------------------------");
		
		if (guzman_1.getSaldo() > guzman_2.getSaldo()) {
			
			if (guzman_1.getSaldo() > guzman_3.getSaldo()) {
				
				System.out.printf("La primera cuenta con el saldo mas alto es: %s %n", guzman_1.toString());
				
			} else {
				
				System.out.printf("La tersera cuenta con el saldo mas alto es: %s %n", guzman_3.toString());
				
			}
			
		} else {
			
			if (guzman_2.getSaldo() > guzman_3.getSaldo()) {
				
				System.out.printf("La segunda cuenta con el saldo mas alto es: %s %n", guzman_2.toString());
				
			} else {
				
				System.out.printf("La tersera cuenta con el saldo mas alto es: %s %n", guzman_3.toString());
				
			}
			
		}
		
		//parte 5
		
		System.out.println("-----------------------------------");
		System.out.println("Intresamos 1000 a la primera cuenta");
		System.out.println("-----------------------------------");
		
		double ingreso = 1000;
		
		guzman_1.ingresar(ingreso);
		
		System.out.printf("Se le a ingresado: %.2f a la primera cuenta: %s %n", ingreso , guzman_1.toString());
		
		//parte 6
		
		System.out.println("--------------------------------------------------------------------------------------------------------------------");
		System.out.println("Inbresamos y intrusimos un saldo aleatorio a la primera cuenta 10 veses o asta que no pueda estraer la cantidad dada");
		System.out.println("--------------------------------------------------------------------------------------------------------------------");
		
		int numeroOperaciones = 1;
		
		do {
			
			saldoAleatorio = saldoAleatorio();
		
			try {
				
				
					
				guzman_1.ingresar(saldoAleatorio);
					
				System.out.printf("Operacion numero: %d %n ", numeroOperaciones);
				System.out.println("------------------------------------------");
				System.out.printf("El saldo era: %.2f %n", guzman_1.getSaldo() - saldoAleatorio);
				System.out.println("----");
				System.out.printf("El saldo ingresado es: %d %n", saldoAleatorio);
				System.out.println("----");
				System.out.printf("El saldo es : %.2f %n", guzman_1.getSaldo());
				System.out.println("------------------------------------------");
					
				numeroOperaciones ++;			
				
			} catch (IllegalArgumentException ex1) {
				
				try {
				
					saldoAleatorio = Math.abs(saldoAleatorio);
					
					guzman_1.extraer(saldoAleatorio);
					
					
					System.out.printf("Operacion numero: %d %n ", numeroOperaciones);
					System.out.println("------------------------------------------");
					System.out.printf("El saldo era: %.2f %n", guzman_1.getSaldo() + saldoAleatorio);
					System.out.println("----");
					System.out.printf("El saldo extraido es: %d %n", saldoAleatorio);
					System.out.println("----");
					System.out.printf("El saldo es: %.2f %n", guzman_1.getSaldo());
					System.out.println("------------------------------------------");
					
					numeroOperaciones++;
				
				} catch (IllegalStateException ex3) {
					
					System.out.printf("El saldo era: %.2f %n", guzman_1.getSaldo());
					System.out.printf("El saldo extraido es: %d %n", saldoAleatorio);
					System.out.println("El saldo ya no puede extraer por que se quedo sin saldo");
					
					numeroOperaciones = 100;
				}
				
			} catch (IllegalStateException ex2) {
				
				System.out.println("El saldo ya llego al maximo que se puede ingresar");
				
				numeroOperaciones = 100;
			}
		
		} while (numeroOperaciones <= 10);
	}

	//parte 1

	//saldoAleatorio: Me da un daldo aleaturio entre -3000 y 3000. int
	public static int saldoAleatorio () {
		
		int saltoAleatorio;
		
		saltoAleatorio =(int) (Math.random()*6001) - 3000;
		
		return saltoAleatorio;			
	}
}
