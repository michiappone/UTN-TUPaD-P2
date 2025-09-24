
package Ejercicio10;

public class Principal {
    public static void main(String[] args) {
        
        Titular titular = new Titular("María López", 40555666);

        CuentaBancaria cuenta = new CuentaBancaria("1234567890123456789012", 50000, "ABC123", "23/02/25" , titular);
        
        System.out.println("Cuenta Bancaria");
        System.out.println("CBU: " + cuenta.getCbu());
        System.out.println("Saldo: $" + cuenta.getSaldo());
        System.out.println("Titular: " + cuenta.getTitular().getNombre() + " (DNI: " + cuenta.getTitular().getDni() + ")");
        System.out.println("Clave: " + cuenta.getClave().getCodigo() + " (última modif.: " + cuenta.getClave().getUltimaModificacion() + ")");    
        
    }

}
