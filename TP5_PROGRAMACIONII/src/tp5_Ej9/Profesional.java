package tp5_Ej9;

public class Profesional {

    private String nombre;
    private String especialidad;

    // El profesional es una entidad externa, referenciada por la cita
    public Profesional(String nombre, String especialidad) {
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }
}
