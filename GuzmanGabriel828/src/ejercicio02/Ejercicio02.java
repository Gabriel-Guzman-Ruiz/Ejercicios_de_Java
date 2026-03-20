package ejercicio02;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Ejercicio02 {
	
	public static void main(String[] args) {
		
		Scanner pedido = new Scanner(System.in);
		
		// Bariables
		
		int espacioAleatorio = (int) (Math.random()*10) + 20;
		
		Contactos nuevoContacto;
		
		int cantidadContactos = 0;
		
		LinkedList<Contactos> coleccion;
		coleccion = new LinkedList<Contactos>();
		
		System.out.println("------------------------------------------------------");
		System.out.println("Metemos los contactos aleatorios dentro del LinkedList");
		System.out.println("------------------------------------------------------");
		
		for (int i = 0; i < espacioAleatorio; i ++) {
			
			nuevoContacto = Contactos.ContactoAleatorio();
			
			coleccion.add(nuevoContacto);
			System.out.println(i +") Se agrego un atleta: "+ nuevoContacto.toString());
			
			cantidadContactos ++;
			
		}
		
		System.out.println("-----");
		System.out.println("Datos");
		System.out.println("-----");
		
		System.out.println("Numero de atletas: " + cantidadContactos);
		System.out.println("Lista de atletas: " + coleccion);
		
		System.out.println("--------");
		System.out.println("Interfas");
		System.out.println("--------");
		
		boolean salir = false;
		boolean error = false;
		char Elecion;
		
		do {
			
			System.out.println("a) ingresar contacto\r\n"
					+ "b) consultar un nombre y mostrar todos sus datos\r\n"
					+ "c) mostrar todos los datos de los contactos ordenados por nombre.\r\n"
					+ "d) dada una fecha mostrar aquellos contactos que hayan nacido en ese año.");
			System.out.println("----------------------------------------------------------------");
			
			System.out.print("Elecion: ");
			Elecion = pedido.next().charAt(0);
			
			if (Elecion == 'a' || Elecion == 'A') {
				
				System.out.println("-----------------");
				System.out.println("ingresar contacto");
				System.out.println("-----------------");
				
				String nombre;
				
				String gmail;
				
				int telefono;
				
				String fechaNacimiento;
				
				
				do {
				
					try {
					
						System.out.print("Nombre (Obligatorio): ");
						nombre = pedido.nextLine();
						System.out.println("--------");
						
						System.out.print("gmail (*@*.* | Obligatorio): ");
						gmail = pedido.next();
						System.out.println("-------");
						
						System.out.print("telefono (9 digitos): ");
						telefono = pedido.nextInt();
						System.out.println("----------");
						
						System.out.print("fechaNacimiento (1900-" + LocalDate.now().getYear()+ " | dd/mm/aaaa): ");
						fechaNacimiento = pedido.next();
						System.out.println("--------");
						
						
						
						System.out.println("ingresar contacto");
						System.out.println("-----------------");
						
						
						
						error = false;
					
					} catch (IllegalArgumentException ex1) {
						
						System.out.println("Alguno de los datos no es valido");
						
						error = true;
						
					}
				
				} while (error);
				
			} else if (Elecion == 'b' || Elecion == 'B'){
				
				System.out.println("---------------------------------------------");
				System.out.println("consultar un nombre y mostrar todos sus datos");
				System.out.println("---------------------------------------------");
				
			} else if (Elecion == 'c' || Elecion == 'C'){
				
				System.out.println("-------------------------------------------------------------");
				System.out.println("mostrar todos los datos de los contactos ordenados por nombre");
				System.out.println("-------------------------------------------------------------");
				
			} else if (Elecion == 'd' || Elecion == 'D'){
				
				System.out.println("---------------------------------------------------------------------");
				System.out.println("dada una fecha mostrar aquellos contactos que hayan nacido en ese año");
				System.out.println("---------------------------------------------------------------------");
				
			} else {
				
				System.out.println("dame un valor valido");
				System.out.println("--------------------");
	
				
			}
			
		} while (!salir);
		
		
	}
	
	// METODOS
	

}
