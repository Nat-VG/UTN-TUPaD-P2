package tp6_stock;

import java.util.ArrayList;

public class Inventario {
    private ArrayList<Producto> producto;
    
    public Inventario() {
        this.producto = new ArrayList<>();
    }
    // Método para agregar productos al inventario
    public void agregarProducto(Producto producto){
        this.producto.add(producto);
    }
    
    // Método para listar productos
    public void listarProductos(){
        for (Producto producto : producto) {
            System.out.println(producto);
        }
    }
    
    // buscar productos por Id
    public Producto buscarProductoPorID(String id){
        int i = 0;
        Producto prodEncontrado = null;
        while (i < producto.size() && !this.producto.get(i).getId().equalsIgnoreCase(id)){
            i++;
        }
        if (i < producto.size()) {
            prodEncontrado = this.producto.get(i);
        }
        return prodEncontrado;
    
}        
    // Método para eliminar productos
    public Producto eliminarProducto(String id){
        Producto prodABorrar = buscarProductoPorID(id);
        this.producto.remove(prodABorrar);
        return prodABorrar;
    }
    
    // Método para actualizar stock
    public void actualizarStock(String id, int nuevaCantidad){
        Producto prodAActualizarStock = buscarProductoPorID(id);
        if (prodAActualizarStock == null) {
            System.out.println("El producto no existe.");
        } else{
             prodAActualizarStock.setCantidad(nuevaCantidad);
            System.out.println("Stock del producto ID: " + prodAActualizarStock.getId() + ", actualizado a: " + nuevaCantidad);
        }
    }
    // Método para filtrar por categoria
    public ArrayList<Producto> filtrarPorCategoria(CategoriaProducto categoria){
        ArrayList<Producto> prodFiltrados = new ArrayList<>();
        for (Producto producto : this.producto) {
            if (producto.getCategoria() == categoria) {
                prodFiltrados.add(producto);
            }
        }
        return prodFiltrados;
    }
    // Método para obtener el total de stock de todos los productos
    public void obtenerTotalStock(){
        int total = 0;
        for (Producto producto : this.producto) {
            total += producto.getCantidad();
        }
        System.out.println("El total de stock disponible es: " + total);
    }
    // Método para obtener el producto con mayor stock
    public Producto obtenerProductoConMayorStock(){
        Producto productoMayor = null;
        int max=0;
        for (Producto producto : this.producto) {
            if (producto.getCantidad() > max) {
                productoMayor = producto;
                max = producto.getCantidad();
            }
        }
        return productoMayor;
    }
    // Método para filtrar productos por precios
    public ArrayList<Producto> filtrarProductosPorPrecio(double min, double max){
        ArrayList<Producto> filtro = new ArrayList<>();
        for (Producto producto : this.producto) {
            if (producto.getPrecio() <= max && producto.getPrecio() >= min) {
                filtro.add(producto);
            } 
        }
        if (filtro.isEmpty()) {
                System.out.println("No se encontraron productos con ese filtro de precio.");
            }
        return filtro;
    }
    // Método para obtener las categorías disponibles
    public void mostrarCategoriasDisponibles(){
        for (CategoriaProducto categoria : CategoriaProducto.values()) {
            System.out.println(categoria);
        }
    }
}   