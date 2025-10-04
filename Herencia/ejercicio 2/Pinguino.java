package herencia;
public class Pinguino extends Animal {

    public Pinguino(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void desplazarse() {
        System.out.println(nombre + " nada y se desliza en el hielo.");
    }
}