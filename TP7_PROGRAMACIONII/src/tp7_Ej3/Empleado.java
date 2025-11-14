package tp7_ej3;

/**
 * Clase abstracta Empleado
 * Representa un empleado genérico con nombre.
 * Define el método abstracto calcularSueldo().
 */
public abstract class Empleado {
    protected String nombre;

    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    // Método abstracto: cada tipo de empleado calcula su sueldo de forma distinta
    public abstract double calcularSueldo();
}
