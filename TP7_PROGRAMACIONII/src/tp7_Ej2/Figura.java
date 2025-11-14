package tp7_Ej2;
/**
 * Clase abstracta Figura
 * Representa una figura geométrica genérica.
 * Define el método abstracto calcularArea() que será implementado por las subclases.
 */
public abstract class Figura {
    protected String nombre;

    public Figura(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    // Método abstracto: cada figura calcula su área de forma distinta
    public abstract double calcularArea();
}