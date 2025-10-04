package introduccion;

public class Main {
    public static void main (String[]args){
        Mascota perro = new Mascota("Jacob", "Perro", 70);
        Mascota gato = new Mascota("Tom", "Gato", 80);
        System.out.println(perro);
        System.out.println(gato);
        perro.alimentar();
        perro.jugar();
        gato.alimentar();
        gato.jugar();
        System.out.println(perro);
        System.out.println(gato);
    }
}