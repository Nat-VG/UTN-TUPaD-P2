package tp8_division_segura;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisionSegura {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); 
        int resultado = 0; 

        try {
            System.out.print("Ingrese el numerador: ");
            int num1 = teclado.nextInt();

            System.out.print("Ingrese el denominador (divisor): ");
            int num2 = teclado.nextInt();

            // La división por cero lanza ArithmeticException (Unchecked)
            resultado = num1 / num2; 

            System.out.println("Resultado de la division: " + resultado);
        
        } catch (ArithmeticException e) {
            System.err.println("ERROR ARITMETICO! No se puede dividir por cero.");
            
        } catch (InputMismatchException e) {
            // Capturamos si el usuario ingresa texto en lugar de números
            System.err.println("ERROR DE ENTRADA! Por favor, ingrese solo numeros enteros.");
            
        } finally {
            // El 'finally' se ejecuta siempre, asegurando el cierre del recurso
            teclado.close();
            System.out.println("\n-> Fin del programa.");
        }
    }
}