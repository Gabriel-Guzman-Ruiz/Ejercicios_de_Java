package ejercicio05;

import ejercicio04.Travajadores;

public class Poblacion implements Comparable<Poblacion>{
	
	// ATRIBUTOS
	
		// Atributos fijos de Clases
		
		private static final int EDAD_PREDETERMINADO = 100;
		private static final Sexo SEXO_PREDETERMINADO = Sexo.masculino;
		private static final EstadoCivil ESTADO_CIVIL_PREDETERMINADO = EstadoCivil.soltero;
		
		// Atributos de Clases
		
		private static int numeroTravajadores = 0;
		
		// Atributos de objeto
		private int edad;
		public enum Sexo {
			masculino,
			femenino
		}
		private Sexo sexo;
		public enum EstadoCivil {
		    soltero,
		    casado,
		    viudo,
		    divorciado
		    
		}
		private EstadoCivil estadoCivil;
			
		// CONTRUCTOR
			
		public Poblacion(Sexo sexo, EstadoCivil estadoCivil,int edad){
					

			setSexo(sexo);
			setEstadoCivil(estadoCivil);
			setEdad(edad);
			
			numeroTravajadores ++;
		}
				
		public Poblacion(){ 
				
			this (SEXO_PREDETERMINADO, ESTADO_CIVIL_PREDETERMINADO , EDAD_PREDETERMINADO);
					 
			System.out.println("["+ SEXO_PREDETERMINADO +", "+ ESTADO_CIVIL_PREDETERMINADO + ", " + EDAD_PREDETERMINADO +"]");
					
		}
			
		// METODOS DE OBJETOS
		
		//toString: Mustra los datos del objeto. String
		public String toString() {
		     return "["+ sexo +", "+ estadoCivil +", "+ edad + "]";
		 }
		
		//getNombre: Muestra el nombre. String
		public String getNombre () {
			
			return nombre;
						
		}
		
		//getEdad: Mostrar la edad. int
		public int getEdad () {
			
			return edad;
						
		}
		
		//getSexo: Muestra el sexo. Sexo
		public Sexo getSexo () {
			
			return sexo;
						
		}
		
		//getEstadoCivil: Muestra el estado civil. EstadoCivil
		public EstadoCivil getEstadoCivil () {
			
			return estadoCivil;
						
		}
		
		
		//getSalarioBace: Muestra el salario bace. int
		public int getSalarioBace () {
			
			return salarioBace;
						
		}
		
		
		
		//setNombre: Cambia el nombre.
		public void setNombre (String nombre) throws IllegalArgumentException{
			
			if (nombre == null ||  nombre.equals("")) {
		        throw new IllegalArgumentException("El numbre no puede ser nulo");
			}
			
			this.nombre = nombre;
							
		}
		
		//setEdad: Cambia la edad.
		public void setEdad (int edad) throws IllegalArgumentException{
			
			if ( edad < 18 || edad > 100) {
		        throw new IllegalArgumentException("La edad no es valido.");
			}
		       
			this.edad = edad;
							
		}
		
		//setSexo: Cambia el sexo.
		public void setSexo (Sexo sexo) throws IllegalArgumentException{
			
			if (sexo == null) {
		        throw new IllegalArgumentException("El sexo no puede ser nulo");
			}
			
			this.sexo = sexo;
							
		}
		
		//setEstadoCivil: Cambia el estado civil.
		public void setEstadoCivil (EstadoCivil estadoCivil) throws IllegalArgumentException{
			
			if (estadoCivil == null) {
		        throw new IllegalArgumentException("El estado civil no puede ser nulo");
			}
			
			this.estadoCivil = estadoCivil;
							
		}
		
		//setSalarioBace: Cambia el salario bace.
		public void setSalarioBace (int salarioBace) throws IllegalArgumentException{
			
			if (salarioBace < 0) {
			        throw new IllegalArgumentException("El salario bace no es valido");
			}
			
			this.salarioBace = salarioBace;
							
		}
		
		//ContactoAleatorio: da un contacto aleatorio. Contactos
		public static Travajadores travajadorAleatorio() {
				
			Travajadores travajadorAleatorio = new Travajadores(Travajadores.numbreAleatorio(), 
					Travajadores.edadAleatorio(), 
					Travajadores.sexoAleatorio(), 
					Travajadores.estadoCivilAleatorio(), 
					Travajadores.salarioBaceAleatorio());
			
			return travajadorAleatorio;
							
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
			
			int numeroAleatorio = (int) (Math.random()*50);
			
			nombreAleatorio = numbreAleatorioAray[numeroAleatorio];
			
			return nombreAleatorio;
							
		}
		
		//edadAleatorio: da una edad aleatorio. int
		private static int edadAleatorio(){
			
			int edadAleatorio = (int) ((Math.random()*82) + 18 );
		
			
			return edadAleatorio;
							
		}
		
		//sexoAleatorio: da un sexo aleatorio. Sexo
		private static Sexo sexoAleatorio(){
			
			int numeroAleatoria = (int) (Math.random()*100);
			
			if (numeroAleatoria > 50) {
				
				return Sexo.Mujer;		
				
			} else {
				
				return Sexo.Hombre;		
				
			}
			
		}
		
		//estadoCivilAleatorio: da un estado civil aleatorio. Sexo
		private static EstadoCivil estadoCivilAleatorio(){
			
			int numeroAleatoria = (int) ((Math.random()*3)+ 1);
			
			if (numeroAleatoria == 1) {
				
				return EstadoCivil.Soltero;		
				
			} else if (numeroAleatoria == 2) {
				
				return EstadoCivil.Casado;		
				
			}  else if (numeroAleatoria == 3) {
				
				return EstadoCivil.Divorciado;		
				
			}  else {
				
				return EstadoCivil.Viudo;		
				
			}
	
		}
						
		
		//salarioBaceAleatorio: da un salario bace aleatorio. int
		private static int salarioBaceAleatorio (){
			
			int salarioBaceAleatorio = (int) ((Math.random()*4500) + 500 );
			
			return salarioBaceAleatorio;	
							
		}
		
		// METODOS EXTERNOS
		
		// Ordena por el nombre.	
	    @Override
	    public int compareTo(Travajadores travajador) { 
			
	    	int comparar;
	    	
	    	comparar = this.sexo.compareTo(travajador.sexo);
		    
	        if (comparar == 0) {
	        	comparar = this.estadoCivil.compareTo(travajador.estadoCivil);
	        }

	    	return comparar;
	    	
	    }

		@Override
		public int compareTo(Poblacion o) {
			// TODO Auto-generated method stub
			return 0;
		}

}
