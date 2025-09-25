package tp5_Ej4;

public class Banco {

    private String nombre;
    private String cuit;

    // El banco es una entidad externa, agregada a la tarjeta
    public Banco(String nombre, String cuit) {
        this.nombre = nombre;
        this.cuit = cuit;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCuit() {
        return cuit;
    }
}