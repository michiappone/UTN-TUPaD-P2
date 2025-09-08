package Ejercicio_1;

public class Principal {

    public static void main(String[] args) {
        Estudiante a = new Estudiante();
        
        a.nombre = "Maicol";
        a.apellido = "Chiappone";
        a.curso = "Primer año";
        a.calificacion = 8;
        
        a.mostrarInfo();
        a.subirCalificacion(2);
        a.bajarCalificacion(1);
        
    }
  
}
