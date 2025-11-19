package ecommerce_tp8;

public class Cliente implements Notificable {
    
    private String nombre;

    // Constructor
    public Cliente(String nombre) {
        this.nombre = nombre;
    }
    
    // Getter
    public String getNombre() {
        return nombre;
    }

// Implementación del contrato Notificable
    @Override
    public void cambiarEstado(String mensaje) {
        // Se divide la salida en dos líneas para mayor claridad
        System.out.println("   [CLIENTE NOTIFICADO: " + this.nombre.toUpperCase() + "]");
        System.out.println("   -> Mensaje de estado: " + mensaje);
    }
}