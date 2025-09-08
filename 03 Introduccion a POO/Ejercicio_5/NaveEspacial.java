package Ejercicio_5;
public class NaveEspacial {
    
    
    //Atributos
    private String nombre;
    private double combustible;
    private final double CAPACIDAD_MAX = 100; // límite máximo de combustible
    
    //Constructor
    public NaveEspacial(String nombre, double combustibleInicial){
        this.nombre = nombre;
        //valido que el combustible inicial no sea mayor al maximo
        if(combustibleInicial > CAPACIDAD_MAX){
            combustible = CAPACIDAD_MAX;
        }else{
            combustible = combustibleInicial;
        }
    }
    
    
    
    //Metodo para despegar
    public void despegar(){
        if(combustible > 10){
            combustible -= 10; 
            System.out.println("La nave " + nombre + " ha despegado con exito. El combustible restante es: " + combustible);   
        }else{
            System.out.println("No hay suficiente combustible para despegar.");
        }    
    }
    
    //Metodo para avanzar
    public void avanzar(double distancia){
        double consumo = distancia * 2; //Cada distancia consume 2 de combustible
        if(combustible > consumo){
            combustible -= consumo;
            System.out.println("La nave avanzó " + distancia + " unidades. Combustible restante: " + combustible);
        }else{
            System.out.println("No hay suficiente combustible para avanzar " + distancia + " unidades.");
        }
    }
    
    //Metodo para recargar combustible
    public void recargarCombustible(double cantidad){
        if((combustible + cantidad) > CAPACIDAD_MAX){
            combustible = CAPACIDAD_MAX;
            System.out.println("El tanque se llenó al máximo (" + CAPACIDAD_MAX + ").");
        }else{
        combustible += cantidad;
        System.out.println("Se recargo " + cantidad + " unidades. Combustible actual: " + combustible);  
        } 
    }
    
    //Metodo para mostrar informacion de la nave
    public void mostrarEstado(){
        System.out.println("=== Estado de la nave " + nombre + " ===");
        System.out.println("Combustible: " + combustible);
        System.out.println("----------------------------------------");
    } 
    
    
    
    
    
    
    
    
    
    
}
