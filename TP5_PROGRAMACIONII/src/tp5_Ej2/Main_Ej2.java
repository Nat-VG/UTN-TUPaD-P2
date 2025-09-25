package tp5_Ej2;

public class Main_Ej2 {

    public static void main(String[] args) {

        Bateria bateria = new Bateria("LitIon GX200", 5500);
        Usuario usuario = new Usuario("Alberto Rodriguez", "23232555");

        Celular celular = new Celular("356789012345678", "Samsung", "Galaxy S23", bateria, usuario);

        System.out.println("IMEI: " + celular.getImei());
        System.out.println("Marca: " + celular.getMarca());
        System.out.println("Modelo: " + celular.getModelo());
        System.out.println("Bateria: " + celular.getBateria().getModelo() + " - " + celular.getBateria().getCapacidad() + " mAh");
        System.out.println("Usuario: " + celular.getUsuario().getNombre() + " - DNI: " + celular.getUsuario().getDni());
        System.out.println("Celular del usuario: " + usuario.getCelular().getMarca() + " " + usuario.getCelular().getModelo());
    }
}