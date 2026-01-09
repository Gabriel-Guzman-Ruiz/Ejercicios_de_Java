/*
	 Descripción:
	 Autor: Gabriel Guzmán
	 Fecha: 2/12/2025
	 */

package creacionDeClases;

import java.time.LocalDate;
import java.time.LocalTime;
import java.lang.Number;

public class Alumno {

	// ATRIVUTOS
	
	// Atributos contante de clase	
	
	public static final int NUMERO_MAXIMO_DEALUMNOS_EN_UN_GRUPO = 30;
	public static int NUMERO_MINIMO_DEALUMNOS_EN_UN_GRUPO = 10;
	public final static int NUMERO_MAXIMA_DE_ALUMNOS = 1000;
	

	public final static LocalTime HORA_MAXIMA_ALUMNOS = null;
	
	
	// Atributos de clase	
	
	private static int numeroDeAlumnos = 0;	
	
	
	// Atributos contante de objeto	
	
	private final String DNI = null;
	
	// Atributos de objeto
	
	private String nombre;
	private String apellidos;
	private LocalDate fechaNacimiento;
	private double peso;
	private double altura;
	private boolean mayorDeEdad;
	private byte numeroDeHermanos;
	private LocalTime horaMaxima;
	private Number nivelDeInbles;
	
	// CONTRUCTOR
	
	public Alumno (String nombre, LocalDate fechaNacimiento, double peso, double altura, byte numeroDeHermanos, Number nivelDeInbles, String DNI){
	
		if (nombre == null  || apellidos == null || fechaNacimiento == null || nivelDeInbles == null ||DNI == null){
			
			throw new IllegalArgumentException (
				   ("Elguno de los valores introdusidos esta vacio (null)"));
			
		} else if (nombre.isEmpty() || apellidos.isEmpty()){
			
			throw new IllegalArgumentException (
				   ("Elguno de los valores introdusidos esta vacio"));
			
		} else if (!fechaValidad(fechaNacimiento)){
			
			throw new IllegalArgumentException (
					("La fecha no es valida es demaciado antigua. Es menor al año 1980 o superior a el año actual"));
			
		} else if (peso < 20 || peso > 300){
			
			throw new IllegalArgumentException (
					("El peso no es valido. Es inferior a 20k o superior a 300k"));
			
		} 
		
		Alumno.numeroDeAlumnos ++;
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
































