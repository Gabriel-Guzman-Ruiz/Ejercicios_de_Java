package guzman;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class PrincipalVivienda {
    
	public static void main(String[] args) {
		
		Scanner pedido = new Scanner(System.in);
       
        // 1. Apartamento por defecto
		System.out.println("--------------------------");
		System.out.println("1. Apartamento por defecto");
		System.out.println("--------------------------");
        
		Apartamento apratamento1 = new Apartamento(); 
		
		System.out.println(apratamento1.toString());
		
        // 2. Precio 1500€/m2
		
		System.out.println("--------------------------");
		System.out.println(" 2. Precio 1500€/m2");
		System.out.println("--------------------------");
		
		double precioA = apratamento1.calcularPrecioVenta(1500);
		
		System.out.println(precioA);
        

        // 3. Apartamento con datos usuario
		
		System.out.println("--------------------------");
		System.out.println("3. Apartamento con datos usuario");
		System.out.println("--------------------------");
		
		String fechaTexto; 
		
		int distancia;
		
		
		System.out.print("fecha (dd/mm/aaaa): ");
		fechaTexto = pedido.next();
		
		System.out.print("Distancia el centro: ");
		distancia = pedido.nextInt();
		
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		LocalDate fecha = LocalDate.parse(fechaTexto, formato);
		
		Apartamento apratamento2 = new Apartamento(distancia , fecha);
		
		System.out.println(apratamento2.toString());
        

        // 4. Precio 800€/m2
		System.out.println("--------------------------");
		System.out.println(" 4. Precio 800€/m2");
		System.out.println("--------------------------");
        
		
		double precioB = apratamento2.calcularPrecioVenta(800);
		
		System.out.println(precioB);
        
		
        // 5. Unifamiliar por defecto
        
		System.out.println("--------------------------");
		System.out.println("1. Apartamento por defecto");
		System.out.println("--------------------------");
        
		Unifamiliar unifamiliar = new Unifamiliar(); 
		
		System.out.println(unifamiliar.toString());
		
        // 6. Unifamiliar con m2 usuario
        
		System.out.println("--------------------------");
		System.out.println("1. Unifamiliar con m2 usuario");
		System.out.println("--------------------------");
		


        // 7. Es grande?
        
		
        // 9. Modificar patio
        
		
        // 10. Total viviendas
        
		
    }
}