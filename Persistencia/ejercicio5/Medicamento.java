package ejercicio5;

public class Medicamento {
    private String nombre;
    private int codMedicamento;
    private String tipo;
    private double precio;

    public Medicamento() {}

    public Medicamento(String nombre, int codMedicamento, String tipo, double precio) {
        this.nombre = nombre;
        this.codMedicamento = codMedicamento;
        this.tipo = tipo;
        this.precio = precio;
    }

    public String getNombre() { return nombre; }
    public int getCodMedicamento() { return codMedicamento; }
    public String getTipo() { return tipo; }
    public double getPrecio() { return precio; }

    @Override
    public String toString() {
        return nombre + " | cod:" + codMedicamento + " | tipo:" + tipo + " | precio:" + precio;
    }
}