package ejercicio03;

import java.io.File;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio03 {
	
	public static void main(String[] args) {
	
		Scanner pedido = new Scanner(System.in);
		

        
		System.out.println("-----------------------------------------------------");
		System.out.println("Cambiar el nombre de la carpeta ‘Documentos’ a ‘DOCS’");
		System.out.println("-----------------------------------------------------");
		
        File fichero = new File("Documentos");
        File numbreNuevo = new File("DOCS");
        
        fichero.renameTo(numbreNuevo);
        
		System.out.println("Nombre archivo: " + fichero.getName());
		
		System.out.println("-----------------------------------------------------");
		System.out.println("Cambia la carpeta ‘Fotografias’ a ‘FOTOS’ y el de la carpeta ‘Libros’ a ‘LECTURAS’");
		System.out.println("-----------------------------------------------------");
		
        fichero = new File("Documento/Fotografias");
        numbreNuevo = new File("FOTOS");
        
        fichero.renameTo(numbreNuevo);
        
		System.out.println("Nombre archivo: " + fichero.getName());
		
        fichero = new File("Documento/Libros");
        numbreNuevo = new File("LECTURAS");
        
        fichero.renameTo(numbreNuevo);
        
		System.out.println("Nombre archivo: " + fichero.getName());
		
		System.out.println("-----------------------------------------------------");
		System.out.println("Cambiar el nombre de la carpeta ‘Documentos’ a ‘DOCS’");
		System.out.println("-----------------------------------------------------");
		
       
        fichero = new File("DOCS");
        
		System.out.println("Nombre archivo: " + fichero.getName() + " A");
        
        File [] lista = fichero.listFiles();
        
        
		for (int i = 0; i < lista.length; i ++) {
			
			if (lista[i].isDirectory()) {
				
				System.out.print("\n" + lista[i].getName()  + " *");
				
				
			} 
			
		}
		
		for (int i = 0; i < lista.length; i ++) {
			
			if (lista[i].isFile()) {
				
				System.out.print("\n" + lista[i].getName()  + " A");

			}
		
		}
		
		System.out.print("\n");
	
	}
	
}

