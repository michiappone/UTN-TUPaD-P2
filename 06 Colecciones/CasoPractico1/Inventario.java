
package CasoPractico1;

import java.util.ArrayList;

public class Inventario {
    
    //Atributos
    ArrayList<Producto> productos = new ArrayList<>();
    
    
    public void agregarProducto(Producto producto){
        productos.add(producto);
    }
    
    public void listarProductos(){
        for (Producto producto : productos) {
            producto.mostrarInfo();
        }
    }
        
    public Producto buscarProductoPorId(String id){
        for (Producto producto : productos) {
            if(producto.getId().equals(id)){
                return producto;
            } 
        }
        return null;
    }
        
        
    public void eliminarProducto(String id) {
       Producto productoEncontrado = buscarProductoPorId(id);
        
        if(productoEncontrado != null){
            productos.remove(productoEncontrado);
            System.out.println("Producto con ID " + id + " eliminado.");
        }else{
            System.out.println("Producto con ID " + id + " no encontrado.");
        }
    }
    
    
    public void actualizarStock(String id, int nuevaCantidad){
        Producto actualizado = buscarProductoPorId(id);
        
        if(actualizado != null){
            actualizado.setCantidad(nuevaCantidad);
            System.out.println("Stock actualizado para " + id);
        }else{
            System.out.println("Producto no encontrado.");
        } 
    }
    
    public void filtrarPorCategoria(CategoriaProducto categoria){
        for (Producto producto : productos) {
            if(producto.getCategoria().equals(categoria)){
               producto.mostrarInfo();
            }
        }       
    }
    
    public int obtenerTotalStock(){
            
        int totalStock = 0;
        for (Producto producto : productos) {
            totalStock += producto.getCantidad();
        }
        return totalStock;
    }
    
    public Producto obtenerProductoConMayorStock(){ 
        
        if(productos.isEmpty()){
            return null; //Si la lista está vacía, no hay producto
        }
        
        Producto mayorStock = productos.get(0); //Primer producto de la lista
        
        for (Producto producto : productos) {
            if(producto.getCantidad() > mayorStock.getCantidad() ){
                mayorStock = producto;  
            }
        }
        return mayorStock; 
    }
    
    public void filtrarProductosPorPrecio(double min, double max){
        for (Producto p : productos) {
            if (p.getPrecio() >= min && p.getPrecio() <= max) {
                p.mostrarInfo();
            }
        }   
    }
    
    public void mostrarCategoriasDisponibles() {
        for (CategoriaProducto c : CategoriaProducto.values()) {
            System.out.println(c + " → " + c.getDescripcion());
        }
    }
    
}
