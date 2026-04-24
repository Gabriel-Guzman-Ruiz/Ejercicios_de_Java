package guzman1;

import java.time.LocalDate;

public class Ejercicio01 {
	
	public static void main(String[] args) {
		
		
	    System.out.println("--------------------");
	    System.out.println("1) Creamos un librio");
	    System.out.println("--------------------");
	
		String autor = "Guzmám";
	    
	    Libros nuevolibro = new Libros(autor);
	    
	    System.out.println("Muevo libro: " + nuevolibro );
		
	    
	}
	
}
