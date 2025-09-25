package tp5_Ej5;

public class Main_Ej5 {

    public static void main(String[] args) {

        PlacaMadre placa = new PlacaMadre("ASUS50M-S3H", "ASUS");
        Propietario propietario = new Propietario("Belo Mendez");

        Computadora pc = new Computadora("Hewllet Packard", placa, propietario);

        System.out.println("Marca: " + pc.getMarca());
        System.out.println("Placa madre: " + pc.getPlacaMadre().getModelo());
        System.out.println("Propietario: " + pc.getPropietario().getNombre());
        System.out.println("Computadora del propietario: " + propietario.getComputadora().getMarca());
    }
}