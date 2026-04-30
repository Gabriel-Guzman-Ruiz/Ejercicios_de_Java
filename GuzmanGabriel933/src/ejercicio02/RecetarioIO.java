package ejercicio02;

import java.io.*;

public class RecetarioIO {

    // Ruta del fichero binario donde se guardará el recetario
    private String rutaFichero;

    // Constructor que recibe la ruta del archivo Recetario.dat
    public RecetarioIO(String rutaFichero) {
        this.rutaFichero = rutaFichero;
    }

    // Método para escribir un objeto Recetario en un archivo binario
    public void escribir(Recetario recetario) {

        // try-with-resources cierra automáticamente los flujos
        try (ObjectOutputStream oos =
                     new ObjectOutputStream(
                             new FileOutputStream(rutaFichero))) {

            // Se escribe el objeto completo en el fichero
            oos.writeObject(recetario);

            System.out.println("Escribiendo en el archivo Recetario.dat...");

        } catch (IOException e) {
            System.out.println("Error al escribir el recetario en el archivo.");
        }
    }

    // Método para leer un objeto Recetario desde un archivo binario
    public Recetario leer() {

        // Creamos un recetario vacío por si ocurre algún error
        Recetario recetario = new Recetario();

        // Abrimos los flujos de entrada para leer objetos
        try (ObjectInputStream ois =
                     new ObjectInputStream(
                             new FileInputStream(rutaFichero))) {

            // Leemos el objeto y lo convertimos de nuevo a Recetario
            recetario = (Recetario) ois.readObject();

        } catch (FileNotFoundException e) {
            System.out.println("No se encuentra el archivo Recetario.dat.");
        } catch (IOException e) {
            System.out.println("Error al leer el archivo Recetario.dat.");
        } catch (ClassNotFoundException e) {
            System.out.println("No se ha encontrado la clase Recetario.");
        }

        // Devolvemos el recetario leído
        return recetario;
    }
}