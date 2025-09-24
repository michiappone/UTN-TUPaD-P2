package Ejercicio1;

// Clase Titular (Asociacion con Pasaporte)
public class Titular {
    
    private String nombre;
    private String dni;
    private Pasaporte pasaporte;

    //Constructor
    public Titular(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public void setPasaporte(Pasaporte pasaporte) {
        this.pasaporte = pasaporte;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public Pasaporte getPasaporte() {
        return pasaporte;
    }
    
}
