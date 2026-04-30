/*
 * Objetivo: clase que modela al objeto de tipo Socio
 * Autor: Profe
 * Fecha: 29/04/26
 */

package guzman;

public class Socio {
	
	private static int numeroSocios = 0;
	
    private int id;
    private String nombre;
    private byte antiguedad; // en años

    public Socio(int id, String nombre, byte antiguedad) {
        this.id = id;
        this.nombre = nombre;
        this.antiguedad = antiguedad;
        
        numeroSocios ++;
    }

	// 
    public String toString() {

        return "[" +  id + ", " + nombre + ", " + antiguedad + "]";
    }

   
}
