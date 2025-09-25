package tp5_Ej5;

public class Propietario {

    private String nombre;
    private Computadora computadora;

    public Propietario(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public Computadora getComputadora() {
        return computadora;
    }

    // Asociación bidireccional: el propietario conoce su computadora
    public void setComputadora(Computadora computadora) {
        this.computadora = computadora;
    }
}
