package relaciones;
import java.util.*;
public class Evento { 
    String nombre; 
    Charla[] charlas; 
 
    public Evento(String nombre, Charla[] charlas) { 
        this.nombre = nombre; 
        this.charlas = charlas; 
    } 

    public double edadPromedioEvento() { 
        double suma = 0; 
        int count = 0; 
        for (Charla c : charlas) 
            for (Participante p : c.participantes) { 
                suma += p.edad; 
                count++; 
            } 
        return (count == 0) ? 0 : suma / count; 
    } 
 
    public boolean personaEnEvento(String nombre, String apellido) { 
        for (Charla c : charlas) 
            if (c.contienePersona(nombre, apellido)) 
                return true; 
        return false; 
    } 
 
    public void eliminarCharlasPorSpeaker(int ci) { 
        List<Charla> lista = new ArrayList<>(Arrays.asList(charlas)); 
        lista.removeIf(c -> c.speaker.ci == ci); 
        charlas = lista.toArray(new Charla[0]); 
        System.out.println("Charlas del speaker con CI " + ci + " eliminadas."); 
    } 
 
    public void ordenarPorNumeroParticipantes() { 
        Arrays.sort(charlas, Comparator.comparingInt(Charla::getNumeroParticipantes)); 
        System.out.println("Charlas ordenadas por número de participantes:"); 
        for (Charla c : charlas) 
            System.out.println(c.nombreCharla + " - Participantes: " + 
c.getNumeroParticipantes()); 
    } 
}

