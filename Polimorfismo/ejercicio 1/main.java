package polimorfismo;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Videojuego juego1 = new Videojuego("FIFA 24", "PS5");
        Videojuego juego2 = new Videojuego("Minecraft", "PC", 4);

        juego1.agregarJugadores(); 
        System.out.print("Ingrese cantidad de jugadores para FIFA 24: ");
        int cantidad1 = sc.nextInt();
        juego1.agregarJugadores(cantidad1);

        juego2.agregarJugadores(); 
        System.out.print("Ingrese cantidad de jugadores para Minecraft: ");
        int cantidad2 = sc.nextInt();
        juego2.agregarJugadores(cantidad2);

        System.out.println(juego1);
        System.out.println(juego2);

        sc.close();
    }
}