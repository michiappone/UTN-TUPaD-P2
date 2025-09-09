package trabajopractico4;

public class Empleado {
    
    //ATRIBUTOS 
    private int id; //Identificador único del empleado.
    private String nombre; //Nombre completo.
    private String puesto; //Cargo que desempeña.
    private double salario; //Salario actual.
    private static int totalEmpleados; //Contador global de empleados creados.
    private static int generadorID = 0; // para asignar id automátic
    
    //CONSTRUCTORES SOBRECARGADOS
    public Empleado(int id, String nombre, String puesto, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        totalEmpleados++;
    }

    public Empleado(String nombre, String puesto) { //Solo nombre y puesto
        generadorID++;
        this.id = generadorID; //ID automatico
        this.salario = 2000; //Salario por defecto
        this.nombre = nombre;
        this.puesto = puesto;
        totalEmpleados++;
    }
    
    //METODOS SOBRECARGADOS PARA ACTUALIZAR SALARIOS
    public void actualizarSalario(double porcAumento){
        this.salario += this.salario * (porcAumento / 100);
    }
    
    public void actualizarSalario(int cantFija){
        this.salario += cantFija;
    }

    //TO STRING
    @Override
    public String toString() {
        return "Empleado{" + "id=" + id + ", nombre=" + nombre + ", puesto=" + puesto + ", salario=" + salario + '}';
    }
    
    //METODO PARA MOSTRAR LA CANTIDAD DE EMPLEADOS TOTALES
    public static int mostrarTotalEmpleados(){
        return totalEmpleados;
    }
    
    //GETTERS
    public int getId() {return id;}
        
    public String getNombre() {return nombre;}
        
    public String getPuesto() {return puesto;}
        
    public double getSalario() {return salario;}
        
    //SETTERS
    public void setNombre(String nombre) {this.nombre = nombre;}

    public void setPuesto(String puesto) {this.puesto = puesto;}
  
    public void setSalario(double salario) {this.salario = salario;}
   
}
