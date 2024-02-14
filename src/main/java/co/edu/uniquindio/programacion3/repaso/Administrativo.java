package co.edu.uniquindio.programacion3.repaso;

public class Administrativo {

    private Estudiantes estudiantes;
    private Docentes docentes;
    private Materia materia;
    
    public Administrativo(Estudiantes estudiantes, Docentes docentes, Materia materia) {
        
        this.estudiantes = estudiantes;
        this.docentes = docentes;
        this.materia = materia;
    }

    public Estudiantes getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(Estudiantes estudiantes) {
        this.estudiantes = estudiantes;
    }

    public Docentes getDocentes() {
        return docentes;
    }

    public void setDocentes(Docentes docentes) {
        this.docentes = docentes;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }
}
