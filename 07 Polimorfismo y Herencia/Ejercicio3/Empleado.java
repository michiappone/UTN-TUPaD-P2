
package Ejercicio3;
// Clase abstracta: Empleado
public abstract class Empleado {
    private String nombre;

    public Empleado(String nombre) {
        this.nombre = nombre;
    }
    
    // Método abstracto: cada tipo de empleado calcula su sueldo de forma distinta
    public abstract double calcularSueldo();

    public String getNombre() {
        return nombre;
    }   
}
