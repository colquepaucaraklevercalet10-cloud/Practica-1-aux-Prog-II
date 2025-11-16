package relaciones;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private String nombre;
    private List<Empleado> empleados;

    public Empresa(String nombre) {
        this.nombre = nombre;
        this.empleados = new ArrayList<>();
    }

    public void agregarEmpleado(Empleado e) {
        empleados.add(e);
    }

    public void mostrarInformacion() {
        System.out.println("Empresa: " + nombre);
        for (Empleado e : empleados) {
            System.out.println(e);
        }
        System.out.println();
    }

    public Empleado buscarEmpleado(String nombre) {
        for (Empleado e : empleados) {
            if (e.getNombre().equalsIgnoreCase(nombre)) {
                return e;
            }
        }
        return null;
    }

    public void eliminarEmpleado(String nombre) {
        empleados.removeIf(e -> e.getNombre().equalsIgnoreCase(nombre));
    }

    public double promedioSalarial() {
        double suma = 0;
        for (Empleado e : empleados) {
            suma += e.getSalario();
        }
        return empleados.isEmpty() ? 0 : suma / empleados.size();
    }

    public void listarMayores(double valor) {
        for (Empleado e : empleados) {
            if (e.getSalario() > valor) {
                System.out.println(e);
            }
        }
    }
}