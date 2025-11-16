package relaciones;
public class Charla { 
    String lugar, nombreCharla; 
    Speaker speaker; 
    Participante[] participantes; 
 
    public Charla(String lugar, String nombreCharla, Speaker speaker, Participante[] 
participantes) { 
        this.lugar = lugar; 
        this.nombreCharla = nombreCharla; 
        this.speaker = speaker; 
        this.participantes = participantes; 
    } 
 
    public int getNumeroParticipantes() { 
        return participantes.length; 
    } 
 
    public double getEdadPromedioParticipantes() { 
        double suma = 0; 
        for (Participante p : participantes) suma += p.edad; 
        return suma / participantes.length; 
    } 
 
    public boolean contienePersona(String nombre, String apellido) { 
        if (speaker.nombre.equals(nombre) && speaker.apellido.equals(apellido)) return 
true; 
        for (Participante p : participantes) 
            if (p.nombre.equals(nombre) && p.apellido.equals(apellido)) 
                return true; 
        return false; 
    } 
}

