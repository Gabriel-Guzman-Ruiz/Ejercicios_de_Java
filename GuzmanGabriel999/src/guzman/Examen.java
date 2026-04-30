package guzman;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Examen {
	
	public static void main(String[] args) {
		
		Scanner pedido = new Scanner(System.in);
		
		System.out.println("------------------------------");
		System.out.println("Importamos los Socios");
		System.out.println("------------------------------");
		
        String rutaEntrada ="dam/socios.txt";
		
		HashSet<Socio> conjuntoSocios;
		conjuntoSocios = new HashSet<Socio>();
	
		// Crear o sobrescribir el archivo
	    File f = new File("Enteros.txt");
	    PrintWriter escritor = new PrintWriter(f);
	    
	       // ===== LECTURA DEL FICHERO =====

	    BufferedReader br = new BufferedReader( new FileReader(rutaEntrada));
	    
            String linea;

            // Leemos línea a línea hasta llegar al final
            while((linea = br.readLine()) != null){

                // Separamos los campos por ;
                String[] datos = linea.split(";");

                // Guardamos cada dato en variables
                String id = datos[0];
                String nombre = datos[1];
                String antiguedad = datos[2];
                

                // Creamos objeto receta
                Socio socio =
                        new Socio(
                                id,
                                nombre,
                                antiguedad
                        );

                // Añadimos receta al recetario
                conjuntoSocios.add(socio);
            }
            
    	System.out.println("------------------------------");
    	System.out.println("Creamos un objeto");
    	System.out.println("------------------------------");
    	
    	byte dato = 4;
    	
    	Socio socio = new Socio(
                10,
                "Hogo Vera",
                dato
        );
    	
        conjuntoSocios.add(socio);

        escritor.println(dato);
 
        escritor.close();
    	

	}

}
