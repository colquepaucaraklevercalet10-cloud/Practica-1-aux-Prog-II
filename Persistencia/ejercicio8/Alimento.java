package ejercicio8;

public class Alimento {
    private String nombre;
    private String fechaVencimiento;
    private int cantidad;

    public Alimento() {}

    public Alimento(String nombre, String fechaVencimiento, int cantidad) {
        this.nombre = nombre;
        this.fechaVencimiento = fechaVencimiento;
        this.cantidad = cantidad;
    }

    public String getNombre() { return nombre; }
    public String getFechaVencimiento() { return fechaVencimiento; }
    public int getCantidad() { return cantidad; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setFechaVencimiento(String fecha) { this.fechaVencimiento = fecha; }
    public void setCantidad(int cantidad) { this.cantidad = cantidad; }

    @Override
    public String toString() {
        return "Alimento{nombre='" + nombre + "', fechaVencimiento='" + fechaVencimiento + "', cantidad=" + cantidad + "}";
    }
}