
package Ejercicio3;
// Subclase: EmpleadoPlanta
public class EmpleadoPlanta extends Empleado{
    private  double sueldoBase;
    private double bonificacion;

    public EmpleadoPlanta(String nombre, double sueldo, double bonificacion) {
        super(nombre);
        this.sueldoBase = sueldo;
        this.bonificacion = bonificacion;
    }

    

    @Override
    public double calcularSueldo() {
       return sueldoBase  + bonificacion;
    }
    
    
    
    
    
    
    
}
