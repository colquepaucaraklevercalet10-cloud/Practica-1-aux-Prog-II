package relaciones;
import java.util.ArrayList;
import java.util.List;

public class Hospital {
    private String nombre;
    private List<Doctor> doctores;

    public Hospital(String nombre) {
        this.nombre = nombre;
        this.doctores = new ArrayList<>();
    }

    public void agregarDoctor(Doctor doctor) {
        doctores.add(doctor);
    }

    public void mostrarDoctores() {
        System.out.println("Hospital: " + nombre);
        for (Doctor d : doctores) {
            System.out.println(d);
        }
        System.out.println();
    }
}