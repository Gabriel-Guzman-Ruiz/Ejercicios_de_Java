package ejerciciosList;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		
		Scanner pedido = new Scanner(System.in);
		
		// Bariables
		
		int espacioAleatorio = (int) (Math.random()*20) + 1;
		
		Integer numeroAleatorio;
		
		int cantidadObjetos = 0;
		
		LinkedList <Integer> conjunto;
		conjunto = new LinkedList <Integer>();
		
		
		System.out.println("--------------------------------------");
		System.out.println("Metemos los objetos dentro del HashSet");
		System.out.println("--------------------------------------");
		
		for (int i = 0; i < espacioAleatorio; i ++) {
			
			numeroAleatorio = new Integer((int) (Math.random()*10) + 1);
			
			conjunto.add( numeroAleatorio );
			
			System.out.println(i +") Se agrego el numero "+ numeroAleatorio +".");
			cantidadObjetos ++;
			
		}
		
		System.out.println("-----");
		System.out.println("Datos");
		System.out.println("-----");
		
		System.out.println("Cantidad de objetos introducidos: " + cantidadObjetos);
		System.out.println("Lista de objetos ArrayList: " + conjunto);
		
		System.out.println("-----------------------");
		System.out.println("Lo comvertimos una cola");
		System.out.println("-----------------------");
		
		boolean error = false;
		
		boolean terminar = false;
		
		int NumeroNuevoCola;
		
		int Decicion;
		
		do {
		
			try {
				
				do {
				
				System.out.println("0) Salor | "
						+ "1) Meter un mumero a la cola | "
						+ "2) Sacar el numero mas antigua |"
						+ "3) Ver el numero mas antigua");
				Decicion = pedido.nextInt();
				
					if (Decicion >= 0 && Decicion <= 3) {
							
							switch (Decicion) {
							
								case 0:
								
									terminar = true;
									
									System.out.println("Termina");
									
									break;
							
								case 1:
									
									System.out.print("El nuevo numero: ");
									NumeroNuevoCola = pedido.nextInt();
									
									numeroAleatorio = new Integer(NumeroNuevoCola);
									
									conjunto.offer(numeroAleatorio);
									
									System.out.println("Conjunto cambiado: " + conjunto);
									
									cantidadObjetos ++;
									
									pedido.nextLine();
									
									break;
									
								case 2:
									
									conjunto.poll();
									
									System.out.println("Conjunto cambiado: " + conjunto);
									
									cantidadObjetos --;
									
									pedido.nextLine();
									
									break;
									
								case 3:
									
									System.out.println("El ultimo numero: " + conjunto.peek());
									
									pedido.nextLine();
									
									break;
							}
							
					} else {
						
						System.out.println("Elije una de las opciones");
						
					}
					
				} while (!terminar);
				
					error = false;
					
					terminar = false;
				
				
			} catch (InputMismatchException ex1) {
				
				System.out.println("tienes que darme un numero entero");
				
				error = true;
				
				pedido.nextLine();
				
			} catch (IndexOutOfBoundsException ex2) {
				
				System.out.println("La posision dada no esta en el conjunto");
				
				error = true;
				
			} 
			
		} while (error);
		
		System.out.println("-----------------------");
		System.out.println("Lo comvertimos una pila");
		System.out.println("-----------------------");
		
		do {
		
			try {
				
				do {
				
				System.out.println("0) Salor | "
						+ "1) Meter un mumero a la pila | "
						+ "2) Sacar el numero mas nuevo |"
						+ "3) Ver el numero mas antigua");
				Decicion = pedido.nextInt();
				
					if (Decicion >= 0 && Decicion <= 3) {
							
							switch (Decicion) {
							
								case 0:
								
									terminar = true;
									
									System.out.println("Termina");
									
									break;
							
								case 1:
									
									System.out.print("El nuevo numero: ");
									NumeroNuevoCola = pedido.nextInt();
									
									numeroAleatorio = new Integer(NumeroNuevoCola);
									
									conjunto.push(numeroAleatorio);
									
									System.out.println("Conjunto cambiado: " + conjunto);
									
									cantidadObjetos ++;
									
									pedido.nextLine();
									
									break;
									
								case 2:
									
									conjunto.pop();
									
									System.out.println("Conjunto cambiado: " + conjunto);
									
									cantidadObjetos --;
									
									pedido.nextLine();
									
									break;
									
								case 3:
									
									System.out.println("El ultimo numero: " + conjunto.peek());
									
									pedido.nextLine();
									
									break;
							}
							
					} else {
						
						System.out.println("Elije una de las opciones");
						
					}
					
				} while (!terminar);
				
					error = false;
				
				
			} catch (InputMismatchException ex1) {
				
				System.out.println("tienes que darme un numero entero");
				
				error = true;
				
				pedido.nextLine();
				
			} catch (IndexOutOfBoundsException ex2) {
				
				System.out.println("La posision dada no esta en el conjunto");
				
				error = true;
				
			} 
			
		} while (error);		
		
		
	}	
	
}
