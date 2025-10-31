/*
 * Descripción: Mostrar la suma de los negativos y positivos de 20 numeros enteros introducidos. Usando Arrays
 * Autor: Gabriel Guzmán
 * Fecha: 21/10/2025
 */

package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 { 

	public static void main(String[] args) {
		
		Scanner pedido = new Scanner(System.in);
		
		double numero;
		double suma = 0;
		double media;
		
		final int TOTAL_NUM = 20;
		
		double [] numeros;
		numeros = new double [TOTAL_NUM];
		
		System.out.println("---------------------------------------------");
		System.out.println("GOARDA Y MUESTRA MEDIA  DE 10 NUMEROS ENTEROS");
		System.out.println("---------------------------------------------");
		
		for (int i = 0; i < TOTAL_NUM; i ++) {
			
			System.out.print("Dame el numero entero: ");
			numero = pedido.nextInt();
			
			numeros [i] = numero;
			
			suma = suma + numeros [i];
			
		}
		
		media = suma / TOTAL_NUM;
		
		System.out.println("---------------------------------------------------------------------------");
		System.out.println("La media aritmetica de la secuencia de numeros: " + media);
		
	}
}
