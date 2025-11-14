package tp7_ej4;

/**
 * Clase abstracta Animal
 * Representa un animal genérico con nombre.
 * Define los métodos abstractos hacerSonido() y describirAnimal().
 */
public abstract class Animal {
    protected String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    // Método abstracto: cada animal hace un sonido distinto
    public abstract String hacerSonido();

    // Método abstracto: cada animal se describe de forma distinta
    public abstract String describirAnimal();
}
