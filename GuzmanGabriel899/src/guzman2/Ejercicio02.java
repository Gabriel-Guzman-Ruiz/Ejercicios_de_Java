package guzman2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;


public class Ejercicio02 {
	
	public static void main(String[] args) {

	    System.out.println("--------------------------------------");
	    System.out.println("1) creamos el ArrayList con 10 objetos");
	    System.out.println("--------------------------------------");
		
			Empleado nuevoEmpleado;
			
			
			ArrayList<Empleado> coleccion;
			coleccion = new ArrayList<Empleado>(10);
			
			for (int i = 0; i < 10; i ++) {
				
				coleccion.add(Empleado.generarAleatorio());
				
			}
			
			int contador = 0;
			
			for (Empleado i: coleccion) {
				
				contador ++;
				
			    System.out.println( contador + ") Empleado: " + i);
				
			}
			
			 contador = 0;
			
		    System.out.println("Numero de empleados empleado: " + coleccion.size());
	    
	    System.out.println("------------------------------------------------------");
	    System.out.println("2) Creamos un objeto y lo ponemos en mitad de la lista");
	    System.out.println("------------------------------------------------------");
	    
		    LocalDate fecha = LocalDate.of(2004, 4, 28);
		    
		    nuevoEmpleado = new Empleado("34376426Z", "Gabriel",22 , fecha);
	        
	        System.out.println("Metemos el objeto: " + nuevoEmpleado);
	
	        int mitad = coleccion.size() / 2;
	
	        coleccion.add(mitad, nuevoEmpleado);
	        
			for (Empleado i: coleccion) {
				
				contador ++;
				
			    System.out.println( contador + ") Empleado: " + i);
				
			}
			
			 contador = 0;
	        
		    System.out.println("Numero de empleados empleado: " + coleccion.size());
	    
	    System.out.println("------------------------------------------------------");
	    System.out.println("3) Ordenamos la lista de manera decreciente por el DNI");
	    System.out.println("------------------------------------------------------");
	    
			Collections.sort(coleccion);
	        
			for (Empleado i: coleccion) {
				
				contador ++;
				
			    System.out.println( contador + ") Empleado: " + i);
				
			}
			
			 contador = 0;
	        
		    System.out.println("Numero de empleados empleado: " + coleccion.size());
	    
	    System.out.println("-------------------------------------------");
	    System.out.println("4) Comprovar si 101010101Z esta en la lista");
	    System.out.println("-------------------------------------------");
	    
	        String dniBuscado = "101010101Z";
	
	        boolean encontrado = false;
	
	        for (Empleado i : coleccion) {
	
	            if (i.getDni().equals(dniBuscado)) {
	
	                System.out.println("Empleado encontrado:");
	                System.out.println(i);
	
	                encontrado = true;
	            }
	        }
	
	        if (!encontrado) {
	            System.out.println("No se encontró el empleado");
	        }   
        
	    System.out.println("--------------------------------------------");
	    System.out.println("5) Comprovar cuantos empleados se llaman Ana");
	    System.out.println("--------------------------------------------");
	    
	        String nombreBuscado = "Ana";
	    	
	        int contadorAna = 0;
	        
	        for (Empleado i : coleccion) {
	
	            if (i.getNombre().equals(nombreBuscado)) {
	
	                System.out.println("Empleado encontrado:");
	                System.out.println(i);
	                
	                contadorAna ++;
	
	            }
	        }
	
	
	        System.out.println("Empleados con nombre Ana: " + contadorAna);
 
	    System.out.println("-----------------------------------------------");
	    System.out.println("6) Elimunamos a el primer empleado llamado Luis");
	    System.out.println("-----------------------------------------------");
	    
	    /*  
        nombreBuscado = "Luis";
        
        encontrado = false;
        
        for (Empleado i : coleccion) {

            if (i.getNombre().equals(nombreBuscado)) {

    			Empleado primerLuis = i;
            	
            	System.out.println("Empleado encontrado:");
                System.out.println(i);
                
                coleccion.remove(primerLuis);
             

                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("No hay un empleado llamado Luis");
        } 

	    System.out.println("Numero de empleados empleado: " + coleccion.size());        
        */
	}


}
