package ejercicio01;

public class Cancion implements Cloneable {
    private String titulo;
    private String autor;

    // Constructor principal
    public Cancion(String titulo, String autor) {
        this.titulo = validarTexto(titulo, "título");
        this.autor = validarTexto(autor, "autor");
    }

    // Constructor por defecto (llama al principal)
    public Cancion() {
        this("Sin título", "Desconocido");
    }

    public String dameTitulo() {
        return titulo;
    }

    public String dameAutor() {
        return autor;
    }

    public void ponTitulo(String titulo) {
        this.titulo = validarTexto(titulo, "título");
    }

    public void ponAutor(String autor) {
        this.autor = validarTexto(autor, "autor");
    }

    private String validarTexto(String valor, String campo) {
        if (valor == null || valor.trim().isEmpty()) {
            throw new IllegalArgumentException("El " + campo + " no puede ser nulo ni vacío.");
        }
        return valor.trim();
    }

    @Override
    public Cancion clone() {
        try {
            return (Cancion) super.clone(); // suficiente porque solo tiene String (inmutable)
        } catch (CloneNotSupportedException e) {
            // No debería pasar porque implementa Cloneable
            throw new AssertionError("No se pudo clonar la canción", e);
        }
    }

    @Override
    public String toString() {
        return "Cancion{titulo='" + titulo + "', autor='" + autor + "'}";
    }
    
    
    public static void main(String[] args) {
        // 1) Crear una canción sin título y sin autor (usando valores por defecto)
        Cancion c1 = new Cancion();

        // 2) Crear una canción con valores por defecto (equivalente al paso 1)
        Cancion c2 = new Cancion();

        // 3) Modificar título con y sin contenido
        c2.ponTitulo("Bohemian Rhapsody");
        try {
            c2.ponTitulo("   "); // esto debe fallar
        } catch (IllegalArgumentException e) {
            System.out.println("Error esperado: " + e.getMessage());
        }

        // 4) Clonar la canción anterior
        Cancion clon = c2.clone();

        // 5) Crear referencia a la canción clonada
        Cancion ref = clon;

        // 6) Modificar autor usando la referencia
        ref.ponAutor("Queen");

        // 7) Mostrar información de todas
        System.out.println("c1:   " + c1);
        System.out.println("c2:   " + c2);
        System.out.println("clon: " + clon);
        System.out.println("ref:  " + ref);

        // Nota importante:
        // clon y ref apuntan al MISMO objeto, por eso ambos muestran el autor modificado.
    }
        

}

