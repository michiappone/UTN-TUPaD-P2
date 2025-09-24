
package Ejercicio10;

public class CuentaBancaria {
    
    private String cbu;
    private double saldo;
    private ClaveSeguridad clave; //Composicion
    private Titular titular; //Asociación bidireccional

    public CuentaBancaria(String cbu, double saldo, String codigo, String ultimaModificacion, Titular titular) {
        this.cbu = cbu;
        this.saldo = saldo;
        this.titular = titular;
        this.clave = new ClaveSeguridad(codigo, ultimaModificacion);
        
        // Establecer asociación bidireccional
        if(titular != null){
            titular.setCuentaBancaria(this);
        }
        
    }

    public String getCbu() {
        return cbu;
    }

    public double getSaldo() {
        return saldo;
    }

    public ClaveSeguridad getClave() {
        return clave;
    }

    public Titular getTitular() {
        return titular;
    }
    
    
    
}
