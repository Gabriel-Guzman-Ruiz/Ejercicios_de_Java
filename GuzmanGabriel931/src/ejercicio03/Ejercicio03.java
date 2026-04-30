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
		
        cambiarCarpeta("Documentos","DOCS");
		
		System.out.println("-----------------------------------------------------");
		System.out.println("Cambia la carpeta ‘Fotografias’ a ‘FOTOS’ y el de la carpeta ‘Libros’ a ‘LECTURAS’");
		System.out.println("-----------------------------------------------------");
		
        cambiarCarpeta("DOCS/Fotografias","FOTOS");
        
        cambiarCarpeta("DOCS/Libros","LECTURAS");
		
		System.out.println("---------------------------------------------------------------");
		System.out.println("Cambiar el nombre de los archivos de la carpetas fotos y libros");
		System.out.println("---------------------------------------------------------------");
		
	
	
	}
	
	// cambiarCarpeta
	 public static void cambiarCarpeta(String viejo, String nuevo){

	        File origen = new File(viejo);
	        File destino = new File(nuevo);

	        if (origen.exists()) {

	            if (origen.renameTo(destino)) {

	                System.out.println(viejo + " cambiado a " + nuevo);

	            } else {

	                System.out.println("No se pudo renombrar " + viejo);

	            }

	        }

	    }
	
}

