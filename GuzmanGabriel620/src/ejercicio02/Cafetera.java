package ejercicio02;

import ejercicio01.Linea;
import ejercicio01.Punto;

public class Cafetera {

	// ATRIBUTOS
	
	// Atributos fijos de clase
	
	private final double capacidadMaxima;
			
	// Atributos de objeto
	
	private double capacidadMaxima;
	
	private double cantidadActual;
		
	// CONTRUCTOR
		
	public Cafetera( double capacidadMaxima , double cantidadActual) throws IllegalArgumentException{
				
		if (cantidadActual < 0 || capacidadMaxima < 0) {
			throw new IllegalArgumentException("La cantidad y limite de cafe no puede ser negativa");
		}else if (capacidadMaxima < cantidadActual) {
			
			double sobrante = cantidadActual - capacidadMaxima;
			
			this.cantidadActual = capacidadMaxima;
			this.capacidadMaxima = capacidadMaxima;
			
			throw new IllegalArgumentException("La cantidad actual hera superior a el maximo, la cabetera se rellena al completo, sobro: " +sobrante + " de cafe");
		}
			
		this.cantidadActual = cantidadActual;
		this.capacidadMaxima = capacidadMaxima;
			
	}
				
	public Cafetera(double capacidadMaxima){ 
			
		 this (capacidadMaxima,capacidadMaxima);
				
	}
	
	public Cafetera(){ 
		
		 this (capacidadMaxima,capacidadMaxima);
				 
		 System.out.println("Se creo un objeto con los datos predeterminados: [PuntoA = "+ PUNTO_A_PREDETERMINADO +" , PuntoB = "+ PUNTO_B_PREDETERMINADO +"]");
				
	}
		
		// METODOS DE OBJETOS
		
			//toString: Mustra los datos del objeto. String
			public String toString() {
			     return "Linia [PuntoA = " + this.puntoA + ", PuntoB = " + this.puntoB + "]";
			 }
			
			//getPintoA: muestra la cordenada del PuntoA de la linia. Punto
			public Punto getPuntoA () {
					
				double x, y;
				
				Punto pA;
				
				x = this.puntoA.getX();
				
				y = this.puntoA.getY();
				
				pA = new Punto(x,y);
				
				return pA;
							
			}
			
			//getPintoB: muestra la cordenada del PuntoB de la linia. Punto
			public Punto getPuntoB () {
							
				double x, y;
				
				Punto pB;
				
				x = this.puntoB.getX();
				
				y = this.puntoB.getY();
				
				pB = new Punto(x,y);
				
				return pB;
									
			}
			
			//setPuntoA: cambia la cordenada del PuntoA de la linia.
			public void setPuntoA (Punto puntoA) throws IllegalArgumentException{
				
				if (puntoA == null) {
			        throw new IllegalArgumentException("puntoA no puede ser null");
			    }
				
				this.puntoA = puntoA;
								
			}
			
			
			//setPuntoB: cambia la cordenada del PuntoB de la linia.
			public void setPuntoB (Punto puntoB) throws IllegalArgumentException{
				
				if (puntoB == null) {
			        throw new IllegalArgumentException("puntoB no puede ser null");
			    }
				
				this.puntoB = puntoB;
								
			}
			
			//mueveDerecha: Mueve la linia a la derecha.
			public void mueveDerecha (double movimiento) throws IllegalArgumentException{
				
				if (movimiento <= 0) {
			        throw new IllegalArgumentException("El movimiento debe ser mayor que 0");
			    }
						
				double movimientoA = this.puntoA.getX() + movimiento;
				double movimientoB = this.puntoB.getX() + movimiento;
				
				this.puntoA.setX(movimientoA);
				this.puntoB.setX(movimientoB);
										
			}
			
			//mueveIzquierda: Mueve la linia a la izquierda.
			public void mueveIzquierda (double movimiento) throws IllegalArgumentException{
						
				if (movimiento <= 0) {
					throw new IllegalArgumentException("El movimiento debe ser mayor que 0");
				}
								
				double movimientoA = this.puntoA.getX() - movimiento;
				double movimientoB = this.puntoB.getX() - movimiento;
						
				this.puntoA.setX(movimientoA);
				this.puntoB.setX(movimientoB);
												
			}
			
			//mueveArriba: Mueve la linia a arriba.
			public void mueveArriba(double movimiento) throws IllegalArgumentException{
								
				if (movimiento <= 0) {
					throw new IllegalArgumentException("El movimiento debe ser mayor que 0");
				}
										
				double movimientoA = this.puntoA.getY() + movimiento;
				double movimientoB = this.puntoB.getY() + movimiento;
								
				this.puntoA.setY(movimientoA);
				this.puntoB.setY(movimientoB);
														
			}
			
			//mueveAbajo: Mueve la linia a abajo.
			public void mueveAbajo(double movimiento) throws IllegalArgumentException{
										
				if (movimiento <= 0) {
					throw new IllegalArgumentException("El movimiento debe ser mayor que 0");
				}
												
				double movimientoA = this.puntoA.getY() - movimiento;
				double movimientoB = this.puntoB.getY() - movimiento;
										
				this.puntoA.setY(movimientoA);
				this.puntoB.setY(movimientoB);
																
			}
			
			//EscribirLinea: Da un resultado en pantalla mostrando los datos de la linia con el siquiente formato:[puntoA,puntoB].
			public void escribirLinea() throws IllegalArgumentException{
														
				double xA;
				double xB;
				double yA;
				double yB;
				
				xA = this.puntoA.getX();
				xB = this.puntoB.getX();
				yA = this.puntoA.getY();
				yB = this.puntoB.getY();
				
				System.out.println("[("+ xA +"," +yA+"),("+ xB +"," +yB+")]");
																		
			}

		// Ejemplo
			
		public static void main(String[] args) {
				
			Punto Punto1 = new Punto(1,1);
			Punto Punto2 = new Punto(2,2);
			
			Linea linea1 = new Linea(Punto1, Punto2);
				
			Linea linea2 = new Linea();
			
			System.out.println(linea1.toString());
			System.out.println(linea2.toString());
			System.out.println(linea1.getPuntoA());
			System.out.println(linea2.getPuntoA());
			
			Punto1 = new Punto(3,3);
			Punto2 = new Punto(4,4);
				
			linea2.setPuntoA(Punto1); 
			linea2.setPuntoB(Punto2); 
			
			System.out.println(linea1.toString());
			System.out.println(linea2.toString());
			
			linea1.mueveDerecha(2);
			
			System.out.println(linea1.toString());
			
			linea1.mueveIzquierda(2);
			
			System.out.println(linea1.toString());
			
			linea1.mueveArriba(2);
			
			System.out.println(linea1.toString());
			
			linea1.mueveAbajo(2);
			
			System.out.println(linea1.toString());
			
			linea1.escribirLinea();
		}	
	
}
