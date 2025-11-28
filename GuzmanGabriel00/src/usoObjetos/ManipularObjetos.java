package usoObjetos;

import java.awt.Rectangle;

public class ManipularObjetos {
	
	public static void main(String[] args) {
		
		Rectangle r1; // la clace la declaramos
		
		r1 = new Rectangle(); //creamos un objeto
		
		System.out.println(r1.toString());
		
		r1.x = 10;
		
		System.out.println(r1.toString());
		
		Rectangle r2;
		r2 = r1; // copiamos la referencia del objeto
		
		System.out.println(r2.toString());
		
		r2.y = 5;  // camviamos un valor.
		
		System.out.println(r1.toString());
		
		r1.setLocation(5, 5); // cambiar varios valores
		System.out.println(r1.toString());
		
		double dimencionX = r1.getCenterX(); // pedir un valor concreto
		System.out.println(dimencionX);
	
	}

}
