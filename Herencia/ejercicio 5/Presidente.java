package herencia;
public class Presidente extends Politico {
    private String nombre;
    private String apellido;
    private Partido partido;

    public Presidente(String nombre, String apellido, String profesion, int aniosExp, String nombreP, String rol) {
        super(profesion, aniosExp);
        this.nombre = nombre;
        this.apellido = apellido;
        this.partido = new Partido(nombreP, rol);
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Partido getPartido() {
        return partido;
    }

    @Override
    public String toString() {
        return "Presidente: " + nombre + " " + apellido + "\n" +
               super.toString() + "\n" +
               partido.toString();
    }
}