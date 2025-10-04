package introduccion;

public class Main {
    public static void main (String[] args){
        Bus b1 = new Bus(40, 1.50);
        b1.subirPasajeros(25);
        b1.cobrarPasaje();
        b1.asientosDisponibles();
    }
}