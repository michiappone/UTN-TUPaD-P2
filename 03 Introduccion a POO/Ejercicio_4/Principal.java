package Ejercicio_4;

public class Principal {
          public static void main(String[] args){
            Gallina a = new Gallina(); 
            Gallina b = new Gallina();
              
            a.idGallina = 1;
            a.edad = 6;
            a.huevosPuestos = 200;
            
            b.idGallina = 2;
            b.edad = 4;
            b.huevosPuestos = 50;
              
            a.envejecer();
            a.ponerHuevo(23);
            
            b.envejecer();
            b.ponerHuevo(42);
              
           a.mostrarInfo();
           b.mostrarInfo();
        
    }
    
        
}
