package creacionDeClases;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class PruevaDeClases {

	public static void main(String[] args) {
		
		Scanner pedido = new Scanner(System.in);
		
		String nombre;
		String apellidos;
		String fecha;
		LocalDate fechaNacimiento = LocalDate.of(2001, 01, 01);
		double peso;
		double altura = 2.1;
		boolean mayorDeEdad = true;
		byte numeroDeHermanos = 3;
		LocalTime horaMaxima = LocalTime.of(2,3);
		Number nivelDeInbles = null;
		String DNI = null;
		
		Alumno alumno1;
		
		System.out.println("----------------------");
		System.out.println("EL NUMERO MENOR DE DOS");
		System.out.println("----------------------");
		
		System.out.print("Nombre: ");
		nombre = pedido.nextLine();
		
		System.out.print("Apellidos: ");
		apellidos = pedido.nextLine();
		
		System.out.print("Peso: ");
		peso = pedido.nextInt();
		
		alumno1 = new Alumno(nombre, apellidos,fechaNacimiento, peso, altura, numeroDeHermanos, nivelDeInbles, DNI);
		
		System.out.println(alumno1.toString());
		
		
	}
}
