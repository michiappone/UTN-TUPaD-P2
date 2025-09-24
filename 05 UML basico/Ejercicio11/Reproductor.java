
package Ejercicio11;

public class Reproductor {
    
    // Dependencia de uso: recibe la canción como parámetro, no la guarda como atributo
    public void reproducir(Cancion cancion){
        System.out.println("Reproduciendo: " + cancion.getTitulo() + (" - ") + cancion.getArtista().getNombre());
        System.out.println(("( ") + cancion.getArtista().getGenero() + " )");  
    }
    
}
