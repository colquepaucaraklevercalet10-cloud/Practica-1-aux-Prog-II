package herencia;
public class Main {
    public static void main(String[] args) {
        Estudiante e1 = new Estudiante("Juan", "Perez", "Lopez", 20, "RU001", "MAT2023");
        Estudiante e2 = new Estudiante("Ana", "Gomez", "Diaz", 22, "RU002", "MAT2024");
        Docente d1 = new Docente("Luis", "Martinez", "Soto", 22, 3500.0, "PROF123");

        e1.mostrar();
        e2.mostrar();
        d1.mostrar();

        System.out.println("Promedio edad estudiantes: " + Estudiante.promedio(e1, e2));

        e1.modificarEdad(25);
        System.out.println("Edad modificada del estudiante 1: " + e1.getEdad());

        if (e1.getEdad() == d1.getEdad() || e2.getEdad() == d1.getEdad()) {
            System.out.println("Un estudiante tiene la misma edad que el docente");
        } else {
            System.out.println("Ningún estudiante tiene la misma edad que el docente");
        }
    }
}