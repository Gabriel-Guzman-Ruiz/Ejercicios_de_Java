/*
	Descripción: Ejercicio B2 – Persona - incluimos un contructor
	Autor: Gabriel Guzmán
	Fecha:  15/01/2026
*/

package ejercicio2;

public class Persona {

	// ATRIBUTOS

	// Atributos de objeto

	public String dni;
	public String nombre;
	public String apellidos;
	public int edad;

	// CONTRUCTOR
	public Persona(String dni, String nombre, String apellidos, int edad){ 
		
		if (nombre == null  || apellidos == null ||dni == null){
		
			throw new IllegalArgumentException (
			   ("Elguno de los valores introdusidos esta vacio (null)"));
		
		} else if (nombre.isEmpty() || apellidos.isEmpty() || dni.isEmpty()){
		
			throw new IllegalArgumentException (
			   ("Elguno de los valores introdusidos esta vacio"));
			
		} else if (edad <= 0){
		
			throw new IllegalArgumentException (
			   ("Edad invalidad: La edad no puede ser menor o igual a 0"));
		
		} else if (!DniValido(dni)){
			
			throw new IllegalArgumentException (
			   ("DNI invalido: el DNI no es corecto"));
		}
		
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
	
	}
	
	public Persona(){ 
		
		 this ("Gabriel", "Guzmán", "12345678Z", 22);
		 
	}
	
	// METODOS DE OBJETOS

	// METODOS DE CONTRUCTORES
		
	// DniValido: Comprueva si un DNI es valido. boolean
	private static boolean DniValido (String dni) {
			
		boolean Valido = true;
			
		if ( !dni.matches("\\d{8}[A-Z]")) {
	        return false;
	    }

	    String letras = "TRWAGMYFPDXBNJZSQVHLCKE";

	    int numero = Integer.parseInt(dni.substring(0, 8));
	    char letra = dni.charAt(8);

	    char letraCorrecta = letras.charAt(numero % 23);
	    
	    if (letra != letraCorrecta) {
	        
	    	Valido = false;
	    } 	
			
		return Valido;	
				
	}
}

