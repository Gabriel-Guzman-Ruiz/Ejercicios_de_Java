package ejercicio01_ArrayList;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio01 {
	
	public static void main(String[] args) {
	
		// 1. Importa la información contenida en el documento notas1.txt, donde la información tiene el  siguiente formato:
				//grupo;nombre,matemáticas;lengua;física;química;inglés
	
		        ArrayList<Alumno> lista = new ArrayList<>();
	
		        try {
		            File f = new File("recursos/notas1.txt");
		            Scanner lector = new Scanner(f);
	
		            while (lector.hasNextLine()) {
	
		                String linea = lector.nextLine();
	
		                // Separar datos
		                String[] datos = linea.split(";");
	
		                String grupo = datos[0];
		                String nombre = datos[1];
	
		                int matematicas = Integer.parseInt(datos[2]);
		                int lengua = Integer.parseInt(datos[3]);
		                int fisica = Integer.parseInt(datos[4]);
		                int quimica = Integer.parseInt(datos[5]);
		                int ingles = Integer.parseInt(datos[6]);
	
		                Alumno a = new Alumno(grupo, nombre, matematicas, lengua, fisica, quimica, ingles);
	
		                lista.add(a);
		            }
	
		            lector.close();
		            System.out.println("--------------------------------------------------------------");		            
		            System.out.println("1. Importa la información contenida en el documento notas1.txt");
		            System.out.println("--------------------------------------------------------------");		            
		            System.out.println("Lista de alumnos: " + lista);
	
		        } catch (Exception e) {
		            System.out.println("Error: " + e.getMessage());
		        }
		
		// 2. Muestra el número de registros que contiene.
		        
	            System.out.println("----------------------------------------------");		            
	            System.out.println("2. Muestra el número de registros que contiene");
	            System.out.println("----------------------------------------------");		
		        
	            System.out.println("Numero de alumnos registrados: " + lista.size());   
		
		// 3. Ordena los registros por grupo y nombre.
	            
	            System.out.println("------------------------------------------");		            
	            System.out.println("3. Ordena los registros por grupo y nombre");
	            System.out.println("------------------------------------------");	
	            
	    		Collections.sort(lista);
		        
	            System.out.println("Numero de alumnos registrados: " + lista); 
	            
	            try {
		
	                FileWriter fw = new FileWriter("recursos/notas1.txt");
	                PrintWriter pw = new PrintWriter(fw);
	                
	                
	                for (Alumno i: lista) {
	                	
		                pw.println(i.toFileString());
		            
	                }
	                
	                pw.close();
                
	            } catch (Exception e) {
	                System.out.println("Error al escribir en el fichero: " + e.getMessage());
	                e.printStackTrace();
	            }
                
		// 4. Inserta siguiente registro:
			// 1º ESO D;López Muro, Rosario;3;3;4;4;3
	            
	            System.out.println("------------------------------");		            
	            System.out.println("4. Inserta siguiente registro:");
	            System.out.println("------------------------------");
	            
	            Alumno a = new Alumno("1º ESO D", "López Muro, Rosario", 3, 3, 4, 4, 3);
	            lista.add(a);
	            
	            try {
	                
	                FileWriter fw = new FileWriter("recursos/notas1.txt", true);
	                PrintWriter pw = new PrintWriter(fw);

	                pw.println(a.toFileString());

	                pw.close();
	                
		            System.out.println("Alumno guardado: " + a);   

	            } catch (Exception e) {
	                System.out.println("Error al escribir en el fichero");
	            }
		
		// 5. Insertar el siguiente registro en mitad de la lista:
			// 1º ESO B;Duarte Durán, Alba;2;3;4;1;3
	            
	            System.out.println("-------------------------------------------------------");		            
	            System.out.println("5. Insertar el siguiente registro en mitad de la lista:");
	            System.out.println("-------------------------------------------------------");
	            
	            a = new Alumno("1º ESO B","Duarte Durán, Alba", 2, 3, 4, 1, 3);
	            
	            System.out.println(a);

	            int mitad = lista.size() / 2;

	            lista.add(mitad, a);
	            
	            try {
	        		
	                FileWriter fw = new FileWriter("recursos/notas1.txt");
	                PrintWriter pw = new PrintWriter(fw);
	                
	                for (Alumno i: lista) {
	                	
		                pw.println(i.toFileString());
		            
	                }
	                
	                pw.close();
                
	            } catch (Exception e) {
	                System.out.println("Error al escribir en el fichero");
	            }
	            
		
		// 6. Mostrar la posición que ocupa el último registro anterior insertado.
	            
	            System.out.println("----------------------------------------------------------------------");		            
	            System.out.println("6. Mostrar la posición que ocupa el último registro anterior insertado");
	            System.out.println("----------------------------------------------------------------------");
	            
	            int posicion = lista.indexOf(a);

	            System.out.println("Posición: " + posicion);  
		
		// 7. Importa los registros del documento notas2.txt a un ArraList auxiliar e incluye los elementos de este ArrayList auxiliar al primer ArrayList.
		       
	            ArrayList<Alumno> lista2 = new ArrayList<>();
		    	
		        try {
		            File f = new File("recursos/notas2.txt");
		            Scanner lector2 = new Scanner(f);
	
		            while (lector2.hasNextLine()) {
	
		                String linea = lector2.nextLine();
	
		                // Separar datos
		                String[] datos = linea.split(";");
	
		                String grupo = datos[0];
		                String nombre = datos[1];
	
		                int matematicas = Integer.parseInt(datos[2]);
		                int lengua = Integer.parseInt(datos[3]);
		                int fisica = Integer.parseInt(datos[4]);
		                int quimica = Integer.parseInt(datos[5]);
		                int ingles = Integer.parseInt(datos[6]);
	
		                a = new Alumno(grupo, nombre, matematicas, lengua, fisica, quimica, ingles);
	
		                lista.add(a);
		                lista2.add(a);
		            }
	
		            lector2.close();
		            
		            System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------");		            
		            System.out.println(" 7. Importa los registros del documento notas2.txt a un ArraList auxiliar e incluye los elementos de este ArrayList auxiliar al primer ArrayList");
		            System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------");		            
		            System.out.println("Lista auxiliar de alumnos: " + lista2);
		            System.out.println("Lista de alumnos: " + lista);
	
		        } catch (Exception e) {
		            System.out.println("Error: " + e.getMessage());
		        }
		// 8. Busca el registro con el nombre “Cordero Benítez, Alejandro” y muestra toda su información.
		        
		        System.out.println("---------------------------------------------------------------------------------------------");
		        System.out.println("8. Busca el registro con el nombre “Cordero Benítez, Alejandro” y muestra toda su información");
		        System.out.println("---------------------------------------------------------------------------------------------");

		        String nombreBuscado = "Cordero Benítez, Alejandro";

		        boolean encontrado = false;

		        for (Alumno i : lista) {

		            if (i.getNombre().equals(nombreBuscado)) {

		                System.out.println("Alumno encontrado:");
		                System.out.println(i);

		                encontrado = true;
		            }
		        }

		        if (!encontrado) {
		            System.out.println("No se encontró el alumno");
		        }     
		
		// 9. Busca el registro con el nombre “Fernández Villalón, Carlos” y muestra toda su información.
		        
		        System.out.println("---------------------------------------------------------------------------------------------");
		        System.out.println("9. Busca el registro con el nombre “Fernández Villalón, Carlos” y muestra toda su información");
		        System.out.println("---------------------------------------------------------------------------------------------");

		        nombreBuscado = "Fernández Villalón, Carlos";

		        encontrado = false;

		        for (Alumno i : lista) {

		            if (i.getNombre().equals(nombreBuscado)) {

		                System.out.println("Alumno encontrado:");
		                System.out.println(i);

		                encontrado = true;
		            }
		        }

		        if (!encontrado) {
		            System.out.println("No se encontró el alumno");
		        }     
		        
		// 10. Borra el registro que está en la posición mitad más 1, indicando la información del registro que borras.
		
		        System.out.println("-------------------------------------------------------------------------------------------------------");
		        System.out.println("Borra el registro que está en la posición mitad más 1, indicando la información del registro que borras");
		        System.out.println("-------------------------------------------------------------------------------------------------------");

		        mitad = lista.size() / 2;
		        posicion = mitad + 1;

		        if (posicion < lista.size()) {

		            // 1. Eliminar y guardar el eliminado
		            Alumno eliminado = lista.remove(posicion);

		            System.out.println("Se ha eliminado el registro:");
		            System.out.println(eliminado);

		            // 2. Reescribir el fichero completo
		            try {
		                FileWriter fw = new FileWriter("recursos/notas1.txt"); // ⚠️ sobrescribe
		                PrintWriter pw = new PrintWriter(fw);

		                for (Alumno i : lista) {
		                    pw.println(i.toFileString());
		                }

		                pw.close();

		                System.out.println("Fichero actualizado correctamente");

		            } catch (Exception e) {
		                System.out.println("Error al actualizar el fichero: " + e.getMessage());
		                e.printStackTrace();
		            }

		        } else {
		            System.out.println("No se puede eliminar, posición fuera de rango");
		        }
		        
		// 11. Borra los primeros 10 registros.
		
		// 12. Borra todos los registros que tengan en matemáticas un 2. Indica cuántos registros borras.
		
		// 13. Calcula la nota media para cada alumno.
		
		// 14. Crea una sublista por cada grupo y ordénala por nombre descendente.
		
		// 15. Calcula para cada grupo la nota media de cada materia.
		
		// 16. Para cada grupo muestra las diez mejores notas en matemáticas ordenadas por nota y nombre.
	}
}
