/*
 * Descripción: Codigo que crea un formulario de las caminatas que a realizado el usuaria
 * Autor: Gabriel Guzmán
 * Fecha: 15/10/2025
 */

package ejercicio8;

import java.util.Scanner;

public class Ejercicio8 { 

	public static void main(String[] args) {
		
		Scanner pedido = new Scanner(System.in);
		
		String nombre;
		String apellidos;
		int edad;
		int numeroRotas;
		double distanciaUltimaRuta;
		
		double distancia;
		int numeroParticipantes;
		String ciudad;
		
		int contador = 0;
		double sumaDistancia = 0;
		double distanciaMedia = 0;
		double distanciaMasLarga = 0;
		String ciudadMasLarga = "";
		
		System.out.println("----------------------------------------");
		System.out.println("CREADOR DE FORMULARIO DE RUTAS CAMINADAS");
		System.out.println("----------------------------------------");
		
		System.out.print("Dame tu nombre: ");
		nombre = pedido.nextLine();
		
		System.out.print("Dame tus apellidos: ");
		apellidos = pedido.nextLine();
		
		System.out.print("Dame tu edad: ");
		edad = pedido.nextInt();
		
		System.out.print("Dame la cantidad de rutas de caminata realizaste: ");
		numeroRotas = pedido.nextInt();
		
		System.out.print("Dame la distancia recorida de la ultima caminata que realizaste: ");
		distanciaUltimaRuta = pedido.nextDouble();
		
		for (contador = 0; contador < 5; contador ++) {
			
			if (edad > 17 && edad < 45) {
				
				System.out.println("---------------------------------");
				System.out.print("Dame la distancia de una caminata: ");
				distancia = pedido.nextDouble();
				
				System.out.print("Dame el numero de participantes en la caminata: ");
				numeroParticipantes = pedido.nextInt();
				
				System.out.print("Dame la ciudad donde se realizo la caminata: ");
				ciudad = pedido.next();
				System.out.println("---------------------------------");
				
				sumaDistancia = sumaDistancia + distancia;
				
				if (distancia > distanciaMasLarga) {
					
					distanciaMasLarga = distancia;
					
					ciudadMasLarga = ciudad;
					
				}	
				
			} else {
				
				System.out.println("------------------------------------------");
				System.out.println("Su edad no es correcta");
				System.out.println("------------------------------------------");
				
				System.out.print("Dame tu edad: ");
				edad = pedido.nextInt();
				
				contador --;
				
			}	
			
		}
		
		distanciaMedia = sumaDistancia / contador;
		
		System.out.println("---------------------------------------------------------------");
		System.out.println("Nombre: " + nombre + " " + apellidos);
		System.out.println("Edad: " + edad);
		System.out.println("Número de rutas realizadas: " + numeroRotas);
		System.out.println("");
		System.out.println("Distancia media (5 últimas rutas): " + distanciaMedia);
		System.out.println("Distancia más larga de las últimas 5 rutas: " + distanciaMasLarga);
		System.out.println("Ciudad de la ruta más larga: " + ciudadMasLarga);
		System.out.println("---------------------------------------------------------------");
		
	}
					
}
