package Ejercicio_5;

public class Principal {
    public static void main(String[] args) {
        // Crear nave con 50 de combustible
        NaveEspacial nave = new NaveEspacial("Apollo", 50);
        
        // Intentar avanzar sin recargar
        nave.avanzar(30);
        
        // Recargar combustible
        nave.recargarCombustible(40);
        
        
        // Avanzar correctamente
        nave.despegar();
        nave.avanzar(20);//Consume 40 unidades de combustible
        
        // Mostrar estado final
        nave.mostrarEstado();

    }       
}
