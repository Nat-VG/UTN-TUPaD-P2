package tp5_Ej13;

public class CodigoQR {

    private String valor;
    private Usuario usuario; // Asociación unidireccional: el código QR conoce al usuario

    public CodigoQR(String valor, Usuario usuario) {
        this.valor = valor;
        this.usuario = usuario;
    }

    public String getValor() {
        return valor;
    }

    public Usuario getUsuario() {
        return usuario;
    }
}
