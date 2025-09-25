package tp5_Ej10;

public class Titular {

    private String nombre;
    private String dni;
    private CuentaBancaria cuenta;

    public Titular(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public CuentaBancaria getCuenta() {
        return cuenta;
    }

    // Asociación bidireccional: el titular conoce su cuenta
    public void setCuenta(CuentaBancaria cuenta) {
        this.cuenta = cuenta;
    }
}