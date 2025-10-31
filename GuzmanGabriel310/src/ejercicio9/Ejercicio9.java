/*
 * Descripción: De 100 numeros enteros entre 1 y 10 Mostrar los numeros que son iguales que R . Usando Arrays
 * Autor: Gabriel Guzmán
 * Fecha: 23/10/2025
 */

package ejercicio9;

import java.util.Scanner;

public class Ejercicio9 { 

	public static void main(String[] args) {
		
		Scanner pedido = new Scanner(System.in);
		
		int numeroN;
		
		int [] numeros;
		
		final int TOTAL_NUM = 100;
		
		
		System.out.println("-------------------------------------------------");
		System.out.println("GOARDA Y MUESTRA DONDE DENTRO DEL ARRAY APARESE N");
		System.out.println("-------------------------------------------------");
		
		
		System.out.print("Numero entre 1 y 10 (N): ");
		numeroN = pedido.nextInt();
		
		numeros = new int [TOTAL_NUM];
		
		for (int i = 0; i < TOTAL_NUM; i ++) {
			
			numeros [i] = (int) (1 + Math.random() * 10);
			
		}
		
		System.out.println("-------------------------------------------------------");
		System.out.print("Dentro de el array " + numeroN + " aparese en la pocicion: ");
		
		for (int i = 0; i < TOTAL_NUM; i ++) {
			
			if (numeros [i] == numeroN) {
				
				System.out.print(i + " ");
			}
			
		}
		
	}

}
