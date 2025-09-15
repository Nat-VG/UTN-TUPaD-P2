/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_programacionii;
import java.util.Scanner;

public class Ejercicio_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("SUMA DE NÚMEROS PARES");
        System.out.println("**********************************************");

        int numero = 1; // Inicializamos con un valor distinto de 0 para entrar al bucle
        int sumaPares = 0;

        while (numero != 0) {
            System.out.print("Ingrese un número (0 para terminar): ");
            numero = input.nextInt();

            if (numero % 2 == 0 && numero != 0) {
                sumaPares += numero;
            }
        }

        System.out.println("La suma de los números pares es: " + sumaPares);

        input.close();
    }
}
