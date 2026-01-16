/*
 Descripción: Ejercicio B3 – Rectángulo – incluimos un contructor
 Autor: Gabriel Guzmán
 Fecha:  15/01/2026
 */

package ejercicio3;

public class Principal {
	
public static void main(String[] args) {
		
		Rectangulo rectangulo1 = new Rectangulo (0, 0, 5, 5);
		Rectangulo rectangulo2 = new Rectangulo (1, 2, 2, 3);
		
		int perimetro1 = rectangulo1.x1 + rectangulo1.y1 + rectangulo1.x2 + rectangulo1.y2;
		int area1 = (rectangulo1.x1 + rectangulo1.x2) * (rectangulo1.y1 + rectangulo1.y2);
		
		int perimetro2 = rectangulo2.x1 + rectangulo2.y1 + rectangulo2.x2 + rectangulo2.y2;
		int area2 = (rectangulo2.x1 + rectangulo2.x2) * (rectangulo2.y1 + rectangulo2.y2);
		
		System.out.printf("Rectangulo1 = (X1 = %s Y1 = %s ; X2 = %s Y2 = %s)%n",rectangulo1.x1 , rectangulo1.y1 , rectangulo1.x2 , rectangulo1.y2);
		System.out.printf("Perimetro = %s %n",perimetro1);
		System.out.printf("Aria = %s %n", area1);
		System.out.println("-------------------------------------------------");
		
		System.out.printf("Rectangulo2 = (X1 = %s Y1 = %s ; X2 = %s Y2 = %s)%n",rectangulo2.x1 , rectangulo2.y1 , rectangulo2.x2 , rectangulo2.y2);
		System.out.printf("Perimetro = %s %n",perimetro2);
		System.out.printf("Aria = %s %n", area2);
		System.out.println("-------------------------------------------------");
		
	}

}