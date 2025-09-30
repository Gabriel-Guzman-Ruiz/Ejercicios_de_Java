/*
 * Descripción: Limites de las variables de numeros enteros
 * Autor: Gabriel Guzmán
 * Fecha: 30/09/2025
 */

package ejercicio4;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		byte pequenna = 127;
		short mediana = 32767;
		int grande = 2147483647;
		long estragrande = 9223372036854775807l;
		
		System.out.println("-------------------------------");
		System.out.println("Variables numericos explicados:");
		System.out.println("-------------------------------");
		System.out.println("La variable \"byte\" solo almasena numaros negativos y positibos hasta: " + pequenna);
		System.out.println("La variable \"short\" solo almasena numaros negativos y positibos hasta: " + mediana);
		System.out.println("La variable \"int\" solo almasena numaros negativos y positibos hasta: " + grande);
		System.out.println("La variable \"long\" solo almasena numaros negativos y positibos hasta: " + estragrande);

	}

}