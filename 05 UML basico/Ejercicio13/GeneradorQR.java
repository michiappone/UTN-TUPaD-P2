
package Ejercicio13;

public class GeneradorQR {
    // Dependencia de creación: el generador crea el CódigoQR, no lo guarda como atributo
    public CodigoQR generar(String valor, Usuario usuario){
        CodigoQR codigoQR = new CodigoQR(valor, usuario);
        
        System.out.println("Codigo QR generado para: " + usuario.getNombre() + "( " + usuario.getEmail() + " )");
        System.out.println("Valor: " + codigoQR.getValor());
        return codigoQR;
    }
}
