package tp5_Ej13;

public class Main_Ej13 {

    public static void main(String[] args) {

        // Se crea el usuario
        Usuario usuario = new Usuario("Alejandra Ramírez", "ale.ramirez@email.com");

        // Se crea el generador y se genera el código QR (dependencia de creación)
        GeneradorQR generador = new GeneradorQR();
        generador.generar("QR-ABC123", usuario);
    }
}
