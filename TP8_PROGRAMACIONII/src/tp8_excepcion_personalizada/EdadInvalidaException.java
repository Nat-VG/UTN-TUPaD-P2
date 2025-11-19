package excepciones_tp8.personalizada;

/**
 * Excepcion COMPROBADA (Checked Exception).
 * Extiende de Exception para validar reglas de negocio.
 */
public class EdadInvalidaException extends Exception {
    
    // Constructor que permite pasar un mensaje de error
    public EdadInvalidaException(String mensaje) {
        super(mensaje);
    }
}