package tp6_universidad; 

/**
 * Clase que representa un Curso en el sistema universitario.
 * Relación BIDIRECCIONAL N a 1 con Profesor:
 * - Un Curso tiene un Profesor
 * - El Profesor tiene muchos Cursos
 * - La sincronización es CRÍTICA aquí
 */
public class Curso {
    // Atributos privados
    private String codigo;
    private String nombre;
    private Profesor profesor;  // Relación N a 1: un curso tiene un profesor
    
    /**
     * Constructor del Curso
     * @param codigo código único del curso
     * @param nombre nombre del curso
     */
    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.profesor = null;  // Inicialmente sin profesor
    }
    
    /**
     * MÉTODO MÁS IMPORTANTE: establece el profesor y sincroniza ambos lados
     * Aquí está la magia de la bidireccionalidad
     * @param p profesor a asignar (puede ser null para desasignar)
     */
    public void setProfesor(Profesor p) {
        // Si es el mismo profesor, no hacemos nada (evita recursión)
        if (this.profesor == p) {
            return;
        }
        
        // Si ya tenía un profesor, nos removemos de su lista
        if (this.profesor != null) {
            this.profesor.eliminarCurso(this);
        }
        
        // Establecemos el nuevo profesor
        this.profesor = p;
        
        // Si el nuevo profesor no es null, nos agregamos a su lista
        if (p != null && !p.getCursos().contains(this)) {
            p.agregarCurso(this);
        }
        
        System.out.println("Curso '" + nombre + "' asignado al profesor: " + 
                          (p != null ? p.getNombre() : "Ninguno"));
    }
    
    /**
     * Muestra la información del curso
     * Incluye información del profesor si tiene uno asignado
     */
    public void mostrarInfo() {
        System.out.println("=== INFORMACIÓN DEL CURSO ===");
        System.out.println("Código: " + codigo);
        System.out.println("Nombre: " + nombre);
        if (profesor != null) {
            System.out.println("Profesor: " + profesor.getNombre());
        } else {
            System.out.println("Profesor: No asignado");
        }
        System.out.println("----------------------------");
    }
    
    // ========== GETTERS ==========
    
    public String getCodigo() {
        return codigo;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public Profesor getProfesor() {
        return profesor;
    }
    
    /**
     * Override de toString para representación textual
     */
    @Override
    public String toString() {
        return codigo + " - " + nombre + 
               (profesor != null ? " (" + profesor.getNombre() + ")" : " (Sin profesor)");
    }
}