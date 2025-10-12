
package Ejercicio3;
// Subclase: EmpleadoTemporal
public class EmpleadoTemporal extends Empleado {
    private double pagoPorHora;
    private int horasTrabajadas;

    public EmpleadoTemporal(String nombre, double pagoPorHora, int horasTrabajadas) {
        super(nombre);
        this.pagoPorHora = pagoPorHora;
        this.horasTrabajadas = horasTrabajadas;
    }
    
  

    @Override
    public double calcularSueldo() {
        return pagoPorHora * horasTrabajadas;
    }
    
    
    
}
