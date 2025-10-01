
package CasoPractico3;

import java.util.ArrayList;
import java.util.List;


public class Profesor {
    private String id;
    String nombre;
    private String especialidad;
    private List<Curso> cursos;

    public Profesor(String id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.cursos = new ArrayList<>();
    }

    public String getNombre() {
    return nombre;
    }
    
    public String getId() {
        return id;
    }

    public void agregarCurso(Curso c) {
        if (!cursos.contains(c)) {
            cursos.add(c);
        }
        if (c.getProfesor() != this) {
            c.setProfesor(this); // sincroniza
        }
    }

    public void eliminarCurso(Curso c) {
        if (cursos.contains(c)) {
            cursos.remove(c);
        }
        if (c.getProfesor() == this) {
            c.setProfesor(null); // sincroniza
        }
    }

    public void listarCursos() {
        System.out.println("Cursos dictados por " + nombre + ":");
        for (Curso c : cursos) {
            System.out.println("  - " + c.getCodigo() + ": " + c.getNombre());
        }
    }

    public void mostrarInfo() {
        System.out.println("Profesor: " + nombre +
                " (ID: " + id + ", Especialidad: " + especialidad +
                ", Cursos: " + cursos.size() + ")");
    }

    public List<Curso> getCursos() {
        return cursos;
    }
}
