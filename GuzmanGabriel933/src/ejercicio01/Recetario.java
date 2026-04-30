package ejercicio01;

import java.util.ArrayList;

public class Recetario {

    // Lista donde se almacenarán todas las recetas
    private ArrayList<Receta> recetas;

    // Constructor que inicializa la lista vacía
    public Recetario() {
        recetas = new ArrayList<>();
    }

    // Método para añadir una receta al recetario
    public void agregarReceta(Receta receta){
        recetas.add(receta);
    }

    // Devuelve todas las recetas almacenadas
    public ArrayList<Receta> getRecetas(){
        return recetas;
    }

    // Convierte todo el recetario en texto
    @Override
    public String toString(){

        String texto = "****************************************************************************************\n";
        texto += "LIBRO DE RECETAS\n";
        texto += "****************************************************************************************\n";

        // Recorremos todas las recetas y las añadimos al texto
        for(Receta r : recetas){
            texto += r.toString();
        }

        return texto;
    }
}
