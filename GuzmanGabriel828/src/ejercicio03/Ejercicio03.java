package ejercicio03;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Scanner;

import ejercicio01.Atleta;

public class Ejercicio03 {
	
	public static void main(String[] args) {
		
		Scanner pedido = new Scanner(System.in);
		
		// Bariables
		
		int espacioAleatorio = (int) (Math.random()*10) + 20;
		
		Contactos nuevoContacto;
		
		int cantidadContactos = 0;
		
		LinkedHashSet<Contactos> coleccion;
		coleccion = new  LinkedHashSet<Contactos>();
		
		System.out.println("------------------------------------------------------");
		System.out.println("Metemos los contactos aleatorios dentro del LinkedList");
		System.out.println("------------------------------------------------------");
		
		for (int i = 0; i < espacioAleatorio; i ++) {
			
			nuevoContacto = Contactos.ContactoAleatorio();
			
			coleccion.add(nuevoContacto);
			System.out.println(i +") Se agrego un contacto: "+ nuevoContacto.toString());
			
			cantidadContactos ++;
			
		}
		
		System.out.println("-----");
		System.out.println("Datos");
		System.out.println("-----");
		
		System.out.println("Numero de contactos: " + cantidadContactos);
		System.out.println("Lista de contactos: " + coleccion);
		
		System.out.println("--------");
		System.out.println("Interfas");
		System.out.println("--------");
		
		boolean salir = false;
		boolean error = false;
		char Eleccion;
		
		do {
			
			System.out.println("a) ingresar contacto.\r\n"
					+ "b) consultar un nombre y mostrar todos sus datos.\r\n"
					+ "c) mostrar todos los datos de los contactos ordenados por nombre.\r\n"
					+ "d) dada una fecha mostrar aquellos contactos que hayan nacido en ese año.\r\n"
					+ "0) serar interfas.");
			System.out.println("----------------------------------------------------------------");
			
			System.out.print("Eleccion: ");
			Eleccion = pedido.next().charAt(0);
			
			if (Eleccion == 'a' || Eleccion == 'A') {
				
				System.out.println("-----------------");
				System.out.println("ingresar contacto");
				System.out.println("-----------------");
				
				String nombre;
				
				String gmail;
				
				int telefono;
				
				String fecha;
				
				
				do {
				
					try {
						
						pedido.nextLine();
					
						System.out.print("Nombre (Obligatorio): ");
						nombre = pedido.nextLine();
						
						System.out.print("telefono (9 digitos): ");
						telefono = pedido.nextInt();
						
						System.out.print("gmail (*@*.* | Obligatorio): ");
						gmail = pedido.next();
						
						System.out.print("fechaNacimiento (1900-" + LocalDate.now().getYear()+ " | dd/mm/aaaa): ");
						fecha = pedido.next();
						
						DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

						LocalDate fechaNacimiento = LocalDate.parse(fecha, formato);
						
						nuevoContacto = new Contactos(nombre, telefono, gmail, fechaNacimiento);
						
						coleccion.add(nuevoContacto);
						System.out.println("---------------------------------------------");
						System.out.println("Se agrego un contacto: "+ nuevoContacto.toString());
						System.out.println("---------------------------------------------");
						
						cantidadContactos ++;
						
						error = false;
					
					} catch (IllegalArgumentException ex1) {
						
						System.out.println("Alguno de los datos no es valido");
						
						pedido.nextLine();
						
						error = true;
						
					}	catch (DateTimeParseException ex2) {
						
						System.out.println("La fecha no tiene un formato valido");
						
						pedido.nextLine();
						
						error = true;
					}
				
				} while (error);
				
			} else if (Eleccion == 'b' || Eleccion == 'B'){
				
				System.out.println("---------------------------------------------");
				System.out.println("consultar un nombre y mostrar todos sus datos");
				System.out.println("---------------------------------------------");
				
				String nombre;
				
				
				do {
					pedido.nextLine();
					
					int contador = 0;
					
					System.out.print("Dame al nombre: ");
					nombre = pedido.nextLine();
					
					for (Contactos c : coleccion) {
					    
						if (nombre.equals( c.getNombre())){
							
							
							System.out.println("---------------------------------------------");
							System.out.println("El contacto: "+ c.toString());
							System.out.println("---------------------------------------------");
							
							contador ++;
							
							error = false;
							
						}
					
					}
					
					for(int i = 0; i < coleccion.size(); i ++) {
					

					}
					
					if (contador == 0) {
						
						System.out.println("El nombre no esta en la colecion");
						
						error = true;
					}
				
				} while (error);				
				
			} else if (Eleccion == 'c' || Eleccion == 'C'){
				
				System.out.println("-------------------------------------------------------------");
				System.out.println("mostrar todos los datos de los contactos ordenados por nombre");
				System.out.println("-------------------------------------------------------------");
			
				
				System.out.println("---------------------------------------------");
				System.out.println("Lista de atletas: " + coleccion);
				System.out.println("---------------------------------------------");
				
			} else if (Eleccion == 'd' || Eleccion == 'D'){
				
				System.out.println("---------------------------------------------------------------------");
				System.out.println("dada una fecha mostrar aquellos contactos que hayan nacido en ese año");
				System.out.println("---------------------------------------------------------------------");
				
				int anno;
				
				int contador = 0;
				
				do {
					pedido.nextLine();
					

					
					System.out.print("Dame el año: ");
					anno = pedido.nextInt();
					
					for (Contactos c : coleccion) {	

						if (anno == c.getFechaNacimiento().getYear()){
								
							System.out.println("---------------------------------------------");
							System.out.println("El contacto: "+ c.toString());
							System.out.println("---------------------------------------------");
								
							contador ++;			
							
						}
					
					}
					
					
					if (contador == 0) {
						
						System.out.println("Ningún contacto nació en ese año");
						
					}
				
				} while (contador == 0);		
				
				
			} else if (Eleccion == '0'){
				
				System.out.println("Serar interfas");
				System.out.println("--------------------");
				
				salir = true;
				
			} else {
				
				System.out.println("dame un valor valido");
				System.out.println("--------------------");
	
				
			}
			
		} while (!salir);
		
		
	}
	
	// METODOS
	

}
