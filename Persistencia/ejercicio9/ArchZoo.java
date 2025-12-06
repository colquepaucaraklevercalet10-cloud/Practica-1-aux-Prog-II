package ejercicio9;

import java.io.Writer;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class ArchZoo {
    private String nombreArchivo;
    private Gson gson = new Gson();

    public ArchZoo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    private List<Zoologico> leerLista() {
        try {
            Reader reader = Files.newBufferedReader(Paths.get(nombreArchivo));
            List<Zoologico> lista = gson.fromJson(reader, new TypeToken<List<Zoologico>>(){}.getType());
            reader.close();
            if (lista == null) return new ArrayList<>();
            return lista;
        } catch (Exception e) {
            return new ArrayList<>();
        }
    }

    private void escribirLista(List<Zoologico> lista) {
        try {
            Writer writer = Files.newBufferedWriter(Paths.get(nombreArchivo));
            gson.toJson(lista, writer);
            writer.close();
        } catch (Exception e) {}
    }

    public void crearArchivo() {
        escribirLista(new ArrayList<>());
    }

    public void agregar(Zoologico z) {
        List<Zoologico> lista = leerLista();
        lista.add(z);
        escribirLista(lista);
    }

    public void modificar(int id, Zoologico nuevo) {
        List<Zoologico> lista = leerLista();
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getId() == id) {
                lista.set(i, nuevo);
                break;
            }
        }
        escribirLista(lista);
    }

    public void eliminar(int id) {
        List<Zoologico> lista = leerLista();
        lista.removeIf(z -> z.getId() == id);
        escribirLista(lista);
    }

    public List<Zoologico> mayorVariedad() {
        List<Zoologico> lista = leerLista();
        List<Zoologico> res = new ArrayList<>();
        int max = 0;
        for (Zoologico z : lista) if (z.contarVariedades() > max) max = z.getNroAnimales();
        for (Zoologico z : lista) if (z.getNroAnimales() == max) res.add(z);
        return res;
    }

    public List<Zoologico> listarVacios() {
        List<Zoologico> lista = leerLista();
        List<Zoologico> res = new ArrayList<>();
        for (Zoologico z : lista) if (z.contarVariedades() == 0) res.add(z);
        return res;
    }

    public void eliminarVacios() {
        List<Zoologico> lista = leerLista();
        lista.removeIf(z -> z.contarVariedades() == 0);
        escribirLista(lista);
    }

    public List<Animal> animalesDeEspecie(String especie) {
        List<Zoologico> lista = leerLista();
        List<Animal> res = new ArrayList<>();
        for (Zoologico z : lista) {
            for (Animal a : z.getAnimales()) {
                if (a != null && a.getEspecie().equalsIgnoreCase(especie)) res.add(a);
            }
        }
        return res;
    }

    public void moverAnimales(int x, int y) {
        List<Zoologico> lista = leerLista();
        Zoologico zx = null, zy = null;
        for (Zoologico z : lista) {
            if (z.getId() == x) zx = z;
            if (z.getId() == y) zy = z;
        }
        if (zx == null || zy == null) return;

        Animal[] origen = zx.getAnimales();
        Animal[] destino = zy.getAnimales();

        int pos = zy.contarVariedades();
        for (Animal a : origen) {
            if (a != null && pos < 30) {
                destino[pos] = a;
                pos++;
            }
        }

        zx = new Zoologico(zx.getId(), zx.getNombre(), new Animal[30]);
        escribirLista(lista);
    }

    public List<Zoologico> listarTodos() {
        return leerLista();
    }
}