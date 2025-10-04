package introduccion;

public class Empleado {
    private String nombre;
    private String horario;
    
    public Empleado(String nombre, String horario){
        this.nombre = nombre;
        this.horario = horario;
        System.out.println("Empleado creado: "+ nombre + ", Horario="+ horario);
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getHorario(String horario){
        return horario;
    }
    public void setHorario(String horario){
        this.horario = horario;
    }
    @Override
    public String toString(){
        return "Empleado [Nombre=" + nombre + ", Horario=" + horario + "]";
    } 
    @Override
    protected void finalize () throws Throwable{
        System.out.println("Empleado eliminado: " + this.nombre);
        super.finalize();
    }
}