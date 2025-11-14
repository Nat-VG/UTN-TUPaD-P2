package tp6_biblioteca;

/**
 * Prueba todas las funcionalidades de la biblioteca.
 */
public class MainBiblioteca {
    public static void main(String[] args) {
        Biblioteca biblio = new Biblioteca("Biblioteca UTN");

        // Crear autores
        Autor a1 = new Autor("A001", "Jorge Luis Borges", "Argentina");
        Autor a2 = new Autor("A002", "Isabel Allende", "Chile");
        Autor a3 = new Autor("A003", "Gabriel García Márquez", "Colombia");

        // Agregar libros
        biblio.agregarLibro("L001", "Ficciones", 1944, a1);
        biblio.agregarLibro("L002", "La casa de los espíritus", 1982, a2);
        biblio.agregarLibro("L003", "Cien años de soledad", 1967, a3);
        biblio.agregarLibro("L004", "El Aleph", 1949, a1);
        biblio.agregarLibro("L005", "Eva Luna", 1987, a2);

        // Listar todos
        System.out.println("Listado completo:");
        biblio.listarLibros();

        // Buscar por ISBN
        System.out.println("Buscar libro L003:");
        Libro buscado = biblio.buscarLibroPorIsbn("L003");
        if (buscado != null) buscado.mostrarInfo();

        // Filtrar por año
        System.out.println("Libros publicados en 1982:");
        biblio.filtrarLibrosPorAnio(1982);

        // Eliminar libro
        biblio.eliminarLibro("L002");
        System.out.println("Después de eliminar L002:");
        biblio.listarLibros();

        // Cantidad total
        System.out.println("Cantidad total de libros: " + biblio.obtenerCantidadLibros());

        // Autores disponibles
        System.out.println("Autores disponibles:");
        biblio.mostrarAutoresDisponibles();
    }
}