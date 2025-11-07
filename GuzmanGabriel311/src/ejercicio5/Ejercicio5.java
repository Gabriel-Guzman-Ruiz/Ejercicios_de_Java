/*
 * Descripción: Calcula el salario medio de hombres y el salario medio de mujeres de una emprese con N empleados.
 * Autor: Gabriel Guzmán
 * Fecha: 04/11/2025
 */

package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 { 

	public static void main(String[] args) {
		
		Scanner pedido = new Scanner(System.in);
		
		int numeroEnpleados;
		int genero;
		int salario;
		
		int sumaSueldoVarones = 0;
		int sumaSueldoMujeres = 0;
		int numeroVarones = 0;
		int numerosMujeres = 0;
		int mediaSueldoVarones;
		int mediaSueldoMujeres;
		
		final int generoSalario = 2;
		
		int [] [] empleados;
		
		
		System.out.println("----------------------------------------------------------");
		System.out.println("CALCULAR SI EXISTE BRECHA SALARIAL ENTRE HOMBRES Y MUJERES");
		System.out.println("----------------------------------------------------------");
		
		System.out.print("Numeros de empleados: ");
		numeroEnpleados = pedido.nextInt();
		
		empleados = new int [numeroEnpleados] [generoSalario];
		
		for (int i = 0; i < numeroEnpleados; i ++) {
			
			for (int y = 0; y < generoSalario; y ++) {
			
				System.out.println("--------------------------------------------------------");
				System.out.print("Genero del empleado numero " + (i + 1) + " (0 = Hombre, 1 = mujer): ");
				genero = pedido.nextInt();
					
				empleados [i] [y]  = genero;
				
				if (empleados [i] [y] == 1 || empleados [i] [y] == 0) {
					
					y ++;
					
					System.out.println("---------------------------------------------------------");
					System.out.print("Salario del empleado numero " + (i + 1) + ": ");
					salario = pedido.nextInt();
					
					empleados [i] [y]  = salario;
					
				} else {
					
					System.out.println("-----------------------------");
					System.out.println("Introdujo un numero incorecto");
					
					y = -1;
				}
			
			}
			
		}
		
		
		for (int i = 0; i < numeroEnpleados; i ++) {
			
			for (int y = 0; y < generoSalario; y ++) {
		
				if (empleados [i] [y] == 0) {
					
					sumaSueldoVarones = sumaSueldoVarones + empleados [i] [y + 1];
					
					numeroVarones ++;
					
				} else if (empleados [i] [y] == 1){
					
					sumaSueldoMujeres = sumaSueldoMujeres + empleados [i] [y + 1];
					
					numerosMujeres ++;
				}
			
			}
			
		}
		
		mediaSueldoVarones = sumaSueldoVarones / numeroVarones;
		
		mediaSueldoMujeres = sumaSueldoMujeres / numerosMujeres;
			
		System.out.println("---------------------------------------------------------");
		System.out.println("El salario medio de los hombres es: " + mediaSueldoVarones);
		System.out.println("El salario medio de las mujeres es: " + mediaSueldoMujeres);
			
	}
}
