package ejercicio03;

import java.util.ArrayList;

public class Receta {

    // Atributos de la receta
    private String nombre;
    private String tipoPlato;
    private String fechaCreacion;
    private ArrayList<String> ingredientes;
    private String instrucciones;

    // Constructor para crear una receta con todos sus datos
    public Receta(String nombre, String tipoPlato, String fechaCreacion,
                  ArrayList<String> ingredientes, String instrucciones) {

        this.nombre = nombre;
        this.tipoPlato = tipoPlato;
        this.fechaCreacion = fechaCreacion;
        this.ingredientes = ingredientes;
        this.instrucciones = instrucciones;
    }

    // Convierte la receta a texto para mostrarla por pantalla
    @Override
    public String toString() {
        return "#" + nombre + ";" +
               tipoPlato + ";" +
               fechaCreacion + ";" +
               ingredientes + ";" +
               instrucciones;
    }
}
