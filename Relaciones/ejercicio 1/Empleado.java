package relaciones;
public class Empleado {
    private String  nombre,cargo;
    private double sueldo;
    
    public Empleado(){
        nombre="Gerson";
        cargo="Supervisor";
        sueldo=1200;
    }
    public Empleado(String n){
        nombre=n;
        cargo="gerente";
        sueldo=3000;
    } 
    public void mostrar(){
        System.out.println(nombre+" "+cargo+" "+sueldo);
    }
    public double getSueldo() {
        return sueldo;
    }
    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}

