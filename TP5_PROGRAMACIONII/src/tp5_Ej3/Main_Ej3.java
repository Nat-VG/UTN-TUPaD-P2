package tp5_Ej3;

public class Main_Ej3 {

    public static void main(String[] args) {

        Autor autor = new Autor("Jose Mauro de Vasconcelos", "Brasil");
        Editorial editorial = new Editorial("Editora Melhoramentos", "São Paulo, Brasil");

        Libro libro = new Libro("Mi planta de naranja lima", "978-987-6543210", autor, editorial);

        System.out.println("Titulo: " + libro.getTitulo());
        System.out.println("ISBN: " + libro.getIsbn());
        System.out.println("Autor: " + libro.getAutor().getNombre() + " - Nacionalidad: " + libro.getAutor().getNacionalidad());
        System.out.println("Editorial: " + libro.getEditorial().getNombre() + " - Direccion: " + libro.getEditorial().getDireccion());
    }
}