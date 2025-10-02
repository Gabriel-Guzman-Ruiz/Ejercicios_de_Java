/*
 * Descripción: Convertidor del  Sistema Internacional de Unidades a sistema anglosajón de unidades
 * Autor: Gabriel Guzmán
 * Fecha: 30/09/2025
 */

package ejercico3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		Scanner pedido = new Scanner(System.in);
	
		double distancia;
		
		System.out.print("Longitu en metros que deseas trasformar: ");
		distancia = pedido.nextDouble();
		
		double decimetros =  distancia * 10;
		double centimetros = distancia * 100;
		double milimetros =  distancia * 1000;
		
		double pulgadas =  centimetros / 2.54;
		double pies =  pulgadas / 12;
		double yardas =  pies / 3;
		
		
		System.out.println("----------");
		System.out.println("RESULTADO");
		
		System.out.println("---------------------");
		System.out.println("SISTEMA INTERNACIONAL");
		System.out.println("---------------------");
		System.out.println("La medida " + distancia + " en metros es:");
		System.out.println( decimetros + " decímetros");
		System.out.println( centimetros + " centímetros");
		System.out.println( milimetros + " milímetros");
		
		System.out.println("------------------");
		System.out.println("SISTEMA ANGLOSAJÓN");
		System.out.println("------------------");
		System.out.println("La medida " + distancia + " en metros es:");
		System.out.println( pulgadas + " pulgadas");
		System.out.println( pies + " pies");
		System.out.println( yardas + " yardas");

	}

}
