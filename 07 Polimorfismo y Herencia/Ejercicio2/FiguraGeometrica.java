
package Ejercicio2;

public abstract class FiguraGeometrica {
    private String nombre;

    public FiguraGeometrica(String nombre) {
        this.nombre = nombre;
    }
    
    public abstract double calcularArea();

    public String getNombre() {
        return nombre;
    }
    
    
    
}
