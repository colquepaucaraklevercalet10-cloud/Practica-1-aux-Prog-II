package introduccion;

public class Main {
    public static void main (String[]args){
        Buzon b1 = new Buzon(1, 3);
        Buzon b2 = new Buzon(2, 3);
        Buzon b3 = new Buzon(3, 3);
        Carta c1 = new Carta("C123", "Hola amigo, te escribo para saludarte.", "Juan Álvarez", "Peter Chaves");
        Carta c2 = new Carta("C456", "Querido amigo, ella no te ama...", "Pepe Mujica", "Wilmer Pérez");
        Carta c3 = new Carta("C789", "Feliz cumpleaños, con mucho amor.", "Paty Vasques", "Pepe Mujica");
        b1.agregarCarta(c1, 0, 0);
        b1.agregarCarta(c2, 0, 1);
        b1.agregarCarta(c3, 0, 2);
        System.out.println("Cartas recibidas por 'Pepe Mujica': " + b1.contarCartasPorDestinatario("Pepe Mujica"));
        b1.eliminarCarta("C456");
        System.out.println("¿Ha enviado cartas Pepe Mujica?: " + b1.verificarRemitente("Pepe Mujica"));
        System.out.println("Cartas que contienen la palabra 'amor':");
        b1.buscarPorPalabraClave("amor");
        System.out.println(b1);
    }
}