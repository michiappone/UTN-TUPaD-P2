package trabajopractico4;

public class Principal {
    public static void main(String[] args) {
        
        //Creacion de empleados mediante constructores
        Empleado e1 = new Empleado(1, "Juan Ramirez", "Gerente", 1500);
        Empleado e2 = new Empleado("Marcos Martinez", "Desarrollador");
        Empleado e3 = new Empleado("Lucía Torres", "Analista");
        
        //Aplicar aumentos mediantes metodos
        e1.actualizarSalario(500); //aumento fijo
        e2.actualizarSalario(15.0); //aumento del 15%
        e3.actualizarSalario(10.0); //aumento del 10%
        
        //Imprimir datos de los empleados
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
        
        System.out.println(e2.getSalario());
        
        //Mostrar cantidad total de empleados
        System.out.println("La cantidad total de empleados es: " + Empleado.mostrarTotalEmpleados());
        
        
        
    }
    
}
