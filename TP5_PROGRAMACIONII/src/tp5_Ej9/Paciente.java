package tp5_Ej9;

public class Paciente {

    private String nombre;
    private String obraSocial;

    // El paciente es una entidad externa, referenciada por la cita
    public Paciente(String nombre, String obraSocial) {
        this.nombre = nombre;
        this.obraSocial = obraSocial;
    }

    public String getNombre() {
        return nombre;
    }

    public String getObraSocial() {
        return obraSocial;
    }
}
