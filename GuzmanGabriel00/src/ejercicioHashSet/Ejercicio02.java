package ejercicioHashSet;

import java.util.Scanner;
import java.util.HashSet;
import java.util.InputMismatchException;

public class Ejercicio02 {

	public static void main(String[] args) {
			
			Scanner pedido = new Scanner(System.in);
			
			// Bariables
			
			int espacioAleatorio = (int) (Math.random()*100) + 50;
			
			Integer numeroAleatorio;
			
			int cantidadNumerosDiferentes = 0;
			
			HashSet<Integer> conjunto;
			conjunto = new HashSet<Integer>(espacioAleatorio);
			
			int numeroUsuario;
			
			String respuesta;
			
			System.out.println("----------------------------------");
			System.out.println("Metemos los objetos dentro del HashSet");
			System.out.println("----------------------------------");
			
			for (int i = 0; i < espacioAleatorio; i ++) {
				
				numeroAleatorio = new Integer((int) (Math.random()*100) + 1);
				
				if (!conjunto.add( numeroAleatorio )) {
					System.out.println(i +") No se pudo añadir. El número "+ numeroAleatorio +" ya está en la lista.");
				} else {
					System.out.println(i +") Se agrego el numero "+ numeroAleatorio +".");
					cantidadNumerosDiferentes ++;
				}
				
				System.out.println("El texto partido: ");	
				
			}
			
			System.out.println("-----");
			System.out.println("Datos");
			System.out.println("-----");
			
			System.out.println("Cantidad de objetos introducidos: " + cantidadNumerosDiferentes);
			System.out.println("Lista de objetos introducidos: " + conjunto);
			
			System.out.println("----------------------------------------------");
			System.out.println("Sumar los numeros pares y inpares del conjunto");
			System.out.println("----------------------------------------------");
			
			
			System.out.println("Suma detodos los pares: " + sumaPares(conjunto));
			System.out.println("Suma todo los pares: " + sumaImpar(conjunto));
	}
	
	// sumaPar: Suma todos los pares de un conjunto. int 
		public static int sumaPares (HashSet<Integer> conjunto) {	
			
			int suma = 0;
			int numero;
			
			for (Integer i: conjunto) { 
 
			     numero = i.intValue();
				
				if (numero % 2 == 0) {
					suma = suma + numero;
				} 
			
			}
			return suma;	
		}
	
	// sumaImpar: Suma todos los impares de un conjunto. int 
		public static int sumaImpar (HashSet<Integer> conjunto) {	
			
			int suma = 0;
			int numero;
			
			for (Integer i: conjunto) { 

			     numero = i.intValue();
				
				if (numero % 2 != 0) {
					suma = suma + numero;
				} 
			
			}
			return suma;	
		}
}
