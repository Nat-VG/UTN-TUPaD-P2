package tp7_ej4;

import java.util.ArrayList;

public class Main_Ej4 {

    public static void main(String[] args) {
        System.out.println("=== TRABAJO PRÁCTICO 7 – HERENCIA Y POLIMORFISMO ===");
        System.out.println("Ejercicio 4: Animales y comportamiento sobrescrito");
        System.out.println("---------------------------------------------");
        System.out.println("");

        // Creo una lista de animales (uso polimorfismo)
        ArrayList<Animal> animales = new ArrayList<>();

        // Agrego distintos tipos de animales
        animales.add(new Perro("Firulais"));
        animales.add(new Gato("Michi"));
        animales.add(new Vaca("Lola"));

        // Recorro la lista y muestro sonido y descripción de cada animal
        for (Animal a : animales) {
            System.out.println(a.getNombre() + " dice: " + a.hacerSonido());
            System.out.println("Descripción: " + a.describirAnimal());
            System.out.println("");
        }
    }
}
