/*
 Descripción: Creamos un juego donde tres jugadores tiran un dado de 6 caras x veses y gana el que tenga mayor puntaje.
 Autor: Gabriel Guzmán
 Fecha: 11/12/2025
 */

package ejercicio01;

import libtarea3.Dado;

public class Ejercicio01 {
	
	public static void main(String[] args) {
		
		//parte 1
		//parte 5
		
		System.out.println("----------------------------------------------------------------");
		System.out.println("1. DE MANERA ALEATORIA SE ELIGE LOS PUNTOS MAXIMOS ENTRE 30 Y 60");
		System.out.println("----------------------------------------------------------------");
		
		int puntosMaximos = (int) (Math.random()*31) + 30;
		
		//parte 5.1
		
		System.out.printf("El numero maximo de puntos es: %d %n", puntosMaximos);
		
		//parte 2
		
		System.out.println("-------------------------------------");
		System.out.println("2. CREAMOS LOS TRES JUGADORES (DADOS)");
		System.out.println("-------------------------------------");
		
		Dado dado1, dado2, dado3;
		
		dado1 = new Dado ();
		dado2 = new Dado ();
		dado3 = new Dado ();
		
		System.out.printf("Jugador 1 (dado1): %s caras %n", dado1.getNumeroCaras());
		System.out.printf("Jugador 2 (dado2): %s caras %n", dado2.getNumeroCaras());
		System.out.printf("Jugador 3 (dado3): %s caras %n", dado3.getNumeroCaras());
		
		//parte 3
		
		System.out.println("-----------------------------------------------------------------------------------------------------------------");
		System.out.println("3. SE LANZAN Y SE REGISTRAN LOS PUNTAJES DE LOS TRES DADOS HASTA QUE SUPERE O IGUALE LA CANTIDAD MAXIMA DE PUNTOS");
		System.out.println("-----------------------------------------------------------------------------------------------------------------");
		
		//parte 3.1
		
		System.out.println("|Lanzamientos - jugador 1 - jugador 2 - jugador 3|");
		
		long puntosTotales = 0;
		int resultado1;
		int resultado2;
		int resultado3;
		
		do {
			
			resultado1 = dado1.lanzar();
			resultado2 = dado2.lanzar();
			resultado3 = dado3.lanzar();
			
			//parte 5.2
			
			System.out.printf("|      %d            %d           %d          %d     |%n", dado1.getNumeroLanzamientos(), resultado1, resultado2, resultado3);
			
			//parte 3.2
			
			puntosTotales = dado1.getSumaPuntuacionHistorica() + dado2.getSumaPuntuacionHistorica() + dado3.getSumaPuntuacionHistorica();
			
		} while ( puntosTotales < puntosMaximos);
		
		//parte 5.3
		
		System.out.printf("%n Los puntos de todos los dados es %d, se para el juego.  %n", puntosTotales);
		
		//parte 4
		
		System.out.println("------------------------------------------------------");
		System.out.println("4. CALCULAMOS CUAL FUE EL JUGADOR QUE SACO MAS PUNTOS");
		System.out.println("------------------------------------------------------");
		
		int ganador = 1;
		
		long puntoTotalesGanador = dado1.getSumaPuntuacionHistorica();
		
		int ultimosPuntosGanador = resultado1;
		
		String puntosLanzamientosGanador = dado1.getSerieHistoricaLanzamientos();
		
		if (puntoTotalesGanador < dado2.getSumaPuntuacionHistorica()) {
			
			ganador = 2;
			
			puntoTotalesGanador = dado2.getSumaPuntuacionHistorica();
			
			ultimosPuntosGanador = resultado2;
			
			puntosLanzamientosGanador = dado2.getSerieHistoricaLanzamientos();
			
		}
		
		if (puntoTotalesGanador < dado3.getSumaPuntuacionHistorica()) {
			
			ganador = 3;
			
			puntoTotalesGanador = dado2.getSumaPuntuacionHistorica();
			
			ultimosPuntosGanador = resultado3;
			
			puntosLanzamientosGanador = dado2.getSerieHistoricaLanzamientos();
			
		}
		
		//parte 5.4
		
		System.out.printf("El Jugador %d gano  %n", ganador);
		System.out.printf("El ganador saco %d puntos en el ultimo lanzamiento %n", ultimosPuntosGanador);

		
		//parte 5.5
		
		System.out.printf("El valor %d a salido %d en todas las lanzamientos %n", ultimosPuntosGanador, Dado.getNumeroVecesCaraGlobal(ultimosPuntosGanador));
		
		//parte 5.6
		
		System.out.printf("El numero de lanzamiento de todos los dados es: %d %n", Dado.getNumeroLanzamientosGlobal());
		
		//parte 5.7
		
		System.out.printf("Los puntos en cada lanzamiento del dado ganador en orden fueron: %s %n", puntosLanzamientosGanador);		
		
		
	}

}
