package tp7_Ej2;
/**
 * Clase Circulo
 * Hereda de Figura y calcula el área como PI * radio^2.
 */
public class Circulo extends Figura {
    private double radio;

    public Circulo(String nombre, double radio) {
        super(nombre);
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }
}