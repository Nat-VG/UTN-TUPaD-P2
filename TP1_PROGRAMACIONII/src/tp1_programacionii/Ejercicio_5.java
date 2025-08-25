package tp1_programacionii;

/**
 *
 * @author rogui
 */
import java.util.Scanner;

public class Ejercicio_5 {
 public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
              
        System.out.print("Ingresa el primer número entero: ");
        int numero1 = input.nextInt();
                      
        System.out.print("Ingresa el segundo número entero: ");
        int numero2 = input.nextInt();
        
        int suma = numero1 + numero2;
        int resta = numero1 - numero2;
        int multiplicacion = numero1 * numero2;
        int division = numero1 / numero2;
        
        // Mostramos resultados
        System.out.println("Resultados:");
        System.out.println(numero1 + " + " + numero2 + " = " + suma);
        System.out.println(numero1 + " - " + numero2 + " = " + resta);
        System.out.println(numero1 + " * " + numero2 + " = " + multiplicacion);
        System.out.println(numero1 + " / " + numero2 + " = " + division);
                
    }
}    

