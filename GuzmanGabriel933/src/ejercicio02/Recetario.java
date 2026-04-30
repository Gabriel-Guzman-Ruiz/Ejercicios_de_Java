package ejercicio02;

import java.io.Serializable;
import java.util.ArrayList;

public class Recetario implements Serializable {

    // Identificador recomendado para serialización
    private static final long serialVersionUID = 42L;

    // Lista donde se guardan las recetas
    private ArrayList<Receta> recetas;

    // Constructor que inicializa el ArrayList
    public Recetario() {
        recetas = new ArrayList<>();
    }

    // Método para añadir una receta al recetario
    public void agregarReceta(Receta receta) {
        recetas.add(receta);
    }

    // Devuelve el número de recetas guardadas
    public int numeroRecetas() {
        return recetas.size();
    }

    // Devuelve el recetario completo como texto
    @Override
    public String toString() {

        String texto = "";

        // Recorremos todas las recetas y las añadimos al texto
        for (Receta receta : recetas) {
            texto += receta.toString() + "\n";
        }

        return texto;
    }
}