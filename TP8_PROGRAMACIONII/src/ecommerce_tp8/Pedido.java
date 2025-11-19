package ecommerce_tp8;

import java.util.ArrayList;

public class Pedido implements Pagable, Notificable {
    
    private ArrayList<Producto> productos;
    private String estado;
    private Cliente cliente; // Asociación con Cliente

    // Constructor
    public Pedido(String estadoInicial, Cliente cliente) {
        this.productos = new ArrayList<>();
        this.estado = estadoInicial;
        this.cliente = cliente;
    }

    // Método de gestión
    public void agregarProducto(Producto p) {
        this.productos.add(p);
    }

    // Implementación del contrato Pagable
    @Override
    public double calcularTotal() {
        double total = 0;
        // Recorremos la colección de productos
        for (Producto p : this.productos) {
            total += p.getPrecio(); 
        }
        return total;
    }

    // Implementación del contrato Notificable
    @Override
    public void cambiarEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
        
        // El pedido notifica al cliente asociado (Asociación)
        String mensajeNotificacion = "El estado de su pedido ha cambiado a: " + this.estado;
        this.cliente.cambiarEstado(mensajeNotificacion);
    }
    
    // Getter del estado
    public String getEstado() {
        return estado;
    }
}