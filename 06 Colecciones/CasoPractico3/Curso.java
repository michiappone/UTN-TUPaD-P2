
package CasoPractico3;

public class Curso {
    private String codigo;
    private String nombre;
    private Profesor profesor;

    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.profesor = null;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor p) {
        if (this.profesor == p) {
            return; // no cambia nada
        }
        // Si ya tenía profesor, quitarlo de su lista
        if (this.profesor != null) {
            this.profesor.getCursos().remove(this);
        }
        // Asignar nuevo profesor
        this.profesor = p;
        if (p != null && !p.getCursos().contains(this)) {
            p.getCursos().add(this); // sincroniza
        }
    }

    public void mostrarInfo() {
        System.out.println("Curso: " + codigo + " - " + nombre +
                " | Profesor: " + (profesor != null ? profesor.getId() + " - " + profesor.getNombre() : "Sin asignar"));
    }
}
