package tp5_Ej14;

public class Proyecto {

    private String nombre;
    private int duracionMin;

    // El proyecto es una entidad externa, referenciada por el render
    public Proyecto(String nombre, int duracionMin) {
        this.nombre = nombre;
        this.duracionMin = duracionMin;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDuracionMin() {
        return duracionMin;
    }
}
