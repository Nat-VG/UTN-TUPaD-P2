/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_programacionii;

public class Ejercicio_12 {

    public static void main(String[] args) {
        System.out.println("REGISTRO Y MODIFICACIÓN DE PRECIOS");
        System.out.println("**********************************************");

        // Se declara el array con los precios directamente asignados
        double[] precioProducto = {199.99, 299.5, 149.75, 89.99, 79.99};

        // Se muestra el array original
        System.out.println("Precios originales:");
        mostrarPrecios(precioProducto);

        // Se modifica el precio de la posición 2 (índice 2)
        precioProducto[2] = 129.99;

        // Se muestra el array modificado
        System.out.println("Precios modificados:");
        mostrarPrecios(precioProducto);
    }


    // Método que muestra los precios, utilce for-each
    public static void mostrarPrecios(double[] precios) {
        for (double precio : precios) {
            System.out.println("Precio: $" + precio);
        }
    }
}
