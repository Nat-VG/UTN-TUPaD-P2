package tp7_ej5;

/**
 * Clase TarjetaCredito
 * Implementa la interfaz Pagable y simula un pago con tarjeta.
 */
public class TarjetaCredito implements Pagable {
    private String titular;

    public TarjetaCredito(String titular) {
        this.titular = titular;
    }

    @Override
    public void pagar(double monto) {
        System.out.println("Pago de $" + monto + " realizado con tarjeta de crédito a nombre de " + titular);
    }
}
