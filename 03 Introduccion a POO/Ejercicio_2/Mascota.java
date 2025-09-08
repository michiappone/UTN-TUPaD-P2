package Ejercicio_2;

public class Mascota {

    //Atributos
    String nombre, especie;
    int edad;
    
    //Metodo para mostrar infomacion
    void mostrarInfo(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Especie: " + especie);
        System.out.println("Edad: " + edad);
        System.out.println("--------------------------");
    }
    

    //Metodo para simular que cumple años
    void cumplirAnios(){
        edad++;
        System.out.println( nombre + " cumplio un año mas y ahora tiene " + edad + " años.");
    }
    
    
    
}
