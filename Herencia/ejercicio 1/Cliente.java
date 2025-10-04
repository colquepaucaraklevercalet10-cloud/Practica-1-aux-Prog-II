package herencia;
public class Cliente extends Persona {
    private String nroCompra;
    private String idCliente;

    public Cliente(String nombre, String apellido, String ci, String nroCompra, String idCliente) {
        super(nombre, apellido, ci);
        this.nroCompra = nroCompra;
        this.idCliente = idCliente;
    }

    @Override
    public String mostrarDatos() {
        return "Cliente: " + nombre + " " + apellido + ", CI: " + ci +
               ", NroCompra: " + nroCompra + ", ID: " + idCliente;
    }
}