package ejercicio01;

public class CD {
    private static final int CAPACIDAD_POR_DEFECTO = 10;

    private Cancion[] canciones;
    private int contador; // siguiente posición libre

    public CD() {
        this.canciones = new Cancion[CAPACIDAD_POR_DEFECTO];
        this.contador = 0;
    }

    // Constructor opcional útil para copias/capacidad personalizada
    public CD(int capacidad) {
        if (capacidad <= 0) {
            throw new IllegalArgumentException("La capacidad debe ser mayor que 0.");
        }
        this.canciones = new Cancion[capacidad];
        this.contador = 0;
    }

    public int numeroCanciones() {
        return contador;
    }

    public Cancion dameCancion(int posicion) {
        validarPosicion(posicion);
        return canciones[posicion];
    }

    public void grabaCancion(int posicion, Cancion nuevaCancion) {
        validarPosicion(posicion);
        if (nuevaCancion == null) {
            throw new IllegalArgumentException("La canción no puede ser null.");
        }
        canciones[posicion] = nuevaCancion;
    }

    public void agrega(Cancion nuevaCancion) {
        if (nuevaCancion == null) {
            throw new IllegalArgumentException("La canción no puede ser null.");
        }
        if (contador >= canciones.length) {
            throw new IllegalStateException("El CD está lleno.");
        }
        canciones[contador] = nuevaCancion;
        contador++;
    }

    public void elimina(int posicion) {
        validarPosicion(posicion);

        // Desplazar a la izquierda para no dejar huecos
        for (int i = posicion; i < contador - 1; i++) {
            canciones[i] = canciones[i + 1];
        }

        canciones[contador - 1] = null; // limpiar última
        contador--;
    }

    // Copia profunda simple del contenido a otro CD (útil para el ejercicio)
    public void copiarEn(CD destino) {
        if (destino == null) {
            throw new IllegalArgumentException("El CD destino no puede ser null.");
        }

        // Vaciar destino
        while (destino.numeroCanciones() > 0) {
            destino.elimina(destino.numeroCanciones() - 1);
        }

        // Copiar canciones (clonando)
        for (int i = 0; i < this.contador; i++) {
            destino.agrega(this.canciones[i].clone());
        }
    }

    private void validarPosicion(int posicion) {
        if (posicion < 0 || posicion >= contador) {
            throw new IndexOutOfBoundsException("Posición inválida: " + posicion);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("CD{\n");
        for (int i = 0; i < contador; i++) {
            sb.append("  [").append(i).append("] ").append(canciones[i]).append("\n");
        }
        sb.append("Total canciones: ").append(contador).append("\n}");
        return sb.toString();
    }
  
    public static void main(String[] args) {
        // 1) Crear un CD llamado unCd
        CD unCd = new CD();

        // 2) Incluir tres canciones y mostrar número de canciones
        unCd.agrega(new Cancion("Imagine", "John Lennon"));
        unCd.agrega(new Cancion("Hotel California", "Eagles"));
        unCd.agrega(new Cancion("Billie Jean", "Michael Jackson"));
        System.out.println("unCd tiene " + unCd.numeroCanciones() + " canciones.");

        // 3) Eliminar la segunda canción (índice 1)
        unCd.elimina(1);

        // 4) Crear otroCd y copiar contenido de unCd
        CD otroCd = new CD();
        unCd.copiarEn(otroCd);

        // 5) Agregar una canción a otroCd
        otroCd.agrega(new Cancion("Numb", "Linkin Park"));

        // 6) Mostrar contenido de unCd
        System.out.println("\nContenido de unCd:");
        System.out.println(unCd);

        // 7) Mostrar contenido de otroCd
        System.out.println("\nContenido de otroCd:");
        System.out.println(otroCd);
    }

}
