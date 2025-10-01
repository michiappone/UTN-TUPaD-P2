
package CasoPractico3;

public class Principal {
    
    public static void main(String[] args) {
        Universidad uni = new Universidad("UTN");

        // 1. Crear profesores y cursos
        Profesor p1 = new Profesor("P1", "Ana López", "Matemática");
        Profesor p2 = new Profesor("P2", "Juan Pérez", "Programación");
        Profesor p3 = new Profesor("P3", "Laura Gómez", "Historia");

        Curso c1 = new Curso("C1", "Álgebra");
        Curso c2 = new Curso("C2", "Programación I");
        Curso c3 = new Curso("C3", "Historia Universal");
        Curso c4 = new Curso("C4", "Estructuras de Datos");
        Curso c5 = new Curso("C5", "Programación II");

        // 2. Agregar a la universidad
        uni.agregarProfesor(p1);
        uni.agregarProfesor(p2);
        uni.agregarProfesor(p3);

        uni.agregarCurso(c1);
        uni.agregarCurso(c2);
        uni.agregarCurso(c3);
        uni.agregarCurso(c4);
        uni.agregarCurso(c5);

        // 3. Asignar profesores
        uni.asignarProfesorACurso("C1", "P1");
        uni.asignarProfesorACurso("C2", "P2");
        uni.asignarProfesorACurso("C3", "P3");
        uni.asignarProfesorACurso("C4", "P2");
        uni.asignarProfesorACurso("C5", "P2");

        // 4. Listar
        uni.listarProfesores();
        System.out.println();
        uni.listarCursos();
        System.out.println();

        // 5. Cambiar profesor de un curso
        uni.asignarProfesorACurso("C1", "P2");
        uni.listarCursos();
        System.out.println();

        // 6. Eliminar curso
        uni.eliminarCurso("C4");
        uni.listarCursos();
        p2.listarCursos();
        System.out.println();

        // 7. Eliminar profesor
        uni.eliminarProfesor("P2");
        uni.listarProfesores();
        uni.listarCursos();
        System.out.println();

        // 8. Reporte
        uni.reporteCursosPorProfesor();
    }
    
}
    
        