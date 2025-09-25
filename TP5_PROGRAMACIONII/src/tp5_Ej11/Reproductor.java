package tp5_Ej11;

public class Reproductor {

    // Dependencia de uso: el reproductor usa la canción como parámetro, pero no la guarda
    public void reproducir(Cancion cancion) {
        System.out.println("Reproduciendo: " + cancion.getTitulo() +
                           " - Artista: " + cancion.getArtista().getNombre());
    }
}
