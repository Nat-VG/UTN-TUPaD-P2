package tp6_stock;
public class Producto {
    private String id, nombre;
    private double precio;
    private int cantidad;
    private CategoriaProducto categoria;

    public Producto(String id, String nombre, double precio, int cantidad, CategoriaProducto categoria) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.categoria = categoria;
    }

    public String getId() {
        return id;
    }

    public double getPrecio() {
        return precio;
    }

 @Override
public String toString() {
    return "\nProducto" +
           "\n************************" +
           "\nID: " + id +
           "\nNombre: " + nombre +
           "\nPrecio: $" + precio +
           "\nCantidad: " + cantidad +
           "\nCategoría: " + categoria +
           "\n************************";
}
    // Método mostrarInfo
    public void mostrarInfo() {
    System.out.println(this.toString());
}

    public int getCantidad() {
        return cantidad;
    }

    public CategoriaProducto getCategoria() {
        return categoria;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    
}