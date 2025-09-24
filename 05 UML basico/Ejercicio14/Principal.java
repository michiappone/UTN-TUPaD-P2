
package Ejercicio14;

public class Principal {
    public static void main(String[] args) {
        Proyecto proyecto = new Proyecto("Corto de terror", 15);
        EditorVideo editor = new EditorVideo();
        
        editor.exportar("MP4", proyecto);
    }
}
