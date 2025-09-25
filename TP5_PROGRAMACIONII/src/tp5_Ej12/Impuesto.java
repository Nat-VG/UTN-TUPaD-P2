package tp5_Ej12;

public class Impuesto {

    private double monto;
    private Contribuyente contribuyente; // Asociación unidireccional: el impuesto conoce al contribuyente

    public Impuesto(double monto, Contribuyente contribuyente) {
        this.monto = monto;
        this.contribuyente = contribuyente;
    }

    public double getMonto() {
        return monto;
    }

    public Contribuyente getContribuyente() {
        return contribuyente;
    }
}
