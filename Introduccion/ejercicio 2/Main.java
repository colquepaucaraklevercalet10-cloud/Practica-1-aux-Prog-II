package introduccion;

public class Main {
    public static void main (String[] args){
        Producto p1 = new Producto("Laptop", 3500.0, 10);
        System.out.println(p1);
        p1.vender(3);
        System.out.println(p1);
        p1.reabastecer(5);
        System.out.println(p1);
    }
}
