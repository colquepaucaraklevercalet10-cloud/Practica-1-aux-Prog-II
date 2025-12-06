package ejercicio3;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class ArchivoProducto {
    private String nomA;
    private ArrayList<Producto> lista = new ArrayList<>();

    public ArchivoProducto(String nomA) {
        this.nomA = nomA;
    }

    public void crearArchivo() {
        try {
            Files.write(Paths.get(nomA), "[]".getBytes());
        } catch (Exception e) {
            System.out.println("Error");
        }
    }

    public void guardarProducto(Producto p) {
        try {
            lista.add(p);
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            String json = gson.toJson(lista);
            Files.write(Paths.get(nomA), json.getBytes());
        } catch (Exception e) {
            System.out.println("Error");
        }
    }

    public Producto buscaProducto(int c) {
        for (Producto p : lista)
            if (p.getCodigo() == c)
                return p;
        return null;
    }

    public float promedioPrecios() {
        float s = 0;
        for (Producto p : lista)
            s += p.getPrecio();
        return lista.size() == 0 ? 0 : s / lista.size();
    }

    public Producto productoMasCaro() {
        if (lista.size() == 0) return null;
        Producto m = lista.get(0);
        for (Producto p : lista)
            if (p.getPrecio() > m.getPrecio())
                m = p;
        return m;
    }

    public ArrayList<Producto> getLista() {
        return lista;
    }
}