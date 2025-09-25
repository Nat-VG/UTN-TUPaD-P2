package tp5_Ej1;

public class Titular {

    private String nombre;
    private String dni;
    private Pasaporte pasaporte;

    public Titular(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public Pasaporte getPasaporte() {
        return pasaporte;
    }

    // Asociación bidireccional: el titular conoce su pasaporte
    public void setPasaporte(Pasaporte pasaporte) {
        this.pasaporte = pasaporte;
    }
}