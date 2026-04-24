/*
* Descripción: .
* Autor: Gabriel Guzmán
* Fecha: 22/04/2026
*/

package ejercicio01;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio01 {
	
	public static void main(String[] args) {
		
		Scanner pedido = new Scanner(System.in);
		
		boolean continuar = false;
		
		String ruta;
		
		File fichero;
		
		do {
			
			System.out.println("------------------------------");
			System.out.println("Mostrar informacion de fichero");
			System.out.println("------------------------------");

			try {
				
				System.out.print("Ruta del fichero: ");
				ruta = pedido.nextLine();
				System.out.println("--------------------");
		        
		        if (ruta.isEmpty()) {
		        	
					System.out.println("-----------------------");
					System.out.println("Se termina la ejecucion");
					System.out.println("-----------------------");
					
					continuar = false;
		            
		        } else {
		        	
			        fichero = new File(ruta);
		        	
			        muestraInfoRuta (fichero);
			        
			        continuar = true;
			        
		        }   
				
			} catch (FileNotFoundException ex1) {
				
				System.out.println(ex1.getMessage());

				
				continuar = true;
				
			} catch (NullPointerException ex2) {
				

				System.out.println(ex2.getMessage());

				
				continuar = true;
				
			}
			
		} while (continuar );
		
		pedido.close();
		
	}
	
	
	// muestraInfoRuta:
	public static void muestraInfoRuta (File fichero)  throws FileNotFoundException , NullPointerException{
        if (!fichero.exists()) {
            throw new FileNotFoundException("El fichero no existe");
        }
		
		if (fichero.isFile()){
			
			System.out.println("Nombre archivo: " + fichero.getName() + " A");
			
		} else if (fichero.isDirectory()) {
			
	        System.out.println("Contenido del directorio: " + fichero.getName() + " *");
	        
	        
	        File [] lista = fichero.listFiles();
	        
	        if (lista == null) {
	        	throw new NullPointerException("El fichero no existe");
	        }
	        
			for (int i = 0; i < lista.length; i ++) {
				
				if (lista[i].isDirectory()) {
					
					System.out.println(lista[i].getName()  + " *");
					
				} 
			}
	        
			for (int i = 0; i < lista.length; i ++) {
				
				if (lista[i].isFile()) {
					
					System.out.println(lista[i].getName()  + " A");
					
				}
			
			}
		}
		
	}

}
