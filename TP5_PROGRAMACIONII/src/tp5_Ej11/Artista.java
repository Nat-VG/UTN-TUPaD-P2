package tp5_Ej11;

public class Artista {

    private String nombre;
    private String genero;

    // El artista es una entidad externa, referenciada por la canción
    public Artista(String nombre, String genero) {
        this.nombre = nombre;
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public String getGenero() {
        return genero;
    }
}
