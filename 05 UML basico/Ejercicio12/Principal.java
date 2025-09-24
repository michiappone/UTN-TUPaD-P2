
package Ejercicio12;

public class Principal {
    public static void main(String[] args) {
        
        Contribuyente contribuyente = new Contribuyente("Juan Perez", "20-4569879-9");
        Impuesto impuesto = new Impuesto(21450.25, contribuyente);
        
        Calculadora calculadora = new Calculadora();
        calculadora.calcular(impuesto);
        
        
    }
}
