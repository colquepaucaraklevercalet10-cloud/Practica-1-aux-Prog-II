package herencia;
class Moto extends Vehiculo {
    private int cilindrada;
    private boolean casco;

    public Moto(String conductor, String placa, int id, int cilindrada, boolean casco) {
        super(conductor, placa, id);
        this.cilindrada = cilindrada;
        this.casco = casco;
    }

    @Override
    public String toString() {
        return "Moto -> " + super.toString() + ", Cilindrada: " + cilindrada + ", Casco: " + casco;
    }
}