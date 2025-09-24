package Ejercicio3;

public class Principal {
    
    public static void main(String[] args) {
        
        Autor a = new Autor("Gabriel García Márquez", "Colombiana");
        Editorial e = new Editorial("Sudamericana", "Buenos Aires");
        
        Libro libro = new Libro("Ficciones", "123456789", e, a);
        
        System.out.println("Libro: " + libro.getTitulo());
        System.out.println("Autor: " + libro.getAutor().getNombre());
        System.out.println("Editorial: " + libro.getEditorial().getNombre());
        
    }
    
}
