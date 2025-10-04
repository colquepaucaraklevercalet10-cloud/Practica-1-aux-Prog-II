package herencia;
class Vehiculo {
    protected String conductor;
    protected String placa;
    protected int id;

    public Vehiculo(String conductor, String placa, int id) {
        this.conductor = conductor;
        this.placa = placa;
        this.id = id;
    }

    public String getConductor() {
        return conductor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setConductor(String nuevoConductor) {
        this.conductor = nuevoConductor;
    }

    @Override
    public String toString() {
        return "Placa: " + placa + ", Conductor: " + conductor;
    }
}