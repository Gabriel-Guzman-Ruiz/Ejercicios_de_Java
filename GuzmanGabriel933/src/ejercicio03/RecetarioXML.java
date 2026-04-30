package ejercicio03;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.security.AnyTypePermission;

import java.io.*;

public class RecetarioXML {

    // Ruta del archivo XML donde se guardará el recetario
    private String rutaFichero;

    // Objeto XStream que permite convertir objetos Java a XML y XML a objetos Java
    private XStream xstream;

    // Constructor que recibe la ruta del archivo Recetario.xml
    public RecetarioXML(String rutaFichero) {

        this.rutaFichero = rutaFichero;

        // Se crea el objeto XStream
        xstream = new XStream();

        // Permite que XStream pueda trabajar con nuestras clases
        xstream.addPermission(AnyTypePermission.ANY);

        // Alias para que el XML quede más claro
        xstream.alias("recetario", Recetario.class);
        xstream.alias("receta", Receta.class);
    }

    // Método para escribir un objeto Recetario en un archivo XML
    public void escribir(Recetario recetario) {

        // Convertimos el objeto Recetario a una cadena XML
        String xml = xstream.toXML(recetario);

        // Abrimos el archivo de texto y escribimos la cadena XML
        try (PrintWriter pw =
                     new PrintWriter(
                             new FileWriter(rutaFichero))) {

            // Guardamos el XML en el archivo
            pw.println(xml);

            System.out.println("Escribiendo en el archivo Recetario.xml...");

        } catch (IOException e) {
            System.out.println("Error al escribir el archivo XML.");
        }
    }

    // Método para leer un objeto Recetario desde un archivo XML
    public Recetario leer() {

        // Creamos un recetario vacío por si ocurre algún error
        Recetario recetario = new Recetario();

        // StringBuilder sirve para ir juntando todas las líneas del XML
        StringBuilder contenidoXML = new StringBuilder();

        // Abrimos el archivo XML para leerlo línea a línea
        try (BufferedReader br =
                     new BufferedReader(
                             new FileReader(rutaFichero))) {

            String linea;

            // Leemos todas las líneas del archivo
            while ((linea = br.readLine()) != null) {

                // Añadimos cada línea al StringBuilder
                contenidoXML.append(linea);
            }

            // Convertimos la cadena XML otra vez en un objeto Recetario
            recetario = (Recetario) xstream.fromXML(contenidoXML.toString());

        } catch (FileNotFoundException e) {
            System.out.println("No se encuentra el archivo Recetario.xml.");
        } catch (IOException e) {
            System.out.println("Error al leer el archivo XML.");
        }

        // Devolvemos el recetario leído
        return recetario;
    }
}