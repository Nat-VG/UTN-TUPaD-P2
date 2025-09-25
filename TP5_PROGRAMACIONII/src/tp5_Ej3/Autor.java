package tp5_Ej3;

public class Autor {

    private String nombre;
    private String nacionalidad;

    // El autor es una entidad externa, referenciada por el libro
    public Autor(String nombre, String nacionalidad) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }
}