package Ejercicio1;

public class Pasaporte {
    
    private String numero;
    private String fechaEmision;
    private Foto foto; // composición
    private Titular titular; // asociación bidireccional
    
    
    //Constructor
    public Pasaporte(String numero, String fechaEmision, Foto foto, Titular titular) {
        this.numero = numero;
        this.fechaEmision = fechaEmision;
        this.foto = foto;
        this.titular = titular;
        if(titular != null){
            titular.setPasaporte(this); // bidireccional
        }          
    }

    public String getNumero() {
        return numero;
    }

    public String getFechaEmision() {
        return fechaEmision;
    }

    public Foto getFoto() {
        return foto;
    }

    public Titular getTitular() {
        return titular;
    }
     
}
