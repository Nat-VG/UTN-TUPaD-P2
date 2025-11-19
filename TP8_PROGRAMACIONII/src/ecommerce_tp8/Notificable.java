package ecommerce_tp8;

/**
 * Contrato que define la capacidad de ser notificado ante un cambio de estado.
 */
public interface Notificable {
    
    void cambiarEstado(String mensaje);

}