package tp6_stock;

/**
 * Enum que representa las categorías posibles de productos.
 * Cada categoría tiene una descripción asociada.
 */
public enum CategoriaProducto {
    ALIMENTOS("Productos comestibles"),
    ELECTRONICA("Dispositivos electrónicos"),
    ROPA("Prendas de vestir"),
    HOGAR("Artículos para el hogar");

    private final String descripcion;

    // Constructor privado para asignar la descripción
    private CategoriaProducto(String descripcion) {
        this.descripcion = descripcion;
    }

    // Devuelve la descripción asociada a la categoría
    public String getDescripcion() {
        return descripcion;
    }
    
    
   @Override
public String toString() {
    return name() + " - " + descripcion;
}



}