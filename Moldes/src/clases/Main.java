package clases;

import java.io.*;

public class Main {

    public static void main(String[] args) {

        // Ruta del fichero de entrada
        String rutaEntrada =
                System.getProperty("user.dir") +
                "/recursos/Entrada.txt";

        // Ruta del fichero de salida
        String rutaSalida =
                System.getProperty("user.dir") +
                "/recursos/Salida.txt";

        // Creamos el contenedor
        CLaseContenedor contenedor = new CLaseContenedor();

        // Lectura del fichero
        try (BufferedReader br =
                     new BufferedReader(
                             new FileReader(rutaEntrada))) {

            String linea;

            // Leemos línea a línea
            while ((linea = br.readLine()) != null) {

                // Separar datos por ;
                String[] datos = linea.split(";");

                // Extraer datos
                String campo1 = datos[0];
                String campo2 = datos[1];
                String campo3 = datos[2];

                // Crear objeto
                ClaseObjeto objeto =
                        new ClaseObjeto(campo1, campo2, campo3);

                // Añadir al contenedor
                contenedor.agregarObjeto(objeto);
            }

        } catch (FileNotFoundException e) {
            System.out.println("No se encuentra el archivo de entrada.");
        } catch (IOException e) {
            System.out.println("Error al leer el archivo.");
        }

        // Escritura del fichero
        try (PrintWriter pw =
                     new PrintWriter(
                             new FileWriter(rutaSalida))) {

            // Escribir todo el contenido
            pw.println(contenedor.toString());

            System.out.println("Archivo generado correctamente.");

        } catch (IOException e) {
            System.out.println("Error al escribir el archivo.");
        }
    }
}