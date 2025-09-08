package Ejercicio_4;

public class Gallina {

    //Atributos
    public int idGallina;
    public int edad;
    public int huevosPuestos;

    //Metodo para poner huevos
    void ponerHuevo(int ponerHuevo) {
        huevosPuestos += ponerHuevo;
        System.out.println(" La gallina " + idGallina + " ha puesto " + ponerHuevo + " huevos. Total: " + huevosPuestos);
    }

    //Metodo envejecer
    public void envejecer() {
        edad++;
        System.out.println(" La gallina " + idGallina + " ha envejecido un año. Edad actual: " + edad);
    }

    //Metodo para mostrar informacion
    public void mostrarInfo() {
        System.out.println("Informacion de gallina: ");
        System.out.println("La gallina " + idGallina + " tiene " + edad + " años y ha puesto " + huevosPuestos + " huevos.");
    }

}
