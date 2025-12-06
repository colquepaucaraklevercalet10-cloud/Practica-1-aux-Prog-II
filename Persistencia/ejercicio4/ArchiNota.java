package ejercicio4;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class ArchiNota {
    private String nombreArchi;
    private ArrayList<Nota> lista = new ArrayList<>();

    public ArchiNota(String nombreArchi) {
        this.nombreArchi = nombreArchi;
    }

    public void crearArchivo() {
        try {
            Files.write(Paths.get(nombreArchi), "[]".getBytes());
        } catch (Exception e) {}
    }

    public void agregar(Nota n) {
        try {
            lista.add(n);
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            String json = gson.toJson(lista);
            Files.write(Paths.get(nombreArchi), json.getBytes());
        } catch (Exception e) {}
    }

    public float promedioNotas() {
        float s = 0;
        for (Nota n : lista) s += n.getNotaFinal();
        return lista.size() == 0 ? 0 : s / lista.size();
    }

    public ArrayList<Nota> mejoresNotas() {
        ArrayList<Nota> res = new ArrayList<>();
        if (lista.size() == 0) return res;
        float max = lista.get(0).getNotaFinal();
        for (Nota n : lista)
            if (n.getNotaFinal() > max)
                max = n.getNotaFinal();
        for (Nota n : lista)
            if (n.getNotaFinal() == max)
                res.add(n);
        return res;
    }

    public void eliminarMateria(String m) {
        lista.removeIf(n -> n.getMateria().equalsIgnoreCase(m));
        try {
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            String json = gson.toJson(lista);
            Files.write(Paths.get(nombreArchi), json.getBytes());
        } catch (Exception e) {}
    }

    public ArrayList<Nota> getLista() {
        return lista;
    }
}