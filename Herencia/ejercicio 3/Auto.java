package herencia;
class Auto extends Vehiculo {
    private int caballosFuerza;
    private boolean descapotable;

    public Auto(String conductor, String placa, int id, int caballosFuerza, boolean descapotable) {
        super(conductor, placa, id);
        this.caballosFuerza = caballosFuerza;
        this.descapotable = descapotable;
    }

    @Override
    public String toString() {
        return "Auto -> " + super.toString() + ", CaballosFuerza: " + caballosFuerza + ", Descapotable: " + descapotable;
    }
}