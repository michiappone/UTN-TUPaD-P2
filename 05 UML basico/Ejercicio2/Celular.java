package Ejercicio2;

public class Celular {
    private String imei;
    private String marca;
    private String modelo;
    private Bateria bateria; // agregación
    private Usuario usuario; // asociación bidireccional

        public Celular(String imei, String marca, String modelo, Bateria bateria, Usuario usuario) {
            this.imei = imei;
            this.marca = marca;
            this.modelo = modelo;
            this.bateria = bateria;
            this.usuario = usuario;
            
            //Asociacion bidireccional
            if(usuario != null){
                 usuario.setCelular(this);
            }
        }  
    
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public String getImei() {
        return imei;
    }

    public Bateria getBateria() {
        return bateria;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
}
