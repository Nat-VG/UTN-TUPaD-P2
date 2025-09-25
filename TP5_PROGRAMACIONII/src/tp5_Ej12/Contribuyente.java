package tp5_Ej12;

public class Contribuyente {

    private String nombre;
    private String cuil;

    // El contribuyente es una entidad externa, referenciada por el impuesto
    public Contribuyente(String nombre, String cuil) {
        this.nombre = nombre;
        this.cuil = cuil;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCuil() {
        return cuil;
    }
}
