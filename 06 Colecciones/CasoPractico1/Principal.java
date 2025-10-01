
package CasoPractico1;

public class Principal {

    public static void main(String[] args) {
        Inventario inventario = new Inventario();

        // 1. Crear 5 productos
        Producto p1 = new Producto("A1", "Pan", 500, 20, CategoriaProducto.ALIMENTOS);
        Producto p2 = new Producto("B2", "Televisor", 150000, 5, CategoriaProducto.ELECTRONICA);
        Producto p3 = new Producto("C3", "Camisa", 2500, 15, CategoriaProducto.ROPA);
        Producto p4 = new Producto("D4", "Silla", 8000, 10, CategoriaProducto.HOGAR);
        Producto p5 = new Producto("E5", "Notebook", 300000, 8, CategoriaProducto.ELECTRONICA);

        inventario.agregarProducto(p1);
        inventario.agregarProducto(p2);
        inventario.agregarProducto(p3);
        inventario.agregarProducto(p4);
        inventario.agregarProducto(p5);

        // 2. Listar productos
        System.out.println("\n--- Lista de Productos ---");
        inventario.listarProductos();

        // 3. Buscar producto por ID
        System.out.println("\n--- Buscar producto con ID 'C3' ---");
        Producto buscado = inventario.buscarProductoPorId("C3");
        if (buscado != null) buscado.mostrarInfo();

        // 4. Filtrar por categoría
        System.out.println("\n--- Productos en categoría ELECTRONICA ---");
        inventario.filtrarPorCategoria(CategoriaProducto.ELECTRONICA);

        // 5. Eliminar producto
        System.out.println("\n--- Eliminar producto con ID 'A1' ---");
        inventario.eliminarProducto("A1");
        inventario.listarProductos();

        // 6. Actualizar stock
        System.out.println("\n--- Actualizar stock del producto D4 ---");
        inventario.actualizarStock("D4", 50);
        inventario.listarProductos();

        // 7. Mostrar total stock
        System.out.println("\n--- Total stock disponible ---");
        System.out.println("Total = " + inventario.obtenerTotalStock());

        // 8. Producto con mayor stock
        System.out.println("\n--- Producto con mayor stock ---");
        Producto mayorStock = inventario.obtenerProductoConMayorStock();
        if (mayorStock != null) mayorStock.mostrarInfo();

        // 9. Filtrar por precio
        System.out.println("\n--- Productos con precio entre $1000 y $3000 ---");
        inventario.filtrarProductosPorPrecio(1000, 3000);

        // 10. Mostrar categorías disponibles
        System.out.println("\n--- Categorías Disponibles ---");
        inventario.mostrarCategoriasDisponibles(); 
    }
    
}
