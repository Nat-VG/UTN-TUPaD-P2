package tp5_Ej2;

public class Celular {

    private String imei;
    private String marca;
    private String modelo;
    private Bateria bateria;   // Agregación: el celular tiene una batería externa
    private Usuario usuario;   // Asociación bidireccional con Usuario

    // Constructor que establece todas las relaciones
    public Celular(String imei, String marca, String modelo, Bateria bateria, Usuario usuario) {
        this.imei = imei;
        this.marca = marca;
        this.modelo = modelo;
        this.bateria = bateria;
        this.usuario = usuario;
        usuario.setCelular(this); // Enlace bidireccional
    }

    public String getImei() {
        return imei;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public Bateria getBateria() {
        return bateria;
    }

    public Usuario getUsuario() {
        return usuario;
    }
}