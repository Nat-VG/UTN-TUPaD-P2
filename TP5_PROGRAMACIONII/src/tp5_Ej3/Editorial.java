package tp5_Ej3;

public class Editorial {

    private String nombre;
    private String direccion;

    // La editorial es agregada al libro (agregación)
    public Editorial(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }
}