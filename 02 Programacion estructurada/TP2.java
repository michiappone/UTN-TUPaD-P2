import java.util.Scanner;


public class TP2 {//Inicio main
    
    
    public static void main(String[] args) {
        
        //EJERCICIO 1
        Scanner input = new Scanner(System.in);   
        
        int anio;
        
        System.out.println("Ingrese un Año: ");
        anio = input.nextInt();
        
        if ((anio % 4 == 0 && anio % 100!= 0) || (anio % 400 == 0 && anio % 100 == 0)) {
           System.out.println("El año " + anio + " es bisisesto");
        }else {
            System.out.println("El año " + anio + " no es bisisesto");
         
            
         //EJERCICIO 2        
        int num, mayor = 0;
        
        
        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese 3 numeros enteros: ");
            num = input.nextInt();
            if (num > mayor) {
                mayor = num;
            }
        }
       
        System.out.println("El mayor de los 3 numeros ingresados es: " + mayor);
        
        
         //EJERCICIO 3
        Scanner input = new Scanner(System.in);   
        
        int edad;
        
        System.out.println("Ingrese su edad");
        edad = input.nextInt();
        
        if (edad < 12 && edad > 0) {
            System.out.println("Eres un niño");
        }else if(edad >= 12 && edad <= 17){
            System.out.println("Eres un adolecente");
        }else if(edad > 17 && edad <= 59){
            System.out.println("Eres un adulto");
        }else if(edad >= 60){
            System.out.println("Eres un adulto mayor");
        }else{
            System.out.println("Valor invalido");
        }
     
         //EJERCICIO 4
        Scanner input = new Scanner(System.in);   
        
        double precio, precioFinal;
        char categ;
        
        
        System.out.println("Ingrese el precio del producto: ");
        precio = Double.parseDouble(input.nextLine());
      
        System.out.println("Ingrese el la categoria del producto(A,B 0 C): ");
        categ = input.next().charAt(0);
        
        switch (categ) {
           case 'A':
           case 'a':
               precioFinal = precio - (precio * 0.10);
               System.out.println("Descuento aplicado: 10%");
               System.out.println("Precio final: " + precioFinal);
               break;
           case 'B':
           case 'b':
               precioFinal = precio - (precio * 0.15);
               System.out.println("Descuento aplicado: 15%");
               System.out.println("Precio final: " + precioFinal);
               break;
           case 'C':
           case 'c':
               precioFinal = precio - (precio * 0.20);
               System.out.println("Descuento aplicado: 20%");
               System.out.println("Precio final: " + precioFinal);
               break;         
           default:
               System.out.println("Categoría no válida");
         //EJERCICIO 5
          Scanner input = new Scanner(System.in);   
        
        double num, suma = 0;
       
        System.out.println("Ingrese el un numero(0 para finalizar): ");
        num = Double.parseDouble(input.nextLine());  
            
        while (num != 0) {            
            if ((num % 2) == 0){
                suma = suma + num;
            }
            System.out.println("Ingrese el un numero(0 para finalizar): ");
            num = Double.parseDouble(input.nextLine());
            
        }
                
        System.out.println("La suma de los números pares es: " + suma);
         //EJERCICIO 6
        Scanner input = new Scanner(System.in);   
        
        int num,pos = 0,neg = 0,ceros = 0;
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese 10 numeros enteros "); 
            num = Integer.parseInt(input.nextLine());
            
            if (num > 0) {
                pos += 1;
            }else if(num < 0){
                neg += 1;
            }else{
                ceros += 1;
            } 
        }
       
            
       System.out.println("Resultados: ");
       System.out.println("Positivos: " + pos);
       System.out.println("Negativos: " + neg);
       System.out.println("Ceros: " + ceros);
        
       //EJERCICIO 7
        Scanner input = new Scanner(System.in);   
       
        double nota;
            
        do {      
            
            System.out.println("Ingrese una nota (0-10):");
            nota = Double.parseDouble(input.nextLine());
            
            if (nota < 0 || nota > 10) {
            System.out.println("Error: Nota inválida. Ingrese una nota entre 0 y 10.");
            nota = Double.parseDouble(input.nextLine());               
            } 
        } while (nota < 0 || nota > 10);
        
        System.out.println("Nota guardada correctamente.");
       
       
       //EJERCICIO 8
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingrese el precio base del producto: ");
        double precioBase = Double.parseDouble(input.nextLine());
        
        System.out.println("Ingrese el impuesto en porcentaje (Ejemplo: 10 para 10%): ");
        double impuesto = Double.parseDouble(input.nextLine());
        
        System.out.println("Ingrese el descuento en porcentaje (Ejemplo: 5 para 5%): ");
        double descuento = Double.parseDouble(input.nextLine());
       
        double precioFinal = calcularPrecioFinal(precioBase,impuesto, descuento);
        
        System.out.println("El precio final del producto es: " + precioFinal);
        
    }//Cierre main

        //Metodo que calcula el precio final
        public static double calcularPrecioFinal(double PrecioBase, double impuesto, double descuento){      
        return PrecioBase + (PrecioBase * (impuesto / 100)) - (PrecioBase * (descuento / 100));
        }  
    
       //EJERCICIO 9
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingrese el precio del producto: ");
        double precioBase = Double.parseDouble(input.nextLine());
        
        System.out.println("Ingrese el peso del paquete en kg: ");
        double peso = Double.parseDouble(input.nextLine());
        
        System.out.println("Ingrese la zona de envío (Nacional/Internacional): ");
        String zona = input.nextLine();
    
        double costoEnvio = calcularCostoEnvio(peso, zona);
        double precioFinal =  calcularTotalCompra( precioBase, costoEnvio);
        
        System.out.println("El costo de envío es: " + costoEnvio);
        System.out.println("El total a pagar es: " + precioFinal);
        
    }//Cierre main
   
    
    //Metodo que calcula el costo de envío
    public static double calcularCostoEnvio(double peso, String zona){      
        double costoEnvio = 0;
    
        if (zona.equalsIgnoreCase("nacional")) {
          costoEnvio = peso * 5;
        }else{
            costoEnvio = peso * 10;
        }
    
        return costoEnvio;
    }   


    //Metodo que calcula el total de compra.
    public static double calcularTotalCompra(double precioProducto, double costoEnvio){      
      return costoEnvio + precioProducto;
    }   
 
       
       //EJERCICIO 10
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingrese el stock actual del producto: ");
        int stockActual = Integer.parseInt(input.nextLine());
        
        System.out.println("Ingrese la cantidad vendida: ");
        int stockVendido = Integer.parseInt(input.nextLine());
        
        System.out.println("Ingrese la cantidad recibida: ");
        int stockRecibido = Integer.parseInt(input.nextLine());
    
        int stockActualizado = actualizarStock(stockActual, stockVendido, stockRecibido);
        
        
        System.out.println("El nuevo stock del producto es: " + stockActualizado);
   
        
    }//Cierre main
  

        //Metodo que actualiza el stock.
        public static int actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida){   
            return stockActual - cantidadVendida + cantidadRecibida;
        }   
 

       //EJERCICIO 11

        //Variable global estatica
        static double descuentoEspecial = 0.10;
    
     public static void main(String[] args) { //Inicio main
          Scanner input = new Scanner(System.in);
          
          System.out.println("Ingrese el precio del producto: ");
          double precio = Double.parseDouble(input.nextLine());
        
          calcularDescuentoEspecial(precio);
        
      }//Cierre main
  

        //Metodo que calcula el descuento especial usando la variable global
        public static void calcularDescuentoEspecial(double precio){ 
          double descuentoAplicado = precio * descuentoEspecial;
          double precioFinal = precio - descuentoAplicado;
    
          System.out.println("El descuento especial aplicado es: " + descuentoAplicado);
          System.out.println("El precio final con descuento es: " + precioFinal);
        }   
   
       //EJERCICIO 12
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};
        
        
        System.out.println("Precios originales: ");
        for (int i = 0; i < precios.length; i++) {
            double precio = precios[i];   
            
            System.out.println(precio);
        }
        
        precios[2] = 129.99;
        
        System.out.println("Precios modificados: ");
        for (int i = 0; i < precios.length; i++) {
            double precio = precios[i];   
            
            System.out.println(precio);
        }
        

       //EJERCICIO 13            
          
    public static void main(String[] args) { //Inicio main
        Scanner input = new Scanner(System.in);
        
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};
        
       
        System.out.println("Precios originales:");
        mostrarPreciosRecursivo(precios, 0);
        
        precios[2] = 129.99;
        
        System.out.println("Precios modificados: ");
        mostrarPreciosRecursivo(precios, 0);
        
    }//Cierre main
  
     // Función recursiva para imprimir los precios
    public static void mostrarPreciosRecursivo(double[] array, int indice) {
        // Caso base: si llegamos al final del array, terminamos
        if (indice >= array.length) {
            return;
        }

        // Mostrar el precio actual
        System.out.println("Precio: $" + array[indice]);

        // Llamada recursiva para el siguiente índice
        mostrarPreciosRecursivo(array, indice + 1);
    }   
          
        }
    }
}//Cierre main