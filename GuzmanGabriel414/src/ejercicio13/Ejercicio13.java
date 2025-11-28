/*
 * Descripción: Creamos un metodo que calcule el descuento de un producto y despues lo mostramos por pantalla.
 * Autor: Gabriel Guzmán
 * Fecha: 25/11/2025
 */

package ejercicio13;

import java.util.Scanner;

public class Ejercicio13 { 
	
	public static void main(String[] args) {
		
		Scanner pedido = new Scanner(System.in);
		
		double precio;
		double precioDescuento;
		
		double descuento;
		
		System.out.println("-----------------------------------");
		System.out.println("Calcula el descuento de un producto");
		System.out.println("-----------------------------------");
		
		System.out.print("Precio sin descuento: ");
		precio = pedido.nextDouble();
		
		System.out.print("Precio con descuento: ");
		precioDescuento = pedido.nextDouble();
			
		descuento = descuentoProducto(precio , precioDescuento);
			
		System.out.println("--------------------------------------------");
		System.out.println("El descuento es de: " + descuento + "%");
		
	}
	
	// descuentoProducto: Calcula el descuento de un precio. double
	public static double descuentoProducto (double precio , double precioDescuento) {
		
		double descuento;
		
		double descuentoPorsentaje;
		
		descuento = precioDescuento / precio;
		
		descuentoPorsentaje = 100 - (descuento * 100);
			
		return descuentoPorsentaje;	
				
	}
		
}