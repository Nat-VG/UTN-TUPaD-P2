package tp7_ej3;

/**
 * Clase EmpleadoTemporal
 * Hereda de Empleado y calcula el sueldo según horas trabajadas * valor por hora.
 */
public class EmpleadoTemporal extends Empleado {
    private double valorHora;
    private int horasTrabajadas;

    public EmpleadoTemporal(String nombre, double valorHora, int horasTrabajadas) {
        super(nombre);
        this.valorHora = valorHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public double calcularSueldo() {
        return valorHora * horasTrabajadas;
    }
}
