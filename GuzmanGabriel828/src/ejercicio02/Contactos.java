package ejercicio02;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;

import ejercicio01.Atleta;

public class Contactos implements Comparable<Contactos>{
	
	// ATRIBUTOS
	
	// Atributos fijos de Clases
	
	private static final String NOMBRE_PREDETERMINADO = "VACIO";
	private static final int TELEFONO_PREDETERMINADO = 000000000;
	private static final String GMAIL_PREDETERMINADO = "VACIO";
	private static final LocalDate FECHANACIMIENTO_PREDETERMINADO =  LocalDate.of(2000, 01, 01);
	
	// Atributos de Clases
	
	private static int numeroContactos = 0;
	private static 	HashSet<Integer> listaTelefonos = new HashSet<Integer>();
	
	// Atributos de objeto
	private String nombre;
	private int telefono;
	private String gmail;
	private LocalDate fechaNacimiento;
		
	// CONTRUCTOR
		
	public Contactos(String nombre, int telefono, String gmail, LocalDate fechaNacimiento) throws IllegalArgumentException{
				
		if (nombre == null || gmail == null) {
	        throw new IllegalArgumentException("El numbre y gmail no puede ser nulo");
		} else if ( telefono < 000000000 || telefono > 999999999) {
	        throw new IllegalArgumentException("El telefono no es valido, tiene que tener 9 sigras");
		} else if (listaTelefonos.contains(Integer.valueOf(telefono)) ) {
	        throw new IllegalArgumentException("El telefono no es valido, es repetido");
		}else if (!gmailValido(gmail)) {
	        throw new IllegalArgumentException("el gmail no es valido, tiene que tener un @ y .");
		} else if (!fechaNacimientoValido(fechaNacimiento)) {
	        throw new IllegalArgumentException("el gmail no es valido, despues de 1900 y andes de la fecha actual (" + LocalDate.now() + ")");
		}
		
		
		listaTelefonos.add(Integer.valueOf(telefono));

			
		this.nombre = nombre;
		this.telefono = telefono;
		this.gmail = gmail;
		this.fechaNacimiento = fechaNacimiento;
		
		numeroContactos ++;
	}
			
	public Contactos(){ 
			
		this (NOMBRE_PREDETERMINADO, TELEFONO_PREDETERMINADO, GMAIL_PREDETERMINADO, FECHANACIMIENTO_PREDETERMINADO );
				 
		System.out.println("Se creo un Atleta con los datos predeterminados: ["+ NOMBRE_PREDETERMINADO +", "+ TELEFONO_PREDETERMINADO +", "+ GMAIL_PREDETERMINADO + ", " + FECHANACIMIENTO_PREDETERMINADO +"]");
				
	}
		
	// METODOS DE OBJETOS
	
	//toString: Mustra los datos del objeto. String
	public String toString() {
	     return "["+ nombre +", "+ telefono +", "+ gmail + ", "+ fechaNacimiento +"]";
	 }
	
	//getNombre: Muestra el nombre. String
	public String getNombre () {
		
		return nombre;
					
	}
	
	//getTelefino: Mostrar el telefono. String
	public String getTelefono () {
		
		String completoTelefono = completarNumeroTelefono(telefono);
		
		return completoTelefono;
					
	}
	
	//getGmail: Muestra el gmail. String
	public String getGmail () {
		
		return gmail;
					
	}
	
	//getGmail: Muestra la fecha de nacimiento. LocalDate
	public LocalDate getFechaNacimiento () {
		
		return fechaNacimiento;
					
	}
	
	
	
	//setNombre: Cambia el nombre.
	public void setNombre (String nombre) throws IllegalArgumentException{
		
		if (nombre == null) {
	        throw new IllegalArgumentException("El numbre no puede ser nulo");
		}
		
		this.nombre = nombre;
						
	}
	
	//setTelefono: Cambia el telefono.
	public void setTelefono (int telefono) throws IllegalArgumentException{
		
		if ( telefono < 000000000 || telefono > 999999999) {
			throw new IllegalArgumentException("El telefono no es valido, tiene que tener 9 sigras");
		}  else if (listaTelefonos.contains(Integer.valueOf(telefono)) ) {
	        throw new IllegalArgumentException("El telefono no es valido, es repetido");
		}
		
		listaTelefonos.remove(Integer.valueOf(this.telefono));
		
		listaTelefonos.add(Integer.valueOf(telefono));
	       
		this.telefono = telefono;
						
	}
	
	//setGmail: Cambia el gmail.
	public void setGmail (String gmail) throws IllegalArgumentException{
		
		if (!gmailValido(gmail)) {
	        throw new IllegalArgumentException("el gmail no es valido, tiene que tener un @ y .");
		}
		
		this.gmail = gmail;
						
	}
	
	//setFechaNacimiento: Cambia la fecha de nacimiento.
	public void setFechaNacimiento (LocalDate fechaNacimiento) throws IllegalArgumentException{
		
		if (!fechaNacimientoValido(fechaNacimiento)) {
	        throw new IllegalArgumentException("el gmail no es valido, despues de 1900 y andes de la fecha actual (" + LocalDate.now() + ")");
		}
		
		this.fechaNacimiento = fechaNacimiento;
						
	}
	
	// METODOS DE CLACE PUBLICO
	
	//tamanno: muestra el numero de contactos creados. int
	public static int tamanno() {
			
		return numeroContactos;
						
	}
	
	//ContactoAleatorio: da un contacto aleatorio. Contactos
	public static Contactos ContactoAleatorio() {
			
		Contactos contactoAleatorio = new Contactos(Contactos.numbreAleatorio(), 
				Contactos.telefonoAleatorio(), 
				Contactos.gmailAleatorio(), 
				Contactos.fechaNacimientoAleatorio());
		
		return contactoAleatorio;
						
	}
	
	// METODOS DE OBJETOS PRIVADAS
	
	//gmailValido: Comprueva si es valido la fecha de nacimiento.
	private boolean gmailValido (String gmail) {
		
		boolean verdadero = true;
		
		if (gmail == null) {
			
			verdadero = false;
			
		} else if (gmail.contains(gmail)) {
			
			verdadero = gmail.matches("^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,}$");
		}
		
		return verdadero;
						
	}
	
	//fechaNacimientoValido: Comprueva si es valido la fecha de nacimiento.
	private boolean fechaNacimientoValido (LocalDate fechaNacimiento) {
		
		boolean verdadero = true;
		
		int dia = 01;
		int mes = 01;
		int anno = 1900;
		
		 if ( fechaNacimiento.isBefore(LocalDate.of(anno, mes , dia)) || fechaNacimiento.isAfter(LocalDate.now())) {
			 
			 verdadero = false;
			 
		 }
		
		return verdadero;
		
	}
	
	//completarNumeroTelefono: agrega ceros al numero de telefono hasta  que tenga 9 digitos. String
	private String completarNumeroTelefono(int numero) {

	    String completoTelefono = String.valueOf(numero);

	    while (completoTelefono.length() < 9) {
	    	completoTelefono = "0" + completoTelefono;
	    }

	    return completoTelefono;
	}
		
	// METODOS DE CLACE PRIVADO
	
	//numbreAleatorio: da un nombre aleatorio. String
	private static String numbreAleatorio() {
		
		String nombreAleatorio;
		
		String[] numbreAleatorioAray = {
				"Alejandro", "Beatriz", "Carlos", "Daniela", "Eduardo",
				"Fernanda", "Gabriel", "Helena", "Iván", "Julia",
				"Kevin", "Laura", "Manuel", "Natalia", "Óscar",
				"Paula", "Raúl", "Sara", "Tomás", "Valeria",
				"Adrián", "Blanca", "Cristian", "Diana", "Emilio",
				"Fátima", "Gonzalo", "Inés", "Javier", "Lucía",
				"Marcos", "Noelia", "Pablo", "Rocío", "Sergio",
				"Teresa", "Víctor", "Alicia", "Bruno", "Claudia",
				"David", "Elena", "Francisco", "Gloria", "Hugo",
				"Isabel", "Jorge", "Lidia", "Miguel", "Nuria"
				}; 
		
		int numeroAleatorio = (int) (Math.random()*49) +1;
		
		nombreAleatorio = numbreAleatorioAray[numeroAleatorio];
		
		return nombreAleatorio;
						
	}
	
	//gmailAleatorio: da un gmail aleatorio. String
	private static String gmailAleatorio(){
		
		String gmailAleatorio;
		
		String[] emailAliatorios = {
			    "juan123@gmail.com","ana.lopez@yahoo.com","carlos_dev@hotmail.com","maria89@outlook.com",
			    "pedro.garcia@gmail.com","lucia_2024@icloud.com","davidmartin@gmail.com","sofia.ramirez@yahoo.es",
			    "alex_code@hotmail.com","laura.perez@gmail.com","miguel_07@outlook.es","andrea.dev@gmail.com",
			    "jorge_1985@yahoo.com","elena.gomez@hotmail.com","pablo_dev@gmail.com","nuria_23@icloud.com",
			    "alberto.sanchez@gmail.com","clara.dev@yahoo.es","roberto_22@hotmail.com","patricia.lopez@gmail.com",
			    "fernando.dev@outlook.com","isabel_1999@gmail.com","daniel.garcia@yahoo.com","sara.dev@hotmail.com",
			    "marcos_88@gmail.com","beatriz.lopez@icloud.com","victor.dev@gmail.com","carmen_77@yahoo.es",
			    "raul.gomez@hotmail.com","noelia.dev@gmail.com","ivan_2020@outlook.es","teresa.lopez@gmail.com",
			    "oscar.dev@yahoo.com","lorena_15@hotmail.com","adrian.garcia@gmail.com","marta.dev@icloud.com",
			    "sergio_44@gmail.com","eva.lopez@yahoo.es","ruben.dev@hotmail.com","paula_33@gmail.com",
			    "diego.gomez@outlook.com","ines.dev@gmail.com","tomas_66@yahoo.com","cristina.lopez@hotmail.com",
			    "gonzalo.dev@gmail.com","silvia_55@icloud.com","hector.garcia@gmail.com","irene.dev@yahoo.es",
			    "alvaro_11@hotmail.com","monica.lopez@gmail.com"
			};
		
		int numeroAleatorio = (int) (Math.random()*49) +1;
		
		gmailAleatorio = emailAliatorios[numeroAleatorio];
		
		return gmailAleatorio;
						
	}
	
	//telefonoAleatorio: da un telefono aleatorio. int
	private static int telefonoAleatorio(){
		
		int telefonoAleatorio;
		
		telefonoAleatorio = (int) (Math.random()*999999999) + 1;
		
		return telefonoAleatorio;
						
	}
	
	//fechaNacimientoAleatorio: da un fecha aleatorio. LocalDate
	private static LocalDate fechaNacimientoAleatorio (){
		
		boolean error = false;
		
		LocalDate fechaNacimientoAleatorio = null;
		
		do{
			
			int dia = (int) (Math.random()*30) + 1;
			int mes = (int) (Math.random()*11) + 1;
			
			int annoActual = (LocalDate.now().getYear()) - 1900;
			
			int anno = (int) (Math.random()* annoActual) + 1900;
			
			try {
			
				fechaNacimientoAleatorio = LocalDate.of(anno, mes, dia);
				
				error = false;
			
			} catch (DateTimeException ex1) { 
				
				error = true;
				
			}
			
		} while (error);
		
		return fechaNacimientoAleatorio;
						
	}
	
	// METODOS EXTERNOS
	
	// Ordena por la edad y el nombre.	
    @Override
    public int compareTo(Contactos Contacto) { 
    	
    	int comparar;
    	
		comparar = nombre.compareTo(Contacto.nombre);
		
    	return comparar;
    	
    }

}
