package guzman;

import java.time.LocalDate;

public class Apartamento extends Vivienda{
	
    private int  M2_PRETEDERMINADO = 50;
    private int  DISTANCIA_CENTRO_CIUDAD_PRETEDERMINADO = 50;
    private LocalDate  FECHA_ULTIMA_REFORMA_PRETEDERMINADO = LocalDate.of(2000, 01, 01);
	
    private int m2;
    private int distanciaCentroCiudad;
    private LocalDate fechaUltimaReforma;

    public Apartamento(String IDENTIFICADOR, LocalDate fechaContrucion,  String direcion, boolean  dispinible, int m2, int distanciaCentroCiudad, LocalDate fechaUltimaReforma) {
        super(IDENTIFICADOR, fechaContrucion, direcion, dispinible);
        
        setM2(m2);
        setDistanciaCentroCiudad(distanciaCentroCiudad);
        setFechaUltimaReforma(fechaUltimaReforma);
    }
    
    public Apartamento(int distanciaCentroCiudad, LocalDate fechaUltimaReforma) {
        super();
        
        setM2(M2_PRETEDERMINADO);
        setDistanciaCentroCiudad(distanciaCentroCiudad);
        setFechaUltimaReforma(fechaUltimaReforma);
    }
    
    public Apartamento() {
        super();
        
        setM2(M2_PRETEDERMINADO);
        setDistanciaCentroCiudad(DISTANCIA_CENTRO_CIUDAD_PRETEDERMINADO);
        setFechaUltimaReforma(FECHA_ULTIMA_REFORMA_PRETEDERMINADO);
    }

    public int getM2() {
        return m2;
    }
    
    public int getDistanciaCentroCiudad() {
        return distanciaCentroCiudad;
    }
    
    public LocalDate getFechaUltimaReforma() {
        return fechaUltimaReforma;
    }

    public void setM2(int m2) {
        if (m2 < 0 ) {
            throw new IllegalArgumentException("Los metros cuatrados tienen que ser positivos");
        }
        this.m2 = m2;
    }
    
    public void setDistanciaCentroCiudad(int distanciaCentroCiudad) {
        if (distanciaCentroCiudad < 0) {
            throw new IllegalArgumentException("La distancia el centro de la ciudad tiene que ser positivo");
        }
        this.distanciaCentroCiudad = distanciaCentroCiudad;
    }
    
    public void setFechaUltimaReforma(LocalDate fechaUltimaReforma) {
        if (fechaUltimaReforma.isAfter(LocalDate.now())) {
            throw new IllegalArgumentException("La fecha de reforma tiene que ser antes de la actual");
        }
        this.fechaUltimaReforma = fechaUltimaReforma;
    }
    
    public boolean calcularApartamentoModerno() {
        
        boolean moderno = false;
        
        if (fechaUltimaReforma.getYear() > (LocalDate.now().getYear() - 5)) {
            moderno = true;
        }
        
        return moderno;
    }
    
    @Override
    public double calcularPrecioVenta(double precio) {
    	
    	double precioA = precio * (m2 * m2);
    	
    	if (distanciaCentroCiudad < 2){
    		
    		precioA = precioA * 1.15;
    		
    	}
    	
        return precioA;
    }

    @Override
    public String toString() {
        return "Apartamento\n" +
               super.toString() +
               "\nMetros cuatrados: " + m2 + 
               "\nDistancia del centro: " + distanciaCentroCiudad + 
               "\nFecha de la ultima reforma: " + fechaUltimaReforma;
    }

}
