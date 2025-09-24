package Ejercicio2;

public class Principal {
    public static void main(String[] args) {
        
        Bateria b = new Bateria("Li-ion", 3500);
        Usuario u = new Usuario("Juan", 43259878);
        Celular c = new Celular("12345678901234","Motorola" , "G45", b, u);
        
        // Mostrar datos desde el celular
        System.out.println("IMEI: " + c.getImei());
        System.out.println("Marca: " + c.getMarca());
        System.out.println("Modelo: " + c.getModelo());
        System.out.println("Bateria: " + c.getBateria().getModelo());
        System.out.println("Usuario: " + c.getUsuario().getNombre());
        
        // Mostrar datos desde el usuario (bidireccionalidad)
        System.out.println("\n=== Datos del usuario ===");
        System.out.println("Nombre: " + u.getNombre());
        System.out.println("DNI: " + u.getDni());
        System.out.println("Celular asociado: " + u.getCelular().getMarca() + " - " + u.getCelular().getModelo());
                
        
    }
}
