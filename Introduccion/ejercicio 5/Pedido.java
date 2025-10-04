package introduccion;

public class Pedido {
    private String producto;
    private String entrega;
    public Pedido(String producto, String entrega) {
        this.producto = producto;
        this.entrega = entrega;
        System.out.println("Pedido creado: " + this.producto + ", Entrega:" + this.entrega);
    }
    public String getProducto() {
        return producto;
    }
    public void setProducto(String producto) {
        this.producto = producto;
    }
    public String getEntrega() {
        return entrega;
    }
    public void setEntrega(String entrega) {
        this.entrega = entrega;
    }
    @Override
    public String toString() {
        return "Pedido [Producto=" + producto + ", Entrega=" + entrega + "]";
    }
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Pedido eliminado: " + this.producto);
        super.finalize();
    }
}