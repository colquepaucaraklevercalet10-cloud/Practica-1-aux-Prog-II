package introduccion;

public class Bus {
    private int capacidadTotal;
    private int pasajerosActuales;
    private double costoPasaje;
    
    public Bus(int capacidadTotal, double costoPasaje){
        this.capacidadTotal = capacidadTotal;
        this.pasajerosActuales = 0;
        this.costoPasaje = costoPasaje;
    }
    public void subirPasajeros(int cantidad){
        if(pasajerosActuales + cantidad <= capacidadTotal ){
            pasajerosActuales = pasajerosActuales + cantidad;
            System.out.println(cantidad + " pasajeros subieron al autobus");
        } else {
            int disponibles = capacidadTotal - pasajerosActuales;
            System.out.println("Solo pueden subir " + disponibles + " pasajeros mas");
        }
    }
    public double cobrarPasaje(){
        double total = pasajerosActuales * costoPasaje;
        System.out.println("Total cobrado:" + total + " Bs");
        return total;
    }
    public int asientosDisponibles(){
        int disponibles = capacidadTotal - pasajerosActuales;
        System.out.println("Asientos disponibles:" + disponibles);
        return disponibles;
    }
}