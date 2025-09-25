package tp5_Ej6;

public class Main_Ej6 {

    public static void main(String[] args) {

        Mesa mesa = new Mesa(12, 4);
        Cliente cliente = new Cliente("Valentina Ruiz");

        Reserva reserva = new Reserva("2025-10-09", "21:30", mesa, cliente);

        System.out.println("Fecha de reserva: " + reserva.getFecha());
        System.out.println("Hora: " + reserva.getHora());
        System.out.println("Mesa: " + reserva.getMesa().getNumero());
        System.out.println("Cliente: " + reserva.getCliente().getNombre());
    }
}