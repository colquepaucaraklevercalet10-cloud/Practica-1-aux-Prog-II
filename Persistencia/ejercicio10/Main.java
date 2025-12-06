package ejercicio10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        JuegoEstrategia juego = new JuegoEstrategia();
        Scanner sc = new Scanner(System.in);
        int op;

        do {
            System.out.println("\n--- VIDEOJUEGO DE ESTRATEGIA ---");
            System.out.println("1. Registrar jugador");
            System.out.println("2. Mostrar todos los jugadores");
            System.out.println("3. Buscar jugador por nombre");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            op = sc.nextInt();
            sc.nextLine(); 

            switch (op) {
                case 1:
                    System.out.print("Nombre: ");
                    String n = sc.nextLine();
                    System.out.print("Nivel: ");
                    int niv = sc.nextInt();
                    System.out.print("Puntaje: ");
                    int p = sc.nextInt();
                    sc.nextLine();

                    juego.guardarJugador(new Jugador(n, niv, p));
                    System.out.println("Jugador guardado.");
                    break;

                case 2:
                    juego.mostrarJugadores();
                    break;

                case 3:
                    System.out.print("Nombre del jugador a buscar: ");
                    String buscar = sc.nextLine();
                    juego.buscarPorNombre(buscar);
                    break;

                case 4:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }

        } while (op != 4);
    }
}