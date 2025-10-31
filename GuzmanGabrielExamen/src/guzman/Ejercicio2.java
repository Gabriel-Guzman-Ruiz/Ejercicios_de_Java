/*
 * Descripción: .
 * Autor: Gabriel Guzmán
 * Fecha: 29/10/2025
 */

package guzman;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio2 { 

	public static void main(String[] args) {
		
		Scanner pedido = new Scanner(System.in);
		
		int eleccion;
		
		double iva1;
		double iva2;
		double iva3;
		double precioMatriculaIVAFitnes;
		double precioMatriculaIVAYoga;
		double precioMatriculaIVAMusculacion;
		
		int topoMatricula;
		double descuento;
		double precioFinal;
		
		
		final double MATRICULA_FITNES = 10;
		final double MATRICULA_YOGA = 15;
		final double MATRICULA_MUSCULACION = 20;
		
		System.out.println("-----------------------------------");		
		System.out.println("EJERCICIO 1: GESTIÓN DE UN GIMNASIO");
		System.out.println("-----------------------------------");
		System.out.println("TIPOS DE MATRICULAS: 1. FITNESS - 2. YOGA - 3. MUSCULACIÓN");
		System.out.println("Precio de la matrícula tipo 1 (FITNESS): " + MATRICULA_FITNES);
		System.out.println("Precio de la matrícula tipo 2 (YOGA): " + MATRICULA_YOGA);
		System.out.println("Precio de la matrícula tipo 3 (MUSCULACIÓN): " + MATRICULA_MUSCULACION);
		
		do {
		
		System.out.println("--------------------");		
		System.out.println("MENÚ DE OPERACIONES");
		System.out.println("--------------------");
		System.out.println("1. Calcular PVP de cada matricula.");
		System.out.println("2. Aplicar oferta a un tipo de matricula (sin iva).");
		System.out.println("3. Calcular el importe total de matriculas realizadas (sin iva).");
		System.out.println("4. Salir");
		
		System.out.print("Seleccione una opción: ");
		eleccion = pedido.nextInt();
		
		switch (eleccion) {
		
		case 1: {
			
			System.out.print("Ingrese el IVA para el tipo de matrícula 1 (4 - 10 - 21): ");
			iva1 = pedido.nextDouble();
			
			System.out.print("Ingrese el IVA para el tipo de matrícula 2 (4 - 10 - 21): ");
			iva2 = pedido.nextDouble();
			
			System.out.print("Ingrese el IVA para el tipo de matrícula 3 (4 - 10 - 21): ");
			iva3 = pedido.nextDouble();
			
			precioMatriculaIVAFitnes = MATRICULA_FITNES + (MATRICULA_FITNES * iva1 / 100);
			precioMatriculaIVAYoga = MATRICULA_YOGA + (MATRICULA_YOGA * iva1 / 100);
			precioMatriculaIVAMusculacion = MATRICULA_MUSCULACION + (MATRICULA_MUSCULACION * iva1 / 100);
			
			System.out.println("El PVP de la actividad de Fitness es: " + precioMatriculaIVAFitnes + "€");
			System.out.println("El PVP de la actividad de Yoga es: " + precioMatriculaIVAYoga + "€");
			System.out.println("El PVP de la actividad de Musculación es: " + precioMatriculaIVAMusculacion + "€");
			
		break; }
		
		case 2: {
			
			System.out.print("Seleccione tipo de matrícula (1. Fitness, 2. Yoga o 3. Musculación): ");
			topoMatricula = pedido.nextInt();
			
			System.out.print(" Ingrese el % de descuento a aplicar: ");
			descuento = pedido.nextDouble();
			
			switch (topoMatricula) {
			
			case 1: {
				
				precioFinal = MATRICULA_FITNES - (MATRICULA_FITNES * descuento / 100);
				
				System.out.println(" El precio final (sin iva) con descuento para el tipo de matrícula 1 es: " + precioFinal);
				
			break; }
			
			case 2: {
				
				precioFinal = MATRICULA_YOGA - (MATRICULA_YOGA * descuento / 100);
				
				System.out.println(" El precio final (sin iva) con descuento para el tipo de matrícula 2 es: " + precioFinal);
				
			break; }
			
			case 3: {
				
				precioFinal = MATRICULA_MUSCULACION - (MATRICULA_MUSCULACION * descuento / 100);
				
				System.out.println(" El precio final (sin iva) con descuento para el tipo de matrícula 3 es: " + precioFinal);
				
			break; }
			}
			
		
		break; }
		
		case 3: {
			
			
			
			break; }
		
		case 4: {
			
			System.out.println("Saliendo del programa..");
			
			break; }
		}
		
		} while (eleccion != 4);
		
	}
}
