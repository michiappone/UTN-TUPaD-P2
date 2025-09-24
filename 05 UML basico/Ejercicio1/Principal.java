package Ejercicio1;

public class Principal {
    public static void main(String[] args) {
        Foto foto = new Foto("fotoPasaporte.jpg", "JPEG");
        Titular titular = new Titular("Juan ", "42692226");
        Pasaporte pasaporte = new Pasaporte("11224565", "2025-09-17", foto, titular);
        
        System.out.println("Titular: " + pasaporte.getTitular().getNombre());
        System.out.println("Pasaporte Nº: " + pasaporte.getNumero());
        System.out.println("Foto: "+ pasaporte.getFoto().getImagen() + "(" + pasaporte.getFoto().getFormato() + ")");
        System.out.println("Bidireccional: " + titular.getPasaporte().getNumero());
        
    }
}
