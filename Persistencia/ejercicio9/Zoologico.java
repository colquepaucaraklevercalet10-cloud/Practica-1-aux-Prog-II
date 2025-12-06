package ejercicio9;

public class Zoologico {
    private int id;
    private String nombre;
    private int nroAnimales;
    private Animal[] animales = new Animal[30];

    public Zoologico() {}

    public Zoologico(int id, String nombre, Animal[] animales) {
        this.id = id;
        this.nombre = nombre;
        this.animales = animales;
        this.nroAnimales = contarVariedades();
    }

    public int getId() { return id; }
    public String getNombre() { return nombre; }
    public int getNroAnimales() { return nroAnimales; }
    public Animal[] getAnimales() { return animales; }

    public void setId(int id) { this.id = id; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public int contarVariedades() {
        int c = 0;
        for (Animal a : animales) if (a != null) c++;
        nroAnimales = c;
        return c;
    }

    @Override
    public String toString() {
        return "Zoologico{id=" + id + ", nombre='" + nombre + "', variedades=" + nroAnimales + "}";
    }
}