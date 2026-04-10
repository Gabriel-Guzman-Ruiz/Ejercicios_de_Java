package ejercicio04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

import ejercicio01.Atleta;
import ejercicio02.Contactos;
import ejercicio04.Travajadores.EstadoCivil;
import ejercicio04.Travajadores.Sexo;

public class Ejercicio04 {
	
	public static void main(String[] args) {
		
		Scanner pedido = new Scanner(System.in);
		
		// Bariables
		
		int espacioAleatorio = (int) (Math.random()*10) + 20;
		
		Travajadores nuevoTravajador;
		
		int cantidadContactos = 0;
		
		HashSet<Travajadores> coleccion;
		coleccion = new HashSet<Travajadores>(espacioAleatorio);
		
		System.out.println("------------------------------------------------------");
		System.out.println("Metemos los travajadores aleatorios dentro del HashSet");
		System.out.println("------------------------------------------------------");
		
		for (int i = 0; i < espacioAleatorio; i ++) {
			
			cantidadContactos ++;
			
			nuevoTravajador = Travajadores.travajadorAleatorio();
			
			coleccion.add(nuevoTravajador);
			
			System.out.println(cantidadContactos +") Se agrego un travajador: "+ nuevoTravajador.toString());
			

			
		}
		
		System.out.println("-----");
		System.out.println("Datos");
		System.out.println("-----");
		
		System.out.println("Numero de contactos: " + cantidadContactos);
		System.out.println("Lista de contactos: " + coleccion);
		
		System.out.println("-----");
		System.out.println("ordenar por sexo y estado civil");
		System.out.println("-----");
		
		ArrayList<Travajadores> lista = new ArrayList<>(coleccion);
				
		Collections.sort(lista);
		
		System.out.println("Lista de Travajadores: " + lista);
		
		System.out.println("-----");
		System.out.println("Numero de travajadores hombres");
		System.out.println("-----");
		
		System.out.println("Lista de Travajadores: " + numeroTravajadoresHombres(coleccion));
		
		System.out.println("-----");
		System.out.println("Numero de travajadores mujeres casadas");
		System.out.println("-----");
		
		System.out.println("Lista de travajadores: " + numeroTravajadoresMujeresCasadas(coleccion));
		
		System.out.println("-----");
		System.out.println("Numero de travajadores solteros");
		System.out.println("-----");
		
		System.out.println("Lista de travajadores: " + sumaSolteros(coleccion));
		
	}
	
	// METODOS
	
	//numeroTravajadoresHombres: Da el numero de travajadores masculinos. int
	public static int numeroTravajadoresHombres( HashSet<Travajadores> coleccion) throws IllegalArgumentException{
		
		if (coleccion.isEmpty()) {
	        throw new IllegalArgumentException("ERROR: No puedes usar este metodo si la colección esta vacia");
		}
					
		int cantidad = 0;
		
		for (Travajadores i: coleccion) {
			
			if (Sexo.Hombre == i.getSexo()) {
				
				cantidad ++;
			}
			
		}
	
		return cantidad;													
	}
	
	//numeroTravajadoresMujeresCasadas: Da el numero de travajadores Mujeres casadas. int
	public static int numeroTravajadoresMujeresCasadas( HashSet<Travajadores> coleccion) throws IllegalArgumentException{
		
		if (coleccion.isEmpty()) {
	        throw new IllegalArgumentException("ERROR: No puedes usar este metodo si la colección esta vacia");
		}
					
		int cantidad = 0;
		
		for (Travajadores i: coleccion) {
			
			if (Sexo.Mujer == i.getSexo() && EstadoCivil.Casado == i.getEstadoCivil()) {
				
				cantidad ++;
			}
			
		}
	
		return cantidad;													
	}
	
	//sumaSolteros: Da el numero de travajadores solteros. int
	public static int sumaSolteros( HashSet<Travajadores> coleccion) throws IllegalArgumentException{
		
		if (coleccion.isEmpty()) {
	        throw new IllegalArgumentException("ERROR: No puedes usar este metodo si la colección esta vacia");
		}
					
		int cantidad = 0;
		
		for (Travajadores i: coleccion) {
			
			if (EstadoCivil.Soltero == i.getEstadoCivil()) {
				
				cantidad ++;
			}
			
		}
	
		return cantidad;													
	}


}
