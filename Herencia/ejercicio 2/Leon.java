package herencia;
public class Leon extends Animal {

    public Leon(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void desplazarse() {
        System.out.println(nombre + " camina con fuerza.");
    }
}