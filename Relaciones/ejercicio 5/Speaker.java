package relaciones;
public class Speaker extends Persona { 
    String especialidad; 
 
    public Speaker(String nombre, String apellido, int edad, int ci, String especialidad) { 
        super(nombre, apellido, edad, ci); 
        this.especialidad = especialidad; 
    } 
}
