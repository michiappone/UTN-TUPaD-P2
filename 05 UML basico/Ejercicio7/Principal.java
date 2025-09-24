
package Ejercicio7;

public class Principal {
    public static void main(String[] args) {
        
        Motor motor = new Motor("V8", "MTR12345");
        Conductor conductor = new Conductor("Luis Fernández", "LIC98765");

        Vehiculo vehiculo = new Vehiculo("AB123CD", "Ford Mustang", motor, conductor);

        System.out.println("Vehículo: " + vehiculo.getModelo() + " - Patente: " + vehiculo.getPatente());
        System.out.println("Motor: " + vehiculo.getMotor().getTipo() + " - Serie: " + vehiculo.getMotor().getNumeroSerie());
        System.out.println("Conductor: " + vehiculo.getConductor().getNombre() + " - Licencia: " + vehiculo.getConductor().getLicencia());
        
        
    }
}
