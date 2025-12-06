package ejercicio8;

import java.io.Writer;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class ArchReFri {
    private String nombreArchivo;
    private Gson gson = new Gson();

    public ArchReFri(String nombreArchivo) { this.nombreArchivo = nombreArchivo; }

    private List<Alimento> leerLista() {
        try {
            Reader reader = Files.newBufferedReader(Paths.get(nombreArchivo));
            List<Alimento> lista = gson.fromJson(reader, new TypeToken<List<Alimento>>(){}.getType());
            reader.close();
            if (lista == null) return new ArrayList<>();
            return lista;
        } catch (Exception e) {
            return new ArrayList<>();
        }
    }

    private void escribirLista(List<Alimento> lista) {
        try {
            Writer writer = Files.newBufferedWriter(Paths.get(nombreArchivo));
            gson.toJson(lista, writer);
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void crearArchivo() {
        escribirLista(new ArrayList<>());
    }

    public void agregar(Alimento a) {
        List<Alimento> lista = leerLista();
        lista.add(a);
        escribirLista(lista);
    }

    public void modificarPorNombre(String nombre, Alimento nuevo) {
        List<Alimento> lista = leerLista();
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getNombre().equalsIgnoreCase(nombre)) {
                lista.set(i, nuevo);
                break;
            }
        }
        escribirLista(lista);
    }

    public void eliminarPorNombre(String nombre) {
        List<Alimento> lista = leerLista();
        lista.removeIf(a -> a.getNombre().equalsIgnoreCase(nombre));
        escribirLista(lista);
    }

    public List<Alimento> caducaronAntesDe(String fechaX) {
        List<Alimento> lista = leerLista();
        List<Alimento> res = new ArrayList<>();
        for (Alimento a : lista) {
            if (a.getFechaVencimiento().compareTo(fechaX) < 0) res.add(a);
        }
        return res;
    }

    public void eliminarCantidadCero() {
        List<Alimento> lista = leerLista();
        lista.removeIf(a -> a.getCantidad() == 0);
        escribirLista(lista);
    }

    public List<Alimento> vencidos() {
        String hoy = java.time.LocalDate.now().toString();
        List<Alimento> lista = leerLista();
        List<Alimento> res = new ArrayList<>();
        for (Alimento a : lista) {
            if (a.getFechaVencimiento().compareTo(hoy) < 0) res.add(a);
        }
        return res;
    }

    public Alimento mayorCantidad() {
        List<Alimento> lista = leerLista();
        if (lista.isEmpty()) return null;
        Alimento max = lista.get(0);
        for (Alimento a : lista) {
            if (a.getCantidad() > max.getCantidad()) max = a;
        }
        return max;
    }

    public List<Alimento> listarTodos() {
        return leerLista();
    }
}