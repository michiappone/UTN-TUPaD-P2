
package Ejercicio4;

public class Animal {
    protected String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }
    
    public void describirAnimal(){
        System.out.println("El nombre del animal es: " + nombre);
    }
            
            
    public void hacerSonido(){
        System.out.println(nombre + "El animal hace un sonido generico");
    }
    
    
        
}
