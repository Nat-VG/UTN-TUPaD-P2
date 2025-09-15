package tp1_programacionii;

/**
 * @author rogui
 */
import java.util.Scanner;
public class Ejercicio_8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("DIVISIÓN NÚMEROS ENTEROS");
        System.out.print("Ingresa el primer número entero: ");
        int num1Int = input.nextInt();
        System.out.print("Ingresa el segundo número entero: ");
        int num2Int = input.nextInt();
        
        int resultadoInt = num1Int / num2Int;
        System.out.println();        
        System.out.println("Division con numero enteros: " + num1Int + " / " + num2Int + " = " + resultadoInt);
        System.out.println();
        System.out.println("DIVISIÓN NÚMEROS DECIMALES");       
        
        // Conversión a double para división decimal
        double divisionDecimal = (double) num1Int / num2Int;
        System.out.println();
        System.out.println("División con números decimales: " + divisionDecimal);
        System.out.println();
        System.out.println("Division Entera: " + resultadoInt + "\nDivisión Decimal: " + divisionDecimal );
    }    
}
