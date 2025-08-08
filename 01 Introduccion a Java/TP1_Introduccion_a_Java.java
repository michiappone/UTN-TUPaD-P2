
import java.util.Scanner;

public class TP1_Introduccion_a_Java {
    
   // EJERCICIO 3
    public static void main(String[] args) {
        
    
    String nombre = "Michael";
    int edad = 25;
    double altura = 1.75;
    boolean estudiante = true;
    
    System.out.println(nombre);
    System.out.println(edad);
    System.out.println(altura);
    System.out.println(estudiante);
    
    // EJERCICIO 4
            Scanner input = new Scanner(System.in);   
    
        String nombre;
        int edad;
    
        System.out.println("Ingrese su nombre y edad: ");
        nombre = input.nextLine();
        edad = input.nextInt(); 
    
        System.out.println("Su nombre es: " + nombre + " y tiene " + edad + " años");
    
    
    // EJERCICIO 5
            Scanner input = new Scanner(System.in);   
    
        int suma, resta, multiplicacion, num1, num2;
        double division;
    
        System.out.println("Ingrese dos numeros: ");
        num1 = input.nextInt();
        num2 = input.nextInt(); 
    
        suma = num1 + num2;
        resta = num1 - num2;
        multiplicacion = num1 * num2;
        division = (double) num1/num2;
    
    
        System.out.println("Suma entre " + num1 + " y " + num2 + ": " + suma);
        System.out.println("Resta entre " + num1 + " y " + num2 + ": " + resta);
        System.out.println("Multiplicacion entre " + num1 + " y " + num2 + ": " + multiplicacion);
        System.out.println("Division entre " + num1 + " y " + num2 + ": " + division);
        
     // EJERCICIO 6
        System.out.println("Nombre: Juan Pérez\nEdad: 31 años\nDireccion: \"Calle Falsa 123\"");
        
      // EJERCICIO 7
        /*
        Una expresión es una combinación de valores, variables y
         operadores que produce un resultado (por ejemplo, x + 5).
         Una instrucción es una orden completa que la computadora ejecuta,
         como declarar una variable, asignar un valor o llamar a un método.
         */
        
    // EJERCICIO 8
    
    Scanner input = new Scanner(System.in);   
        
        int num1, num2, division;
        double numUno, numDos, division_dec;
        
        System.out.println("Ingrese dos numeros enteros: ");
        num1 = input.nextInt();
        num2 = input.nextInt();
        
        System.out.println("Ingrese dos numeros con decimales: ");
        numUno = input.nextDouble();
        numDos = input.nextDouble();
        
        division = num1/num2;
        division_dec = numUno/numDos;
        
        System.out.println("Resultado de la división entera: " + division);
        System.out.println("Resultado de la división con decimales: " + division_dec);
    
    // EJERCICIO 9
    
        /*El error es que se está intentando guardar en una variable de tipo String el valor que retorna nextInt().
        El método nextInt() está diseñado para leer números enteros (int), no texto, por lo que el compilador marca error de tipo.
        Para leer texto, se debe usar nextLine() (o next(), aunque este último no lee espacios).
        Por eso lo reemplacé por:
        String nombre = scanner.nextLine();
        */

    // EJERCICIO 10
        
        /*
            Tabla adjunta en formato .png
        En Java, cuando se dividen dos valores de tipo int, el resultado también es un entero:
        La parte decimal se descarta (no se redondea).
        Para obtener 2.5 habría que convertir al menos uno de los operandos a double
        */
   
    }
}
