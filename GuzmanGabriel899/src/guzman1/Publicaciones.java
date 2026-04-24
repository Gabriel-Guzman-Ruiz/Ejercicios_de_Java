package guzman1;

import java.time.LocalDate;

public class Publicaciones {
	
    private static final String  TITULO_PRETEDERMINADO = "sin título";
    private static final String  AUTOR_PRETEDERMINADO = "sin autor";
    private static final LocalDate  FECHA_PUBLICACION_PRETEDERMINADO = LocalDate.of(2000, 01, 01);
    private static final double  PRECIO_COMPRA_PRETEDERMINADO = 0;
    private static final boolean  PRESTADO_PRETEDERMINADO = false;
    
    private static int numeroPublicaciones = 0;
    
    private String id;
    private String titulo;
    private String autor;
    private LocalDate fechaPublicacion;
    private double precioCompra;
    private boolean prestado;
    

    public Publicaciones(String titulo,  String autor, LocalDate fechaPublicacion, double precioCompra, boolean prestado) {
        
    	crearID(fechaPublicacion);
    	setTitulo(titulo);
        setAutor(autor);
        setFechaPublicacion(fechaPublicacion);
        setPrecioCompra(precioCompra);
        setPrestado(prestado);
    }
    
    public Publicaciones(String autor) {
        
    	crearID(FECHA_PUBLICACION_PRETEDERMINADO);
    	setTitulo(TITULO_PRETEDERMINADO);
        setAutor(autor);
        setFechaPublicacion(FECHA_PUBLICACION_PRETEDERMINADO);
        setPrecioCompra(PRECIO_COMPRA_PRETEDERMINADO);
        setPrestado(PRESTADO_PRETEDERMINADO);
    	
    }
    
    
    //METODOS
    
    public String toString() {
        return "Identificador: " + id +
               "\nTitulo: " + titulo +
               "\nAutor: " + autor +
               "\nFecha de publicacion: " + fechaPublicacion +
               "\nPrecio: " + precioCompra +
               "\nPrestado: " + prestado;
    }
    
    private String crearID(LocalDate fechaPublicacion) {
        int anio = fechaPublicacion.getYear() % 100;
        String consecutivo = String.format("%03d", numeroPublicaciones++);
        return String.format("%02d-%s", anio, consecutivo);
        
    }

    public void setTitulo(String titulo) throws IllegalArgumentException{
        if (titulo == null || titulo.isBlank()) {
            throw new IllegalArgumentException("El titulo no puede estar vacía.");
        }
        
        this.titulo = titulo;
    }
    
    public void setAutor(String autor) throws IllegalArgumentException{
        if (autor == null || autor.isBlank()) {
            throw new IllegalArgumentException("El autor no puede estar vacía.");
        }
        
        this.autor = autor;
    }
    
    public void setFechaPublicacion(LocalDate fechaPublicacion) throws IllegalArgumentException{
        if (fechaPublicacion.isBefore(LocalDate.of(1950, 1, 1)) || fechaPublicacion.isAfter(LocalDate.now())) {
            throw new IllegalArgumentException("La fecha no es valido");
        }
        
        this.fechaPublicacion = fechaPublicacion;
    }
    
    public void setPrecioCompra(double precioCompra) throws IllegalArgumentException{
        if (precioCompra < 0 ) {
            throw new IllegalArgumentException("El precio no puede ser menor a 0");
        }
        
        this.precioCompra = precioCompra;
    }
    
    public void setPrestado(boolean prestado){
    	
        this.prestado = prestado;
        
    }
    
}
