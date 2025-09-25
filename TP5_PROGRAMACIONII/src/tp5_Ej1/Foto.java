package tp5_Ej1;

public class Foto {

    private String imagen;
    private String formato;

    // Parte interna del pasaporte (composición)
    public Foto(String imagen, String formato) {
        this.imagen = imagen;
        this.formato = formato;
    }

    public String getImagen() {
        return imagen;
    }

    public String getFormato() {
        return formato;
    }
}