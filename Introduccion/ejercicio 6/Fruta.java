package introduccion;

public class Fruta {
    private String nombre;
    private String tipo;
    private int nroVitaminas;
    private String[] v = new String [30];
    
    public Fruta(){
        this.nroVitaminas = 0;
    }
    public Fruta(String nombre, String tipo){
        this.nombre = nombre;
        this.tipo = tipo;
        this.nroVitaminas = 0;
    }
    public Fruta(String nombre, String tipo, int nroVitaminas, String[] vitaminas){
        this.nombre = nombre;
        this.tipo = tipo;
        this.nroVitaminas = nroVitaminas;
        for (int i = 0; i < nroVitaminas; i++) {
            this.v[i] = vitaminas[i];
        }
    }

    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setTipo(String tipo) { this.tipo = tipo; }
    public void setNroVitaminas(int nro) { this.nroVitaminas = nro; }
    public void setVitamina(int i, String vit) { this.v[i] = vit; }

    public String getNombre() { return nombre; }
    public String getTipo() { return tipo; }
    public int getNroVitaminas() { return nroVitaminas; }
    public String getVitamina(int i) { return v[i]; }
    @Override
    public String toString() {
        String info = "Fruta: " + nombre + "\nTipo: " + tipo + "\nNroVitaminas: " + nroVitaminas + "\nVitaminas: ";
        for (int i = 0; i < nroVitaminas; i++) {
            info += v[i] + " ";
        }
        return info;
    }
}
