package paquete1;

/**
 *
 * @author alexj
 */
public class DocenteFactura extends Docente {

    private double valorFactura ;
    private double valorIvaDescuento= 12;
    private double valorCancelar;

// Establecer
    public void establecerValorFactura(double valorF) {
        valorFactura = valorF;
    }

    public void establecerValorIvaDescuento(double valorIvaD) {
        valorIvaDescuento = valorIvaD;
    }

    public void calcularValorCancelar() {
        valorCancelar = valorFactura - ((valorFactura * valorIvaDescuento) / 100);
    }

    public double obtenerValorFactura() {
        return valorFactura;
    }

    public double obtenerValorIvaDescuento() {
        return valorIvaDescuento;
    }

    public double obtenerValorCancelar() {
        return valorCancelar;
    }

    @Override
    public String toString() {
        String reporte = String.format(
                "%.2f",
                 obtenerValorCancelar()
        );

        return reporte;

    }
;
}
