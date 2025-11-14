package tp7_Ej1;

public class Main_Ej1 {

    public static void main(String[] args) {
        System.out.println("TRABAJO PRÁCTICO 7 – HERENCIA Y POLIMORFISMO");
        System.out.println("**********************************************");
        System.out.println("EJERCICIO 1 – VEHÍCULO Y AUTO");
        System.out.println("");

        // Se crea un objeto Auto con marca, modelo y cantidad de puertas
        Auto auto = new Auto("Chevrolet", "Spin", 5);

        // Se muestra la información completa del auto usando polimorfismo
        auto.mostrarInfo();
    }
}
