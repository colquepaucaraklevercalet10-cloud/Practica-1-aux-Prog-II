package herencia;
public class Triatleta implements Nadador, Ciclista, Corredor {
    private String nombre;
    private String estiloNatacion;
    private String tipoBicicleta;
    private int distanciaPreferida;

    public Triatleta(String nombre, String estiloNatacion, String tipoBicicleta, int distanciaPreferida) {
        this.nombre = nombre;
        this.estiloNatacion = estiloNatacion;
        this.tipoBicicleta = tipoBicicleta;
        this.distanciaPreferida = distanciaPreferida;
    }

    @Override
    public void nadar() {
        System.out.println(nombre + " nadando estilo " + estiloNatacion);
    }

    @Override
    public void pedalear() {
        System.out.println(nombre + " pedaleando en bicicleta tipo " + tipoBicicleta);
    }

    @Override
    public void correr() {
        System.out.println(nombre + " corriendo una distancia de " + distanciaPreferida + " km");
    }

    @Override
    public String toString() {
        return "Triatleta: " + nombre + " [Natación: " + estiloNatacion + ", Bicicleta: " 
                + tipoBicicleta + ", Distancia: " + distanciaPreferida + " km]";
    }
}
