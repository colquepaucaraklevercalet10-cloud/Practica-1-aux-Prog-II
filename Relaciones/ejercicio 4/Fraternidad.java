package relaciones;
public class Fraternidad {
     String nombre;
     Persona encargado;

    Fraternidad(String nombre, Persona encargado) {
        this.nombre = nombre;
        this.encargado = encargado;
    }

    void mostrarEncargado() {
        System.out.println(nombre + " → Encargado: " + encargado.nombre + " " + encargado.apellido);
    }
}
