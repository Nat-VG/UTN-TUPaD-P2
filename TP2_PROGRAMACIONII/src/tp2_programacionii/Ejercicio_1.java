package tp2_programacionii;

import java.util.Scanner;

/**
 * Ejercicio 1: Verificación de Año Bisiesto
 * Un año es bisiesto si es divisible por 4, pero no por 100, salvo que sea divisible por 400.
 */
public class Ejercicio_1{
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("INFORMAR SI UN AÑO ES BISIESTO");
        System.out.println("**********************************************");
        
        System.out.print("Ingrese un año: ");
        int anio = input.nextInt();
        
        boolean esBisiesto = (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0);
        
        if (esBisiesto) {
            System.out.println("El año " + anio + " es bisiesto.");
        } else {
            System.out.println("El año " + anio + " no es bisiesto.");
        }
        
        input.close();
    }
}