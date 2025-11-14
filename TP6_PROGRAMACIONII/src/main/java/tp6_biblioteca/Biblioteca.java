package tp6_biblioteca;

import java.util.*;

/**
 * Representa una biblioteca que contiene libros.
 * Controla el ciclo de vida de los libros (composición).
 */
public class Biblioteca {
    private String nombre;
    private List<Libro> libros = new ArrayList<>();

    public Biblioteca(String nombre) {
        this.nombre = nombre;
    }

    // Crea y agrega un libro desde datos primitivos
    public void agregarLibro(String isbn, String titulo, int anio, Autor autor) {
        libros.add(new Libro(isbn, titulo, anio, autor));
    }

    public void listarLibros() {
        for (Libro l : libros) {
            l.mostrarInfo();
        }
    }

    public Libro buscarLibroPorIsbn(String isbn) {
        for (Libro l : libros) {
            if (l.getIsbn().equals(isbn)) {
                return l;
            }
        }
        return null;
    }

    public void eliminarLibro(String isbn) {
        libros.removeIf(l -> l.getIsbn().equals(isbn));
    }

    public int obtenerCantidadLibros() {
        return libros.size();
    }

    public void filtrarLibrosPorAnio(int anio) {
        for (Libro l : libros) {
            if (l.getAnioPublicacion() == anio) {
                l.mostrarInfo();
            }
        }
    }

    public void mostrarAutoresDisponibles() {
        Set<String> autoresUnicos = new HashSet<>();
        for (Libro l : libros) {
            String nombreAutor = l.getAutor().getNombre();
            if (!autoresUnicos.contains(nombreAutor)) {
                l.getAutor().mostrarInfo();
                autoresUnicos.add(nombreAutor);
            }
        }
    }
}