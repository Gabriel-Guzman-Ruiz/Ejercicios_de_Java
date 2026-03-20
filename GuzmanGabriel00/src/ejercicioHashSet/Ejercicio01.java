package ejercicioHashSet;

import java.util.Scanner;
import java.util.HashSet;
import java.util.InputMismatchException;

public class Ejercicio01 {

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
				
			}
			
			System.out.println("-----");
			System.out.println("Datos");
			System.out.println("-----");
			
			System.out.println("Cantidad de objetos introducidos: " + cantidadNumerosDiferentes);
			System.out.println("Lista de objetos introducidos: " + conjunto.toString());
			System.out.println("Lista de objetos introducidos: " + conjunto);
			
			System.out.println("----------------------------------------------------");
			System.out.println("Pedir numero al usuario y ver si esta en el conjunto");
			System.out.println("----------------------------------------------------");
			
			do {
			
				System.out.print("Dame un numero entre 1 y 100 (0 para terminar): ");
				numeroUsuario = pedido.nextInt();
				
				if (numeroUsuario < 101 && numeroUsuario > 0) {
					
					if (conjunto.contains( numeroUsuario )) {
						System.out.println("El numero "+ numeroUsuario +" si esta.");
						
						do {
							
						System.out.print("quieres eliminar el numero (si / no): ");
						respuesta = pedido.next();
						
							if (respuesta.equalsIgnoreCase("si")){
								
								conjunto.remove(numeroUsuario);
								System.out.println("Se a eliminado: " + numeroUsuario);
								
							}else if (respuesta.equalsIgnoreCase("no")){
								
								System.out.println("------------------------");
								
							}else {
								System.out.println("no es valido. si / no");
							}
								
						}while (respuesta.equalsIgnoreCase("no"));
						
					} else {
						System.out.println("El numero "+ numeroUsuario +" no esta.");
					}
					
				} else if (numeroUsuario == 0) {
					System.out.println("Se termina la busqueda");
					
				} else {
					System.out.println("El numero tiene que estar entre 1 y 100");
				}
			}while (numeroUsuario != 0);
			
			System.out.println("----------------------");
			System.out.println("combinamos el conjunto");
			System.out.println("----------------------");
			
			HashSet<Integer> conjunto2;
			conjunto2 = new HashSet<Integer>(10);
			
			for (int i = 101; i < 111; i ++) {
				
				numeroAleatorio = new Integer (i);
				
				if (!conjunto2.add( numeroAleatorio )) {
					System.out.println(i +") No se pudo añadir. El número "+ numeroAleatorio +" ya está en la lista.");
				} else {
					System.out.println(i +") Se agrego el numero "+ numeroAleatorio +".");
				}	
				
			}
			
			System.out.println("Nuevo conjunto: " + conjunto2);
			
			// copia del primer conjunto
			HashSet<Integer> conjunto2Copia;
			conjunto2Copia = new HashSet<Integer>(espacioAleatorio);
			
			try {
				
				conjunto2Copia.addAll(conjunto2);
				
				conjunto.addAll(conjunto2);
				
				System.out.println("Conjunto convinado: " + conjunto);
				
			} catch (UnsupportedOperationException ex1) {
				
				System.out.println("si la operación addAll no es compatible con este conjunto");
				
			} catch (ClassCastException ex2) {
				
				System.out.println("si la clase de un elemento de la colección especificada impide que se agregue a este conjunto");
				
			} catch (NullPointerException ex3) {
				
				System.out.println(" si la colección especificada contiene uno o más elementos nulos y este conjunto no permite elementos nulos, o si la colección especificada es nula");
				
			} catch (IllegalArgumentException ex4) {
				
				System.out.println("si alguna propiedad de un elemento de la colección especificada impide que se agregue a este conjunto");
				
			}
			
			System.out.println("----------------------");
			System.out.println("Extraemos los objetos que estan en dos conjuntos");
			System.out.println("----------------------");
			
			try {
				
				conjunto.retainAll(conjunto2Copia);
			
			System.out.println("Los objetos iguales de los dos conjuntos: " + conjunto);
			
			} catch (UnsupportedOperationException ex1) {
				
				System.out.println("si la operación addAll no es compatible con este conjunto");
				
			} catch (ClassCastException ex2) {
				
				System.out.println("si la clase de un elemento de la colección especificada impide que se agregue a este conjunto");
				
			} catch (NullPointerException ex3) {
				
				System.out.println(" si la colección especificada contiene uno o más elementos nulos y este conjunto no permite elementos nulos, o si la colección especificada es nula");
				
			}
			
	}
}
