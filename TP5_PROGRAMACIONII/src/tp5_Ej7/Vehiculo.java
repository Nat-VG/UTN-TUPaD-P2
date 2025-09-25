package tp5_Ej7;

public class Vehiculo {

    private String patente;
    private String marca;
    private Motor motor;         // Composición: el vehículo contiene el motor
    private Conductor conductor; // Asociación bidireccional con Conductor

    // Constructor que establece todas las relaciones
    public Vehiculo(String patente, String marca, Motor motor, Conductor conductor) {
        this.patente = patente;
        this.marca = marca;
        this.motor = motor;
        this.conductor = conductor;
        conductor.setVehiculo(this); // Enlace bidireccional
    }

    public String getPatente() {
        return patente;
    }

    public String getMarca() {
        return marca;
    }

    public Motor getMotor() {
        return motor;
    }

    public Conductor getConductor() {
        return conductor;
    }
}
