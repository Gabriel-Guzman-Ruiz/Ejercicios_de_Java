/*
Descripción:
Autor: Gabriel Guzmán
Fecha:  15/01/2026
*/

package creacionDeClases;

import java.time.LocalDate;
import java.time.LocalTime;

public class Ticket {
	
	// ATRIBUTOS
	
	// Atributos contantes de clase
	
	
	public static final int LIMITE_MAXIMO_TICKET = 99999999;
		
	// Atributos de clase	

	private static int numeroDeTicket = 0;
	
	private static int anioActual = 2026;
		
	// Atributos de objeto
		
	private LocalDate fechaTicket;
	
	private String id;
	private LocalDate fechaUso;
	private LocalTime horaUsado;
			
	// CONTRUCTOR
		
	public Ticket(LocalDate fechaUso) throws IllegalArgumentException{ 
		
		if (!fechaValida(fechaUso)){
			
			throw new IllegalArgumentException(
			   ("La fecha no puede ser anterior a la actual y tiene que ser del mismo año"));
		
		} else if (numeroDeTicket == LIMITE_MAXIMO_TICKET) {
		    throw new IllegalArgumentException("No se pueden crear mas ticket en la fecha dada");
		}
		this.numeroDeTicket ++;
		
		this.fechaTicket = LocalDate.now();
		
		this.fechaUso = fechaUso;
		
		this.id = generarId(fechaTicket);

		
		this.horaUsado = null;
		
		if (2026 < fechaUso.getYear()) {
			
			anioActual = fechaUso.getYear();
			
			numeroDeTicket = 0;
			
			this.id = generarId(fechaTicket);
		}
		
	}
		
	public Ticket(){ 
		
		 this (LocalDate.now());
			 
		 System.out.printf("Se creo un objeto con los datos predeterminados: (fecha = %s) %n", LocalDate.now());
			
	}
		

	// METODOS DE OBJETOS
	
	// Metodos get
	
	// getEstado: Nos muestra el id del ticket . String
	public String getEstado () {
			
		return this.id;
					
	}
	
	// getFecha: Nos muestra cuando es valido el ticket . LocalDate
	public LocalDate getFecha () {
				
		return this.fechaUso;
						
	}
	
	// isUsado: Nos dise si el ticket fue usado. boolean
	public boolean isUsado () {
				
		boolean usado = false;
			
		if (this.horaUsado != null) {
				
			usado = true;
		}
			
			
		return usado;
							
	}
		
	// isFinDeSemana: indica si ticket es para ser utilizado en fin de semana. boolean
	public boolean isFinDeSemana () {
						
		boolean usado = false;
						
		if ((this.fechaUso.getDayOfWeek()).getValue() == 6 || (this.fechaUso.getDayOfWeek()).getValue() == 7) {
							
			usado = true;
		}
						
						
		return usado;
									
	}
	
	// usar: Se rejistra la hora en que se uso el ticket.
		public void usar () throws IllegalStateException{
			
			if (this.horaUsado != null) {
			
			throw new IllegalStateException (
					   ("El ticket ya fue usado"));
			
			} if (this.fechaUso != LocalDate.now()) {
				
				throw new IllegalStateException (
						   ("El ticket no es valido para hoy"));
				
			}
							
			this.horaUsado = LocalTime.now();
							
										
		}
	
	// toString: Mustra los datos del objeto. String
	public String toString() {
		
		if (this.horaUsado != null) {
			
			return "{ID: " + this.id + ", Fecha: " + this.fechaUso + ", Usado: " + this.horaUsado + "}";
			
		} else {
			
			return "{ID: " + this.id + ", Fecha: " + this.fechaUso + ", Usado: No}";
			
		}
	      
	}
	
	// randomEsteMes: Crea un ticket random de este mes. String
		public String randomEsteMes() {
			
			if (this.horaUsado != null) {
				
				return "{ID: " + this.id + ", Fecha: " + this.fechaUso + ", Usado: " + this.horaUsado + "}";
				
			} else {
				
				return "{ID: " + this.id + ", Fecha: " + this.fechaUso + ", Usado: No}";
				
			}
		      
		}
	
	// METODOS DE CONTRUCTORES
	
	// fechaValida: Comprueva si la fecha es valida. boolean
	private boolean fechaValida (LocalDate fechaTicket) {
			
		boolean valida = true;
		
		LocalDate fechaActual = LocalDate.now();
		
		if (fechaTicket.isBefore(fechaActual) || fechaTicket.getYear() != fechaActual.getYear()){
			
			valida = false;
			
		} 
		
		return valida;
	}
	
	
	// fechaValida: Crea el id de el Ticket. String
	private String generarId(LocalDate fechaTicket) {
		
        int anio = fechaTicket.getYear();
        String numeroFormateado = String.format("%08d", numeroDeTicket);

        return anio + "-" + numeroFormateado;
    }
	
		// Ejemplo
			
	public static void main(String[] args) {
		
		LocalDate fecha = LocalDate.of(2026, 05, 21);
		
		Ticket Ticket1 = new Ticket();
		
		Ticket Ticket2 = new Ticket(fecha);
		
		
		
		
		
	}
}
