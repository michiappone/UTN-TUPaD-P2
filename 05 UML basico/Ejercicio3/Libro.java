
package Ejercicio3;

public class Libro {
    
    private String titulo;
    private String isbn;
    private Editorial editorial; // Agregación
    private Autor autor; // Asociación unidireccional

    public Libro(String titulo, String isnb, Editorial editorial, Autor autor) {
        this.titulo = titulo;
        this.isbn = isnb;
        this.editorial = editorial;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public Autor getAutor() {
        return autor;
    }
    
    
    
    
    
    
}
