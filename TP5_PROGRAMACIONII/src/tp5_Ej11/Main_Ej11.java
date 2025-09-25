package tp5_Ej11;

public class Main_Ej11 {

    public static void main(String[] args) {

        // Se crea el artista
        Artista artista = new Artista("Fito Paez", "Rock nacional");

        // Se crea la canción, asociada al artista
        Cancion cancion = new Cancion("Mariposa Tecnicolor", artista);

        // Se crea el reproductor y se reproduce la canción (dependencia de uso)
        Reproductor reproductor = new Reproductor();
        reproductor.reproducir(cancion);
    }
}