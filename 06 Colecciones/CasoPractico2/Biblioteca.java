
package CasoPractico2;

import java.util.List;
import java.util.ArrayList;



public class Biblioteca {
    private String nombre;
    private List<Libro> libros;

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.libros = new ArrayList<>();
    }

    public void agregarLibro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        Libro nuevo = new Libro(isbn, titulo, anioPublicacion, autor);
        libros.add(nuevo);
    }

    public void listarLibros() {
        if (libros.isEmpty()) {
            System.out.println("No hay libros en la biblioteca.");
        } else {
            System.out.println("📚 Libros en la biblioteca " + nombre + ":");
            for (Libro libro : libros) {
                libro.mostrarInfo();
            }
        }
    }

    public Libro buscarLibroPorIsbn(String isbn) {
        for (Libro libro : libros) {
            if (libro.getIsbn().equals(isbn)) {
                return libro;
            }
        }
        return null;
    }

    public void eliminarLibro(String isbn) {
        Libro encontrado = buscarLibroPorIsbn(isbn);
        if (encontrado != null) {
            libros.remove(encontrado);
            System.out.println("Libro con ISBN " + isbn + " eliminado.");
        } else {
            System.out.println("No se encontró un libro con ISBN " + isbn);
        }
    }

    public int obtenerCantidadLibros() {
        return libros.size();
    }

    public void filtrarLibrosPorAnio(int anio) {
        System.out.println("📖 Libros publicados en el año " + anio + ":");
        for (Libro libro : libros) {
            if (libro.getAnioPublicacion() == anio) {
                libro.mostrarInfo();
            }
        }
    }

    public void mostrarAutoresDisponibles() {
        System.out.println("✍ Autores en la biblioteca " + nombre + ":");
        for (Libro libro : libros) {
            libro.getAutor().mostrarInfo();
        }
    }
}
