/*
Descripción: Ejercicio B1 – Punto - incluimos un contructor
Autor: Gabriel Guzmán
Fecha: 15/01/2026
*/

package ejercicio1;

public class Punto {

// ATRIBUTOS

// Atributos de objeto

public int x;
public int y;

// CONTRUCTOR

public Punto (int x, int y){
	
	this.x = x;
	this.y = y;
}

public Punto (){
	
	this ((int) (Math.random()*100), (int) (Math.random()*100));
	
}

// METODOS DE OBJETOS

// METODOS DE CONTRUCTORES
}

