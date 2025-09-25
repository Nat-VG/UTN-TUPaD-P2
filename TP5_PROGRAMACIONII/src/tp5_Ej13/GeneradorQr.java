package tp5_Ej13;

public class GeneradorQR {

    // Dependencia de creación: se crea el código QR dentro del método, sin guardarlo como atributo
    public void generar(String valor, Usuario usuario) {
        CodigoQR codigo = new CodigoQR(valor, usuario);
        System.out.println("Codigo QR generado: " + codigo.getValor() +
                           " para el usuario " + codigo.getUsuario().getNombre());
    }
}
