
package CasoPractico3;

import java.util.ArrayList;
import java.util.List;

public class Universidad {
    private String nombre;
    private List<Profesor> profesores;
    private List<Curso> cursos;

    public Universidad(String nombre) {
        this.nombre = nombre;
        this.profesores = new ArrayList<>();
        this.cursos = new ArrayList<>();
    }

    public void agregarProfesor(Profesor p) {
        profesores.add(p);
    }

    public void agregarCurso(Curso c) {
        cursos.add(c);
    }

    public Profesor buscarProfesorPorId(String id) {
        for (Profesor p : profesores) {
            if (p.getId().equals(id)) return p;
        }
        return null;
    }

    public Curso buscarCursoPorCodigo(String codigo) {
        for (Curso c : cursos) {
            if (c.getCodigo().equals(codigo)) return c;
        }
        return null;
    }

    public void asignarProfesorACurso(String codigoCurso, String idProfesor) {
        Curso curso = buscarCursoPorCodigo(codigoCurso);
        Profesor profesor = buscarProfesorPorId(idProfesor);
        if (curso != null && profesor != null) {
            curso.setProfesor(profesor);
        } else {
            System.out.println("Error: curso o profesor no encontrado.");
        }
    }

    public void eliminarCurso(String codigo) {
        Curso c = buscarCursoPorCodigo(codigo);
        if (c != null) {
            if (c.getProfesor() != null) {
                c.getProfesor().eliminarCurso(c);
            }
            cursos.remove(c);
            System.out.println("Curso " + codigo + " eliminado.");
        }
    }

    public void eliminarProfesor(String id) {
        Profesor p = buscarProfesorPorId(id);
        if (p != null) {
            // Dejar sus cursos sin profesor
            for (Curso c : new ArrayList<>(p.getCursos())) {
                c.setProfesor(null);
            }
            profesores.remove(p);
            System.out.println("Profesor " + id + " eliminado.");
        }
    }

    public void listarProfesores() {
        System.out.println("Profesores en " + nombre + ":");
        for (Profesor p : profesores) {
            p.mostrarInfo();
        }
    }

    public void listarCursos() {
        System.out.println("Cursos en " + nombre + ":");
        for (Curso c : cursos) {
            c.mostrarInfo();
        }
    }

    public void reporteCursosPorProfesor() {
        System.out.println("📊 Reporte de cursos por profesor:");
        for (Profesor p : profesores) {
            System.out.println(p.getId() + " - " + p.nombre + ": " + p.getCursos().size() + " cursos");
        }
    }
}
