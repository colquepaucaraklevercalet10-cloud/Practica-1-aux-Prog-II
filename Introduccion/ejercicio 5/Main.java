package introduccion;

public class Main {
    public static void main (String[]args){
        Empleado empleado1 = new Empleado("Ana", "08:00-16:00");
        Pedido pedido1 = new Pedido("Café", "12:30");
        System.out.println(empleado1);
        System.out.println(pedido1);
        empleado1 = null;
        pedido1 = null;
        System.gc(); 
    }
}