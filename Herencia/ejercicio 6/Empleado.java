package herencia;
public class Empleado extends Persona {
    private double sueldo;
    private String cargo;

    public Empleado(String nombre, int edad, double sueldo, String cargo) {
        super(nombre, edad);
        this.sueldo = sueldo;
        this.cargo = cargo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public String getCargo() {
        return cargo;
    }

    @Override
    public String toString() {
        return super.toString() + ", Sueldo: " + sueldo + ", Cargo: " + cargo;
    }
}