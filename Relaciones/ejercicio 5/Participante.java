package relaciones;
public class Participante extends Persona { 
    int nroTicket; 
 
    public Participante(String nombre, String apellido, int edad, int ci, int nroTicket) { 
        super(nombre, apellido, edad, ci); 
        this.nroTicket = nroTicket; 
    } 
}
