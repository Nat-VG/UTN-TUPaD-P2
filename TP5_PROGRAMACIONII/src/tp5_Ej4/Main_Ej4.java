package tp5_Ej4;

public class Main_Ej4 {

    public static void main(String[] args) {

        Banco banco = new Banco("Banco Frances", "26-25845678-9");
        Cliente cliente = new Cliente("Claudia Soto", "40584556");

        TarjetaDeCredito tarjeta = new TarjetaDeCredito("3258-5678-9012-3456", "12/28", cliente, banco);

        System.out.println("Numero de tarjeta: " + tarjeta.getNumero());
        System.out.println("Vencimiento: " + tarjeta.getFechaVencimiento());
        System.out.println("Cliente: " + tarjeta.getCliente().getNombre() + " - DNI: " + tarjeta.getCliente().getDni());
        System.out.println("Banco: " + tarjeta.getBanco().getNombre() + " - CUIT: " + tarjeta.getBanco().getCuit());
        System.out.println("Tarjeta del cliente: " + cliente.getTarjeta().getNumero());
    }
}