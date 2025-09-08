package Ejercicio_3;

public class Libro {

    //Atributos
    private String titulo = "La tercera puerta";
    private String autor = "Norma Huidobro";
    private int anioPublicacion = 2009;

    
    //Getters
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    
    //Metodo para modificar el año de publicacion(Setter con validacion)
    public void setAnioPublicacion(int anioPublicacion) {
        if (anioPublicacion > 0 && anioPublicacion <= 2025) { // año válido
            this.anioPublicacion = anioPublicacion;
        } else {
            System.out.println("Año de publicación inválido: " + anioPublicacion);
        }   
    }
    
    //Metodo para mostrar la informacion
    public void mostrarInfo() {
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Año de Publicación: " + anioPublicacion);
        System.out.println("--------------------------");
    }
    
}
