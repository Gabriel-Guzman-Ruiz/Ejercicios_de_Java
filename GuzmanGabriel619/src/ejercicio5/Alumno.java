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
	
	public final static String DNI__PREDETERMINADO = "00000000A";
	public final static String NOMBRE__PREDETERMINADO = "Ninguno";
	public final static String APELLIDO__PREDETERMINADO = "Ninguno";
	public final static LocalDate FECHA_NACIMIENTO_PREDETERMINADO = LocalDate.of(2000, 01, 01);
	public final static boolean TIENE_BECA_PREDETERMINADO = false;
	public final static double MEDIAS_MODULOS_PREDETERMINADO = 0;
	public final static int NUMERO_MODULOS_PREDETERMINADO = 0;
	
	// Atributos de clase	
	
	private static int numeroDeAlumnos = 0;	
	private static int numeroAlumnosTodosLosModulosAprobados = 0;
	
	// Atributos contante de objeto	
	
	private final int LIMITE_MODULOS_MATRICILA = 5;	
	
	// Atributos de objeto
	
	private String dni;
	private String nombre;
	private String apellidos;
	private LocalDate fechaNacimiento;
	private boolean tieneBeca;
	private double mediaModulosAprobados;
	private int numeroModulos;
	
	// CONTRUCTOR
	
	public Alumno(String dni, String nombre, String apellidos, LocalDate fechaNacimiento, boolean tieneBeca, double mediaModulosAprobados, int numeroModulos){ 
		
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
			
		} else if (mediaModulosAprobados < 0){
			
			throw new IllegalArgumentException (
					("La media de midulos aporovados no puede ser negativo"));
			
		} else if (numeroModulos < 0 || numeroModulos > LIMITE_MODULOS_MATRICILA){
			
			throw new IllegalArgumentException (
					("El numero de modulos no puede ser negaativo o superior a el maximo permitido"));
			
		}
		
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fechaNacimiento = fechaNacimiento;
		this.tieneBeca = tieneBeca;
		this.mediaModulosAprobados = mediaModulosAprobados;
		this.numeroModulos = numeroModulos;
		
		
		
		this.numeroDeAlumnos --;
	
	}
	
	public Alumno(String dni, String nombre, String apellidos){ 
	
		 this (dni, nombre, apellidos, FECHA_NACIMIENTO_PREDETERMINADO, TIENE_BECA_PREDETERMINADO, MEDIAS_MODULOS_PREDETERMINADO, NUMERO_MODULOS_PREDETERMINADO);
		 
		 System.out.println("Se creo un objeto con los siquientes datos predeterminados: ("
		 		+ "Fecha nacimiento = 2000-01-01, "
		 		+ "Beca = false, "
		 		+ "Media modulos aprovados = 0, "
		 		+ "Numero de modulos = 0)");
		
	}
	
	public Alumno(){ 
		
		 this (DNI__PREDETERMINADO, NOMBRE__PREDETERMINADO, APELLIDO__PREDETERMINADO, FECHA_NACIMIENTO_PREDETERMINADO, TIENE_BECA_PREDETERMINADO, MEDIAS_MODULOS_PREDETERMINADO, NUMERO_MODULOS_PREDETERMINADO);
		 
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
