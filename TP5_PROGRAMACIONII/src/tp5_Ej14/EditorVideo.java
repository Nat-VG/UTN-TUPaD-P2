package tp5_Ej14;

public class EditorVideo {

    // Dependencia de creación: se crea el render dentro del método, sin guardarlo como atributo
    public void exportar(String formato, Proyecto proyecto) {
        Render render = new Render(formato, proyecto);
        System.out.println("Proyecto exportado: " + render.getProyecto().getNombre() +
                           " en formato " + render.getFormato());
    }
}
