/*
 * Descripción: crear y comparar dos Arrays con 20 numeros introducidos por el usuario. Usando los metodos de la clase Arrays
 * Autor: Gabriel Guzmán
 * Fecha: 28/10/2025
 */

package ejercicio17;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio17 { 

	public static void main(String[] args) {
		
		Scanner pedido = new Scanner(System.in);
		
		int numero;
		
		final int TOTAL_NUM = 20;
		final int MITAD_NUM = 10;
		
		int [] numeros;
		int [] primeraParte;
		int [] segundaParte;
		
		numeros = new int [TOTAL_NUM];
		primeraParte = new int [MITAD_NUM];
		segundaParte = new int [MITAD_NUM];
		
		System.out.println("------------------------");
		System.out.println("DOS LISTAS DE 10 NUMEROS");
		System.out.println("------------------------");
		
		for (int i = 0; i < TOTAL_NUM; i ++) {
			
			System.out.print("Dime un numero (" + (i + 1) + "): ");
			numero = pedido.nextInt();
			
			numeros [i] = numero;
			
		}
		
		primeraParte = Arrays.copyOfRange(numeros, 0, 10);
		segundaParte = Arrays.copyOfRange(numeros, 10, 20);
		
		if (Arrays.equals(primeraParte, segundaParte)) {
			
			System.out.println("---------------------------------------");
			System.out.println("Las dos listas de numeros son igiales: ");
			System.out.println("Primera lista: " + Arrays.toString(primeraParte));
			System.out.println("Segunda lista: " + Arrays.toString(segundaParte));
			
		} else {
			
			System.out.println("---------------------------------------");
			System.out.println("Las dos listas de numeros no son iguales: ");
			System.out.println("Primera lista: " + Arrays.toString(primeraParte));
			System.out.println("Segunda lista: " + Arrays.toString(segundaParte));
			
		}
	}
}