package guzman1;

import java.time.LocalDate;

public class Libros extends Publicaciones{
	
    public Libros(String titulo,  String autor, LocalDate fechaPublicacion, double precioCompra, boolean prestado) {
        super(titulo, autor, fechaPublicacion, precioCompra, prestado);
        
    }
    
    public Libros(String autor) {
    	
        super(autor);
    	
    }
    
    @Override
    public String toString() {
        return "Libro\n" +
               super.toString();
    }


}
