package introduccion;

public class Persona {
    private String nombre;
    private String paterno;
    private String materno;
    private int edad;
    private String ci;
    
    public Persona (String nombre, String paterno, String materno, int edad, String ci){
        this.nombre = nombre;
        this.paterno = paterno;
        this.materno = materno;
        this.edad = edad;
        this.ci = ci;
    }
    
    public void mostrarDatos(){
        System.out.println(this.toString());
    }
    
    public boolean mayorDeEdad(){
        return this.edad >= 18;
    }
    
    public void modificarEdad(int nuevo){
        this.edad = nuevo;
    }
    
    public boolean mismoPaterno(Persona otra){
        if (otra == null) return false;
        if (this.paterno == null) return otra.paterno == null;
        return this.paterno.equalsIgnoreCase(otra.paterno);
    }
    @Override
    public String toString(){
        return "Persona{nombre='"+ nombre + "',paterno= '"+ paterno + "', materno='" + materno +"', edad =" + edad +",ci='" + ci+ "'}";
    }
}
