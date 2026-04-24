/*
* Descripción: .
* Autor: Gabriel Guzmán
* Fecha: 22/04/2026
*/

package ejercicio02;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.Date;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio02 {
	
	public static void main(String[] args) {
		
		Scanner pedido = new Scanner(System.in);
		
		boolean continuar = false;
		
		String ruta;
		
		File fichero;
		
		boolean info;
		
		do {
			
			System.out.println("------------------------------");
			System.out.println("Mostrar informacion de fichero");
			System.out.println("------------------------------");

			try {
				
				System.out.print("Ruta del fichero: ");
				ruta = pedido.nextLine();
				System.out.println("--------------------");
				
				System.out.print("Quiere informacion detayada (True o false): ");
				info = pedido.nextBoolean();
				System.out.println("--------------------");
		        
		        if (ruta.isEmpty()) {
		        	
					System.out.println("-----------------------");
					System.out.println("Se termina la ejecucion");
					System.out.println("-----------------------");
					
					continuar = false;
		            
		        } else {
		        	
			        fichero = new File(ruta);
		        	
			        muestraInfoRuta (fichero, info);
			        
			        continuar = true;
			        
		        }   
		        
				pedido.nextLine();
				
			} catch (FileNotFoundException ex1) {
				
				System.out.println(ex1.getMessage());
				
				pedido.nextLine();

				
				continuar = true;
				
			} catch (NullPointerException ex2) {
				

				System.out.println(ex2.getMessage());
				
				pedido.nextLine();
			
				continuar = true;
				
			} catch ( InputMismatchException ex3) {
				
				System.out.println("No es valido, true o false");
				
				pedido.nextLine();
			
				continuar = true;
				
			}
			
		} while (continuar );
		
		pedido.close();
		
	}
	
	
	// muestraInfoRuta:
	public static void muestraInfoRuta (File fichero ,  boolean info)  throws FileNotFoundException , NullPointerException{
        if (!fichero.exists()) {
            throw new FileNotFoundException("El fichero no existe");
        }
		
		if (fichero.isFile()){
			
			System.out.println("Nombre archivo: " + fichero.getName() + " A");
			
			if (info) {
				
				muestraInfoRutaAdicional(fichero);
				
			}
			
		} else if (fichero.isDirectory()) {
			
	        System.out.println("Contenido del directorio: " + fichero.getName() + " *");
	        
	        
	        File [] lista = fichero.listFiles();
	        
	        if (lista == null) {
	        	throw new NullPointerException("El fichero no existe");
	        }
	        
	        Arrays.sort(lista);
	        
			for (int i = 0; i < lista.length; i ++) {
				
				if (lista[i].isDirectory()) {
					
					System.out.print("\n" + lista[i].getName()  + " *");
					
					if (info) {
						
						muestraInfoRutaAdicional(fichero);
						
					}
					
				} 
			}
	        
			for (int i = 0; i < lista.length; i ++) {
				
				if (lista[i].isFile()) {
					
					System.out.print("\n" + lista[i].getName()  + " A");
					
					if (info) {
						
						muestraInfoRutaAdicional(fichero);
						
					}
					
				}
			
			}
			
			System.out.print("\n");
		
		}	
		
	}
	
	// muestraInfoRuta:
	public static void muestraInfoRutaAdicional (File fichero) {
		
		Date fecha = new Date(fichero.lastModified());
		
		System.out.print(" " +  fichero.length() + " bytes");
		System.out.print(" " +  fecha + "\n");
		
	}

}
