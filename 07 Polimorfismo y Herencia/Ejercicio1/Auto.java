
package Ejercicio1;
// Subclase: Auto (hereda de Vehiculo)
public class Auto extends Vehiculo{
    private int cantPuertas;

    public Auto(int cantPuertas, String marca, String modelo) {
        super(marca, modelo);// Llama al método original de Vehiculo
        this.cantPuertas = cantPuertas;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();// Sobrescribe el método para agregar más informació
        System.out.println("Cantidad de puertas: " + cantPuertas);// Llama al método original de Vehiculo
    }    
}
