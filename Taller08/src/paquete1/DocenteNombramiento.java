package paquete1;

/**
 *
 * @author alexj
 */
public class DocenteNombramiento extends Docente {

    private double valorSueldo;
    private double valorHoraExtra;
    private double numerHorasExtra;
    private double sueldo;

    public void establecerValorsueldo(double valorS) {
        valorSueldo = valorS;
    }

    public void establecerValorHoraExtra(double valorHE) {
        valorHoraExtra = valorHE;
    }

    public void establecerNumerHorasExtra(double numHE) {
        numerHorasExtra = numHE;
    }

    public double obtenerValorsueldo() {
        return valorSueldo;
    }

    public double obtenerValorHoraExtra() {
        return valorHoraExtra;
    }

    public double obtenerNumerHorasExtra() {
        return numerHorasExtra;
    }

    public double obtenerSueldo() {
        return sueldo;
    }

    public void calcularSueldo() {
        sueldo = (valorSueldo + valorHoraExtra) * numerHorasExtra;
    }

    @Override
    public String toString() {
        String reporte = String.format(
                "%.2f",
                obtenerSueldo()
        );

        return reporte;

    }
;
}
