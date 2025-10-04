package polimorfismo;
public class Videojuego {
    private String nombre;
    private String plataforma;
    private int cantidadJugadores;

    public Videojuego() {
        this.nombre = "";
        this.plataforma = "";
        this.cantidadJugadores = 0;
    }

    public Videojuego(String nombre, String plataforma) {
        this.nombre = nombre;
        this.plataforma = "";
        this.cantidadJugadores = 0;
    }

    public Videojuego(String nombre, String plataforma, int cantidadJugadores) {
        this.nombre = nombre;
        this.plataforma = plataforma;
        this.cantidadJugadores = cantidadJugadores;
    }

    public void agregarJugadores() {
        this.cantidadJugadores += 1;
    }

    public void agregarJugadores(int cantidad) {
        this.cantidadJugadores += cantidad;
    }

    @Override
    public String toString() {
        return "Videojuego: " + nombre + ", Plataforma: " + plataforma + ", Jugadores: " + cantidadJugadores;
    }
}