package tp5_Ej10;

public class CuentaBancaria {

    private String cbu;
    private double saldo;
    private ClaveSeguridad clave; // Composición: la cuenta contiene la clave
    private Titular titular;      // Asociación bidireccional con Titular

    // Constructor que establece todas las relaciones
    public CuentaBancaria(String cbu, double saldo, ClaveSeguridad clave, Titular titular) {
        this.cbu = cbu;
        this.saldo = saldo;
        this.clave = clave;
        this.titular = titular;
        titular.setCuenta(this); // Enlace bidireccional
    }

    public String getCbu() {
        return cbu;
    }

    public double getSaldo() {
        return saldo;
    }

    public ClaveSeguridad getClave() {
        return clave;
    }

    public Titular getTitular() {
        return titular;
    }
}