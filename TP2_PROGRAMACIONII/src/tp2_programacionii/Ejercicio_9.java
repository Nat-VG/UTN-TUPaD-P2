/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_programacionii;

import java.util.Scanner;

public class Ejercicio_9 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("CÁLCULO DEL COSTO TOTAL DE COMPRA");
        System.out.println("**********************************************");

        System.out.print("Ingrese el precio del producto: ");
        double precioProducto = input.nextDouble();

        System.out.print("Ingrese la distancia de envío en kilómetros: ");
        double distancia = input.nextDouble();

        // Se llama a calcularCostoEnvio pasando la distancia como parámetro
        double costoEnvio = calcularCostoEnvio(distancia);

        // Se llama a calcularTotalCompra pasando el precio del producto y el costo de envío
        double total = calcularTotalCompra(precioProducto, costoEnvio);

        System.out.println("Costo de envío: $" + costoEnvio);
        System.out.println("Total a pagar: $" + total);

        input.close();
    }

    // Función que recibe la distancia y devuelve el costo de envío
    public static double calcularCostoEnvio(double distancia) {
        return distancia * 5; // $5 por kilómetro
    }

    // Función que recibe el precio del producto y el costo de envío, y devuelve el total
    public static double calcularTotalCompra(double precioProducto, double costoEnvio) {
        return precioProducto + costoEnvio;
    }
}

