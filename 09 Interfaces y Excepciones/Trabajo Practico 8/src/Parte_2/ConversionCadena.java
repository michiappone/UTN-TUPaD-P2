package Parte_2;

public class ConversionCadena {
    public static void main(String[] args) {
        String texto = "Hola"; // prueba con "123" para ver la diferencia
        try {
            int numero = Integer.parseInt(texto);
            System.out.println("Número convertido: " + numero);
        } catch (NumberFormatException e) {
            System.out.println("Error: '" + texto + "' no es un número válido.");
        }
    }
}
