package ecommerce_tp8;

public class Producto implements Pagable {
    
    private String nombre;
    private double precio;

    // Constructor para inicializar atributos
    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    // Getter necesario para acceder al precio desde el Pedido
    public double getPrecio() {
        return precio;
    }

    // Implementación del contrato Pagable
    @Override
    public double calcularTotal() {
        // Un producto tiene como total su propio precio
        return this.precio;
    }
}