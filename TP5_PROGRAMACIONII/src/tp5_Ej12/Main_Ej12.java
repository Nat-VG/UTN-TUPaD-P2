package tp5_Ej12;

public class Main_Ej12 {

    public static void main(String[] args) {

        // Se crea el contribuyente
        Contribuyente contribuyente = new Contribuyente("Martina Salinas", "20-12345678-9");

        // Se crea el impuesto, asociado al contribuyente
        Impuesto impuesto = new Impuesto(12500.0, contribuyente);

        // Se crea la calculadora y se calcula el impuesto (dependencia de uso)
        Calculadora calculadora = new Calculadora();
        calculadora.calcular(impuesto);
    }
}