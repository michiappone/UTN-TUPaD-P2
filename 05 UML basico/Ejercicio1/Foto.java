package Ejercicio1;

// Clase Foto (composición con Pasaporte)
public class Foto {
    
    private String imagen;
    private String formato;

    //Constructor
    public Foto(String imagen, String formato) {
        this.imagen = imagen;
        this.formato = formato;
    }

    public String getImagen() {
        return imagen;
    }

    public String getFormato() {
        return formato;
    }
    
}
