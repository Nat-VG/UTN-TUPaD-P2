package ecommerce_tp8;

public class ECommerce {

    public static void main(String[] args) {
        
        // ===========================================
        // ETAPA 1: INICIALIZACIÓN Y ARMADO DEL PEDIDO
        // ===========================================
        System.out.println("=================================================");
        System.out.println("INICIO DEL PROCESO DE E-COMMERCE");
        System.out.println("=================================================");
        
        // 1. Crear Entidades
        Producto mouse = new Producto("Cable HDMI", 7500.0);
        Producto teclado = new Producto("Teclado Mecanico", 15000.0);
        Producto monitor = new Producto("Impesora HP Deskjet 1600", 85000.0);
        
        Cliente clienteNuevo = new Cliente("Ignacio Rodriguez");
        
        // 2. Crear Pedido y agregar productos
        Pedido pedidoNuevo = new Pedido("INICIADO", clienteNuevo);
        pedidoNuevo.agregarProducto(mouse);
        pedidoNuevo.agregarProducto(teclado);
        pedidoNuevo.agregarProducto(monitor);
        
        System.out.println("Pedido creado para: " + clienteNuevo.getNombre());
        System.out.println("Estado inicial: " + pedidoNuevo.getEstado());
        System.out.println("-------------------------------------------------");
        
        // 3. Demostración de Pagable
        // Usamos el tipo Pagable para calcular el monto
        Pagable itemParaCobrar = pedidoNuevo;
        double montoInicial = itemParaCobrar.calcularTotal();
        
        System.out.printf("MONTO TOTAL DEL PEDIDO (Sin Descuento): $%.2f%n", montoInicial);
        System.out.println("=================================================");

        
        // ===========================================
        // ETAPA 2: PROCESAMIENTO DE PAGO CON DESCUENTO
        // ===========================================

        // 4. Demostración con Tarjeta de Crédito
        System.out.println("\nPRUEBA 1: PAGO CON TARJETA DE CREDITO");
        System.out.println("-------------------------------------------------");
        
        PagoConDescuento medioPagoTC = new TarjetaCredito();
        double porcentajeDescuentoTC = 15.0;
        
        double montoFinalTarjeta = medioPagoTC.aplicarDescuento(montoInicial, porcentajeDescuentoTC);
        
        System.out.printf("   Descuento aplicado (%.0f%%): $%.2f%n", porcentajeDescuentoTC, (montoInicial - montoFinalTarjeta));
        medioPagoTC.procesarPago(montoFinalTarjeta);
        System.out.printf("   MONTO FINAL COBRADO: $%.2f%n", montoFinalTarjeta);
        
        // 5. Notificación de cambio de estado
        System.out.println("-------------------------------------------------");
        pedidoNuevo.cambiarEstado("PAGO APROBADO Y EN PREPARACION");
        System.out.println("=================================================");
        
        
        // 6. Demostración con PayPal
        System.out.println("\nPRUEBA 2: PAGO CON PAYPAL");
        System.out.println("-------------------------------------------------");
        
        PagoConDescuento medioPagoPP = new PayPal();
        double porcentajeDescuentoPP = 5.0;
        
        double montoFinalPayPal = medioPagoPP.aplicarDescuento(montoInicial, porcentajeDescuentoPP);
        
        System.out.printf("   Descuento aplicado (%.0f%%): $%.2f%n", porcentajeDescuentoPP, (montoInicial - montoFinalPayPal));
        medioPagoPP.procesarPago(montoFinalPayPal);
        System.out.printf("   MONTO FINAL COBRADO: $%.2f%n", montoFinalPayPal);
        
        System.out.println("=================================================");
        System.out.println("PROCESO DE E-COMMERCE FINALIZADO");
        System.out.println("=================================================");
    }
}