/*
 Descripción:Creamos,modificamos y mostramos objetos de unos dados.
 Autor: Gabriel Guzmán
 Fecha: 3/12/2025
 */

package ejercicio2;
	
import libtarea3.Dado;

import java.lang.IllegalArgumentException;
	
public class Ejercicio2 {

	public static void main(String[] args) {
		
		//parte 1
		
		System.out.println("---------------------------------------------");
		System.out.println("1. MOSTRAMOS LOS VALORES GLOBALES DE LA CLASE");
		System.out.println("---------------------------------------------");	
		
		//parte 1.1
		
		System.out.printf("El numero de dados creados es: %d %n" , Dado.getNumeroDadosCreados());
		
		//parte 1.2
		
		System.out.printf("El numero total de lanzamientos: %d %n" , Dado.getNumeroLanzamientosGlobal());
		
		//parte 1.3
			
		System.out.printf("El numero de veces que salieron las caras 1, 2, 3 y 4: %d %n" , Dado.getNumeroVecesCaraGlobal(1) + Dado.getNumeroVecesCaraGlobal(2) + Dado.getNumeroVecesCaraGlobal(3) + Dado.getNumeroVecesCaraGlobal(4));
		
		//parte 2
		
		System.out.println("---------------------------");
		System.out.println("2. CREAMOS Y LANZAMOS DADOS");
		System.out.println("---------------------------");	
		
		//parte 2.1
		
		Dado [] dados = new Dado[10];
		
		System.out.println("2.1. El dado solo se puede crear si su numero de caras es 4, 6 u 8");
		System.out.println("2.2. Lanza el dado tantas veses como su numero de caras");
		System.out.println("2.3. Muestra el resultado de cada tirada y su suma");
		System.out.println("------------------------------------------------------------------");	
		
		for (int i = 0; i < dados.length ; i ++) {
			
			try {
				dados [i] = new Dado((int) (Math.random()*9));
				
				System.out.println("-----------------------------------");
				System.out.printf("Intento %d - El dado numero %d tiene: %d Caras %n" , i + 1 , Dado.getNumeroDadosCreados() , dados [i].getNumeroCaras());
				
				//parte 2.2
				
				for (int i2 = 0 ; i2 < dados [i].getNumeroCaras(); i2 ++) {
							
					dados [i].lanzar();
					
				}
				
				//parte 2.3
				
				//parte 2.3.1 
				
				System.out.printf("El resultado de las %d tiradas es de: %s %n" , dados [i].getNumeroCaras() , dados [i].getSerieHistoricaLanzamientos());
				
				//parte 2.3.2
				
				System.out.printf("Las %d tiradas del dado suman: %d %n" , dados [i].getNumeroCaras() , dados [i].getSumaPuntuacionHistorica());
				System.out.println("-----------------------------------");
			
			} catch (IllegalArgumentException ex1) {
				
				System.out.printf("Intento %d - ERROR: El valor introdusido no es valido %n" , i + 1);
				
			}
			
		}	
		
		//parte 3
		
		System.out.println("------------------------------------------------------");
		System.out.println("3. MOSTRAMOS LOS VALORES GLOBALES DE LA CLASE OTRA VES");
		System.out.println("------------------------------------------------------");	
		
		//parte 3.1
		
		System.out.printf("El numero de dados creados es: %d %n" , Dado.getNumeroDadosCreados());
		
		//parte 3.2
		
		System.out.printf("El numero total de lanzamientos: %d %n" , Dado.getNumeroLanzamientosGlobal());
		
		//parte 3.3
		
		System.out.printf("El numero de veces que salieron las caras 1, 2, 3 y 4: %d %n" , Dado.getNumeroVecesCaraGlobal(1) + Dado.getNumeroVecesCaraGlobal(2) + Dado.getNumeroVecesCaraGlobal(3) + Dado.getNumeroVecesCaraGlobal(4));
		
	}
}
