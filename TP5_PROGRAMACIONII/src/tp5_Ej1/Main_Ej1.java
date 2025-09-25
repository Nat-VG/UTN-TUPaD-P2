package tp5_Ej1;

public class Main_Ej1 {

    public static void main(String[] args) {

        Foto foto = new Foto("foto_macela.jpg", "JPEG");
        Titular titular = new Titular("Marcela Arroyo", "26584550");

        Pasaporte pasaporte = new Pasaporte("B544445678", "2025-09-10", foto, titular);

        System.out.println("Numero: " + pasaporte.getNumero());
        System.out.println("Fecha de emision: " + pasaporte.getFechaEmision());
        System.out.println("Formato de foto: " + pasaporte.getFoto().getFormato());
        System.out.println("Titular: " + pasaporte.getTitular().getNombre());
        System.out.println("Pasaporte del titular: " + titular.getPasaporte().getNumero());
    }
}