/*
Descripción:
Autor: Gabriel Guzmán
Fecha:  15/01/2026
*/

package creacionDeClases;

public class Bombilla {
	
	// ATRIBUTOS
	
	// Atributos contantes de clase
	
	public static final boolean ESTADO_PREDETERMINADO = false;
		
	// Atributos de clase	
	
	private static int numeroDeBombillas = 0;
	private static int numeroDeBombillasEncendidas = 0;
		
	// Atributos de objeto
		
	private boolean estado;
	private int numeroDeVecesEncendida;
			
	// CONTRUCTOR
		
	public Bombilla(boolean estado){ 
		
		if (estado) {
			
			this.numeroDeBombillasEncendidas ++;
			
			this.numeroDeVecesEncendida = 1;
			
		} else {
			
			this.numeroDeVecesEncendida = 0;
			
		}
		
		this.estado = estado;
		
		this.numeroDeBombillas ++;
	}
		
	public Bombilla(){ 
		
		 this (ESTADO_PREDETERMINADO);
			 
		 System.out.println("Se creo un objeto con los datos predeterminados: (Estado = apagado)");
			
	}
		

	// METODOS DE OBJETOS
	
	// toString: Mustra los datos del objeto. String
	public String toString() {
        return "Bombilla [Estado = " + estado + ", Numero de encendidos = " + numeroDeVecesEncendida + "]";
    }
	
	// Metodos get
	
	// getEstado: Muestra el estado del objeto. boolean
	public boolean getEstado () {
		
		return this.estado;
				
	}
	
	// getNumeroDeVecesEncendida: Muestra el numero de veses que se encendio del objeto. int
	public int getNumeroDeVecesEncendida () {
			
		return this.numeroDeVecesEncendida;
					
	}
	
	// getNumeroDeBombillas: Muestra el numero de bombillas creadas. int
	public static int getNumeroDeBombillas () {
				
		return Bombilla.numeroDeBombillas;
						
	}
		
	// getNumeroDeBombillasEncendidad: Mustra el numero de bombillas encendidias. int
	public static int getNumeroDeBombillasEncendidas () {
				
		return Bombilla.numeroDeBombillasEncendidas;
						
	}
	
	// Metodos set
	
	// encender: Enciende una bombilla apagada.
	public void encender () throws IllegalStateException{
			
		if (this.estado) {
			
			throw new IllegalStateException (
					   ("Ya esta ensendido"));
			
		} 
		
		this.estado = true;
		
		this.numeroDeVecesEncendida ++;
		this.numeroDeBombillasEncendidas ++;
				
	}
		
	// apagar: apaga una bombilla apagada.
	public void apagar () throws IllegalStateException{
				
		if (!this.estado) {
				
				throw new IllegalStateException (
						   ("Ya esta apagado"));
				
		} 
			
		this.estado = false;
			
		this.numeroDeBombillasEncendidas --;
					
	}
	
	// conmutar: Apaga si esta encendido y enciende si esta apagado.
		public void conmutar () {
			
			if (this.estado) {
				
				apagar();
				
			} else {
				
				encender();
				
			}						
		}
	
	
		// Ejemplo
			
	public static void main(String[] args) {
		
		Bombilla bombilla1 = new Bombilla(true);
		
		Bombilla bombilla2 = new Bombilla();
		
		System.out.println(bombilla1.toString());
		System.out.println(bombilla2.toString());
		
		bombilla1.apagar();
		
		bombilla2.encender();
		
	}
}
