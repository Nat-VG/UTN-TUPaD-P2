/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp1_programacionii;

/**
 *
 * @author rogui
 */
import java.util.Scanner;
public class Ejercicio_9 {

public static void main(String[] args) { Scanner scanner = new Scanner(System.in); 
//System.out.print("Ingresa tu nombre: "); String nombre = scanner.nextInt(); // ERROR 
  // ERROR: scanner.nextInt() se usa para leer enteros, no texto
  // SOLUCIÓN: usar nextLine() para leer texto
System.out.print("Ingresa tu nombre: "); String nombre = scanner.nextLine();
System.out.println("Hola, " + nombre);
}
}
    

