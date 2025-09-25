package tp5_Ej9;

public class Main_Ej9 {

    public static void main(String[] args) {

        // Se crean las entidades externas
        Paciente paciente = new Paciente("Luciana Di Marco", "OSDE");
        Profesional profesional = new Profesional("Dr. Marcos Rojo", "Cardiologia");

        // Se crea la cita médica, asociando paciente y profesional
        CitaMedica cita = new CitaMedica("2025-09-29", "09:30", paciente, profesional);

        // Se muestra el estado de la cita y las asociaciones establecidas
        System.out.println("Fecha: " + cita.getFecha());
        System.out.println("Hora: " + cita.getHora());
        System.out.println("Paciente: " + cita.getPaciente().getNombre() + " - Obra social: " + cita.getPaciente().getObraSocial());
        System.out.println("Profesional: " + cita.getProfesional().getNombre() + " - Especialidad: " + cita.getProfesional().getEspecialidad());
    }
}