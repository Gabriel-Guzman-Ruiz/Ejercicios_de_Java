package guzman;

import java.time.LocalDate;

public class camiones extends vehiculos {
    private double capacidadToneladas;

    public camiones(String matricula, LocalDate fechaMatriculacion, boolean itvEnVigor, double tarifaBaseKm, double capacidadToneladas) {
        super(matricula, fechaMatriculacion, itvEnVigor, tarifaBaseKm);
        setCapacidadToneladas(capacidadToneladas);
    }

    public double getCapacidadToneladas() {
        return capacidadToneladas;
    }

    public void setCapacidadToneladas(double capacidadToneladas) {
        if (capacidadToneladas < 0.5 || capacidadToneladas > 20) {
            throw new IllegalArgumentException("La capacidad del camión debe estar entre 0.5 y 20 toneladas.");
        }
        this.capacidadToneladas = capacidadToneladas;
    }

    @Override
    public String calcularCapacidadCarga() {
        return capacidadToneladas + " toneladas";
    }

    @Override
    public String toString() {
        return "CAMIÓN\n" +
               super.toString() +
               "\nCapacidad: " + capacidadToneladas + " toneladas";
    }
}
