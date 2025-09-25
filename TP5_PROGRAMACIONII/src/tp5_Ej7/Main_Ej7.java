package tp5_Ej7;

public class Main_Ej7 {

    public static void main(String[] args) {

        // Se crea el motor que será parte del vehículo
        Motor motor = new Motor("Diesel", "MTR-987654");

        // Se crea el conductor del vehículo
        Conductor conductor = new Conductor("Mateo Ramirez", "B123456");

        // Se crea el vehículo, estableciendo composición y asociación bidireccional
        Vehiculo vehiculo = new Vehiculo("AB777CD", "Chevrolet", motor, conductor);

        // Se muestra el estado del vehículo y se verifica la relación bidireccional
        System.out.println("Patente: " + vehiculo.getPatente());
        System.out.println("Marca: " + vehiculo.getMarca());
        System.out.println("Motor: " + vehiculo.getMotor().getTipo() + " - Nº Serie: " + vehiculo.getMotor().getNumeroSerie());
        System.out.println("Conductor: " + vehiculo.getConductor().getNombre());
        System.out.println("Vehículo del conductor: " + conductor.getVehiculo().getMarca());
    }
}