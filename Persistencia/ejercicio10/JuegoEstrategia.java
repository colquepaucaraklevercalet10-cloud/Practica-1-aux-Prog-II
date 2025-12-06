package ejercicio10;

import java.io.*;
import java.util.*;

public class JuegoEstrategia {

    private final String archivo = "jugadores.txt";

    public void guardarJugador(Jugador j) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivo, true))) {
            bw.write(j.getNombre() + ";" + j.getNivel() + ";" + j.getPuntaje());
            bw.newLine();
        } catch (Exception e) {
            System.out.println("Error al guardar: " + e.getMessage());
        }
    }

    public ArrayList<Jugador> leerJugadores() {
        ArrayList<Jugador> lista = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(";");
                String nombre = partes[0];
                int nivel = Integer.parseInt(partes[1]);
                int puntaje = Integer.parseInt(partes[2]);
                lista.add(new Jugador(nombre, nivel, puntaje));
            }
        } catch (Exception e) {
            System.out.println("Error al leer: " + e.getMessage());
        }

        return lista;
    }

    public void mostrarJugadores() {
        ArrayList<Jugador> lista = leerJugadores();
        if (lista.isEmpty()) {
            System.out.println("No hay jugadores registrados.");
            return;
        }

        for (Jugador j : lista) {
            System.out.println(j);
        }
    }

    public void buscarPorNombre(String nombreBuscado) {
        ArrayList<Jugador> lista = leerJugadores();

        for (Jugador j : lista) {
            if (j.getNombre().equalsIgnoreCase(nombreBuscado)) {
                System.out.println("Jugador encontrado:");
                System.out.println(j);
                return;
            }
        }

        System.out.println("No existe un jugador con ese nombre.");
    }
}