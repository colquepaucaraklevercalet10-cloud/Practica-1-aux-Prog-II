package relaciones;
public class Main {
    public static void main(String[] args) {
        Doctor d1 = new Doctor("Juan Pérez", "Cardiología");
        Doctor d2 = new Doctor("Ana López", "Pediatría");
        Doctor d3 = new Doctor("Carlos Ruiz", "Neurología");

        Hospital h1 = new Hospital("Hospital Central");
        Hospital h2 = new Hospital("Clínica del Sur");

        h1.agregarDoctor(d1);
        h1.agregarDoctor(d2);

        h2.agregarDoctor(d2);
        h2.agregarDoctor(d3);

        h1.mostrarDoctores();
        h2.mostrarDoctores();
    }
}