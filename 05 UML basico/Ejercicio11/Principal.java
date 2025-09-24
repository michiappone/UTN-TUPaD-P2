
package Ejercicio11;

public class Principal {
    public static void main(String[] args) {
        Artista artista = new Artista("Soda Stereo", "Rock");
        Cancion cancion = new Cancion("De Música Ligera", artista);
        
        Reproductor reproductor = new Reproductor();
        
        reproductor.reproducir(cancion);// Dependencia de uso

    }

}
