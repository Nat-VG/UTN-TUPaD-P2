package tp5_Ej9;

public class CitaMedica {

    private String fecha;
    private String hora;
    private Paciente paciente;       // Asociación unidireccional con Paciente
    private Profesional profesional; // Asociación unidireccional con Profesional

    // La cita médica se crea con referencias a paciente y profesional
    public CitaMedica(String fecha, String hora, Paciente paciente, Profesional profesional) {
        this.fecha = fecha;
        this.hora = hora;
        this.paciente = paciente;
        this.profesional = profesional;
    }

    public String getFecha() {
        return fecha;
    }

    public String getHora() {
        return hora;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public Profesional getProfesional() {
        return profesional;
    }
}
