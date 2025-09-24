
package Ejercicio8;

public class Principal {
    public static void main(String[] args) {
        
        Usuario usuario = new Usuario("Ana Gómez", "ana@example.com");

        Documento documento = new Documento("Contrato", "Contenido del contrato aquí...", "HASH12345", "22/03/25", usuario);
        
        System.out.println("Documento: " + documento.getTitulo());
        System.out.println("Firma hash: " + documento.getFirma().getCodigoHash());
        System.out.println("Firmado por: " + documento.getFirma().getUsuario().getNombre());
        
        
    }
}
