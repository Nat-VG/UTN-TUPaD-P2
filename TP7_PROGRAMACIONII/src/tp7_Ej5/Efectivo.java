package tp7_ej5;

/**
 * Clase Efectivo
 * Implementa la interfaz Pagable y simula un pago en efectivo.
 */
public class Efectivo implements Pagable {
    @Override
    public void pagar(double monto) {
        System.out.println("Pago en efectivo de $" + monto);
    }
}
