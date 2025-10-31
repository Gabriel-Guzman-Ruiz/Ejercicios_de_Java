/*
 * Descripción: En vase a alturas pedidas al usuario calculamos la media, la mas alta, la mas vaja y todas las alturas por mas altas y mas vajas que la medio. Usando Arrays
 * Autor: Gabriel Guzmán
 * Fecha: 23/10/2025
 */

package ejercicio10;

import java.util.Scanner;

public class Ejercicio10 { 

	public static void main(String[] args) {
		
		Scanner pedido = new Scanner(System.in);
		
		int numeroAlturas;
		double altura;
		double suma = 0;
		double media;
		double maximo = 0;
		double minimo = 999999999;
		
		double [] alturas;
		
		System.out.println("----------------------------------------------------------------------------------------------------------");
		System.out.println("GOARDA Y MUESTRA LA MEDIA, EL MINIMO, EL MAXIMO Y LOS VALORES POR DE VAJO Y ARIVA DE LA MEDIA DE N ALTURAS");
		System.out.println("----------------------------------------------------------------------------------------------------------");
		
		
		System.out.print("Numero de alturas que quieres poner (N): ");
		numeroAlturas = pedido.nextInt();
		System.out.println("---------------------------------------");

		
		alturas = new double [numeroAlturas];
		
		for (int i = 0; i < numeroAlturas; i ++) {
			
			System.out.print("Dame la altura (" + (i + 1) + " de " + numeroAlturas + "): ");
			altura = pedido.nextDouble();
			
			alturas [i] = altura;
			
			suma = suma + alturas [i];
			
			if (alturas [i] >= maximo) {
				
				maximo = alturas [i];
				
			}
			
			if (alturas [i] <= minimo){
				
				minimo = alturas [i];
				
			}
			
		}
		
		media = suma / numeroAlturas;
		
		System.out.println("----------------------------------------------------------------------------------------------------------");
		System.out.println("La media de las alturas es: " + media);
		
		System.out.println("La altura mas alta es: " + maximo);
		
		System.out.println("La altura mas vaja es: " + minimo);
		
		System.out.print("Las alturas que estan por ariva en la media son: ");
		
		for (int i = 0; i < numeroAlturas; i ++) {
			
			if (alturas [i] > media) {
				
				System.out.print(alturas [i] + " ");
				
				
			}
			
		}
		
		System.out.println("");
		
		System.out.print("Las alturas que estan por devajo en la media son: ");
		
		for (int i = 0; i < numeroAlturas; i ++) {
			
			if (alturas [i] < media) {
				
				System.out.print(alturas [i] + " ");
				
				
			}
			
		}
	
	}
}

