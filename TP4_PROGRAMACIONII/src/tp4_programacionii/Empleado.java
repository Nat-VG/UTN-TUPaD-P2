package tp4_programacionii;

public class Empleado {
    // ATRIBUTOS CON ENCAPSULAMIENTO
    private int id;
    private String nombre;
    private String puesto;
    private double salario;

    // Atributo estático para contar empleados creados
    private static int totalEmpleados = 0;

    // Constructor completo con todos los atributos
    public Empleado(int id, String nombre, String puesto, double salario) {
        //usamos THIS para distinguir parametros de atributos
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        totalEmpleados++; // Se incrementa el contador al crear un empleado
    }

    // Constructor sobrecargado con salario por defecto
    public Empleado(String nombre, String puesto) {
        this.id = ++totalEmpleados; //  ID automático basado en cantidad de empleados
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = 500000; // Salario base definido en enunciado 
    }

    // Método para aumentar salario por porcentaje
    public void aumentarSalario(double porcentaje) {
        this.salario += this.salario * (porcentaje / 100); // Aplica aumento 
    
    }

    // Método sobrecargado para aumentar salario por monto fijo
    public void aumentarSalario(int montoFijo) {
        salario += montoFijo; // Aplica aumento directo
    }
   
    // toString para representar el estado del objeto como cadena
    @Override
    public String toString() {
        return "Empleado [ID: " + id + 
               ", Nombre: " + nombre + 
               ", Puesto: " + puesto + 
               ", Salario: $" + String.format("%.2f", salario) + "]";
    }
     // Método para mostrar información del empleado
    public void mostrarInfo() {
        System.out.println("ID: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Puesto: " + puesto);
        System.out.println("Salario: $" + salario);

    }
     // MÉTODO ESTÁTICO para mostrar la cantidad total de empleados
    public static int mostrarTotalEmpleados() {
        return totalEmpleados;
    }
    // Getters y Setters solicitados 
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public double getSalario() {
        return salario;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

}