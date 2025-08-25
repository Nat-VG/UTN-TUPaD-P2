
package tp1_programacionii;

/**
 *
 * @author rogui
 */
// Importamos la clase Scanner
import java.util.Scanner;


public class Ejercicio_4 {
    
    public static void main(String[] args) {
        
        //Se crea un objeto scanner para lectura de datos
        Scanner input = new Scanner(System.in);
        String nombre;
        int edad;
        System.out.print("Ingresa tu nombre: ");
        nombre= input.nextLine(); 
        System.out.print("Ingresa tu edad: ");
        edad= Integer.parseInt(input.nextLine()); 
        // Mostramos los datos
        System.out.println("Hola " + nombre + ", tenes " + edad + " años.");
        
    }
}  