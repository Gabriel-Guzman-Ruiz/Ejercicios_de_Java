/*
 * Descripción: 
 * Autor: Gabriel Guzmán
 * Fecha: 3/10/2025
 */

package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		Scanner pedido = new Scanner(System.in);
		
		String nombre;
		String apellido;
		double importeGastado1;
		double importeGastado2;
		double importeGastado3;
		double importeGastado4;
		
		System.out.println("---------------------");
		System.out.println("DESCUENTO DE 50 EUROS");
		System.out.println("---------------------");
		
		System.out.print("Dame tu Nombre: ");
		nombre = pedido.next();
		
		System.out.print("Dame tu apellido: ");
		apellido = pedido.next();
		
		System.out.print("Dame el importe de la primera factura: ");
		importeGastado1 = pedido.nextDouble();
		
		System.out.print("Dame el importe de la segunda factura: ");
		importeGastado2 = pedido.nextDouble();
		
		System.out.print("Dame el importe de la tersera factura: ");
		importeGastado3 = pedido.nextDouble();
		
		System.out.print("Dame el importe de la cuarta factura: ");
		importeGastado4 = pedido.nextDouble();
		
		System.out.println("----------");
		System.out.println("RESULTADOS");
		System.out.println("----------");
		
		double importeTotal = importeGastado1 + importeGastado2 + importeGastado3 + importeGastado4;
		
		double importeMedio = importeTotal/4;
		
		System.out.println("------------------------");
		System.out.println( " Nombre:" + nombre + "\r\n"
				+ " Apellidos: " + apellido + "\r\n"
				+ " Importe Gastado1: " + importeGastado1 + " euros\r\n"
				+ " Importe Gastado2: " + importeGastado2 + " euros\r\n"
				+ " Importe Gastado3: " + importeGastado3 + " euros\r\n"
				+ " Importe Gastado4: " + importeGastado4 + " euros\r\n"
				+ " Importe Medio: " + importeMedio + " euros\r\n");
		
		if (importeTotal >= 300){
			
			System.out.println( "Sus compras suman " +importeTotal+ ", felisidades te as ganado un vale de descuento de 50 euros.");
			
		} else { 
			
			System.out.println( "Lo sentimos pero sus compras no han alcanzado los 300 euros este mes, no dispone de descuento.");
		}
		
	}
	
}

