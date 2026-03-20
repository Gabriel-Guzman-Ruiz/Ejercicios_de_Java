package ejerciciosList;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio01 {
	
	public static void main(String[] args) {
		
		Scanner pedido = new Scanner(System.in);
		
		// Bariables
		
		int espacioAleatorio = (int) (Math.random()*50) + 1;
		
		Integer numeroAleatorio;
		
		int cantidadObjetos = 0;
		
		ArrayList<Integer> conjunto;
		conjunto = new ArrayList<Integer>(espacioAleatorio);
		
		
		System.out.println("----------------------------------");
		System.out.println("Metemos los objetos dentro del HashSet");
		System.out.println("----------------------------------");
		
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
		
		System.out.println("------------------------------------------------------------");
		System.out.println("Mete un numero aleatorio en una posision dada por el uauario");
		System.out.println("------------------------------------------------------------");
		
		int posision;
		
		boolean error = false;
		
		do {
		
			try {
				
				System.out.print("Dame un numero de 1 a " + cantidadObjetos + ", "
						+ "es la posision donde se pontra un nuevo numero aleatorio: ");
				posision = pedido.nextInt();
				
				numeroAleatorio = new Integer((int) (Math.random()*10) + 1);
				
				conjunto.add( posision , numeroAleatorio );
				
				System.out.println("Conjunto cambiado: " + conjunto);
				
				error = false;
				
				cantidadObjetos ++;
				
			} catch (InputMismatchException ex1) {
				
				System.out.println("tienes que darme un numero entero");
				
				error = true;
				
				pedido.nextLine();
				
			} catch (IndexOutOfBoundsException ex2) {
				
				System.out.println("La posision dada no esta en el conjunto");
				
				error = true;
				
			} 
			
		} while (error);
		
		System.out.println("-----------------------------------");
		System.out.println("Eliminamos un elemento del conjunto");
		System.out.println("-----------------------------------");
		
		do {
			
			try {
				
				System.out.println("0) Salir | 1) Eliminar numero de una posicion | 2) Eliminar un numero en concreto: | 3) Elimunar todas las copias de un numero");
				posision = pedido.nextInt();
				
				boolean salir = false;
				
				if (posision >= 0 && posision <= 3) {
				
				switch (posision) {
				
					case 0:
					
						salir = true;
						
						System.out.println("Termina");
						
						break;
				
					case 1:
						
						System.out.print("Posicion del numero: ");
						posision = pedido.nextInt();
						
						numeroAleatorio = conjunto.remove(posision);
						
						System.out.print("Se a eliminado el numero: " + numeroAleatorio);
						
						break;
						
					case 2:
						
						System.out.print("El numero: ");
						posision = pedido.nextInt();
						
						numeroAleatorio  = new Integer(posision);
						
						conjunto.remove(numeroAleatorio);
						
						System.out.println("Se a eliminado el numero: " + numeroAleatorio);
						
						break;
						
					case 3:
						
						System.out.print("El numero: ");
						posision = pedido.nextInt();
						
						numeroAleatorio  = new Integer(posision);
						
						conjunto.remove(numeroAleatorio);
						
						System.out.println("Se a eliminado el numero: " + numeroAleatorio);
						
						break;
				}
				
				System.out.println("Conjunto cambiado: " + conjunto);
				
				error = false;
				
				cantidadObjetos --;
				
				} else {
					
					error = true;
					
				}
				
				
				
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
