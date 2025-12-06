package ejercicio1;

public class Charango {
    private String material;
    private int nroCuerdas;
    private boolean[] cuerdas;

    public Charango(String material, int nroCuerdas, boolean[] cuerdas) {
        this.material = material;
        this.nroCuerdas = nroCuerdas;
        this.cuerdas = cuerdas;
    }

    public String getMaterial() {
        return material;
    }

    public int getNroCuerdas() {
        return nroCuerdas;
    }

    public boolean[] getCuerdas() {
        return cuerdas;
    }

    public int contarFalse() {
        int c = 0;
        for (boolean b : cuerdas) if (!b) c++;
        return c;
    }

    @Override
    public String toString() {
        String e = "";
        for (boolean b : cuerdas) e += (b ? "1 " : "0 ");
        return "Material: " + material + ", Cuerdas: " + nroCuerdas + ", Estado: " + e;
    }
}