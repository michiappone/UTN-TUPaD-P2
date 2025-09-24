
package Ejercicio4;

public class Principal {
    public static void main(String[] args) {
        
        Cliente cliente = new Cliente("Ana López", 40567890);
        Banco banco = new Banco("Banco Nación", "30-12345678-9");

        TarjetaDeCredito tarjeta = new TarjetaDeCredito("1234-5678-9012-3456", "12/28", banco, cliente);
        
        System.out.println("Cliente: "  + tarjeta.getCliente().getNombre() + " - DNI: " + tarjeta.getCliente().getDni() );
        System.out.println("Banco: " + tarjeta.getBanco().getNombre() + " - CUIT: " + tarjeta.getBanco().getCuit());
        System.out.println("Tarjeta: " + tarjeta.getNumero() + " - Vence: " + tarjeta.getFechaVencimiento());
        System.out.println("Titular de la tarjeta: " + tarjeta.getCliente().getNombre());
        
        

        
        
        
    }
}
