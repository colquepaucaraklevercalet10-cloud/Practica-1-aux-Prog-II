package relaciones;
public class Persona {
     int ci;
     String nombre;
     String apellido;
     int edad;
    Persona(int ci, String nombre, String apellido, int edad) {
        this.ci = ci;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
    void mostrar() {
        System.out.println(nombre + " " + apellido + " (CI: " + ci + ", " + edad + " años)");
    }
}