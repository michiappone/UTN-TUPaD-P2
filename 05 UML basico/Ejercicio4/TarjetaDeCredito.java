
package Ejercicio4;

public class TarjetaDeCredito {
    
    private String numero;
    private String fechaVencimiento;
    private Banco banco; // Agregación
    private Cliente cliente; // Asociación bidireccional

    public TarjetaDeCredito(String numero, String fechaVencimiento, Banco banco, Cliente cliente) {
        this.numero = numero;
        this.fechaVencimiento = fechaVencimiento;
        this.banco = banco;
        this.cliente = cliente;
        
        // establecemos la relación bidireccional
        if(cliente != null){
            cliente.setTarjetaDeCredito(this);
        }
        
    }

    public String getNumero() {
        return numero;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public Banco getBanco() {
        return banco;
    }

    public Cliente getCliente() {
        return cliente;
    }
    
    
}
