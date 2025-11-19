package ecommerce_tp8;

/**
 * Interface que logra Herencia Múltiple de Comportamiento: 
 * Hereda el contrato 'procesarPago' y añade el contrato 'aplicarDescuento'.
 */
public interface PagoConDescuento extends Pago {
    
    double aplicarDescuento(double monto, double porcentaje);

}