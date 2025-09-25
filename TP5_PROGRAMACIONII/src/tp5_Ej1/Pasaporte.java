package tp5_Ej1;

public class Pasaporte {

    private String numero;
    private String fechaEmision;
    private Foto foto;         // Composición: el pasaporte contiene la foto
    private Titular titular;   // Asociación bidireccional con Titular

    // Constructor que establece todas las relaciones
    public Pasaporte(String numero, String fechaEmision, Foto foto, Titular titular) {
        this.numero = numero;
        this.fechaEmision = fechaEmision;
        this.foto = foto;
        this.titular = titular;
        titular.setPasaporte(this); // Enlace bidireccional
    }

    public String getNumero() {
        return numero;
    }

    public String getFechaEmision() {
        return fechaEmision;
    }

    public Foto getFoto() {
        return foto;
    }

    public Titular getTitular() {
        return titular;
    }
}