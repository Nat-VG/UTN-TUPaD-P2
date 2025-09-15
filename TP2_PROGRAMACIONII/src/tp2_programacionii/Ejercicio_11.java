/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_programacionii;

import java.util.Scanner;

public class Ejercicio_11 {

    // Variable global que representa el porcentaje de descuento especial usando variable global
    static double descuentoEspecial = 0.10;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("CÁLCULO DE DESCUENTO ESPECIAL");
        System.out.println("**********************************************");

        System.out.print("Ingrese el precio del producto: ");
        double precio = input.nextDouble();

        // Se llama al método calcularDescuentoEspecial pasando el precio como parámetro
        calcularDescuentoEspecial(precio);

        input.close();
    }

    // Método que recibe el precio y utiliza la variable global para calcular el descuento
    public static void calcularDescuentoEspecial(double precio) {
        // Se calcula el valor del descuento usando la variable global
        double descuentoAplicado = precio * descuentoEspecial;

        // Se calcula el precio final restando el descuento
        double precioFinal = precio - descuentoAplicado;

        // Resultado
        System.out.println("El descuento especial aplicado es: " + descuentoAplicado);
        System.out.println("El precio final con descuento es: " + precioFinal);
    }
}