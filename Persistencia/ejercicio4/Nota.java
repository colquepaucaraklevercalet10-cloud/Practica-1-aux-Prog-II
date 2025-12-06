package ejercicio4;

public class Nota {
    private String materia;
    private float notaFinal;
    private Estudiante estudiante;

    public Nota(String materia, float notaFinal, Estudiante estudiante) {
        this.materia = materia;
        this.notaFinal = notaFinal;
        this.estudiante = estudiante;
    }

    public String getMateria() {
        return materia;
    }

    public float getNotaFinal() {
        return notaFinal;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    @Override
    public String toString() {
        return "Materia: " + materia + ", Nota Final: " + notaFinal + ", " + estudiante.toString();
    }
}