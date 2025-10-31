/*
 * Descripción: Muestra por pantaya un conjunto de sulucionas a formulas matematicas.
 * Autor: Gabriel Guzmán
 * Fecha: 29/10/2025
 */

package guzman;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio1 { 

	public static void main(String[] args) {
		
		Scanner pedido = new Scanner(System.in);
		
		int numeroX;
		int masa;
		int tiempo;
		double frecuencia;
		double radio;
		
		double operacion;
		double fuersaPeso;
		int numVueltasCompletas;
		double aria;
		
		final double GRAVEDAD_TERESTRE = 9.8;
		
		System.out.println("---------------------------------------");		
		System.out.println("CÁLCULO EXPRESIONES FÍSICAS/MATEMÁTICAS");
		System.out.println("---------------------------------------");
		
		System.out.print("Introduce el valor de X: ");
		numeroX = pedido.nextInt();
		
		System.out.print(" Introduce la masa (kg): ");
		masa = pedido.nextInt();
		
		System.out.print(" Introduce el tiempo (s): ");
		tiempo = pedido.nextInt();
		
		System.out.print(" Introduce la frecuencia (hz): ");
		frecuencia = pedido.nextDouble();
		
		System.out.print("Introduce el radio del círculo (m): ");
		radio = pedido.nextDouble();
		
		//fase de calculo
		
		operacion = ((numeroX + (numeroX / 4.0)) / (6.0 - (numeroX / 2.0)));
		
		fuersaPeso = masa * GRAVEDAD_TERESTRE;
		
		numVueltasCompletas = (int) Math.floor(frecuencia * tiempo); //redondeamos el numero final a la vaja. comvercion de tipo casting explícito.
		
		aria = Math.PI * (radio * radio);
		
		System.out.println("----------");		
		System.out.println("RESULTADOS");
		System.out.println("----------");
		
		System.out.println("OPERACION: " + operacion);
		System.out.println("FUERZA_PESO: " + fuersaPeso);
		System.out.println("NUMERO_VUELTAS: " + numVueltasCompletas);
		System.out.println("AREA_CIRCULO: " + aria);
		
	}
}
