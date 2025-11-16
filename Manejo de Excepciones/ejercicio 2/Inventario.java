package manejo.de.excepciones;

import java.util.ArrayList;

public class Inventario {
    private ArrayList<Producto> productos = new ArrayList<>();

    public void agregarProducto(Producto p) throws Exception {
        for (Producto prod : productos) {
            if (prod.getCodigo().equalsIgnoreCase(p.getCodigo())) {
                throw new Exception("El código ya existe: " + p.getCodigo());
            }
        }
        if (p.getPrecio() < 0 || p.getStock() < 0) {
            throw new Exception("Precio/stock no pueden ser negativos");
        }
        productos.add(p);
    }

    public Producto buscarProducto(String codigo) throws ProductoNoEncontradoException{
        for (Producto p : productos)
            if (p.getCodigo().equalsIgnoreCase(codigo))
                return p;
        throw new ProductoNoEncontradoException("Producto no encontrado: " + codigo);
    }

    public void venderProducto(String codigo, int cantidad)
            throws ProductoNoEncontradoException, StockInsuficienteException {
        Producto p = buscarProducto(codigo);
        if (p.getStock() < cantidad)
            throw new StockInsuficienteException("Stock insuficiente para vender " + cantidad);

        p.setStock(p.getStock() - cantidad);
    }

    public void listar() {
        System.out.println("\nInventario:");
        for (Producto p : productos) p.mostrar();
    }
}