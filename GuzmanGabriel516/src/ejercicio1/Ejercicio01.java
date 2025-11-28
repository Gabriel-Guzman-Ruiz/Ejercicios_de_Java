/*
 Descripción:.
 Autor: Gabriel Guzmán
 Fecha: 25/11/2025
 */

package ejercicio1;

import java.util.Scanner;
	
import libtarea3.CuentaBancaria;
	
import java.time.LocalDate;

import java.lang.IllegalArgumentException;
	
public class Ejercicio01 {
		
	public static void main(String[] args) {
			
		Scanner pedido = new Scanner(System.in);
			
		boolean error = false;
		
		//parte 1
		CuentaBancaria cuentaPrivada, cuentaConjunta, cuentaFamiliar;
			
		//parte 2
		
		//parte 2.1
		
		LocalDate fecha1 = LocalDate.of(2027, 9, 1);
				
		try {	
				
			cuentaPrivada = new CuentaBancaria(0.0, fecha1);
				
		} catch (IllegalArgumentException ex1) {
					
			System.out.println("---------------------");
			System.out.println("La fecha no es valida");
			System.out.println("---------------------");	
				
			cuentaPrivada = new CuentaBancaria();
		}
		
		//parte 2.2
			
		LocalDate fecha2 = LocalDate.now();
			
		try {	
				
			cuentaPrivada = new CuentaBancaria(-200.00, fecha2);
				
		} catch (IllegalArgumentException ex1) {
					
			System.out.println("---------------------");
			System.out.println("El saldo no es valido");
			System.out.println("---------------------");	
				
			cuentaPrivada = new CuentaBancaria();
		}
		
		//parte 2.3
		
		LocalDate fecha3 = LocalDate.of(2021, 7, 1);
		
		cuentaPrivada = new CuentaBancaria(1000.00, fecha3, -200.00);
		
		//parte 2.4
		
		LocalDate fecha4 = LocalDate.of(2021, 7, 1);
		
		cuentaPrivada = new CuentaBancaria(200.00, fecha3);
		
		// System.out.println(cuentaPrivada.toString());
		
	}
}
	

