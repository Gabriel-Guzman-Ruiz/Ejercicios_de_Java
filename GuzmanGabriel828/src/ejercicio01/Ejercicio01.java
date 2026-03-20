/*
Descripción: Clase Atleta, con metodos vasicos
Autor: Gabriel Guzmán
Fecha: 17/03/2026
*/

package ejercicio01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio01 {
	
	public static void main(String[] args) {
		
		Scanner pedido = new Scanner(System.in);
		
		// Bariables
		
		int espacioAleatorio = (int) (Math.random()*10) + 20;
		
		Atleta nuevoAtleta;
		
		int cantidadAtleta = 0;
		
		ArrayList<Atleta> coleccion;
		coleccion = new ArrayList<Atleta>(espacioAleatorio);
		
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
		
		int edadAleatoria;
		double alturaAleaturia;
		
		System.out.println("----------------------------------------");
		System.out.println("Metemos los Atletas dentro del ArrayList");
		System.out.println("----------------------------------------");
		
		for (int i = 0; i < espacioAleatorio; i ++) {
			
			int numbreAleatorioNumero = (int) (Math.random()*49) +1;
			
			String nombre = numbreAleatorioAray[numbreAleatorioNumero];
			
			edadAleatoria = (int) (Math.random()*100) + 1;
			
			alturaAleaturia = Math.round((Math.random() + 1) * 100) / 100.0;
			
			nuevoAtleta = new Atleta(nombre, edadAleatoria, alturaAleaturia);
			
			coleccion.add(nuevoAtleta);
			System.out.println(i +") Se agrego un atleta: "+ nuevoAtleta.toString());
			
			cantidadAtleta ++;
			
		}
		
		System.out.println("-----");
		System.out.println("Datos");
		System.out.println("-----");
		
		System.out.println("Numero de atletas: " + cantidadAtleta);
		System.out.println("Lista de atletas: " + coleccion);
		
		System.out.println("---------------------------------------------------------------");
		System.out.println("A) El promedio (media aritmética) de las edades y de las tallas");
		System.out.println("---------------------------------------------------------------");
		
		System.out.printf("Media de la edad: %.2f %n",  mediaEdad(coleccion));
		System.out.printf("Media de la altura: %.2f %n", mediaAltura(coleccion));
		
		System.out.println("------------------------------------------------------------------------------------------------------------");
		System.out.println("B) Determinar cuántos atletas son menores de edad (menores de 18 años) y cuántos atletas son mayores de edad");
		System.out.println("------------------------------------------------------------------------------------------------------------");
		
		System.out.printf("Numero de atleta menores de edad: %d %n",  contarMenoresEdad(coleccion));
		System.out.printf("Numero de atleta mayores de edad: %d %n", contarMayoresEdad(coleccion));
		
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("c) Determinar los nombres de los atletas que son más altos que el promedio");
		System.out.println("--------------------------------------------------------------------------");
		
		System.out.printf("Numero de atletas mas altos quel promedio: %d %n",  contarMayorAltura(coleccion));
		
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("d) Ordenamos la lista de mayor edad a menor y por nombre");
		System.out.println("--------------------------------------------------------------------------");
		
		Collections.sort(coleccion);
		System.out.println("Lista de atletas: " + coleccion);
		
	}
	
	// METODOS
	
	//mediaEdad: devuelve la media de la edad de todos los Atletas. double
	public static double mediaEdad( ArrayList<Atleta> coleccion) throws IllegalArgumentException{
		
		if (coleccion.isEmpty()) {
	        throw new IllegalArgumentException("ERROR: No puedes usar este metodo si la colección esta vacia");
		}
					
		int edad;
		
		int sumaEdad = 0;
		
		double mediaEdad;
		
		Atleta atleta;
		
		int numeroElementos = coleccion.size();
		
		for (Atleta i: coleccion) {
			
			atleta = i;
			
			edad = atleta.getEdad();
			
			sumaEdad = sumaEdad + edad;
			
		}
		
		mediaEdad = (double) sumaEdad / numeroElementos;
	
		return mediaEdad;													
	}
	
	//mediaAltura: devuelve la media de la altura de todos los Atletas. double
	public static double mediaAltura( ArrayList<Atleta> coleccion) throws IllegalArgumentException{
		
		if (coleccion.isEmpty()) {
	        throw new IllegalArgumentException("ERROR: No puedes usar este metodo si la colección esta vacia");
		}
					
		double altura;
		
		double sumaAltura = 0;
		
		double mediaAltura;
		
		Atleta atleta;
		
		int numeroElementos = coleccion.size();
		
		for (Atleta i: coleccion) {
			
			atleta = i;
			
			altura = atleta.getAltura();
			
			sumaAltura = sumaAltura + altura;
			
		}
		
		mediaAltura = sumaAltura / numeroElementos;
	
		return mediaAltura;													
	}
	
	//contarMenoresEdad: da el numero de atletas menores de edad. int
	public static int contarMenoresEdad( ArrayList<Atleta> coleccion) throws IllegalArgumentException{
		
		if (coleccion.isEmpty()) {
	        throw new IllegalArgumentException("ERROR: No puedes usar este metodo si la colección esta vacia");
		}
					
		int numeroAtletas = 0;
		
		Atleta atleta;
		
		for (Atleta i: coleccion) {
			
			atleta = i;
			
			if (atleta.getEdad() < 18) {
				
				numeroAtletas ++;
				
			}
			
		}
	
		return numeroAtletas;													
	}
	
	//contarMayoresEdad: da el numero de atletas mayores de edad. int
	public static int contarMayoresEdad( ArrayList<Atleta> coleccion) throws IllegalArgumentException{
		
		if (coleccion.isEmpty()) {
	        throw new IllegalArgumentException("ERROR: No puedes usar este metodo si la colección esta vacia");
		}
					
		int numeroAtletas = 0;
		
		Atleta atleta;
		
		for (Atleta i: coleccion) {
			
			atleta = i;
			
			if (atleta.getEdad() >= 18) {
				
				numeroAtletas ++;
				
			}
			
		}
	
		return numeroAtletas;													
	}
	
	//contarMayorAltura: devuelve el numero de atletas mas altos que la media . int
	public static int contarMayorAltura( ArrayList<Atleta> coleccion) throws IllegalArgumentException{
		
		if (coleccion.isEmpty()) {
	        throw new IllegalArgumentException("ERROR: No puedes usar este metodo si la colección esta vacia");
		}
					
		int numeroAtletas = 0;
		
		Atleta atleta;
		
		double media = mediaAltura(coleccion);
		
		int numeroElementos = coleccion.size();
		
		for (Atleta i: coleccion) {
			
			atleta = i;
			
			if (atleta.getAltura() > media) {
				
				numeroAtletas ++;
				
			}
			
		}
	
		return numeroAtletas;													
	}

}
