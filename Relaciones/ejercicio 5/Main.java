package relaciones;
public class Main { 
    public static void main(String[] args) { 
        Speaker s1 = new Speaker("Laura", "Diaz", 35, 1001, "IA"); 
        Speaker s2 = new Speaker("Mario", "Rojas", 40, 1002, "Web"); 
 
        Participante p1 = new Participante("Ana", "Perez", 20, 2001, 1); 
        Participante p2 = new Participante("Luis", "Lopez", 22, 2002, 2); 
        Participante p3 = new Participante("Carlos", "Mendez", 25, 2003, 3); 
        Participante p4 = new Participante("Lucia", "Martinez", 23, 2004, 4); 
 
        Charla c1 = new Charla("Aula 1", "Introducción a IA", s1, new Participante[]{p1, 
p2}); 
        Charla c2 = new Charla("Aula 2", "Desarrollo Web", s2, new Participante[]{p3, p4}); 
 
        Evento evento = new Evento("Tech 2025", new Charla[]{c1, c2}); 
 
        System.out.println("Edad promedio de participantes: " + 
evento.edadPromedioEvento()); 
        System.out.println("¿Ana Perez está en el evento?: " + 
evento.personaEnEvento("Ana", "Perez")); 
        evento.eliminarCharlasPorSpeaker(1002); 
        evento.ordenarPorNumeroParticipantes(); 
    } 
}