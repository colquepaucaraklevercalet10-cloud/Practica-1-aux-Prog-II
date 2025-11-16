package relaciones;
public class Participante {
     Persona persona;
     Facultad facultad;
     Fraternidad fraternidad;

    Participante(Persona persona, Facultad facultad, Fraternidad fraternidad) {
        this.persona = persona;
        this.facultad = facultad;
        this.fraternidad = fraternidad;
    }

    void mostrarDatos() {
        System.out.println(persona.nombre + " " + persona.apellido +
                " → Facultad: " + facultad.nombre +
                ", Fraternidad: " + fraternidad.nombre);
    }

    void mostrarEdad() {
        System.out.println(persona.nombre + ": " + persona.edad + " años");
    }
}
