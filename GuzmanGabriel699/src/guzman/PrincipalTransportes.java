/*
 * Objetivo: mostrar el desarrollo de las clases creadas
 * Fecha: 
 * Autor: 
 */
package guzman;

/*
 * Objetivo: mostrar el desarrollo de las clases creadas
 * Fecha:
 * Autor:
 */

import java.time.LocalDate;
import java.util.Scanner;

public class PrincipalTransportes {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 1. Crea un camión con 20 tn de carga máxima.
        // Evidencia. El valor de cada uno de los atributos
        System.out.println("1 ============");
        camiones camion1 = new camiones(
                "1111AAA",
                LocalDate.of(2021, 5, 10),
                true,
                2.5,
                20.0
        );
        System.out.println(camion1);

        // 2. Calcula el precio para un transporte de 200 kms.
        // Evidencia: el precio del transporte.
        System.out.println("2 ============");
        double precioCamion = camion1.calcularCosteOperativo(200);
        System.out.println("Precio del transporte del camión para 200 km: " + precioCamion + " €");

        // 3. Crea una furgoneta con el volumen máximo permitido
        // (valor solicitado al usuario) y refrigerado (solicitado al usuario).
        // Resto de valores por defecto.
        // Evidencia. El valor de cada uno de los atributos
        System.out.println("3 ============");
        System.out.print("Introduce el volumen máximo de la furgoneta (m3): ");
        double volumen = Double.parseDouble(sc.nextLine());

        System.out.print("¿La furgoneta es refrigerada? (true/false): ");
        boolean refrigerada = Boolean.parseBoolean(sc.nextLine());

        furgonetas furgoneta1 = new furgonetas(
                "2222BBB",              // matrícula por defecto
                LocalDate.of(2022, 1, 1), // fecha por defecto
                true,                   // ITV por defecto
                1.8,                    // tarifa base por defecto
                volumen,
                refrigerada
        );
        System.out.println(furgoneta1);

        // 4. Calcula el precio del transporte para 50 kms.
        // Evidencia: el precio del transporte.
        System.out.println("4 ============");
        double precioFurgoneta = furgoneta1.calcularCosteOperativo(50);
        System.out.println("Precio del transporte de la furgoneta para 50 km: " + precioFurgoneta + " €");

        // 5. Crea una motocicleta con valores por defecto.
        // Evidencia. El valor de cada uno de los atributos.
        System.out.println("5 ============");
        motocicletas moto1 = new motocicletas(
                "3333CCC",
                LocalDate.of(2023, 1, 1),
                false,
                0.9,
                125,
                false
        );
        System.out.println(moto1);

        // 6. Calcula el precio de un transporte para 20 kms.
        // Evidencia. El valor de cada uno de los atributos.
        System.out.println("6 ============");
        double precioMoto = moto1.calcularCosteOperativo(20);
        System.out.println("Precio del transporte de la motocicleta para 20 km: " + precioMoto + " €");

        // 7. Modifica el valor de ITV de la motocicleta a sí.
        // Evidencia: El valor de cada uno de los atributos.
        System.out.println("7 ============");
        moto1.setItvEnVigor(true);
        System.out.println(moto1);

        // 8. Indica si la motocicleta tiene cajón de transporte.
        // Evidencia. El valor de cada uno de los atributos.
        System.out.println("8 ============");
        if (moto1.isCajonTransporte()) {
            System.out.println("La motocicleta SÍ tiene cajón de transporte.");
        } else {
            System.out.println("La motocicleta NO tiene cajón de transporte.");
        }

        // 9. Modifica el valor de la tarifa base a la motocicleta.
        // Evidencia. El valor de cada uno de los atributos.
        System.out.println("9 ============");
        System.out.print("Introduce la nueva tarifa base/km de la motocicleta: ");
        double nuevaTarifa = Double.parseDouble(sc.nextLine());
        moto1.setTarifaBaseKm(nuevaTarifa);
        System.out.println(moto1);

        // 10. Crea un camión con todos los valores solicitados al usuario
        // (el objeto debe ser creado por un método).
        // Evidencia. El valor de cada uno de los atributos.
        System.out.println("10 ============");
        camiones camion2 = crearCamionPorTeclado(sc);
        System.out.println(camion2);

        // 11. Calcula el número de vehículos creados.
        // Evidencia. El número de vehículos creados.
        System.out.println("11 ============");
        System.out.println("Número de vehículos creados: " + vehiculos.getNumeroVehiculosCreados());

        sc.close();
    }

    public static camiones crearCamionPorTeclado(Scanner sc) {
        System.out.print("Introduce la matrícula del camión: ");
        String matricula = sc.nextLine();

        System.out.print("Introduce el año de matriculación: ");
        int anio = Integer.parseInt(sc.nextLine());

        System.out.print("Introduce el mes de matriculación: ");
        int mes = Integer.parseInt(sc.nextLine());

        System.out.print("Introduce el día de matriculación: ");
        int dia = Integer.parseInt(sc.nextLine());

        System.out.print("¿Tiene ITV en vigor? (true/false): ");
        boolean itv = Boolean.parseBoolean(sc.nextLine());

        System.out.print("Introduce la tarifa base por km: ");
        double tarifa = Double.parseDouble(sc.nextLine());

        System.out.print("Introduce la capacidad en toneladas: ");
        double capacidad = Double.parseDouble(sc.nextLine());

        return new camiones(
                matricula,
                LocalDate.of(anio, mes, dia),
                itv,
                tarifa,
                capacidad
        );
    }
}
