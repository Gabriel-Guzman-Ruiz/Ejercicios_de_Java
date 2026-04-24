/*
 * Objetivo: modelar objetos de tipo Empleado para TE899
 * Autor: Gabriel Guzmán
 * Fecha: 
 * 
 * Observaciones: completa esta clase con los métodos que consideres necesarios
 */

package guzman2;

import java.time.LocalDate;

public class Empleado implements Comparable<Empleado>{
    private String dni;
    private String nombre;
    private int edad;
    private LocalDate fechaIncorporacion;

    // Constructor
    public Empleado(String dni, String nombre, int edad, LocalDate fechaIncorporacion) {
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
        this.fechaIncorporacion = fechaIncorporacion;
    }

    // Genera objetos de tipo Empleado con valores aleatorios
    public static Empleado generarAleatorio() {
        String[] nombres = {"Ana", "Luis", "Marta", "Carlos", "Elena", "Sofía"};
        int index = (int) (Math.random() * nombres.length);
        int numDni = (int) (Math.random() * 90000000) + 10000000;
        int edadAleatoria = (int) (Math.random() * (65 - 18 + 1)) + 18;
        LocalDate fechaAleatoria = LocalDate.of(2020, 1, 1); 

        return new Empleado(String.valueOf(numDni) + "Z", nombres[index], edadAleatoria, fechaAleatoria);
    }
    
    // metodos
    
	//toString: Mustra los datos del objeto. String
    public String toString() {
        return "[" + dni + ", "  + nombre + ", " + edad + ", " + fechaIncorporacion + "]";
    }
    
	//getDni: Mustra el DNI. String
    public String getDni() {
        return dni;
    }
    
	//getNombre: Mustra el nombre. String
    public String getNombre() {
        return nombre;
    }
	
    
	// METODOS EXTERNOS
	
	// Ordena por la edad y el nombre.	
    @Override
    public int compareTo(Empleado empleado) { 
    	
    	int comparar;
    	
    	comparar = empleado.dni.compareTo(this.dni);
		
    	return comparar;
    	
    }

}
