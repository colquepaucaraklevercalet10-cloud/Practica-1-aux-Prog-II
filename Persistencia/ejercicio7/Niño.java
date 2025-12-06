package ejercicio7;

public class Niño extends Persona {
    private int edad;
    private double peso;
    private double talla;

    public Niño() {}

    public Niño(int ci, String nombre, String apellidoPaterno, String apellidoMaterno, int edad, double peso, double talla) {
        super(nombre, apellidoPaterno, apellidoMaterno, ci);
        this.edad = edad;
        this.peso = peso;
        this.talla = talla;
    }

    public int getEdad() { return edad; }
    public double getPeso() { return peso; }
    public double getTalla() { return talla; }

    public boolean pesoAdecuado() {
        double min = 0, max = Double.MAX_VALUE;
        switch (edad) {
            case 1: min = 8; max = 12; break;
            case 2: min = 10; max = 14; break;
            case 3: min = 12; max = 16; break;
            case 4: min = 14; max = 20; break;
            case 5: min = 16; max = 22; break;
            case 6: min = 18; max = 25; break;
            case 7: min = 20; max = 28; break;
            case 8: min = 22; max = 30; break;
            case 9: min = 24; max = 34; break;
            case 10: min = 26; max = 38; break;
            default:
                min = 10;
                max = 100;
        }
        return peso >= min && peso <= max;
    }

    public boolean tallaAdecuada() {
        double min = 0, max = Double.MAX_VALUE;
        switch (edad) {
            case 1: min = 0.70; max = 0.85; break;
            case 2: min = 0.80; max = 0.95; break;
            case 3: min = 0.90; max = 1.00; break;
            case 4: min = 0.95; max = 1.10; break;
            case 5: min = 1.00; max = 1.20; break;
            case 6: min = 1.05; max = 1.25; break;
            case 7: min = 1.15; max = 1.30; break;
            case 8: min = 1.20; max = 1.35; break;
            case 9: min = 1.25; max = 1.40; break;
            case 10: min = 1.30; max = 1.50; break;
            default:
                min = 0.7;
                max = 2.5;
        }
        return talla >= min && talla <= max;
    }

    @Override
    public String toString() {
        return super.toString() + " | Edad:" + edad + " | Peso:" + peso + "kg | Talla:" + talla + "m";
    }
}