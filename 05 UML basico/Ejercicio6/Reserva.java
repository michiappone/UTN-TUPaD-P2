
package Ejercicio6;

public class Reserva {
    
    private String fecha;
    private String hora;
    private Mesa mesa; // agregacion
    private Cliente cliente; //Asociacion unidireccional;

    public Reserva(String fecha, String hora, Mesa mesa, Cliente cliente) {
        this.fecha = fecha;
        this.hora = hora;
        this.mesa = mesa;
        this.cliente = cliente;
    }

    public String getFecha() {
        return fecha;
    }

    public String getHora() {
        return hora;
    }

    public Mesa getMesa() {
        return mesa;
    }

    public Cliente getCliente() {
        return cliente;
    }
    
    
    
}
