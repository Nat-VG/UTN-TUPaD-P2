package ecommerce_tp8;

/**
 * Contrato base para cualquier medio de pago.
 */
public interface Pago {
    
    void procesarPago(double monto);

}