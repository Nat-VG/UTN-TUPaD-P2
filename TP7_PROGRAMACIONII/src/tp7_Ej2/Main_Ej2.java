package tp7_Ej2;

import java.util.ArrayList;

public class Main_Ej2 {

    public static void main(String[] args) {
        System.out.println("=== TRABAJO PRÁCTICO 7 – HERENCIA Y POLIMORFISMO ===");
        System.out.println("Ejercicio 2: Figuras geométricas");
        System.out.println("---------------------------------------------");
        System.out.println("");

        // Creo una lista de figuras (uso polimorfismo)
        ArrayList<Figura> figuras = new ArrayList<>();

        // Agrego distintas figuras a la lista
        figuras.add(new Rectangulo("Rectángulo", 14, 8));
        figuras.add(new Circulo("Círculo", 8));

        // Recorro la lista y muestro el área de cada figura
        for (Figura f : figuras) {
            System.out.println("Área de " + f.getNombre() + ": " + f.calcularArea());
        }
    }
}
