package tp6_universidad;

/**
 * Clase principal para probar el sistema universitario
 * Demuestra la relación BIDIRECCIONAL 1 a N entre Profesor y Curso
 */
public class MainUniversidad {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA UNIVERSITARIO ===");
        System.out.println("Relación: BIDIRECCIONAL 1 a N (Profesor ↔ Cursos)\n");
        
        // ========== CREACIÓN DE LA UNIVERSIDAD ==========
        System.out.println("1. CREANDO UNIVERSIDAD...");
        Universidad universidad = new Universidad("Universidad Nacional del Oeste");
        
        // ========== CREACIÓN DE PROFESORES ==========
        System.out.println("\n2. CREANDO PROFESORES...");
        Profesor profesor1 = new Profesor("P001", "Ana García", "Programación");
        Profesor profesor2 = new Profesor("P002", "Carlos López", "Base de Datos");
        Profesor profesor3 = new Profesor("P003", "María Fernández", "Matemáticas");
        
        // Agregar profesores a la universidad
        universidad.agregarProfesor(profesor1);
        universidad.agregarProfesor(profesor2);
        universidad.agregarProfesor(profesor3);
        
        // ========== CREACIÓN DE CURSOS ==========
        System.out.println("\n3. CREANDO CURSOS...");
        Curso curso1 = new Curso("C001", "Programación I");
        Curso curso2 = new Curso("C002", "Programación II");
        Curso curso3 = new Curso("C003", "Base de Datos I");
        Curso curso4 = new Curso("C004", "Base de Datos II");
        Curso curso5 = new Curso("C005", "Matemática Discreta");
        
        // Agregar cursos a la universidad
        universidad.agregarCurso(curso1);
        universidad.agregarCurso(curso2);
        universidad.agregarCurso(curso3);
        universidad.agregarCurso(curso4);
        universidad.agregarCurso(curso5);
        
        // ========== ASIGNACIONES INICIALES ==========
        System.out.println("\n4. ASIGNANDO PROFESORES A CURSOS...");
        universidad.asignarProfesorACurso("C001", "P001");  // Ana -> Programación I
        universidad.asignarProfesorACurso("C002", "P001");  // Ana -> Programación II
        universidad.asignarProfesorACurso("C003", "P002");  // Carlos -> Base de Datos I
        universidad.asignarProfesorACurso("C004", "P002");  // Carlos -> Base de Datos II
        universidad.asignarProfesorACurso("C005", "P003");  // María -> Matemática Discreta
        
        // ========== DEMOSTRACIÓN DE BIDIRECCIONALIDAD ==========
        System.out.println("\n" + "=".repeat(60));
        System.out.println("5. VERIFICANDO BIDIRECCIONALIDAD:");
        
        System.out.println("\n--- Desde el Profesor ---");
        profesor1.listarCursos();  // Ana debería tener 2 cursos
        
        System.out.println("\n--- Desde el Curso ---");
        curso1.mostrarInfo();      // Programación I debería tener a Ana
        
        // ========== CAMBIO DE PROFESOR ==========
        System.out.println("\n" + "=".repeat(60));
        System.out.println("6. CAMBIANDO PROFESOR DE UN CURSO...");
        
        // Cambiamos Programación II de Ana a Carlos
        System.out.println("\nANTES del cambio:");
        curso2.mostrarInfo();
        profesor1.listarCursos();
        profesor2.listarCursos();
        
        System.out.println("\nREALIZANDO CAMBIO...");
        universidad.asignarProfesorACurso("C002", "P002");  // Carlos -> Programación II
        
        System.out.println("\nDESPUÉS del cambio:");
        curso2.mostrarInfo();
        profesor1.listarCursos();  // Ana debería tener 1 curso ahora
        profesor2.listarCursos();  // Carlos debería tener 3 cursos ahora
        
        // ========== ELIMINACIÓN DE CURSO ==========
        System.out.println("\n" + "=".repeat(60));
        System.out.println("7. ELIMINANDO UN CURSO...");
        
        System.out.println("\nANTES de eliminar:");
        profesor3.listarCursos();  // María debería tener 1 curso
        
        universidad.eliminarCurso("C005");  // Eliminamos Matemática Discreta
        
        System.out.println("\nDESPUÉS de eliminar:");
        profesor3.listarCursos();  // María debería tener 0 cursos
        
        // ========== ELIMINACIÓN DE PROFESOR ==========
        System.out.println("\n" + "=".repeat(60));
        System.out.println("8. ELIMINANDO UN PROFESOR...");
        
        System.out.println("\nANTES de eliminar:");
        curso3.mostrarInfo();  // Base de Datos I debería tener a Carlos
        
        universidad.eliminarProfesor("P002");  // Eliminamos a Carlos
        
        System.out.println("\nDESPUÉS de eliminar:");
        curso3.mostrarInfo();  // Base de Datos I debería estar sin profesor
        
        // ========== REPORTE FINAL ==========
        System.out.println("\n" + "=".repeat(60));
        System.out.println("9. REPORTE FINAL:");
        
        universidad.generarReporteCursosPorProfesor();
        
        System.out.println("\n" + "=".repeat(60));
        System.out.println("=== PRUEBAS DE BIDIRECCIONALIDAD COMPLETADAS ===");
        
        // ========== RESUMEN DE LO APRENDIDO ==========
        System.out.println("\n" + "=".repeat(60));
        System.out.println("CONCEPTOS DEMOSTRADOS:");
        System.out.println("1. Bidireccionalidad: Profesor conoce Cursos y Curso conoce Profesor");
        System.out.println("2. Sincronización automática: Cambios se reflejan en ambos lados");
        System.out.println("3. Evitar recursión infinita: Verificaciones en setProfesor()");
        System.out.println("4. Consistencia: Las relaciones siempre están sincronizadas");
        System.out.println("5. Encapsulamiento: Getters devuelven copias de las listas");
    }
}