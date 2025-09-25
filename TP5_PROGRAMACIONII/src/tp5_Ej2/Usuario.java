package tp5_Ej2;

public class Usuario {

    private String nombre;
    private String dni;
    private Celular celular;

    public Usuario(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public Celular getCelular() {
        return celular;
    }

    // Asociación bidireccional: el usuario conoce su celular
    public void setCelular(Celular celular) {
        this.celular = celular;
    }
}