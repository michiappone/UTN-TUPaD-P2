package Ejercicio_1;

public class Estudiante {
    
    // Atributos
    public String nombre;
    public String apellido;
    public String curso;
    public double calificacion;
    
 
    // Método para mostrar la información
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre + " " + apellido);
        System.out.println("Curso: " + curso);
        System.out.println("Calificacion: " + calificacion);
        System.out.println("--------------------------");
    }

    
    // Método para subir la calificación
    public void subirCalificacion(double puntos){
        calificacion += puntos;
        System.out.println("La calificacion subio: " + puntos + " puntos");
    }
    
    // Método para bajar la calificación
     public void bajarCalificacion(double puntos){
        calificacion -= puntos;
        System.out.println("La calificacion bajo: " + puntos + " puntos");
         
    }
}
