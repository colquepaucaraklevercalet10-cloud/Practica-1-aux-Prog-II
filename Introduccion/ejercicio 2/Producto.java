package introduccion;

public class Producto {
    private String nombre;
    private double precio;
    private int stock;
    
    public Producto(String nombre, double precio, int stock){
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }
    
    public void vender( int cantidad){
        if ( cantidad <= stock){
            stock = stock - cantidad;
            System.out.println("Se vendieron "+ cantidad + " unidades de "+ nombre);
        }else{
            System.out.println("No hay suficiente stock para vender "+ cantidad+ " unidades.");
        }
    }
    
    public void reabastecer (int cantidad){
        stock = stock + cantidad;
        System.out.println("Se reabastecieron "+ cantidad +" unidades de "+nombre);
    }
    
    @Override 
    public String toString(){
        return"Producto: " +nombre+ ", Precio: Bs "+ precio +", stock disponible: "+ stock;
    }
}