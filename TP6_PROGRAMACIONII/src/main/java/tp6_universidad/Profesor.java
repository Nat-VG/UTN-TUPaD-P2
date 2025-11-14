package tp6_universidad;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa un Profesor en el sistema universitario.
 * Relación BIDIRECCIONAL 1 a N con Curso:
 * - Un Profesor dicta muchos Cursos
 * - Cada Curso conoce a su Profesor
 * - Debemos mantener la consistencia en ambos lados
 */
public class Profesor {
    // Atributos privados
    private String id;
    private String nombre;
    private String especialidad;
    private List<Curso> cursos;  // Relación 1 a N: un profesor dicta muchos cursos
    
    /**
     * Constructor del Profesor
     * @param id identificador único
     * @param nombre nombre completo
     * @param especialidad área de especialización
     */
    public Profesor(String id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.cursos = new ArrayList<>();  // Inicializamos la lista
    }
    
    /**
     * Agrega un curso al profesor y sincroniza el lado del curso
     * MÉTODO CRÍTICO: debe mantener la consistencia bidireccional
     * @param c curso a agregar
     */
    public void agregarCurso(Curso c) {
        if (c != null && !cursos.contains(c)) {
            cursos.add(c);  // Agregamos a nuestra lista
            
            // Sincronizamos el lado del curso
            // Esta verificación evita recursión infinita
            if (c.getProfesor() != this) {
                c.setProfesor(this);  // El curso también conoce al profesor
            }
            System.out.println("Curso '" + c.getNombre() + "' asignado al profesor " + nombre);
        }
    }
    
    /**
     * Elimina un curso del profesor y sincroniza el lado del curso
     * @param c curso a eliminar
     */
    public void eliminarCurso(Curso c) {
        if (c != null && cursos.contains(c)) {
            cursos.remove(c);  // Quitamos de nuestra lista
            
            // Sincronizamos el lado del curso
            if (c.getProfesor() == this) {
                c.setProfesor(null);  // El curso ya no tiene profesor
            }
            System.out.println("Curso '" + c.getNombre() + "' removido del profesor " + nombre);
        }
    }
    
    /**
     * Lista todos los cursos que dicta el profesor
     */
    public void listarCursos() {
        if (cursos.isEmpty()) {
            System.out.println("El profesor " + nombre + " no dicta ningún curso.");
            return;
        }
        
        System.out.println("=== CURSOS DEL PROFESOR " + nombre.toUpperCase() + " ===");
        for (Curso curso : cursos) {
            System.out.println("- " + curso.getCodigo() + ": " + curso.getNombre());
        }
    }
    
    /**
     * Muestra la información completa del profesor
     * Incluye la cantidad de cursos que dicta
     */
    public void mostrarInfo() {
        System.out.println("=== INFORMACIÓN DEL PROFESOR ===");
        System.out.println("ID: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Especialidad: " + especialidad);
        System.out.println("Cursos asignados: " + cursos.size());
        System.out.println("----------------------------");
    }
    
    // ========== GETTERS ==========
    
    public String getId() {
        return id;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public String getEspecialidad() {
        return especialidad;
    }
    
    /**
     * Getter para la lista de cursos (copia para proteger encapsulamiento)
     * @return copia de la lista de cursos
     */
    public List<Curso> getCursos() {
        return new ArrayList<>(cursos);
    }
    
    /**
     * Override de toString para representación textual
     */
    @Override
    public String toString() {
        return nombre + " (" + especialidad + ")";
    }
}