/*
	Descripción: Ejercicio B2 – Persona - incluimos un contructor
	Autor: Gabriel Guzmán
	Fecha:  15/01/2026
*/

package ejercicio2;
public class Persona {

	// ATRIBUTOS

	// Atributos de objeto

	private String dni;
	private String nombre;
	private String apellidos;
	private int edad;

	// CONTRUCTOR
	public Persona(String dni, String nombre, String apellidos, int edad) throws IllegalArgumentException { 
		
		if (nombre == null  || apellidos == null ||dni == null){
		
			throw new IllegalArgumentException (
			   ("Elguno de los valores introdusidos esta vacio (null)"));
		
		} else if (nombre.isEmpty() || apellidos.isEmpty() || dni.isEmpty()){
		
			throw new IllegalArgumentException (
			   ("Elguno de los valores introdusidos esta vacio"));
			
		} else if (edad <= 0){
		
			throw new IllegalArgumentException (
			   ("Edad invalidad: La edad no puede ser menor o igual a 0"));
		
		} else if (!DniValido(dni)){
			
			throw new IllegalArgumentException (
			   ("DNI invalido: el DNI no es corecto"));
		}
		
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
	
		}
		
		public Persona(){ 
			
			 this ("Gabriel", "Guzmán", "12345678Z", 22);
			 
		}
		
		// METODOS DE OBJETOS
		
		//toString: Mustra los datos del objeto. String
		public String toString() {
		     return "Punto [X = " + x + ", Y = " + y + "]";
		 }
		
		//getDni: muestra el DNI de la persona. String
		public String getDni () {
					
			return this.dni;
							
		}
			
		//getNombre: muestra el nombre de la persona. String
		public String getNombre () {
							
			return this.nombre;
									
		}
		
		//getApellidos: muestra los apellidos de la persona. String
		public String getApellidos () {
								
		return this.apellidos;
										
		}
			
		//getEdad: muestra la edad de la persona . int
		public int getEdad () {
								
			return this.edad;
										
		}
		
		//setDni: Cambia el DNI de la persona.
		public void setDni (String dni) throws IllegalArgumentException { 
			
		if ( dni.isEmpty()){
			
			throw new IllegalArgumentException (
			   ("Elguno de los valores introdusidos esta vacio"));
			
		}else if (!DniValido(dni)){
				
				throw new IllegalArgumentException (
				   ("DNI invalido: el DNI no es corecto"));
			}
					
			this.dni = dni;
							
		}
		
		//setNombre: Cambia el nombre de la persona.
		public void setNombre (String nombre) throws IllegalArgumentException { 
			
			if (nombre == null ){
			
				throw new IllegalArgumentException (
				   ("Elguno de los valores introdusidos esta vacio (null)"));
			
			} else if (nombre.isEmpty()){
			
				throw new IllegalArgumentException (
				   ("Elguno de los valores introdusidos esta vacio"));
				
			}
							
			this.dni = dni;
									
		}
				
		//setApellidos: Cambia los apellidos de la persona.
		public void setApellidos (String apellidos) throws IllegalArgumentException { 
			
			if (apellidos == null){
			
				throw new IllegalArgumentException (
				   ("Elguno de los valores introdusidos esta vacio (null)"));
			
			} else if ( apellidos.isEmpty()){
			
				throw new IllegalArgumentException (
				   ("Elguno de los valores introdusidos esta vacio"));
				
			} 
						
			this.dni = dni;
									
		}
				
		//setEdad: Cambia la edad de la persona.
		public void setEdad (int edad) throws IllegalArgumentException { 
			
			 if (edad <= 0){
			
				throw new IllegalArgumentException (
				   ("Edad invalidad: La edad no puede ser menor o igual a 0"));
			
			}
							
			this.edad = edad;
									
		}

		// METODOS DE CONTRUCTORES
			
		// DniValido: Comprueva si un DNI es valido. boolean
		private static boolean DniValido (String dni) {
				
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
}

