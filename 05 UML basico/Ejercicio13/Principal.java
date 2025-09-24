
package Ejercicio13;

public class Principal {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Laura Gómez", "laura@example.com");
        
        GeneradorQR generador = new GeneradorQR();
        CodigoQR qr = generador.generar("ABC123XYZ", usuario); // Dependencia de creación

        
        
    }
}
