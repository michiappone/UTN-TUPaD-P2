
package Parte_2;

// Clase de excepción personalizada
class EdadInvalidaException extends Exception {
    public EdadInvalidaException(String mensaje) {
        super(mensaje);
    }
}

public class PruebaEdad {
    public static void validarEdad(int edad) throws EdadInvalidaException {
        if (edad < 0 || edad > 120) {
            throw new EdadInvalidaException("Edad inválida: " + edad);
        } else {
            System.out.println("Edad válida: " + edad);
        }
    }

    public static void main(String[] args) {
        try {
            validarEdad(150); // prueba con un valor incorrecto
        } catch (EdadInvalidaException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

