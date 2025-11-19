package tp8_conversion_cadena;

import java.util.Scanner;

public class ConversionCadena {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String texto;
        
        try {
            System.out.print("Ingrese una cadena para convertir a entero: ");
            texto = teclado.nextLine();
            
            // parseInt lanza NumberFormatException si el texto no es un número válido (Unchecked)
            int numero = Integer.parseInt(texto);
            
            System.out.println("CONVERSION EXITOSA! El valor entero es: " + numero);
        
        } catch (NumberFormatException e) {
            System.err.println("ERROR DE FORMATO! La cadena ingresada no se pudo convertir a numero entero.");
        
        } finally {
            teclado.close();
            System.out.println("\n-> Fin del programa de conversión.");
        }
    }
}