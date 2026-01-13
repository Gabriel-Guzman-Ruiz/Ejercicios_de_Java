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

	// ATRIBUTOS
	
	// Atributos contante de clase	
	
	public static final int NUMERO_MAXIMO_DEALUMNOS_EN_UN_GRUPO = 30;
	public static int NUMERO_MINIMO_DEALUMNOS_EN_UN_GRUPO = 10;
	public final static int NUMERO_MAXIMA_DE_ALUMNOS = 1000;
	

	public final static LocalTime HORA_MAXIMA_ALUMNOS = LocalTime.of(9, 30);
	
	
	// Atributos de clase	
	
	private static int numeroDeAlumnos = 0;	
	
	
	// Atributos contante de objeto	
	
	
	
	// Atributos de objeto
	
	private String nombre;
	private String apellidos;
	private LocalDate fechaNacimiento;
	private double peso;
	private double altura;
	private boolean mayorDeEdad;
	private byte numeroDeHermanos;
	private LocalTime horaMaxima;
	private String nivelDeInbles;
	private String dni = null;
	
	// Atributos predeterminados
	
	final LocalDate FECHA_NACIMIENTO_PREDETERMINADO = LocalDate.of(2000, 01, 01);
	
	// CONTRUCTOR
	
	public Alumno (String nombre, String apellidos, String dni, LocalDate fechaNacimiento, double peso, double altura, byte numeroDeHermanos, String nivelDeInbles){
	
		/*if (nombre == null  || apellidos == null || fechaNacimiento == null || nivelDeInbles == null ||dni == null){
			
			throw new IllegalArgumentException (
				   ("Elguno de los valores introdusidos esta vacio (null)"));
			
		} else if (nombre.isEmpty() || apellidos.isEmpty()){
			
			throw new IllegalArgumentException (
				   ("Elguno de los valores introdusidos esta vacio"));
			
		} else */if (!fechaValidad(fechaNacimiento)){
			
			throw new IllegalArgumentException (
					("La fecha no es valida. Es menor al año 1980 o superior a el año actual"));
			
		} else if (peso < 20 || peso > 300){
			
			throw new IllegalArgumentException (
					("El peso no es valido. Es inferior a 20 o superior a 300"));
			
		} else if (altura < 0 || altura > 3){
			
			throw new IllegalArgumentException (
					("La altura no es valido. Es inferior a 0 o superior a 3"));
			
		} else if (numeroDeHermanos < 0){
			
			throw new IllegalArgumentException (
					("El numeroDeHermanos no es valido. Es inferior a 0"));
			
		} else if (nivelDeInbles){
			
			throw new IllegalArgumentException (
					("El numeroDeHermanos no es valido. Es inferior a 0"));
			
		} 
		
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.altura = altura;
		this.numeroDeHermanos = numeroDeHermanos;
		this.numeroDeHermanos = numeroDeHermanos;
		this.nivelDeInbles = nivelDeInbles;
		this.dni = dni;
		
		Alumno.numeroDeAlumnos ++;
	}
	
	public Alumno (String nombre, String apellidos, String dni){
		
		 this (nombre, apellidos, dni, null , 0, 0, 0, null);
		
	}
	
	// METODOS DE OBJETOS
	
	// METODOS DE CONTRUCTORES
	
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
































