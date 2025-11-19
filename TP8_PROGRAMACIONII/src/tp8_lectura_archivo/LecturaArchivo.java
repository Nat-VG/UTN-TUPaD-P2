package excepciones_tp8.archivo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LecturaArchivo {
    
    public static void main(String[] args) {
     
        String ruta = "C:\\PRUEBATP8.txt"; 
        File archivo = new File(ruta);
        
        // Declaramos los recursos fuera del try para que sean accesibles en el finally
        FileReader fr = null;
        BufferedReader br = null;

        try {
            System.out.println("--- Iniciando lectura de archivo ---");
            
            // Inicializacion de recursos (puede lanzar FileNotFoundException)
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);
            
            String linea;
            System.out.println("Contenido:");
            
            // Leemos linea por linea (puede lanzar IOException)
            while ((linea = br.readLine()) != null) { 
                System.out.println("  > " + linea);
            }
        
        } catch (FileNotFoundException e) {
            // Captura si el archivo no existe en la ruta especificada
            System.err.println("X ERROR: No se encontro el archivo. Verifique la ruta.");
            
        } catch (IOException e) {
            // Captura errores generales de entrada/salida durante la lectura
            System.err.println("! ERROR: Fallo la lectura del archivo.");
            
        } finally {
            // El bloque finally es OBLIGATORIO para cerrar recursos en el enfoque tradicional
            try {
                if (br != null) {
                    br.close();
                    System.out.println("\nOK Recurso BufferedReader cerrado.");
                }
            } catch (IOException e) {
                System.err.println("Error al cerrar el recurso.");
            }
        }
    }
}