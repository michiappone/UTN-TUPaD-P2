
package Ejercicio7;

public class Vehiculo {
    
    private String patente;
    private String modelo;
    private Motor motor; //Agregacion
    private Conductor conductor; //Asociacion Bidireccional

    public Vehiculo(String patente, String modelo, Motor motor, Conductor conductor) {
        this.patente = patente;
        this.modelo = modelo;
        this.motor = motor;
        this.conductor = conductor;
        
        // Establecemos la relación bidireccional
        if(conductor != null){
            conductor.setVehiculo(this); //bidireccional
        }
        
        
        
    }

    public String getPatente() {
        return patente;
    }

    public String getModelo() {
        return modelo;
    }

    public Motor getMotor() {
        return motor;
    }

    public Conductor getConductor() {
        return conductor;
    }
    
    
    
}
