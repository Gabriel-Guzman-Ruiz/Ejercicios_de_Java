package ejercicio01_ArrayList;

public class Alumno implements Comparable<Alumno>{
	
	// ATRIBUTOS
	
	// Atributos fijos de Clases
		
	// Atributos de objeto
	private String grupo;
	private String nombre;
	private double matematicas;
	private double lengua;
	private double fisica;
	private double quimica;
	private double ingles;
		
	// CONTRUCTOR
		
	public Alumno(String grupo, String nombre, double matematicas, double lengua, double fisica, double quimica, double ingles){
				
		setGrupo(grupo);
		setNombre(nombre);
		setMatematicas(matematicas);
		setLenguas(lengua);
		setFisica(fisica);
		setQuimica(quimica);
		setIngles(ingles);
	}
			
	// METODOS
	
	//toString: Mustra los datos del objeto. String
    public String toString() {
        return "Alumno: (" + grupo + ", "  + nombre + ", " + matematicas + ", " + lengua + ", " + fisica + ", " + quimica + ", " + ingles +")";
    }
	
	//setGrupo: Cambia el grupo.
	public void setGrupo (String grupo) throws IllegalArgumentException{
		
		if (grupo == null) {
	        throw new IllegalArgumentException("El grupo no puede ser nulo");
		}
		
		this.grupo = grupo;
						
	}
	
	//setNombre: Cambia el nombre.
	public void setNombre (String nombre) throws IllegalArgumentException{
		
		if (nombre == null) {
	        throw new IllegalArgumentException("El numbre no puede ser nulo");
		}
		
		this.nombre = nombre;
						
	}
	
	//setMatematicas: Cambia la nota.
	public void setMatematicas (double matematicas) throws IllegalArgumentException{
		
		if (ingles < 0 || ingles > 10) {
	        throw new IllegalArgumentException("No esta bien la nota");
		}
		
		this.matematicas = matematicas;
	}
						
	
	
	//setLenguas: Cambia la nota.
	public void setLenguas (double lengua) throws IllegalArgumentException{
		
		if (lengua < 0 || lengua > 10) {
	        throw new IllegalArgumentException("No esta bien la nota");
		}
		
		this.lengua = lengua;
						
	}
	
	//setFisica: Cambia la nota.
	public void setFisica (double fisica) throws IllegalArgumentException{
		
		if (fisica < 0 || fisica > 10) {
	        throw new IllegalArgumentException("No esta bien la nota");
		}
		
		this.fisica = fisica;
						
	}
	
	//setQuimica: Cambia la nota.
	public void setQuimica (double quimica) throws IllegalArgumentException{
		
		if (quimica < 0 || quimica > 10) {
	        throw new IllegalArgumentException("No esta bien la nota");
		}
		
		this.quimica = quimica;
						
	}
	
	//setIngles: Cambia la nota.
	public void setIngles (double ingles) throws IllegalArgumentException{
		
		if (ingles < 0 || ingles > 10) {
	        throw new IllegalArgumentException("No esta bien la nota");
		}
		
		this.ingles = ingles;
						
	}
	
	//toFileString: Devuelve los datos del objeto para guardarlo en un archivo en formato texto.
	public String toFileString() {
	    return grupo + ";" + nombre + ";" + matematicas + ";" +
	           lengua + ";" + fisica + ";" + quimica + ";" + ingles;
	}
	
	// METODOS EXTERNOS
	
	// Ordena por la edad y el nombre.	
    @Override
    public int compareTo(Alumno alumno) { 
    	
    	int comparar;
    	
    	comparar = this.grupo.compareTo(alumno.grupo);
	    
        if (comparar == 0) {
        	comparar = this.nombre.compareTo(alumno.nombre);
        }
		
    	return comparar;
    	
    }

}
