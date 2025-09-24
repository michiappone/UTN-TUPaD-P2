package Ejercicio2;

// Clase Usuario (asociación bidireccional)
public class Usuario {
    
    private String nombre;
    private int dni;
    private Celular celular; // bidireccional

    public Usuario(String nombre, int dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDni() {
        return dni;
    }

    public Celular getCelular() {
        return celular;
    }

    public void setCelular(Celular celular) {
        this.celular = celular;
    }
    
    
    
    
    
    
}
