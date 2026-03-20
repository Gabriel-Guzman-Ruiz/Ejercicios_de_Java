/*
Descripción: Clase Atleta, con metodos vasicos
Autor: Gabriel Guzmán
Fecha: 17/03/2026
*/

package ejercicio01;

public class Atleta implements Comparable<Atleta>{
	
	// ATRIBUTOS
	
	// Atributos fijos de Clases
	private static final String NOMBRE_PREDETERMINADO = "VACIO";
	private static final int EDAD_PREDETERMINADO = 0;
	private static final double ALTURA_PREDETERMINADO = 1;
		
	// Atributos de objeto
	private String nombre;
	private int edad;
	private double altura;
		
	// CONTRUCTOR
		
	public Atleta(String nombre, int edad, double altura) throws IllegalArgumentException{
				
		if (nombre == null) {
	        throw new IllegalArgumentException("El numbre no puede ser nulo");
		} else if (edad < 0 || edad > 100) {
	        throw new IllegalArgumentException("La edad tiene que ser entre 0 y 100");
		} else if (altura < 1 || altura > 2) {
	        throw new IllegalArgumentException("La altura tiene que estar entre 1 y 2");
		}
			
		this.nombre = nombre;
		this.edad = edad;
		this.altura = altura;
		
	}
			
	public Atleta(){ 
			
		this (NOMBRE_PREDETERMINADO, EDAD_PREDETERMINADO, ALTURA_PREDETERMINADO);
				 
		System.out.println("Se creo un Atleta con los datos predeterminados: ["+ NOMBRE_PREDETERMINADO +", "+ EDAD_PREDETERMINADO +", "+ ALTURA_PREDETERMINADO +"]");
				
	}
		
	// METODOS DE OBJETOS
	
	//toString: Mustra los datos del objeto. String
	public String toString() {
	     return "["+ nombre +", "+ edad +", "+ altura +"]";
	 }
	
	//getNombre: Muestra el nombre. String
	public String getNombre () {
		
		return nombre;
					
	}
	
	//getEdad: Mustra la edad. int
	public int getEdad () {
		
		return edad;
					
	}
	
	//getAltura: Muestra la altura. double
	public double getAltura () {
		
		return altura;
					
	}
	
	//setNombre: Cambia el nombre.
	public void setNombre (String nombre) throws IllegalArgumentException{
		
		if (nombre == null) {
	        throw new IllegalArgumentException("El numbre no puede ser nulo");
		}
		
		this.nombre = nombre;
						
	}
	
	//setEdad: Cambia la edad.
	public void setEdad (int edad) throws IllegalArgumentException{
		
		if (edad < 0 || edad > 100) {
	        throw new IllegalArgumentException("La edad tiene que ser entre 0 y 100");
		}
		
		this.edad = edad;
						
	}
	
	//setAltura: Cambia la altura.
	public void setAltura (double altura) throws IllegalArgumentException{
		
		if (altura < 1 || altura > 2) {
	        throw new IllegalArgumentException("La altura tiene que estar entre 1 y 2");
		}
		
		this.altura = altura;
						
	}
	
	// METODOS EXTERNOS
	
	// Ordena por la edad y el nombre.	
    @Override
    public int compareTo(Atleta atleta) { 
    	
    	int comparar;
    	
    	if (this.edad < atleta.edad) {
	        comparar = 1;
		} else if (this.edad > atleta.edad) {
	        comparar = -1;
		} else {
			comparar = nombre.compareTo(atleta.nombre);
		}
    	return comparar;
    	
    }
}
