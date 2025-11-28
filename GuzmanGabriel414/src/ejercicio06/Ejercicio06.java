/*
 * Descripción: Creando un medodo que Calcule el precio con IVA de un numero.
 * Autor: Gabriel Guzmán
 * Fecha: 18/11/2025
 */

package ejercicio06;

import java.util.Scanner;

public class Ejercicio06 { 
	
	public static void main(String[] args) {
		
		Scanner pedido = new Scanner(System.in);
		
		double precio1;
		double precio2;
		double precio3;
		double precio4;
		double precio5;
		
		double precioIVA1;
		double precioIVA2;
		double precioIVA3;
		double precioIVA4;
		double precioIVA5;
		
		System.out.println("-----------------------------------");
		System.out.println("EQUIVALENCIA SE MILLAS A KILOMETROS");
		System.out.println("-----------------------------------");
		
		System.out.print("Primer precio: ");
		precio1 = pedido.nextDouble();
		
		System.out.print("Segundo precio: ");
		precio2 = pedido.nextDouble();
		
		System.out.print("Tersero precio: ");
		precio3 = pedido.nextDouble();
		
		System.out.print("Cuarto precio: ");
		precio4 = pedido.nextDouble();
		
		System.out.print("Quinto precio: ");
		precio5 = pedido.nextDouble();
		
		precioIVA1 = precioConIVA (precio1);
		
		precioIVA2 = precioConIVA (precio2);
		
		precioIVA3 = precioConIVA (precio3);
		
		precioIVA4 = precioConIVA (precio4);
		
		precioIVA5 = precioConIVA (precio5);
		
		System.out.println("-----------------------------------------");
		System.out.println("El primer precio con IVA es:" + precioIVA1);
		
		System.out.println("El segundo precio con IVA es:" + precioIVA2);
		
		System.out.println("El tersero precio con IVA es:" + precioIVA3);
		
		System.out.println("El cuarto precio con IVA es:" + precioIVA4);
		
		System.out.println("El quinto precio con IVA es:" + precioIVA5);
		
	}
	
	// precioConIVA: introduses un precio y da como resultado este con el 21% de IVA. double
		public static double precioConIVA (double precio) {
			
			double precio21;
			double precioIVA;
			
			precio21 = precio * 0.21;
			
			precioIVA = precio + precio21;
			
			return precioIVA;	
				
		}
		
}
