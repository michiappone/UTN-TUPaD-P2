
package CasoPractico1;

public class Producto {
    
    //Atributos
    private String id;
    private String nombre;
    private double precio ;   
    private int cantidad;       
    private CategoriaProducto categoria;  

    
    //Constructor
    public Producto(String id, String nombre, double precio, int cantidad, CategoriaProducto categoria) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.categoria = categoria;
    }
    
    //Getters
    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public CategoriaProducto getCategoria() {
        return categoria;
    }
    
    //Metodo para mostrar informacion
    public void mostrarInfo(){
        
        System.out.println("------- INFORMACION DEL PRODUCTO -------");
        System.out.println("Nombre: " + getNombre());
        System.out.println("ID: " + getId());
        System.out.println("Cantidad: " + getCantidad());
        System.out.println("Categoria: " + getCategoria());
    }

    //Setters
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Producto" + " [id=" + id + ", nombre=" + nombre + ", precio=" + precio + ", cantidad=" + cantidad + ", categoria=" + categoria + ']';
    }
    
    
}

