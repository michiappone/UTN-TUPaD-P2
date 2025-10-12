
package Ejercicio4;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        
        ArrayList<Animal> animales = new ArrayList<>();
        
        animales.add(new Perro("Rex"));
        animales.add(new Gato("Misu"));
        animales.add(new Vaca("Lola"));
        animales.add(new Perro("Firulais"));
        
        for (Animal a : animales) {
            a.describirAnimal();
            a.hacerSonido();
            System.out.println("-----------------------------------------");    
        }
        
    }
    
    
    
}
