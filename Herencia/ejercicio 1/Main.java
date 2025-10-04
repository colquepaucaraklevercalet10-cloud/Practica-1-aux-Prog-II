package herencia;
public class Main {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("Juan", "Vargas", "123456", "N001", "C45");
        Jefe j1 = new Jefe("Ana", "Torres", "789012", "Sucursal Lima", "General");

        System.out.println(c1.mostrarDatos());
        System.out.println(j1.mostrarDatos());
    }
}