package ejercicio03;

public class Empleado {

	// ATRIBUTOS

	// Atributos fijos de Clases
	
	
	// Atributos de Clases
	
	private static int cantidadEmpleado;
	
	// Atributos fijos de objetos
	
	private final String NIF;
	
	// Atributos de objeto
	
	private String apellidos;
	private String nombre;
	private int sueldoBase;
	private int pagaHoraExtra;
	private int horaExtraMes;
	private double tipoIRPF;
	private boolean casado;
	private int numeroHijos;
	
	// CONTRUCTOR
	
	public Empleado (String NIF , String apellidos , String nombre , int sueldoBase , int pagaHoraExtra , int horaExtraMes , double tipoIRPF , boolean casado , int numeroHijos) throws IllegalArgumentException{
			
		if (NIF == null || apellidos == null || nombre == null) {
			
			throw new IllegalArgumentException("NIF, apellidos  y nombre no pueden ser null");
			
		} else if (!validarNIF(NIF)) {
			
			throw new IllegalArgumentException("El NIF no es valido");
			
		} else if (sueldoBase < 0 ) {
			
		    throw new IllegalArgumentException("El sueldo base no puede ser negativo");
		    
		} else if (pagaHoraExtra < 0) {
			
		    throw new IllegalArgumentException("La paga por hora extra no puede ser negativa");
		    
		} else if (horaExtraMes < 0) {
			
		    throw new IllegalArgumentException("Las horas extra al mes no pueden ser negativas");
		    
		} else if (validarTipoIRPF(tipoIRPF , sueldoBase,casado,numeroHijos)) {
			
		    throw new IllegalArgumentException("El tipo de IRPF no es valido");
		    
		}
		
		this.NIF = NIF;
		
		this.apellidos = apellidos;
		this.nombre = nombre;
		this.sueldoBase = sueldoBase;
		this.pagaHoraExtra = pagaHoraExtra;
		this.horaExtraMes = horaExtraMes;
		this.tipoIRPF = tipoIRPF;
		this.casado = casado;
		this.numeroHijos = numeroHijos;
		
		cantidadEmpleado++;
		
	}
		
	public Empleado(){ 
			 
			
	}
	
	// METODOS DE OBJETOS
	
		
		
	// METODOS DE clase
	
	// validarNIF: Valida el NIF. boolean.
	private static boolean validarNIF(String nif) {
		if (nif.length() != 9) {
				return false;
		}
	
		// Separar número y letra
		String parteNumerica = nif.substring(0, 8);
		char letraNIF = Character.toUpperCase(nif.charAt(8));
	
		// Comprobar que los 8 primeros son números
		if (!parteNumerica.matches("\\d{8}")) {
			return false;
		}
	
	    int numero = Integer.parseInt(parteNumerica);
	    String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
	    char letraCorrecta = letras.charAt(numero % 23);
	
	    return letraNIF == letraCorrecta;
	}
	
	private static boolean validarTipoIRPF(double tipoIRPF, int SueldoBase, boolean casado , int numeroHijos) {
	    
		boolean valido = false;
		int sueldoBrutoAnual = SueldoBase * 12;
		
		if (tipoIRPF < 0 || tipoIRPF > 0.45) {
			
			return false;
			
		} 
		
		if (casado) {
			
			tipoIRPF = tipoIRPF + 0.02;
			
		}
		
		if (numeroHijos == 1) {
			
			tipoIRPF = tipoIRPF + 0.01;
			
		} else if (numeroHijos == 2) {
			
			tipoIRPF = tipoIRPF + 0.02;
			
		} else if (numeroHijos >= 3) {
			
			tipoIRPF = tipoIRPF + 0.03;
			
		}
		
		if (comprovarDouble(tipoIRPF, 0.10) && sueldoBrutoAnual < 12000) {
			
			valido = true;
			
		} else if (comprovarDouble(tipoIRPF, 0.15) && (sueldoBrutoAnual >= 12000 && sueldoBrutoAnual <= 20000)) {
			
			valido = true;
			
		} else if (comprovarDouble(tipoIRPF, 0.20) && (sueldoBrutoAnual >= 20001 && sueldoBrutoAnual < 35000)) {
			
			valido = true;
			
		} else if (comprovarDouble(tipoIRPF, 0.25) && (sueldoBrutoAnual >= 35001 && sueldoBrutoAnual < 60000)) {
			
			valido = true;
			
		} else if (comprovarDouble(tipoIRPF, 0.30) && sueldoBrutoAnual > 60000) {
			
			 valido = true;
			
		} 
	    
		return valido;
	}
	
	// Comparación segura de double
    private static boolean comprovarDouble(double a, double b) {
        return Math.abs(a - b) < 1e-9;
    }

	// Ejemplo
		
	private static boolean eq(double tipoIRPF2, double d) {
		// TODO Auto-generated method stub
		return false;
	}

	public static void main(String[] args) {
		
		  Empleado e = new Empleado(
	                "12345678Z",
	                "García",
	                "Juan",
	                2000,
	                20,
	                10,
	                0.13,   // IRPF final
	                true,
	                2
	        );

	        System.out.println("Empleado creado correctamente");
			
	}
	
}
