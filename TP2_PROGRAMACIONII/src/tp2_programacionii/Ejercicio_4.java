/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_programacionii;

import java.util.Scanner;

public class Ejercicio_4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("CALCULADORA DE DESCUENTO SEGÚN CATEGORÍA");
        System.out.println("**********************************************");

        System.out.print("Ingrese el precio del producto: ");
        double precioOriginal = input.nextDouble();

        System.out.print("Ingrese la categoría del producto (A, B o C): ");
        char categoria = input.next().toUpperCase().charAt(0);

        double descuentoPorcentaje = 0;

        switch (categoria) {
            case 'A':
                descuentoPorcentaje = 10;
                break;
            case 'B':
                descuentoPorcentaje = 15;
                break;
            case 'C':
                descuentoPorcentaje = 20;
                break;
        }

        double descuento = (precioOriginal * descuentoPorcentaje) / 100;
        double precioFinal = precioOriginal - descuento;

        System.out.println("Descuento aplicado: " + descuentoPorcentaje + "%");
        System.out.println("Precio final: " + precioFinal);

        input.close();
    }
}