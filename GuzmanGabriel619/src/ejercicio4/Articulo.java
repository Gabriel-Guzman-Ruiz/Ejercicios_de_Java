/*
 Descripción: Ejercicio B4 – Artículo – incluimos un contructor
 Autor: Gabriel Guzmán
 Fecha: 15/01/2026
 */

package ejercicio4;

public class Articulo {
	
	// ATRIBUTOS
	
	// Atributos contante de objeto	
	
	public final int IVA = 21;

	// Atributos de objeto

	public String nombre;
	public double precio;
	public int cuantosQuedan;

	// CONTRUCTOR
	
	public Articulo(String nombre, double precio, int cuantosQuedan){ 
		
		if (nombre == null ){
			
			throw new IllegalArgumentException (
			   ("El nombre esta vacio (null)"));
		
		} else if (nombre.isEmpty() ){
		
			throw new IllegalArgumentException (
			   ("El nombre esta vacio"));
			
		} else if (precio < 0 || cuantosQuedan < 0){
		
			throw new IllegalArgumentException (
			   ("datos invalidad: el precio y el numero de articulos no puede ser menor de 0"));
		
		}
		
		this.nombre = nombre;
		this.precio = precio;
		this.cuantosQuedan = cuantosQuedan;
	
	}
	
	public Articulo(){ 
		
		 this ("ninguno", 0, 0);
		 
		 System.out.println("Se creo un objeto con los datos predeterminados: (Nombre = ninguno, Precio = 0, cuantosQuedan = 0)");
		
	}

	// METODOS DE OBJETOS

	// METODOS DE CONTRUCTORES

}
