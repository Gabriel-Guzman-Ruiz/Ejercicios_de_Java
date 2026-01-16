/*
 Descripción: Ejercicio B2 – Persona - incluimos un contructor
 Autor: Gabriel Guzmán
 Fecha:  15/01/2026
 */

package ejercicio2;

public class Principal {
	
public static void main(String[] args) {
		
		Persona persona1 = new Persona("12345678Z", "Gabriel", "Guzmán", 21);
		Persona persona2 = new Persona("12345678Z", "Enrique", "Ruiz", 12);
		
		System.out.printf("%s %s con DNI %s es mayor de edad (%d) %n",persona1.nombre, persona1.apellidos , persona1.dni, persona1.edad);
		System.out.printf("%s %s con DNI %s no mayor de edad (%d)",persona2.nombre, persona2.apellidos , persona2.dni, persona2.edad);
		
	}

}
