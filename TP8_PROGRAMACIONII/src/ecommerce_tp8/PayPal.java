package ecommerce_tp8;

public class PayPal implements PagoConDescuento {
    
    // Implementación del contrato PagoConDescuento (Lógica de descuento CORRECTA)
    @Override
    public double aplicarDescuento(double monto, double porcentaje) {
        double descuento = monto * (porcentaje / 100.0);
        return monto - descuento;
    }
 
    // Implementación del contrato Pago
    @Override
    public void procesarPago(double montoFinal) {
        System.out.println("--- PROCESANDO PAGO con PayPal ---");
        System.out.println("Monto final a cobrar: $" + montoFinal);
        System.out.println("Pago de PayPal completado exitosamente.");
    }
}