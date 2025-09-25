package tp5_Ej3;

public class Libro {

    private String titulo;
    private String isbn;
    private Autor autor;         // Asociación unidireccional: el libro conoce al autor
    private Editorial editorial; // Agregación: el libro está vinculado a una editorial

    // Constructor que establece ambas relaciones
    public Libro(String titulo, String isbn, Autor autor, Editorial editorial) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.autor = autor;
        this.editorial = editorial;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public Autor getAutor() {
        return autor;
    }

    public Editorial getEditorial() {
        return editorial;
    }
}