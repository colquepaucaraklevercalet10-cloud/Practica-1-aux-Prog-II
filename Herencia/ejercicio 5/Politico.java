package herencia;
public class Politico {
    private String profesion;
    private int aniosExp;

    public Politico(String profesion, int aniosExp) {
        this.profesion = profesion;
        this.aniosExp = aniosExp;
    }

    public String getProfesion() {
        return profesion;
    }

    public int getAniosExp() {
        return aniosExp;
    }

    @Override
    public String toString() {
        return "Profesión: " + profesion + ", Años de Experiencia: " + aniosExp;
    }
}