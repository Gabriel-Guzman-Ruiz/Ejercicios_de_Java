package guzman;

import java.time.LocalDate;

public class Unifamiliar extends Vivienda{
	
    private int M2_PRETEDERMINADO = 50;
    private boolean PATIO_PRETEDERMINADO = false;
	
    private int m2;
    private boolean patio;

    public Unifamiliar(String IDENTIFICADOR, LocalDate fechaContrucion,  String direcion, boolean  dispinible, int m2, boolean patio) {
        super(IDENTIFICADOR, fechaContrucion, direcion, dispinible);
        
        setM2(m2);
        setPatio(patio);
    }
    
    public Unifamiliar() {
        super();
        
        setM2(M2_PRETEDERMINADO);
        setPatio(PATIO_PRETEDERMINADO);
    }

    public int getM2() {
        return m2;
    }
    
    public boolean getPatio() {
        return patio;
    }
    


    public void setM2(int m2) {
        if (m2 < 0 ) {
            throw new IllegalArgumentException("Los metros cuatrados tienen que ser positivos");
        }
        this.m2 = m2;
    }
    
    public void setPatio(boolean patio) {

        this.patio = patio;
    }
    
    public boolean calcularUnifamiliarGrande() {
    	
        boolean grande = false;
        
        if (m2 >= 100 && patio) {
        	grande = true;
        }
        
        return grande;
    }
    
    @Override
    public double calcularPrecioVenta(double precio) {
    	
    	double precioA = precio * (m2 * m2 * 1.5);
    	
    	if (patio){
    		
    		precioA = precioA * 1.25;
    		
    	}
    	
        return precioA;
    }
    

    @Override
    public String toString() {
        return "Apartamento\n" +
               super.toString() +
               "\nMetros cuatrados: " + m2 + 
               "\n Patio: " + patio;
    }


}
