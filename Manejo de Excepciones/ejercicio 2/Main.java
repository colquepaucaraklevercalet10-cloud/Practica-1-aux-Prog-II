package manejo.de.excepciones;

public class Main {
    public static void main(String[] args) {
        Inventario inv = new Inventario();
        try {
            inv.agregarProducto(new Producto("P1", "Laptop", 2500, 5));
            inv.agregarProducto(new Producto("P2", "Mouse", 40, 20));

            inv.listar();

            inv.venderProducto("P1", 3);
            inv.listar();

            inv.venderProducto("P1", 5);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
