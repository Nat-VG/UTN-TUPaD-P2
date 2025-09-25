package tp5_Ej12;

public class Calculadora {

    // Dependencia de uso: la calculadora usa el impuesto como parámetro, pero no lo guarda
    public void calcular(Impuesto impuesto) {
        System.out.println("Calculando impuesto de $" + impuesto.getMonto() +
                           " para el contribuyente " + impuesto.getContribuyente().getNombre());
    }
}
