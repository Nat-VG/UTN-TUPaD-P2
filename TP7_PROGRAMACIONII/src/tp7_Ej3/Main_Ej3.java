package tp7_ej3;

import java.util.ArrayList;

public class Main_Ej3 {

    public static void main(String[] args) {
        System.out.println("=== TRABAJO PRÁCTICO 7 – HERENCIA Y POLIMORFISMO ===");
        System.out.println("Ejercicio 3: Empleados y polimorfismo");
        System.out.println("---------------------------------------------");
        System.out.println("");

        // Creo una lista de empleados (uso polimorfismo)
        ArrayList<Empleado> empleados = new ArrayList<>();

        // Agrego distintos tipos de empleados
        empleados.add(new EmpleadoPlanta("Martina Stoessel", 1890000));
        empleados.add(new EmpleadoTemporal("Marcelo Tinelli", 5900, 172));

        // Recorro la lista y muestro el sueldo de cada empleado
        for (Empleado e : empleados) {
            System.out.println("Empleado: " + e.getNombre() + " | Sueldo: $" + e.calcularSueldo());

            // Clasificación con instanceof
            if (e instanceof EmpleadoPlanta) {
                System.out.println(" -> Es un empleado de planta.");
            } else if (e instanceof EmpleadoTemporal) {
                System.out.println(" -> Es un empleado temporal.");
            }
            System.out.println("");
        }
    }
}
