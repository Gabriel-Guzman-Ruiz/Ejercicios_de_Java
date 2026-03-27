package guzman;

import java.time.LocalDate;

public class furgonetas extends vehiculos {
    private double volumenMaximoM3;
    private boolean refrigeracion;

    public furgonetas(String matricula, LocalDate fechaMatriculacion, boolean itvEnVigor,
                     double tarifaBaseKm, double volumenMaximoM3, boolean refrigeracion) {
        super(matricula, fechaMatriculacion, itvEnVigor, tarifaBaseKm);
        setVolumenMaximoM3(volumenMaximoM3);
        setRefrigeracion(refrigeracion);
    }

    public double getVolumenMaximoM3() {
        return volumenMaximoM3;
    }

    public void setVolumenMaximoM3(double volumenMaximoM3) {
        if (volumenMaximoM3 <= 0) {
            throw new IllegalArgumentException("El volumen máximo debe ser mayor que 0.");
        }
        this.volumenMaximoM3 = volumenMaximoM3;
    }

    public boolean isRefrigeracion() {
        return refrigeracion;
    }

    public void setRefrigeracion(boolean refrigeracion) {
        this.refrigeracion = refrigeracion;
    }

    @Override
    public String calcularCapacidadCarga() {
        if (refrigeracion) {
            return volumenMaximoM3 + " m3 (refrigerada)";
        }
        return volumenMaximoM3 + " m3";
    }

    @Override
    public String toString() {
        return "FURGONETA\n" +
               super.toString() +
               "\nVolumen máximo: " + volumenMaximoM3 + " m3" +
               "\nRefrigeración: " + refrigeracion;
    }
}