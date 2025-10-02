/*
 * Descripción: Calculando el salaario neto de un travajador
 * Autor: Gabriel Guzmán
 * Fecha: 1/10/2025
 */

package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		Scanner pedido = new Scanner(System.in);
		
		String nombre;
		String apellidos;
		String nacimiento;
		int salariobruto;
		int annostravajados;
		
		System.out.println("-----------------------------");
		System.out.println("Rellena tus datos personales: ");
		System.out.println("-----------------------------");
		
		System.out.print("Dame tu nombre: ");
		nombre = pedido.nextLine();
		
		System.out.print("Dame tus apellidos: ");
		apellidos = pedido.nextLine();
		
		System.out.print("Dame tu fecha de nacimiento: ");
		nacimiento = pedido.nextLine();
		
		System.out.print("Dame tu salario bruto: ");
		salariobruto = pedido.nextInt();
		
		System.out.print("Dame tu numero de años travajando: ");
		annostravajados = pedido.nextInt();
		
		double irpf = salariobruto * 0.15;
		double salarioparcial = salariobruto - irpf;
		
		int aumento = annostravajados * 2;
		double aumentodecimal = aumento;
		
		double salarioaumento = salariobruto * (aumentodecimal/100);
		double salariototal = salariobruto + salarioaumento;
		
		double irpftotal = salariototal * 0.15;
		double salarioneto = salariototal - irpftotal;
		
		System.out.println("---------------------");
		System.out.println
			("Estimad@ " + nombre + " " + apellidos + ", su salario bruto es " + salariobruto + ", teniendo en\r\n"
			+ "cuenta un IRPF del 15% su salario neto es " + salarioparcial + "\r\n"
			+ "Debido a sus " + annostravajados + " años trabajando en la\r\n"
			+ "empresa su salario se incrementará en un 2% por cada año. El aumento es de\r\n"
			+ aumento + "% y el salario total es " + salarioneto);
		System.out.println("---------------------");
	}

}