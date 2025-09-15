/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_programacionii;

public class Ejercicio_13 {

    public static void main(String[] args) {
        System.out.println("IMPRESIÓN RECURSIVA DE PRECIOS");
        System.out.println("**********************************************");

        // Se declara e inicializa el array con los precios
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};

        // Se muestra el array original usando función recursiva
        System.out.println("Precios originales:");
        mostrarPreciosRecursivo(precios, 0);

        // Se modifica el precio de la posición 2 (índice 2)
        precios[2] = 129.99;

        // Se muestra el array modificado usando otra función recursiva
        System.out.println("Precios modificados:");
        mostrarPreciosRecursivo(precios, 0);
    }

    // Función recursiva que muestra los precios del array desde el índice actual
    public static void mostrarPreciosRecursivo(double[] precios, int indice) {
        // Caso base: si el índice supera el tamaño del array, se termina la recursión
        if (indice >= precios.length) {
            return;
        }

        // Se muestra el precio actual
        System.out.println("Precio: $" + precios[indice]);

        // Llamada recursiva para el siguiente elemento
        mostrarPreciosRecursivo(precios, indice + 1);
    }
}