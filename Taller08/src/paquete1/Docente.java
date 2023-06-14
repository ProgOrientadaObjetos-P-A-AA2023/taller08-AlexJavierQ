package paquete1;

/**
 *
 * @author reroes
 */
public class Docente {

    protected String nombres;
    protected String cedula;

    public void establecerNombres(String n) {
        nombres = n;
    }

    public void establecerCedula(String c) {
        cedula = c;
    }

    public String obtenerNombres() {
        return nombres;
    }

    public String obtenerCedula() {
        return cedula;
    }

    @Override
    public String toString() {
        String reporte = String.format(
                "Nombre: %S\n"
                + "Cedula: %s\n",
                obtenerNombres(),
                obtenerCedula()
        );

        return reporte;

    }
;
}
