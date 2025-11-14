package tp7_Ej1;

/**
 * Clase Vehiculo
 * Representa un vehículo genérico con atributos básicos.
 * Esta clase será la base para otras más específicas.
 */
public class Vehiculo {
    protected String marca;
    protected String modelo;

    // Constructor que inicializa marca y modelo
    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    // Método que muestra la información básica del vehículo
    public void mostrarInfo() {
        System.out.println("Marca: " + marca + " | Modelo: " + modelo);
    }
}
