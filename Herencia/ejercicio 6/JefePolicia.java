package herencia;
public class JefePolicia extends Empleado implements Policia {
    private String grado;
    private String area;

    public JefePolicia(String nombre, int edad, double sueldo, String cargo, String grado, String area) {
        super(nombre, edad, sueldo, cargo);
        this.grado = grado;
        this.area = area;
    }

    @Override
    public String getGrado() {
        return grado;
    }

    @Override
    public String getArea() {
        return area;
    }

    @Override
    public String toString() {
        return super.toString() + ", Grado: " + grado + ", Área: " + area;
    }
}