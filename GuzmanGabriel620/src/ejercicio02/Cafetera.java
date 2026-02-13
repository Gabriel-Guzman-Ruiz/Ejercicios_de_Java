/*
Descripción: 
Autor: Gabriel Guzmán
Fecha: 15/01/2026
*/

package ejercicio02;

public class Cafetera {

	// ATRIBUTOS
	
	// Atributos fijos de clase
	
	private final static int CAPACIDAD_MAXIMA_PREDEFINIDA = 1000;
			
	// Atributos de objeto
	
	private int capacidadMaxima;
	
	private double cantidadActual;
		
	// CONTRUCTOR
		
	public Cafetera( int capacidadMaxima , double cantidadActual) throws IllegalArgumentException{
				
		if (cantidadActual < 0 || capacidadMaxima < 0) {
			throw new IllegalArgumentException("La cantidad y limite de cafe no puede ser negativa");
		}else if (capacidadMaxima < cantidadActual) {
			
			double sobrante = cantidadActual - capacidadMaxima;
			
			this.cantidadActual = capacidadMaxima;
			this.capacidadMaxima = capacidadMaxima;
			
			throw new IllegalArgumentException("La cantidad actual hera superior a el maximo, la cabetera se rellena al completo, sobro: " +sobrante + " de cafe");
		}
			
		this.cantidadActual = cantidadActual;
		this.capacidadMaxima = capacidadMaxima;
			
	}
					
	public Cafetera(int capacidadMaxima){ 
				
		 this (capacidadMaxima,capacidadMaxima);
					
	}
		
	public Cafetera(){ 
			
		 this (CAPACIDAD_MAXIMA_PREDEFINIDA,0);
					 
		 System.out.println("Se creo un objeto con los datos predeterminados: Capacidad maxima = "+ CAPACIDAD_MAXIMA_PREDEFINIDA +" , Cantidad actual = "+ 0 +"]");
					
	}
			
	// METODOS DE OBJETOS
			
	//toString: Mustra los datos del objeto. String
	public String toString() {
	     return "cafetera [Capacidad maxima = " + this.capacidadMaxima + ", Cantidad actual = " + this.cantidadActual + "]";
	 }
				
	//getCapacidadMaxima: Muestra la capacidad maxima. int
	public int getCapacidadMaxima() {
					
		return this.capacidadMaxima;
								
	}
				
	//getCantidadActual: Muestra la capacidad actual. double
	public double getCantidadActual() {
					
		return this.cantidadActual;
								
	}
				
	//setCapacidadMaxima: Cambia la capacidad maxima de la cafetera.
	public void setCapacidadMaxima (int capacidadMaxima) throws IllegalArgumentException{
					
		if (capacidadMaxima <= 0) {
			throw new IllegalArgumentException("La cantidad maxima no puede ser igual o menor a 0");
		}
					
		this.capacidadMaxima = capacidadMaxima;
									
	}
			
			
	//setCapacidadMaxima: Cambia la capacidad actual de la cafetera.
	public void setCantidadActual (int cantidadActual) throws IllegalArgumentException{
				
		if (cantidadActual < 0) {
						
	       throw new IllegalArgumentException("La cantidad maxima no puede ser menor a 0");
				        
	    } else if (this.capacidadMaxima < cantidadActual) {
						
			double sobrante = cantidadActual - this.capacidadMaxima;
						
			this.cantidadActual = this.capacidadMaxima;
						
			throw new IllegalArgumentException("La cantidad actual hera superior a el maximo, la cabetera se rellena al completo, sobro: " +sobrante + " de cafe");
		}
					
		this.cantidadActual = cantidadActual;
									
	}
			
	//llenarCafetera: Rellena la cafetera.
	public void llenarCafetera(double cantidad) throws IllegalArgumentException{
				
		if (cantidad <= 0) {
					
	       throw new IllegalArgumentException("La cantidad no puede ser negativo");
			       
		} else if (this.capacidadMaxima < (cantidad + this.cantidadActual)) {
					
			double sobrante = (cantidad + this.cantidadActual) - capacidadMaxima;
						
			this.cantidadActual = capacidadMaxima;
						
			throw new IllegalArgumentException("La cantidad actual hera superior a el maximo, la cabetera se rellena al completo, sobro: " +sobrante + " de cafe");
		}
						
				
		this.cantidadActual = (cantidad + this.cantidadActual);
		
	}
			
	//servirTaza: Sirve una cantidad de cafe en la taza.
	public void servirTaza(int cantidad) throws IllegalArgumentException{
				
		if (cantidad <= 0) {
						
			throw new IllegalArgumentException("La cantidad no puede ser negativa");
				        
		} else if (0 > (this.cantidadActual - cantidad)) {
						
			this.cantidadActual = 0;
						
			throw new IllegalArgumentException("No alcansa la cantidad actual para llenar la tasa, se llena con lo que quede");
		}
					
			this.cantidadActual = (this.cantidadActual - cantidad);
										
	}
			
	//vaciarCafetera: Se vacia de cafe la cafetera.
	public void vaciarCafetera() {
				
	this.cantidadActual = 0;
														
	}
	
	// Ejemplo
				
	public static void main(String[] args) {
					
				
	}	
	
}
