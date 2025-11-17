/*
 * Descripción: Comando que cuentas el numero de cada una de las vocales en un texto.
 * Autor: Gabriel Guzmán
 * Fecha: 13/11/2025
 */

package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 { 

	public static void main(String[] args) {
		
		Scanner pedido = new Scanner(System.in);
		
		String texto;
		
		int cuenta [];
		
		String vocales [] = {"a","e","i","o","u"};	
		
		System.out.println("-------------------------------");
		System.out.println("CONTADOR DE VOCALES DE UN TEXTO");
		System.out.println("-------------------------------");
		
		System.out.print("Texto: ");
		texto = pedido.nextLine();
			
		cuenta = coentarVocal (texto);
			
		for (int i = 0; i < 5; i++) {
				
		System.out.println("------------------------------------------------------------------------------------------");
		System.out.println("En el texto la cantidad de veses que aparecia la vocal " + vocales [i] +" es: " + cuenta [i]);	
				
		}
			
	}
	
	// contarVocal Cuenta todas las vocales de una cadena de caracteres. Arrays []
		public static int[] coentarVocal (String texto) {	
						
			int largo;
			char vocal;
			int numeroA = 0;
			int numeroE = 0;
			int numeroI = 0;
			int numeroO = 0;
			int numeroU = 0;
			
			final int CANTIDAD = 5;
			
			int cuenta [] ;
			
			cuenta = new int [CANTIDAD];
			
			texto = texto.toLowerCase();
			
			largo = texto.length();
			
			for (int silava = 0; silava < largo; silava++) {
				
				vocal = texto.charAt(silava);
				
				switch (vocal) {
				
					case 'a':
						
						numeroA ++;
						
						cuenta [0] = numeroA;
						
						break;
	
					case 'e':
						
						numeroE ++;
						
						cuenta [1] = numeroE;
						
						break;
	
					case 'i':
						
						numeroI ++;
						
						cuenta [2] = numeroI;
						
						break;
	
					case 'o':
						
						numeroO ++;
						
						cuenta [3] = numeroO;
						
						break;
	
					case 'u':
						
						numeroU ++;
						
						cuenta [4] = numeroU;
						
						break;
				}
			}
					
			return cuenta;		
		}
}