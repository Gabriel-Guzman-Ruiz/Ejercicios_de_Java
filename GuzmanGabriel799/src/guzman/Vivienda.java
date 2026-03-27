package guzman;

import java.time.LocalDate;

public class Vivienda {
	
	    private static int contador = 1;
	    
	    private final LocalDate FECHA_CONTRUCION_DEFECTO = LocalDate.of(2000, 01, 01);
	    private final String DIRECION_DEFECTO = "Calle Rio sambrano de las mersedes piso 3 c";
	    private final boolean  DISPUNIVILIDAD__DEFECTO = true;

	    private final String IDENTIFICADOR;
	    private LocalDate fechaContrucion;
	    private String direcion;
	    private boolean  dispinible;

	    public Vivienda(String IDENTIFICADOR, LocalDate fechaContrucion,  String direcion, boolean  dispinible) {
  	
	    	setFechaContrucion(fechaContrucion);
	    	setDirecion(direcion);
	    	setDispinible(dispinible);
	        this.IDENTIFICADOR = generarIdentificador(fechaContrucion);
	    }
	    
	    public Vivienda() {
	      	
	    	setFechaContrucion(FECHA_CONTRUCION_DEFECTO);
	    	setDirecion(DIRECION_DEFECTO);
	    	setDispinible(DISPUNIVILIDAD__DEFECTO);
	        this.IDENTIFICADOR = generarIdentificador(fechaContrucion);
	    }

	    private String generarIdentificador(LocalDate fechaContrucion) {
	        int anio = fechaContrucion.getYear() % 100;
	        String consecutivo = String.format("%03d", contador++);
	        return String.format("%02d-%s", anio, consecutivo);
	    }

	    public String getIdentificador() {
	        return IDENTIFICADOR;
	    }

	    public LocalDate getFechaContrucion() {
	        return fechaContrucion;
	    }
	    
	    public String getDirecion() {
	        return direcion;
	    }
	    
	    public boolean getDispinible() {
	        return dispinible;
	    }

	    public void setDirecion(String direcion) {
	        if (direcion == null || direcion.isBlank()) {
	            throw new IllegalArgumentException("La diracion no puede estar vacía.");
	        }
	        
	        this.direcion = direcion;
	    }

	    public void setFechaContrucion(LocalDate fechaContrucion) {
	        LocalDate fechaMinima = LocalDate.of(2000, 1, 1);
	        if (fechaContrucion == null || fechaContrucion.isBefore(fechaMinima)) {
	            throw new IllegalArgumentException("La fecha de contruccion no puede ser anterior al 1/1/2000.");
	        }
	        
	        this.fechaContrucion = fechaContrucion;
	    }

	    public void setDispinible(boolean dispinible) {
	        this.dispinible = dispinible;
	    }
	    
	    public static int getNumeroVivienda() {
	        return contador -1;
	    }
	    
	    public double calcularPrecioVenta(double precio) {
			return 0;
		}
	   

	    @Override
	    public String toString() {
	        return "Identificador: " + IDENTIFICADOR +
	               "\nFecha de contruccion: " + fechaContrucion +
	               "\nDirecion: " + direcion +
	               "\nDisponivilidad: " + dispinible;
	    }
}

