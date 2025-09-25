package tp5_Ej13;

public class Usuario {

    private String nombre;
    private String email;

    // El usuario es una entidad externa, referenciada por el código QR
    public Usuario(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }
}