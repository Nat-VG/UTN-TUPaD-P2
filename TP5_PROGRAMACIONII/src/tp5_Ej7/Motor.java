package tp5_Ej7;

public class Motor {

    private String tipo;
    private String numeroSerie;

    // Parte interna del vehículo (composición)
    public Motor(String tipo, String numeroSerie) {
        this.tipo = tipo;
        this.numeroSerie = numeroSerie;
    }

    public String getTipo() {
        return tipo;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }
}