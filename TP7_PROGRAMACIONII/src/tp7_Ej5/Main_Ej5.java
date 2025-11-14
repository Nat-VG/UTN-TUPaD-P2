package tp7_ej5;

public class Main_Ej5 {

    // Método genérico que procesa cualquier forma de pago
    public static void procesarPago(Pagable medio, double monto) {
        medio.pagar(monto);
    }

    public static void main(String[] args) {
        System.out.println("=== TRABAJO PRÁCTICO 7 – HERENCIA Y POLIMORFISMO ===");
        System.out.println("Ejercicio 5: Sistema de pagos con polimorfismo");
        System.out.println("---------------------------------------------");
        System.out.println("");

        // Distintas formas de pago
        Pagable pago1 = new TarjetaCredito("Alejandro Sanz");
        Pagable pago2 = new Transferencia("Christina Aguilera");
        Pagable pago3 = new Efectivo();

        // Procesar pagos con una sola función
        procesarPago(pago1, 95000);
        procesarPago(pago2, 56000);
        procesarPago(pago3, 15800);
    }
}
