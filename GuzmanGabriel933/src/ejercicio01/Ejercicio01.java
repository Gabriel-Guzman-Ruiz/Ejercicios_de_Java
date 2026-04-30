package ejercicio01;

import java.io.*;
import java.util.ArrayList;

public class Ejercicio01 {

    public static void main(String[] args) {

        // Ruta donde está el archivo de entrada con las recetas
        String rutaEntrada =
                System.getProperty("user.dir") +
                "/recursos/ListadoRecetas.txt";

        // Ruta donde se creará el archivo de salida
        String rutaSalida =
                System.getProperty("user.dir") +
                "/recursos/Recetario.txt";

        // Creamos el recetario donde iremos guardando recetas
        Recetario recetario = new Recetario();


        // ===== LECTURA DEL FICHERO =====
        try (BufferedReader br =
                     new BufferedReader(
                             new FileReader(rutaEntrada))) {

            String linea;

            // Leemos línea a línea hasta llegar al final
            while((linea = br.readLine()) != null){

                // Separamos los campos por ;
                String[] datos = linea.split(";");

                // Guardamos cada dato en variables
                String nombre = datos[0];
                String tipo = datos[1];
                String fecha = datos[2];

                // Lista para guardar ingredientes individuales
                ArrayList<String> ingredientes =
                        new ArrayList<>();

                // Separamos ingredientes por comas
                String[] listaIngredientes =
                        datos[3].split(",");

                // Recorremos e insertamos cada ingrediente
                for(String ing : listaIngredientes){
                    ingredientes.add(ing.trim());
                }

                // Guardamos instrucciones
                String instrucciones = datos[4];

                // Creamos objeto receta
                Receta receta =
                        new Receta(
                                nombre,
                                tipo,
                                fecha,
                                ingredientes,
                                instrucciones
                        );

                // Añadimos receta al recetario
                recetario.agregarReceta(receta);
            }

        }
        catch(FileNotFoundException e){
            System.out.println("No se encuentra el archivo.");
        }
        catch(IOException e){
            System.out.println("Error leyendo fichero.");
        }



        // ===== ESCRITURA DEL FICHERO =====
        try(PrintWriter pw =
                    new PrintWriter(
                            new FileWriter(rutaSalida))) {

            // Escribimos todo el recetario en el archivo
            pw.println(recetario.toString());

            System.out.println("Recetario generado correctamente.");

        }
        catch(IOException e){
            System.out.println("Error escribiendo fichero.");
        }

    }
}
