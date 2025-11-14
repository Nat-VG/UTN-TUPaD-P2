package tp6_stock;

/**
 * Clase principal que prueba todas las funcionalidades del sistema de stock.
 */

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Inventario inventario = new Inventario();
        
        CargarInventario(inventario);
        System.out.println("Lista de productos:");
        inventario.listarProductos();
        System.out.println("");      
        // Antes de buscar el producto verificamos que exista para que no de NullPointerException
        Producto prodExiste = inventario.buscarProductoPorID("1e");
        if(prodExiste == null){
            System.out.println("El producto no existe.");
        } else {
            System.out.println("Producto encontrado:");
            prodExiste.mostrarInfo();
        }
        System.out.println(""); 
        System.out.println("Filro por categoría: ");
        ArrayList<Producto> alimentos = inventario.filtrarPorCategoria(CategoriaProducto.ROPA);
        for (Producto p : alimentos) {
            p.mostrarInfo();
        }
        System.out.println("");
        Producto prodBorrado = inventario.eliminarProducto("1r");
        System.out.println("Se borró: " +prodBorrado );
        System.out.println("\nProductos restantes:");
        inventario.listarProductos();
        
        System.out.println("");
        
        inventario.actualizarStock("1a", 10);
        
        System.out.println("");
        inventario.obtenerTotalStock();
        
        System.out.println("");
        Producto prodMayorStock = inventario.obtenerProductoConMayorStock();
        System.out.println("El producto con mayor stock es: " + prodMayorStock);
        
        System.out.println("");
        ArrayList<Producto> filtro = inventario.filtrarProductosPorPrecio(1000, 3000);
        for (Producto producto : filtro) {
            producto.mostrarInfo();
        }
        System.out.println("");
        inventario.mostrarCategoriasDisponibles();

    }
  public static void CargarInventario(Inventario inventario) {
    // Carga de Alimentos
    inventario.agregarProducto(new Producto("1A", "Pan Integral", 1300, 5, CategoriaProducto.ALIMENTOS));
    inventario.agregarProducto(new Producto("2A", "Galletas de Avena", 1600, 8, CategoriaProducto.ALIMENTOS));
    inventario.agregarProducto(new Producto("3A", "Yerba Mate", 2200, 6, CategoriaProducto.ALIMENTOS));

    // Carga de Electrónica
    inventario.agregarProducto(new Producto("1E", "Smartwatch Deportivo", 18500, 4, CategoriaProducto.ELECTRONICA));
    inventario.agregarProducto(new Producto("2E", "Parlante Portátil", 11200, 6, CategoriaProducto.ELECTRONICA));
    inventario.agregarProducto(new Producto("3E", "Cargador USB-C", 3200, 10, CategoriaProducto.ELECTRONICA));

    // Carga de Ropa
    inventario.agregarProducto(new Producto("1R", "Buzo con Capucha", 9800, 7, CategoriaProducto.ROPA));
    inventario.agregarProducto(new Producto("2R", "Zapatillas Urbanas", 21500, 5, CategoriaProducto.ROPA));
    inventario.agregarProducto(new Producto("3R", "Gorra Deportiva", 4200, 9, CategoriaProducto.ROPA));

    // Carga de Hogar
    inventario.agregarProducto(new Producto("1H", "Cafetera Eléctrica", 15800, 3, CategoriaProducto.HOGAR));
    inventario.agregarProducto(new Producto("2H", "Cortinas Blackout", 8700, 4, CategoriaProducto.HOGAR));
    inventario.agregarProducto(new Producto("3H", "Almohadas Viscoelásticas", 10200, 6, CategoriaProducto.HOGAR));
}

}