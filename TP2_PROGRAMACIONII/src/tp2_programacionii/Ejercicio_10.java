/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_programacionii;

import java.util.Scanner;

public class Ejercicio_10 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("ACTUALIZACIÓN DE STOCK");
        System.out.println("**********************************************");

        System.out.print("Ingrese el stock actual del producto: ");
        int stockActual = input.nextInt();

        System.out.print("Ingrese la cantidad vendida: ");
        int cantidadVendida = input.nextInt();

        System.out.print("Ingrese la cantidad recibida: ");
        int cantidadRecibida = input.nextInt();

        // Se llama al método actualizarStock pasando los tres valores como parámetros
        int nuevoStock = actualizarStock(stockActual, cantidadVendida, cantidadRecibida);

        System.out.println("El nuevo stock del producto es: " + nuevoStock);

        input.close();
    }

    // Método que recibe el stock actual, la cantidad vendida y la cantidad recibida
    // y devuelve el nuevo stock calculado
    public static int actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida) {
        // Se resta la cantidad vendida al stock actual
        int stockDespuesDeVenta = stockActual - cantidadVendida;

        // Se suma la cantidad recibida al resultado anterior
        int nuevoStock = stockDespuesDeVenta + cantidadRecibida;

        // Se devuelve el nuevo stock
        return nuevoStock;
    }
}
