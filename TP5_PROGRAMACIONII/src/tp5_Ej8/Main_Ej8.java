package tp5_Ej8;

public class Main_Ej8 {

    public static void main(String[] args) {

        // Se crea el usuario que genera la firma
        Usuario usuario = new Usuario("Agostina Riera", "agorod@email.com");

        // Se crea la firma digital, vinculada al usuario
        FirmaDigital firma = new FirmaDigital("ADXSXXD4", "2025-09-20", usuario);

        // Se crea el documento, que contiene la firma
        Documento documento = new Documento("Contrato de alquiler", "Contenido legal del contrato...", firma);

        // Se muestra el estado del documento y la relación con la firma y el usuario
        System.out.println("Titulo: " + documento.getTitulo());
        System.out.println("Contenido: " + documento.getContenido());
        System.out.println("Firma: " + documento.getFirma().getCodigoHash() + " - Fecha: " + documento.getFirma().getFecha());
        System.out.println("Firmado por: " + documento.getFirma().getUsuario().getNombre());
    }
}
