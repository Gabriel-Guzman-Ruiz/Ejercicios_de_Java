package ejercicio03;

import java.util.ArrayList;

public class Recetario {

    // Lista donde se almacenan todas las recetas
    private ArrayList<Receta> recetas;

    // Constructor que inicializa la lista
    public Recetario() {
        recetas = new ArrayList<>();
    }

    // Añade una receta al recetario
    public void agregarReceta(Receta receta) {
        recetas.add(receta);
    }

    // Devuelve el número de recetas guardadas
    public int numeroRecetas() {
        return recetas.size();
    }

    // Convierte el recetario completo a texto
    @Override
    public String toString() {

        String texto = "";

        // Recorremos la lista de recetas
        for (Receta receta : recetas) {
            texto += receta.toString() + "\n";
        }

        return texto;
    }
}