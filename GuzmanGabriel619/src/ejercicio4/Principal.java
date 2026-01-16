/*
 Descripción: Ejercicio B4 – Artículo – incluimos un contructor
 Autor: Gabriel Guzmán
 Fecha: 15/01/2026
 */

package ejercicio4;

public class Principal {
	
public static void main(String[] args) {
		
		Articulo articulo1 = new Articulo("Manzana", 20, 100);
		
		double inpuesto = (articulo1.precio * (articulo1.IVA * 0.01));
		double pvp = articulo1.precio + inpuesto;
		
		System.out.printf("Producto 1: %s - Precio: %.2f - IVA: %d - PVP: %.2f %n",articulo1.nombre, articulo1.precio , articulo1.IVA, pvp);
		
	}

}