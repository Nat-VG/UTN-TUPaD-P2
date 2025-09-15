/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_programacionii;

import java.util.Scanner;

public class Ejercicio_3 {
 public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("CLASIFICACIÓN SEGÚN LA EDAD");
        System.out.println("**********************************************");

        System.out.print("Ingrese su edad: ");
        int edad = input.nextInt();

        String etapa;

        if (edad < 0) {
            etapa = "Edad inválida";
        } else if (edad < 13) {
            etapa = "Niñez";
        } else if (edad < 18) {
            etapa = "Adolescencia";
        } else if (edad < 60) {
            etapa = "Adultez";
        } else {
            etapa = "Adulto mayor";
        }

        System.out.println("Etapa de vida: " + etapa);

        input.close();
    }
    
}
