package guzman;

import java.time.LocalDate;

public class motocicletas extends vehiculos {
    private int cilindrada;
    private boolean cajonTransporte;

    public motocicletas(String matricula, LocalDate fechaMatriculacion, boolean itvEnVigor,
                       double tarifaBaseKm, int cilindrada, boolean cajonTransporte) {
        super(matricula, fechaMatriculacion, itvEnVigor, tarifaBaseKm);
        setCilindrada(cilindrada);
        setCajonTransporte(cajonTransporte);
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        if (cilindrada <= 0) {
            throw new IllegalArgumentException("La cilindrada debe ser mayor que 0.");
        }
        this.cilindrada = cilindrada;
    }

    public boolean isCajonTransporte() {
        return cajonTransporte;
    }

    public void setCajonTransporte(boolean cajonTransporte) {
        this.cajonTransporte = cajonTransporte;
    }

    @Override
    public String calcularCapacidadCarga() {
        if (cajonTransporte) {
            return "Carga ligera en cajón de transporte";
        }
        return "Sin capacidad de transporte adicional";
    }

    @Override
    public String toString() {
        return "MOTOCICLETA\n" +
               super.toString() +
               "\nCilindrada: " + cilindrada + " cc" +
               "\nCajón de transporte: " + cajonTransporte;
    }
}