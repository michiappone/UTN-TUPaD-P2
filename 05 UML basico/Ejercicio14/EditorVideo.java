
package Ejercicio14;

public class EditorVideo {
    
    public void exportar(String formato, Proyecto proyecto){
        
        Render render = new Render(formato, proyecto);

        System.out.println("Exportando proyecto '" + proyecto.getNombre() + 
                "' (" + proyecto.getDuracionMin() + "min)" +
                " en formato: " + render.getFormato());

    }
    
}
