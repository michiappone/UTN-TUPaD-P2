
package Ejercicio4;

public class Cliente {
    
    private String nombre;
    private int dni;
    private TarjetaDeCredito tarjetaDeCredito; // Asociación bidireccional

    public Cliente(String nombre, int dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public void setTarjetaDeCredito(TarjetaDeCredito tarjetaDeCredito) {
        this.tarjetaDeCredito = tarjetaDeCredito;
    }
    
    public String getNombre() {
        return nombre;
    }

    public int getDni() {
        return dni;
    }

    public TarjetaDeCredito getTarjetaDeCredito() {
        return tarjetaDeCredito;
    }
    
    
    
}
