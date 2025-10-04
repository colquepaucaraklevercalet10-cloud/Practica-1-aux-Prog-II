package introduccion;

public class Main {
    public static void main (String[] args){
        Persona p1 = new Persona ( "Ana", "Gonzales", "Lopez", 20, "2983831");
        Persona p2 = new Persona ("Klever","Colque", "Paucara", 18, "14414631");
        p1.mostrarDatos();
        p2.mostrarDatos();
        System.out.println("¿Ana es mayor de edad?"+ p1.mayorDeEdad());
        System.out.println("¿Klever es mayor de edad?"+ p2.mayorDeEdad());
        System.out.println("¿Tienen el mismo apellido paterno?"+ p1.mismoPaterno(p2));
        p2.modificarEdad(16);
        System.out.println("Despues de modificar la edad de Klever:"+ p2.mayorDeEdad());
    }
}