package Ejercicio5;

public class Principal {
    public static void main(String[] args) {
        
        Propietario propietario = new Propietario("Carlos Pérez", "40111222");

        Computadora compu = new Computadora("Dell", "SN12345", "Asus Prime", "Z690", propietario);

        System.out.println("Propietario: " + propietario.getNombre() + " - DNI: " + propietario.getDni());
        System.out.println("Computadora: " + compu.getMarca() + " - Serie: " + compu.getNumeroSerie());
        System.out.println("Placa Madre: " + compu.getPlacaMadre().getModelo() + " - Chipset: " + compu.getPlacaMadre().getChipset());
        System.out.println("Dueño de la computadora: " + compu.getPropietario().getNombre());

    }
}
