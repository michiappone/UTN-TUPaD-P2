
package Ejercicio12;

public class Calculadora {
    
    public void calcular(Impuesto impuesto){
        System.out.println("Calculando impuesto para " + impuesto.getContribuyente().getNombre());
        System.out.println("Cuil: " + impuesto.getContribuyente().getCuil());
        System.out.println("Monto a pagar: $" + impuesto.getMonto());
                
    }
    
}
