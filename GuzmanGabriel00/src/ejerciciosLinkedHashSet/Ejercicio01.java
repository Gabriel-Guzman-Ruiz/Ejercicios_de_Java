package ejerciciosLinkedHashSet;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class Ejercicio01 {

	public static void main(String[] args) {
		
		Scanner pedido = new Scanner(System.in);
		
		// Bariables
		
		int espacioAleatorio = (int) (Math.random()*50) + 1;
		
		Integer numeroAleatorio;
		
		int cantidadNumerosDiferentes = 0;
		
		HashSet<Integer> conjunto;
		conjunto = new HashSet<Integer>(espacioAleatorio);
		
		LinkedHashSet<Integer> conjunto2;
		conjunto2 = new LinkedHashSet<Integer>(espacioAleatorio);
		
		TreeSet<Integer> conjunto3;
		conjunto3 = new TreeSet<Integer>();
		
		System.out.println("----------------------------------");
		System.out.println("Metemos los objetos dentro del HashSet");
		System.out.println("----------------------------------");
		
		for (int i = 0; i < espacioAleatorio; i ++) {
			
			numeroAleatorio = new Integer((int) (Math.random()*50) + 1);
			
			if (!conjunto.add( numeroAleatorio ) || !conjunto2.add( numeroAleatorio ) || !conjunto3.add( numeroAleatorio )) {
				System.out.println(i +") No se pudo añadir. El número "+ numeroAleatorio +" ya está en la lista.");
			} else {
				System.out.println("Lista de objetos HashSet: " + conjunto);
				System.out.println("Lista de objetos LinkedHashSet: " + conjunto2);
				System.out.println("Lista de objetos TreeSet: " + conjunto3);
				System.out.println("-----");
				cantidadNumerosDiferentes ++;
			}
			
		}
		
		System.out.println("-----");
		System.out.println("Datos");
		System.out.println("-----");
		
		System.out.println("Cantidad de objetos introducidos: " + cantidadNumerosDiferentes);
		System.out.println("Lista de objetos HashSet: " + conjunto);
		System.out.println("Lista de objetos LinkedHashSet: " + conjunto2);
		System.out.println("Lista de objetos TreeSet: " + conjunto3);
		

	}

}
