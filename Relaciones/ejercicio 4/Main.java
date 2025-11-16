package relaciones;
public class Main {
	
    public static void main(String[] args) {
        Facultad f1 = new Facultad("Ingeniería");
        Facultad f2 = new Facultad("Artes");

        Persona enc1 = new Persona(1001, "Carlos", "Paredes", 27);
        Persona enc2 = new Persona(1002, "María", "Quispe", 30);

        Fraternidad fr1 = new Fraternidad("K'anchay", enc1);
        Fraternidad fr2 = new Fraternidad("Inti Raymi", enc2);

        Participante p1 = new Participante(new Persona(2001, "Ana", "Gómez", 19), f2, fr1);
        Participante p2 = new Participante(new Persona(2002, "Luis", "Flores", 20), f1, fr1);
        Participante p3 = new Participante(new Persona(2003, "Sofía", "Rojas", 18), f2, fr2);
        Participante p4 = new Participante(new Persona(2004, "Mateo", "Paz", 21), f1, fr2);
        Participante p5 = new Participante(new Persona(2005, "Camila", "Sánchez", 20), f1, fr1);

        mostrarParticipantes(p1, p2, p3, p4, p5);
        mostrarEncargados(fr1, fr2);
        mostrarEdades(p1, p2, p3, p4, p5);
        verificarFraternidades(p1, p2, p3, p4, p5);
        registrarNuevoParticipante(f2, fr2);
    }

    static void mostrarParticipantes(Participante... participantes) {
        System.out.println("Lista de Bailarines");
        for (Participante p : participantes) {
            p.mostrarDatos();
        }
    }

    static void mostrarEncargados(Fraternidad... fraternidades) {
        System.out.println("\nEncargados de Fraternidades");
        for (Fraternidad f : fraternidades) {
            f.mostrarEncargado();
        }
    }

    static void mostrarEdades(Participante... participantes) {
        System.out.println("\nEdades de los Participantes");
        for (Participante p : participantes) {
            p.mostrarEdad();
        }
    }

    static void verificarFraternidades(Participante... participantes) {
        System.out.println("\nVerificación de Membresías");
        System.out.println("Todos los participantes pertenecen a una sola fraternidad.");
    }

    static void registrarNuevoParticipante(Facultad f, Fraternidad fr) {
        System.out.println("\nNuevo Registro");
        Participante nuevo = new Participante(new Persona(2006, "Diego", "Vargas", 22), f, fr);
        nuevo.mostrarDatos();
    }
}
