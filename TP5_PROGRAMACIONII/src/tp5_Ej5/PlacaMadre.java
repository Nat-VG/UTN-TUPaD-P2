package tp5_Ej5;

public class PlacaMadre {

    private String modelo;
    private String fabricante;

    // Parte interna de la computadora
    public PlacaMadre(String modelo, String fabricante) {
        this.modelo = modelo;
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public String getFabricante() {
        return fabricante;
    }
}