package tp5_Ej10;

public class Main_Ej10 {

    public static void main(String[] args) {

        // Se crea la clave de seguridad que será parte de la cuenta
        ClaveSeguridad clave = new ClaveSeguridad("X9A7B3", "2025-09-20");

        // Se crea el titular de la cuenta
        Titular titular = new Titular("Laura Gaspar", "30123456");

        // Se crea la cuenta bancaria, estableciendo composición y asociación bidireccional
        CuentaBancaria cuenta = new CuentaBancaria("0170123456789012345678", 150000.0, clave, titular);

        // Se muestra el estado de la cuenta y se verifica la relación bidireccional
        System.out.println("CBU: " + cuenta.getCbu());
        System.out.println("Saldo: $" + cuenta.getSaldo());
        System.out.println("Clave: " + cuenta.getClave().getCodigo() + " - Ultima modificacion: " + cuenta.getClave().getUltimaModificacion());
        System.out.println("Titular: " + cuenta.getTitular().getNombre() + " - DNI: " + cuenta.getTitular().getDni());
        System.out.println("Cuenta del titular: " + titular.getCuenta().getCbu());
    }
}
