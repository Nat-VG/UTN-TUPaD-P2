
package tp4_programacionii;

public class TP4_PROGRAMACIONII {
    public static void main(String[] args) {
        System.out.println("TRABAJO PRACTICO 4 – POO");
        System.out.println("**********************************************");
        System.out.println("");
        System.out.println("------------------------------------------------------");
        System.out.println("EJERCICIO – EMPLEADO");
        System.out.println("------------------------------------------------------");
        
        // Se crea un empleado con constructor completo
        Empleado e1 = new Empleado(100, "Natalia Gutierrez", "Analista", 750000);

        //Se crea un empleado con constructor sobrecargado (salario base)
        Empleado e2 = new Empleado("Ignacio Rodriguez", "Desarrollador");

        //Se muestra la información inicial de ambos empleados
        System.out.println("------ESTADO INICIAL------");
        e1.mostrarInfo();
        System.out.println("--------------------------");
        e2.mostrarInfo();
        System.out.println("--------------------------");

        //Se aplican aumentos de salario
         System.out.println("--------------------------");
        System.out.println("     AUMENTANDO SALARIO");
         System.out.println("--------------------------");
        e1.aumentarSalario(10.0);     // Aumento por porcentaje
        e2.aumentarSalario(50000);   // Aumento por monto fijo

        // Se muestra la información actualizada
        System.out.println("    ESTADO ACTUALIZADO");
         System.out.println("--------------------------");
        e1.mostrarInfo();
        System.out.println("-------------------------------");
        e2.mostrarInfo();
        System.out.println("-------------------------------");

        // Se muestra la cantidad total de empleados creados
        System.out.println("------TOTAL DE EMPLEADOS------");
        System.out.println("Total de empleados creados: " + Empleado.mostrarTotalEmpleados());
        System.out.println("--------------------------------");
    }
}
