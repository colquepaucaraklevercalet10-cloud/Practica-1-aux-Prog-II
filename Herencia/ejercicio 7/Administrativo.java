package herencia;
public class Administrativo extends Empleado {
    private String cargo;

    public Administrativo(String nombre, float sueldoMes, String cargo) {
        super(nombre, sueldoMes);
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "Administrativo: " + nombre + ", Cargo: " + cargo + ", Sueldo: " + sueldoMes;
    }
}