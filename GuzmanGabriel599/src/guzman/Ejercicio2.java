/*
	 Descripción:Ejercicios2 del ecxamen - utilizar la clase CuentaBancaria
	 Autor: Gabriel Guzmán
	 Fecha: 28/01/2026
	 */

package guzman;

import java.lang.IllegalArgumentException;

import libtarea3.CuentaBancaria;
import java.time.LocalDate;
public class Ejercicio2 {

	public static void main(String[] args) {	
		
		//parte 2
	
		CuentaBancaria gabriel_1 = null, gabriel_2 = null, gabriel_3 = null;
		
		boolean error = false;
			
		//parte 3
			
		System.out.println("------------------------");
		System.out.println("Creamos las tres cuentas");
		System.out.println("------------------------");
			
		System.out.println("Primera cuenta");
		System.out.println("--------------");
			
		double limiteDescubrimiento;
		
		do{
			
			limiteDescubrimiento = limiteAleatorio();
			
			System.out.printf("Saldo: %f %n", limiteDescubrimiento);
			
			try {
					
				gabriel_1 = new CuentaBancaria(1000.0, LocalDate.now(),limiteDescubrimiento);
					
				System.out.printf("La cuenta tiene los siquientes datos: %s %n", gabriel_1.toString());	
				
				error = false;
				
			} catch (IllegalArgumentException ex1) {
				error = true;	
					
				System.out.printf("El limite de descubrimiento no es valido, se volvera a realizar la cuenta %n");
				
			}
		
		} while (error == true);
			
			System.out.println("--------------");
			System.out.println("Segunda cuenta");
			System.out.println("--------------");
			
			
			
			do{
				
				limiteDescubrimiento = limiteAleatorio();
				
				System.out.printf("Saldo: %f %n", limiteDescubrimiento);
				
				try {
						
					gabriel_2 = new CuentaBancaria(2000.0, LocalDate.now(), limiteDescubrimiento);
						
					System.out.printf("La cuenta tiene los siquientes datos: %s %n", gabriel_2.toString());	
					
					error = false;
					
				} catch (IllegalArgumentException ex1) {
					error = true;	
						
					System.out.printf("El limite de descubrimiento no es valido, se volvera a realizar la cuenta %n");
					
				}
			
			} while (error == true);
			
			System.out.println("--------------");
			System.out.println("Tersera cuenta");
			System.out.println("--------------");
			
			do{
				
				limiteDescubrimiento = limiteAleatorio();
				
				System.out.printf("Saldo: %f %n", limiteDescubrimiento);
				
				try {
						
					gabriel_3 = new CuentaBancaria(3000.0, LocalDate.now(), limiteDescubrimiento);
						
					System.out.printf("La cuenta tiene los siquientes datos: %s %n", gabriel_3.toString());	
					
					error = false;
					
				} catch (IllegalArgumentException ex1) {
					
					error = true;	
						
					System.out.printf("El limite de descubrimiento no es valido, se volvera a realizar la cuenta %n");
					
				}
			
			} while (error == true);
	
			//parte 4
			
			System.out.println("---------------------------");
			System.out.println("Cual cuenta tiene menos limite de descuento");
			System.out.println("---------------------------");
			
			if (gabriel_3.getLimiteDescubierto() < gabriel_2.getLimiteDescubierto()) {
				
				if (gabriel_1.getLimiteDescubierto() < gabriel_3.getLimiteDescubierto()) {
					
					System.out.printf("La primera cuenta es el que tiene el limite descubierto mas bajo: %s %n", gabriel_1.toString());
					
				} else {
					
					System.out.printf("La tersera cuenta es el que tiene el limite descubierto mas bajo: %s %n", gabriel_3.toString());
					
				}
				
			} else {
				
				if (gabriel_2.getLimiteDescubierto() < gabriel_3.getLimiteDescubierto()) {
					
					System.out.printf("La segunda cuenta es el que tiene el limite descubierto mas bajo: %s %n", gabriel_2.toString());
					
				} else {
					
					System.out.printf("La tersera cuenta es el que tiene el limite descubierto mas bajo: %s %n", gabriel_3.toString());
					
				}
				
			}
			
			//parte 9
			
			System.out.println("-----------------------------------");
			System.out.println("5 trasferencias de 300 de la primera a la segunda cuenta");
			System.out.println("-----------------------------------");
			
			double trasferido = 300;
			
			for (int x = 0; x < 5 ; x++) {
				
				gabriel_1.transferir(trasferido ,gabriel_2);
				
			}
			
			System.out.printf("El saldo en la primera cuenta es: %.2f %n" , gabriel_1.getSaldo());
			System.out.printf("El saldo en la segunda cuenta es: %.2f %n" , gabriel_2.getSaldo());
			
			//parte 10
			
			System.out.println("-----------------------------------");
			System.out.println("Enbarga la mitad del daldo de la tersera cuenta");
			System.out.println("-----------------------------------");
			
			gabriel_3.embargar(50.00);
			
			System.out.printf("Datos de la tersera cuenta: %s %n" , gabriel_3.toString());
			
			//parte 11
			
			System.out.println("-----------------------------------");
			System.out.println("Muestra el saldo de todas las cuentas y el numero de cuentas");
			System.out.println("-----------------------------------");
			
			System.out.printf("Saldo global de todas las cuentas: %f %n" , CuentaBancaria.getSaldoGlobal());
			System.out.printf("Numeros de cuentas: %d %n" , CuentaBancaria.getNumCuentasEmbargadas());
				
	}
	
	//parte 1
	
	//limiteAleatorio: Valor aleatorio entre -4000 y 0. int
			public static double limiteAleatorio () {
				
				double limiteDescubrimiento;
				
				limiteDescubrimiento = (Math.random()*4000) - 4000;
				
				return limiteDescubrimiento;			
			}
}
