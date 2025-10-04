package introduccion;

public class Mascota {
    private String nombre;
    private String tipo;
    private int energia;
    
    public Mascota(String nombre, String tipo, int energia){
        this.nombre = nombre;
        this.tipo = tipo;
        this.energia = energia;
    }
    
    public void alimentar(){
        energia = energia + 20;
        if(energia > 100){
            energia = 100;
        }
        System.out.println(nombre + " ha sido alimentado. Energia actual: " + energia);
    }
    
    public void jugar(){
        energia = energia - 15;
        if(energia < 0){
            energia = 0;
        }
        System.out.println(nombre + " ha jugado. Energia actual: "+ energia);
    }
    
    @Override
    public String toString(){
        return "Mascota [nombre=" + nombre + ",tipo="+ tipo +", energia=" +energia+ "]";
    }
}