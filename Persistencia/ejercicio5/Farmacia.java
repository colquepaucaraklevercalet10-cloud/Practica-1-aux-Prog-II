package ejercicio5;

import java.util.ArrayList;
import java.util.List;

public class Farmacia {
    private String nombreFarmacia;
    private int sucursal;
    private String direccion;
    private List<Medicamento> medicamentos = new ArrayList<>();

    public Farmacia() {}

    public Farmacia(String nombreFarmacia, int sucursal, String direccion) {
        this.nombreFarmacia = nombreFarmacia;
        this.sucursal = sucursal;
        this.direccion = direccion;
    }

    public String getNombreFarmacia() { return nombreFarmacia; }
    public int getSucursal() { return sucursal; }
    public String getDireccion() { return direccion; }
    public List<Medicamento> getMedicamentos() { return medicamentos; }

    public void agregarMedicamento(Medicamento m) { medicamentos.add(m); }

    public void mostrar() {
        System.out.println("Farmacia: " + nombreFarmacia + " | Sucursal: " + sucursal + " | Dirección: " + direccion);
        for (Medicamento m : medicamentos) System.out.println("  " + m);
    }

    public void mostrarMedicamentosTipo(String tipo) {
        for (Medicamento m : medicamentos) if (m.getTipo().equalsIgnoreCase(tipo)) System.out.println("  " + m);
    }

    public boolean tieneMedicamento(String nombreMed) {
        for (Medicamento m : medicamentos) if (m.getNombre().equalsIgnoreCase(nombreMed)) return true;
        return false;
    }

    public void moverMedicamentosTipoHacia(String tipo, Farmacia destino) {
        List<Medicamento> aMover = new ArrayList<>();
        for (Medicamento m : medicamentos) if (m.getTipo().equalsIgnoreCase(tipo)) aMover.add(m);
        medicamentos.removeAll(aMover);
        destino.getMedicamentos().addAll(aMover);
    }
}