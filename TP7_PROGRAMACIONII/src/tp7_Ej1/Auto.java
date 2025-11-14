package tp7_Ej1;

/**
 * Clase Auto
 * Hereda de Vehiculo y agrega el atributo cantidadDePuertas.
 * Sobrescribe el método mostrarInfo() para incluir ese dato.
 */
public class Auto extends Vehiculo {
    private int cantidadDePuertas;

    // Constructor que usa super() para inicializar marca y modelo
    public Auto(String marca, String modelo, int cantidadDePuertas) {
        super(marca, modelo);
        this.cantidadDePuertas = cantidadDePuertas;
    }

    @Override
    public void mostrarInfo() {
        // Muestro la información del vehículo y agrego las puertas
        System.out.println("Marca: " + marca + " | Modelo: " + modelo + " | Puertas: " + cantidadDePuertas);
    }
}
