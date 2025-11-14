package tp6_universidad;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa la Universidad.
 * Gestiona profesores y cursos, y facilita las asignaciones.
 * No tiene relación bidireccional directa, solo de contención.
 */
public class Universidad {
    // Atributos privados
    private String nombre;
    private List<Profesor> profesores;  // Lista de profesores
    private List<Curso> cursos;         // Lista de cursos
    
    /**
     * Constructor de la Universidad
     * @param nombre nombre de la universidad
     */
    public Universidad(String nombre) {
        this.nombre = nombre;
        this.profesores = new ArrayList<>();
        this.cursos = new ArrayList<>();
    }
    
    /**
     * Agrega un profesor a la universidad
     * @param p profesor a agregar
     */
    public void agregarProfesor(Profesor p) {
        if (p != null && !profesores.contains(p)) {
            profesores.add(p);
            System.out.println("Profesor " + p.getNombre() + " agregado a la universidad.");
        }
    }
    
    /**
     * Agrega un curso a la universidad
     * @param c curso a agregar
     */
    public void agregarCurso(Curso c) {
        if (c != null && !cursos.contains(c)) {
            cursos.add(c);
            System.out.println("Curso " + c.getNombre() + " agregado a la universidad.");
        }
    }
    
    /**
     * Asigna un profesor a un curso usando sus identificadores
     * Este método usa la bidireccionalidad automáticamente
     * @param codigoCurso código del curso
     * @param idProfesor id del profesor
     */
    public void asignarProfesorACurso(String codigoCurso, String idProfesor) {
        Curso curso = buscarCursoPorCodigo(codigoCurso);
        Profesor profesor = buscarProfesorPorId(idProfesor);
        
        if (curso != null && profesor != null) {
            // Aquí se activa la bidireccionalidad automáticamente
            curso.setProfesor(profesor);
        } else {
            System.out.println("No se pudo realizar la asignación. Verifique los datos.");
        }
    }
    
    /**
     * Lista todos los profesores de la universidad
     */
    public void listarProfesores() {
        if (profesores.isEmpty()) {
            System.out.println("No hay profesores en la universidad.");
            return;
        }
        
        System.out.println("=== PROFESORES DE " + nombre.toUpperCase() + " ===");
        for (Profesor profesor : profesores) {
            profesor.mostrarInfo();
        }
    }
    
    /**
     * Lista todos los cursos de la universidad
     */
    public void listarCursos() {
        if (cursos.isEmpty()) {
            System.out.println("No hay cursos en la universidad.");
            return;
        }
        
        System.out.println("=== CURSOS DE " + nombre.toUpperCase() + " ===");
        for (Curso curso : cursos) {
            curso.mostrarInfo();
        }
    }
    
    /**
     * Busca un profesor por su ID
     * @param id id del profesor a buscar
     * @return profesor encontrado o null
     */
    public Profesor buscarProfesorPorId(String id) {
        for (Profesor profesor : profesores) {
            if (profesor.getId().equals(id)) {
                return profesor;
            }
        }
        System.out.println("No se encontró profesor con ID: " + id);
        return null;
    }
    
    /**
     * Busca un curso por su código
     * @param codigo código del curso a buscar
     * @return curso encontrado o null
     */
    public Curso buscarCursoPorCodigo(String codigo) {
        for (Curso curso : cursos) {
            if (curso.getCodigo().equals(codigo)) {
                return curso;
            }
        }
        System.out.println("No se encontró curso con código: " + codigo);
        return null;
    }
    
    /**
     * Elimina un curso de la universidad
     * Importante: rompe la relación con el profesor si la tenía
     * @param codigo código del curso a eliminar
     */
    public void eliminarCurso(String codigo) {
        Curso curso = buscarCursoPorCodigo(codigo);
        if (curso != null) {
            // Romper relación con el profesor antes de eliminar
            if (curso.getProfesor() != null) {
                curso.setProfesor(null);
            }
            cursos.remove(curso);
            System.out.println("Curso " + curso.getNombre() + " eliminado de la universidad.");
        }
    }
    
    /**
     * Elimina un profesor de la universidad
     * Importante: dejar null los cursos que dictaba
     * @param id id del profesor a eliminar
     */
    public void eliminarProfesor(String id) {
        Profesor profesor = buscarProfesorPorId(id);
        if (profesor != null) {
            // Antes de remover, dejar null los cursos que dictaba
            // Usamos una copia para evitar problemas de modificación durante iteración
            List<Curso> cursosDelProfesor = new ArrayList<>(profesor.getCursos());
            for (Curso curso : cursosDelProfesor) {
                curso.setProfesor(null);
            }
            profesores.remove(profesor);
            System.out.println("Profesor " + profesor.getNombre() + " eliminado de la universidad.");
        }
    }
    
    /**
     * Genera un reporte de cantidad de cursos por profesor
     */
    public void generarReporteCursosPorProfesor() {
        System.out.println("=== REPORTE: CURSOS POR PROFESOR ===");
        for (Profesor profesor : profesores) {
            System.out.println("- " + profesor.getNombre() + ": " + 
                             profesor.getCursos().size() + " cursos");
        }
    }
    
    // ========== GETTERS ==========
    
    public String getNombre() {
        return nombre;
    }
    
    public List<Profesor> getProfesores() {
        return new ArrayList<>(profesores);
    }
    
    public List<Curso> getCursos() {
        return new ArrayList<>(cursos);
    }
}