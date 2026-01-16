/*
Descripción:
Autor: Gabriel Guzmán
Fecha:  15/01/2026
*/

package ejercicio5;

import java.time.LocalDate;

public class Alumno {
	
	// ATRIBUTOS
	
	// Atributos contante de objeto

	public final static int NUMERO_MAXIMA_DE_ALUMNOS = 1000;
	
	// Atributos de clase	
	
	private static int numeroDeAlumnos = 0;	
	private static int numeroAlumnosTodosLosModulosAprobados = 0;
	
	// Atributos contante de objeto	
	
	private final int LIMITE_MODULOS_MATRICILA = 0;	
	
	// Atributos de objeto
	
	private String dni;
	private String nombre;
	private String apellidos;
	private LocalDate fechaNacimiento;
	private boolean tieneBeca;
	private double mediaModulosAprobados;
	
	// CONTRUCTOR
	
	public Alumno(String dni, String nombre, String apellidos, LocalDate fechaNacimiento, boolean tieneBeca, double mediaModulosAprobados){ 
		
		if (nombre == null || dni == null || apellidos == null || fechaNacimiento == null){
			
			throw new IllegalArgumentException (
			   ("El nombre esta vacio (null)"));
		
		} else if (nombre.isEmpty() || dni.isEmpty() || apellidos.isEmpty()){
		
			throw new IllegalArgumentException (
			   ("El nombre esta vacio"));
			
		} else if (!dniValido(dni)){
			
			throw new IllegalArgumentException (
			   ("DNI invalido: el DNI no es corecto"));
		
		} else if (!fechaValidad(fechaNacimiento)){
			
			throw new IllegalArgumentException (
					("La fecha no es valida. Es menor al año 1980 o superior a el año actual"));
			
		}
		
		this.nombre = nombre;
		this.precio = precio;
		this.cuantosQuedan = cuantosQuedan;
	
	}
	
	public Alumno(String dni, String nombre, String apellidos){ 
	
		 this ();
		 
		 System.out.println("Se creo un objeto con los datos predeterminados: (Nombre = ninguno, Precio = 0, cuantosQuedan = 0)");
		
	}
	
	public Alumno(){ 
		
		 this ();
		 
		 System.out.println("Se creo un objeto con los datos predeterminados: (Nombre = ninguno, Precio = 0, cuantosQuedan = 0)");
		
	}

	// METODOS DE OBJETOS

	// METODOS DE CONTRUCTORES
	
	private static boolean dniValido (String dni) {
		
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
	
	// fechaValidad: 
		private static boolean fechaValidad (LocalDate fechaNacimiento) {
			
			boolean Valido = true;
			
			LocalDate fechaMinima, fechaMaxima;
			
			fechaMinima = LocalDate.of(1980, 01, 01);
			
			fechaMaxima = LocalDate.now();
			
			if (!fechaNacimiento.isAfter(fechaMinima) || !fechaNacimiento.isBefore(fechaMaxima)){
				
				Valido = false;
			} 
			
			return Valido;	
				
		}
}
