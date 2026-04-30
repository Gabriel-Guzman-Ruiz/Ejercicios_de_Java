package clases;

import java.util.ArrayList;

public class CLaseContenedor {

    // Lista de objetos
    private ArrayList<ClaseObjeto> objetos;

    // Constructor
    public CLaseContenedor() {
        objetos = new ArrayList<>();
    }

    // Añadir objeto
    public void agregarObjeto(ClaseObjeto objeto) {
        objetos.add(objeto);
    }

    // Mostrar todos los objetos
    @Override
    public String toString() {

        String texto = "";

        for (ClaseObjeto objeto : objetos) {
            texto += objeto.toString();
            texto += "-----------------------------\n";
        }

        return texto;
    }
}