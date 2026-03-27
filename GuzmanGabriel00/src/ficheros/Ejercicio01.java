package ficheros;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {

		try {

			// Crear o sobrescribir el archivo
	        File f = new File("Enteros.txt");
	        PrintWriter escritor = new PrintWriter(f);

	        // Escribir los números del 1 al 100
	        for (int i = 1; i <= 100; i++) {
	        	escritor.println(i);
	        }

	        // Cerrar el archivo
	        escritor.close();
	        

            // LEER
            Scanner lector = new Scanner(f);
            
            while (lector.hasNext()) {
                int valor = lector.nextInt();
                System.out.println("Valor leído: " + valor);
            }
            
	        escritor.close();
	        
	        System.out.println("Números del 1 al 100 escritos correctamente.");

	        } catch (Exception e) {

	            System.out.println("Error: " + e);
	            e.printStackTrace();
	     }
	 }
}
