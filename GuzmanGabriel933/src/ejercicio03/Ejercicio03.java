package ejercicio03;

import java.util.ArrayList;

public class Ejercicio03 {

    public static void main(String[] args) {

        // Ruta del archivo XML
        String ruta =
                System.getProperty("user.dir") +
                "/recursos/Recetario.xml";

        // Objeto encargado de escribir y leer XML
        RecetarioXML recetarioXML = new RecetarioXML(ruta);

        // Creamos un recetario vacío
        Recetario recetario = new Recetario();

        // Ingredientes de la primera receta
        ArrayList<String> ingredientes1 = new ArrayList<>();
        ingredientes1.add("pimientos dulces");
        ingredientes1.add("cebolla");
        ingredientes1.add("vinagre");
        ingredientes1.add("aceite");
        ingredientes1.add("sal");
        ingredientes1.add("pimienta");

        // Creamos la primera receta
        Receta receta1 = new Receta(
                "Ensalada de Pimiento Dulce",
                "Ensalada",
                "2010-01-23",
                ingredientes1,
                "1.- Se lavan los pimientos y se mezclan los ingredientes."
        );

        // Ingredientes de la segunda receta
        ArrayList<String> ingredientes2 = new ArrayList<>();
        ingredientes2.add("calabacitas");
        ingredientes2.add("ajo en polvo");
        ingredientes2.add("sal");
        ingredientes2.add("queso parmesano");

        // Creamos la segunda receta
        Receta receta2 = new Receta(
                "Calabacita fantástica",
                "Acompañamiento",
                "2000-02-02",
                ingredientes2,
                "1.- Se precalienta el horno y se hornea la calabacita."
        );

        // Añadimos las dos recetas al recetario
        recetario.agregarReceta(receta1);
        recetario.agregarReceta(receta2);

        System.out.println("He creado y almaceno en el archivo 2 recetas.");
        System.out.println("LISTADO DE RECETAS GUARDADAS EN EL RECETARIO:");
        System.out.println(recetario);

        // Guardamos el recetario con 2 recetas en el archivo XML
        recetarioXML.escribir(recetario);

        // Ingredientes de la tercera receta
        ArrayList<String> ingredientes3 = new ArrayList<>();
        ingredientes3.add("leche de almendras");
        ingredientes3.add("arroz blanco");
        ingredientes3.add("azúcar");
        ingredientes3.add("vainilla");

        // Creamos una tercera receta
        Receta receta3 = new Receta(
                "Pudin de almendras y arroz",
                "Postre",
                "2010-01-23",
                ingredientes3,
                "1.- Se mezclan los ingredientes y se cocinan."
        );

        // Añadimos la tercera receta solo al recetario en memoria
        recetario.agregarReceta(receta3);

        System.out.println("Ahora inserto 1 receta más. Tengo "
                + recetario.numeroRecetas() + " recetas.");

        System.out.println("LISTADO DE RECETAS GUARDADAS EN EL RECETARIO:");
        System.out.println(recetario);

        // Leemos del XML. Deben aparecer solo las 2 recetas guardadas inicialmente.
        Recetario recetarioLeido = recetarioXML.leer();

        System.out.println("Leo del archivo "
                + recetarioLeido.numeroRecetas() + " recetas.");

        System.out.println("LISTADO DE RECETAS GUARDADAS EN EL FICHERO:");
        System.out.println(recetarioLeido);
    }
}
