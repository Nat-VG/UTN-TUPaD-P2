package tp5_Ej5;

public class Computadora {

    private String marca;
    private PlacaMadre placaMadre;   // Composición: la computadora contiene la placa madre
    private Propietario propietario; // Asociación bidireccional con Propietario

    public Computadora(String marca, PlacaMadre placaMadre, Propietario propietario) {
        this.marca = marca;
        this.placaMadre = placaMadre;
        this.propietario = propietario;
        propietario.setComputadora(this); // Enlace bidireccional
    }

    public String getMarca() {
        return marca;
    }

    public PlacaMadre getPlacaMadre() {
        return placaMadre;
    }

    public Propietario getPropietario() {
        return propietario;
    }
}