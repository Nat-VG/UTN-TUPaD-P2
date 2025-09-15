/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_programacionii;

import java.util.Scanner;

public class Ejercicio_8 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("CÁLCULO DEL PRECIO FINAL CON IMPUESTO Y DESCUENTO");
        System.out.println("**********************************************");

        System.out.print("Ingrese el precio base del producto: ");
        double precioBase = input.nextDouble();

        System.out.print("Ingrese el impuesto en porcentaje (Ejemplo: 10 para 10%): ");
        double impuesto = input.nextDouble();

        System.out.print("Ingrese el descuento en porcentaje (Ejemplo: 5 para 5%): ");
        double descuento = input.nextDouble();

         // Llamamos a la función calcularPrecioFinal y guarda el resultado
        double precioFinal = calcularPrecioFinal(precioBase, impuesto, descuento);

        System.out.println("El precio final del producto es: $" + precioFinal);

        input.close();
    }

   
    public static double calcularPrecioFinal(double precioBase, double impuesto, double descuento) {
        // Aplicamos el impuesto y luego restamos el descuento sobre el precio base
        double precioFinal = precioBase + (precioBase * impuesto / 100) - (precioBase * descuento / 100);
        return precioFinal;
    }
}