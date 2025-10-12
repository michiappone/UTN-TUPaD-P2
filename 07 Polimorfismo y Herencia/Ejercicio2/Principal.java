
package Ejercicio2;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        
        ArrayList<FiguraGeometrica> figura = new ArrayList<>();
        
        figura.add(new Circulo(3));
        figura.add(new Rectangulo(0, 0));
        
        for (FiguraGeometrica figuras : figura) {
            System.out.println( figuras.getNombre() + " - area: " + figuras.calcularArea());
            
        }
        
    }
}
