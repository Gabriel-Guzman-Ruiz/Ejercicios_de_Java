package ejercicio01;

public class Linea {
	
	// ATRIBUTOS
	
	// Atributos fijos de Clases
	private final static Punto  PUNTO_A_PREDETERMINADO = new Punto(0,0);
	private final static Punto  PUNTO_B_PREDETERMINADO = new Punto(0,0);
	
	// Atributos de objeto
	private Punto puntoA;
	private Punto puntoB;
	
	// CONTRUCTOR
	
	public Linea(Punto puntoA, Punto puntoB) throws IllegalArgumentException{
			
			if (puntoA == null || puntoB == null ) {
		        throw new IllegalArgumentException("puntoA y puntoB no pueden ser null");
		    }
		
		this.puntoA = puntoA;
		this.puntoB = puntoB;
		
	}
		
	public Linea(){ 
		
		 this (PUNTO_A_PREDETERMINADO,PUNTO_B_PREDETERMINADO);
			 
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
		
	}
}
