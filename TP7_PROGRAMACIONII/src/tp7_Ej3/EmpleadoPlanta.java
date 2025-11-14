package tp7_ej3;

/**
 * Clase EmpleadoPlanta
 * Hereda de Empleado y calcula el sueldo fijo mensual.
 */
public class EmpleadoPlanta extends Empleado {
    private double sueldoMensual;

    public EmpleadoPlanta(String nombre, double sueldoMensual) {
        super(nombre);
        this.sueldoMensual = sueldoMensual;
    }

    @Override
    public double calcularSueldo() {
        return sueldoMensual;
    }
}

