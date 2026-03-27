package guzman;


import java.time.LocalDate;

public abstract class vehiculos {
    private static int contador = 1;

    private final String identificador;
    private String matricula;
    private LocalDate fechaMatriculacion;
    private boolean itvEnVigor;
    private double tarifaBaseKm;

    public vehiculos(String matricula, LocalDate fechaMatriculacion, boolean itvEnVigor, double tarifaBaseKm) {
        setMatricula(matricula);
        setFechaMatriculacion(fechaMatriculacion);
        setItvEnVigor(itvEnVigor);
        setTarifaBaseKm(tarifaBaseKm);
        this.identificador = generarIdentificador(fechaMatriculacion);
    }

    private String generarIdentificador(LocalDate fecha) {
        int anio = fecha.getYear() % 100;
        String consecutivo = String.format("%03d", contador++);
        return String.format("%02d-%s", anio, consecutivo);
    }

    public String getIdentificador() {
        return identificador;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        if (matricula == null || matricula.isBlank()) {
            throw new IllegalArgumentException("La matrícula no puede estar vacía.");
        }
        this.matricula = matricula;
    }

    public LocalDate getFechaMatriculacion() {
        return fechaMatriculacion;
    }

    public void setFechaMatriculacion(LocalDate fechaMatriculacion) {
        LocalDate fechaMinima = LocalDate.of(2000, 1, 1);
        if (fechaMatriculacion == null || fechaMatriculacion.isBefore(fechaMinima)) {
            throw new IllegalArgumentException("La fecha de matriculación no puede ser anterior al 1/1/2000.");
        }
        this.fechaMatriculacion = fechaMatriculacion;
    }

    public boolean isItvEnVigor() {
        return itvEnVigor;
    }

    public void setItvEnVigor(boolean itvEnVigor) {
        this.itvEnVigor = itvEnVigor;
    }

    public double getTarifaBaseKm() {
        return tarifaBaseKm;
    }

    public void setTarifaBaseKm(double tarifaBaseKm) {
        if (tarifaBaseKm < 0) {
            throw new IllegalArgumentException("La tarifa base por km no puede ser negativa.");
        }
        this.tarifaBaseKm = tarifaBaseKm;
    }

    public double calcularCosteOperativo(double km) {
        if (km < 0) {
            throw new IllegalArgumentException("Los kilómetros no pueden ser negativos.");
        }
        return km * tarifaBaseKm;
    }
    
    public static int getNumeroVehiculosCreados() {
        return contador - 1;
    }

    public abstract String calcularCapacidadCarga();

    @Override
    public String toString() {
        return "Identificador: " + identificador +
               "\nMatrícula: " + matricula +
               "\nFecha de matriculación: " + fechaMatriculacion +
               "\nITV en vigor: " + itvEnVigor +
               "\nTarifa base/km: " + tarifaBaseKm;
    }
}
