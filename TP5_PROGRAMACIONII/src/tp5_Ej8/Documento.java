package tp5_Ej8;

public class Documento {

    private String titulo;
    private String contenido;
    private FirmaDigital firma; // Composición: el documento contiene la firma

    public Documento(String titulo, String contenido, FirmaDigital firma) {
        this.titulo = titulo;
        this.contenido = contenido;
        this.firma = firma;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getContenido() {
        return contenido;
    }

    public FirmaDigital getFirma() {
        return firma;
    }
}