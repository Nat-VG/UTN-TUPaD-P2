package excepciones_tp8.personalizada;
 
public class MainExcepcionPersonalizada {

    // Metodo que DECLARA que PUEDE LANZAR la excepcion
    public static void validarEdad(int edad) throws EdadInvalidaException {
        if (edad < 0 || edad > 120) {
            // Lanzamos la excepcion si la edad es invalida
            throw new EdadInvalidaException("La edad " + edad + " no es valida. Debe estar entre 0 y 120 anios.");
        } else {
            System.out.println("OK Edad valida: " + edad);
        }
    }

    public static void main(String[] args) {
        
        // 1. Prueba con edad invalida
        int edadPruebaInvalida = 138;
        try {
            validarEdad(edadPruebaInvalida);
        } 
        catch (EdadInvalidaException e) {
            System.err.println("X ERROR DE VALIDACION: " + e.getMessage());
        }
        
        // 2. Prueba con edad valida
        int edadPruebaValida = 35;
        try {
            validarEdad(edadPruebaValida);
        }
        catch (EdadInvalidaException e) {
            // Este catch no se ejecuta
        }
    }
}