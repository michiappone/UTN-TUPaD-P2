
package Ejercicio3;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        
        ArrayList<Empleado> empleados = new ArrayList<>();
        
        // Creamos empleados de distintos tipos
        empleados.add(new EmpleadoPlanta("Juan Pérez", 120000, 20000));
        empleados.add(new EmpleadoTemporal("Ana López", 1500, 80));
        empleados.add(new EmpleadoPlanta("Carlos Díaz", 100000, 15000));
        empleados.add(new EmpleadoTemporal("Lucía Gómez", 1800, 60));
        
        for (Empleado e : empleados) {
            System.out.println("Empleado: " +  e.getNombre());
            System.out.println("Sueldo: " + e.calcularSueldo());   
            
            if (e instanceof EmpleadoPlanta) {
                System.out.println("Tipo: Empleado Planta");   
            }else{
                System.out.println("Tipo: Empleado Temporal");
            }   
            System.out.println("----------------------------");
        }
        
        
        
        
    }
    
}
