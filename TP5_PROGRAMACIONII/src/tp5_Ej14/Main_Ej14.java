package tp5_Ej14;

public class Main_Ej14 {

    public static void main(String[] args) {

        // Se crea el proyecto
        Proyecto proyecto = new Proyecto("Video institucional", 12);

        // Se crea el editor y se exporta el proyecto (dependencia de creación)
        EditorVideo editor = new EditorVideo();
        editor.exportar("MP4", proyecto);
    }
}
