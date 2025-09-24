
package Ejercicio9;

public class Principal {
    public static void main(String[] args) {
        
        Paciente paciente = new Paciente("Juan Pérez", "OSDE");
        Profesional profesional = new Profesional("Dra. López", "Cardiología");

        CitaMedica cita = new CitaMedica("2025-09-18", "10:30", paciente, profesional);

        System.out.println("Cita médica");
        System.out.println("Fecha: " + cita.getFecha());
        System.out.println("Hora: " + cita.getHora());
        System.out.println("Paciente: " + cita.getPaciente().getNombre() + " (" + cita.getPaciente().getObraSocial() + ")");
        System.out.println("Profesional: " + cita.getProfesional().getNombre() + " - " + cita.getProfesional().getEspecialidad());
        
    }
    
    
    
}
