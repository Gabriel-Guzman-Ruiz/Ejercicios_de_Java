/*
 Descripción:Creamos modificamos y mostramos objetos de unas cuentas bancarias
 Autor: Gabriel Guzmán
 Fecha: 2/12/2025
 */

package ejercicio1;
	
import libtarea3.CuentaBancaria;
	
import java.time.LocalDate;

import java.lang.IllegalArgumentException;

import java.lang.Exception;

import java.lang.IllegalStateException;
	
public class Ejercicio01 {
		
	public static void main(String[] args) {
		
		//parte 1
		CuentaBancaria cuentaPrivada, cuentaConjunta, cuentaFamiliar;
			
		//parte 2
		
		System.out.println("--------------------------------------------");
		System.out.println("CREACION Y MODIFICACION DE CUENTAS BANCARIAS");
		System.out.println("--------------------------------------------");	
		
		//parte 2.1
			
		try {	
			
			LocalDate fecha1 = LocalDate.of(2027, 9, 1);
				
			cuentaPrivada = new CuentaBancaria(0.0, fecha1);
				
		} catch (IllegalArgumentException ex1) {
					
			System.out.println("----------------------------------------------------------------------------------");
			System.out.println("Un dato de la cuenta bancaria esta mal puesta. Se creara con datos predetarminados");
			System.out.println("----------------------------------------------------------------------------------");	
				
			cuentaPrivada = new CuentaBancaria();
			
		}  catch (Exception ex2) {
			
			System.out.println("------------------------------------------------------------");
			System.out.println("La fecha esta mal puesta. Se creara con datos predetarminados");
			System.out.println("------------------------------------------------------------");
			
			cuentaPrivada = new CuentaBancaria();
			
		}
		
		//parte 2.2
			
		try {	
				
			cuentaPrivada = new CuentaBancaria(-200.00);
				
		} catch (IllegalArgumentException ex1) {
					
			System.out.println("----------------------------------------------------------");
			System.out.println("El saldo no es valido. Se creara con datos predetarminados");
			System.out.println("----------------------------------------------------------");	
				
			cuentaPrivada = new CuentaBancaria();
		}
		
		//parte 2.3
		
		try {
		LocalDate fecha3 = LocalDate.of(2021, 7, 1);
		
		cuentaPrivada = new CuentaBancaria(1000.00, fecha3, -200.00);
		} catch (IllegalArgumentException ex1) {
			
			System.out.println("-----------------------------------------------------------------------------------------");
			System.out.println("El saldo o el descubiertod no es valido no es valido. Se creara con datos predetarminados");
			System.out.println("-----------------------------------------------------------------------------------------");	
		
			cuentaPrivada = new CuentaBancaria();
		} catch (Exception ex2) {
			
			System.out.println("----------------------------------------------------------");
			System.out.println("La fecha no es valida. Se creara con datos predetarminados");
			System.out.println("----------------------------------------------------------");
			
		}
		
		//parte 2.4
		
		try {
			LocalDate fecha4 = LocalDate.of(2021, 7, 1);
			
			cuentaConjunta = new CuentaBancaria(200.00, fecha4);
			
			} catch (IllegalArgumentException ex1) {
				
				System.out.println("-----------------------------------------------------------------------");
				System.out.println("El saldo no es valido no es valido. Se creara con datos predetarminados");
				System.out.println("-----------------------------------------------------------------------");
			
				cuentaConjunta = new CuentaBancaria();
			} catch (Exception ex2) {
				
				System.out.println("----------------------------------------------------------");
				System.out.println("La fecha no es valida. Se creara con datos predetarminados");
				System.out.println("----------------------------------------------------------");
				
				cuentaConjunta = new CuentaBancaria();
				
			}
		
		//parte 2.5
			
		cuentaFamiliar = new CuentaBancaria();
		
		// PARTE 3
		
		// parte 3.1
		
		System.out.println("--------------------------------------------------");
		System.out.printf("La cuenta tiene el id: %d  %n",cuentaPrivada.getId());
		
		// parte 3.2
		
		System.out.printf("La cuenta se creo el: %s %n" , cuentaPrivada.getFechaCreacion());
		
		// parte 3.3
		
		System.out.printf("La cuenta tiene un limite descubierto de: %.2f %n" ,  cuentaPrivada.getLimiteDescubierto());
		
		// parte 3.4
		
		if (cuentaPrivada.isEmbargada() == false) {
			
			System.out.println("La cuenta no esta enbargada");
			
		} else {
			
			System.out.println("La cuenta esta enbargada");
			
		}
		
		// parte 3.5
		
		if (cuentaPrivada.isDescubierta() == false) {
			
			System.out.println("La cuenta no esta descubierta");
			
		} else {
			
			System.out.println("La cuenta esta descubierta");
			
		}
		
		// parte 3.6
		
		System.out.printf("La cuenta fue creada hace: %s dias  %n" , cuentaPrivada.	getDiasCuenta());
		
		// parte 4
		
		// parte 4.1
		
		try {
			
			cuentaFamiliar.ingresar(100.00);
			
		} catch (IllegalArgumentException ex1) {
				
			System.out.println("-------------------------------------------------------------------------");
			System.out.println("El dinero ingresado no es valido (negativo). No se realizara la operacion");
			System.out.println("-------------------------------------------------------------------------");	
			
		} catch (IllegalStateException ex2) {
				
			System.out.println("--------------------------------------------------------------");
			System.out.println("El ingreso suera el saldo máximo. No se realizara la operacion");
			System.out.println("--------------------------------------------------------------");
				
		}
		
		// parte 4.2
		
		try {
			
			cuentaConjunta.extraer(100.00);
			
		} catch (IllegalArgumentException ex1) {
				
			System.out.println("-------------------------------------------------------------------------");
			System.out.println("El ingreso extraido no es valido (negativo). No se realizara la operacion");
			System.out.println("-------------------------------------------------------------------------");	
			
		} catch (IllegalStateException ex2) {
				
			System.out.println("---------------------");
			System.out.println("El ingreso suera el saldo máximo. No se realizara la operacion");
			System.out.println("---------------------");
				
		}
		
		// parte 4.3
		
		try {
			
			cuentaPrivada.transferir(1100.00, cuentaFamiliar);
			
		} catch (IllegalArgumentException ex1) {
				
			System.out.println("----------------------------------");
			System.out.println("El saldo no es valido no es valido");
			System.out.println("----------------------------------");	
			
		} catch (IllegalStateException ex2) {
				
			System.out.println("---------------------");
			System.out.println("La fecha no es valida");
			System.out.println("---------------------");
				
		}
		
		// parte 5
		
		System.out.println("-------------------------------------------------");
		
		// parte 5.1
		
		System.out.printf("Cuenta privada: %s %n" , cuentaPrivada.toString());
		
		// parte 5.2
		
		System.out.printf("Cuenta conjunta: %s %n" , cuentaConjunta.toString());
		
		// parte 5.3
		
		System.out.printf("Cuenta familiar: %s %n" , cuentaFamiliar.toString());
		System.out.println("-------------------------------------------------");
		
	}
}
	

