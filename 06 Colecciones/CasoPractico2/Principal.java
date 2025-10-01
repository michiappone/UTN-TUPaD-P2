
package CasoPractico2;

public class Principal {
    public static void main(String[] args) {
        
         // 1. Crear biblioteca
        Biblioteca biblioteca = new Biblioteca("Municipal");

        // 2. Crear autores
        Autor autor1 = new Autor("A1", "Gabriel García Márquez", "Colombiano");
        Autor autor2 = new Autor("A2", "Julio Cortázar", "Argentino");
        Autor autor3 = new Autor("A3", "Isabel Allende", "Chilena");

        // 3. Agregar libros
        biblioteca.agregarLibro("ISBN001", "Cien Años de Soledad", 1967, autor1);
        biblioteca.agregarLibro("ISBN002", "El Amor en los Tiempos del Cólera", 1985, autor1);
        biblioteca.agregarLibro("ISBN003", "Rayuela", 1963, autor2);
        biblioteca.agregarLibro("ISBN004", "Bestiario", 1951, autor2);
        biblioteca.agregarLibro("ISBN005", "La Casa de los Espíritus", 1982, autor3);

        // 4. Listar libros
        biblioteca.listarLibros();
        System.out.println();

        // 5. Buscar por ISBN
        Libro buscado = biblioteca.buscarLibroPorIsbn("ISBN003");
        if (buscado != null) {
            System.out.println("🔎 Libro encontrado:");
            buscado.mostrarInfo();
        } else {
            System.out.println("Libro no encontrado.");
        }
        System.out.println();

        // 6. Filtrar por año
        biblioteca.filtrarLibrosPorAnio(1985);
        System.out.println();

        // 7. Eliminar libro
        biblioteca.eliminarLibro("ISBN004");
        biblioteca.listarLibros();
        System.out.println();

        // 8. Cantidad total
        System.out.println("Cantidad de libros en la biblioteca: " + biblioteca.obtenerCantidadLibros());
        System.out.println();

        // 9. Listar autores
        biblioteca.mostrarAutoresDisponibles();
        
        
        
    }
            
}
