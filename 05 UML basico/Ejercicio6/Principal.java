
package Ejercicio6;

public class Principal {
    public static void main(String[] args) {
        
        Cliente c = new Cliente("Juan Perez", "351459685");
        Mesa m = new Mesa(103, 23);
        Reserva r = new Reserva("21/02/25", "15:30", m, c);
        
        
        System.out.println("Mesa N° " + m.getNumero() + " Capacidad: " + m.getCapacidad());
        System.out.println("Cliente: " + c.getNombre() + " Numero: " + c.getTelefono());
        System.out.println("----- Datos de Reserva -----");
        System.out.println("Cliente: " + r.getCliente().getNombre());
        System.out.println("Fecha: " + r.getFecha() + " - Hora: " + r.getHora());
        System.out.println("Mesa N°: " + r.getMesa().getNumero());
        
    }
}
