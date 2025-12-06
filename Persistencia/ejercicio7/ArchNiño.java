package ejercicio7;

import java.io.FileWriter;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class ArchNiño {
    private String nombreArchivo;

    public ArchNiño(String nombreArchivo) { this.nombreArchivo = nombreArchivo; }

    public void crearArchivo() {
        try {
            Files.write(Paths.get(nombreArchivo), "[]".getBytes());
        } catch (Exception e) { e.printStackTrace(); }
    }

    public void guardarNinio(Niño n) {
        try {
            List<Niño> lista = leerTodos();
            lista.add(n);
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            String json = gson.toJson(lista);
            FileWriter fw = new FileWriter(nombreArchivo);
            fw.write(json);
            fw.close();
        } catch (Exception e) { e.printStackTrace(); }
    }

    public List<Niño> leerTodos() {
        try {
            Gson gson = new Gson();
            Reader reader = Files.newBufferedReader(Paths.get(nombreArchivo));
            Niño[] arr = gson.fromJson(reader, Niño[].class);
            reader.close();
            if (arr == null) return new ArrayList<>();
            return new ArrayList<>(Arrays.asList(arr));
        } catch (Exception e) { return new ArrayList<>(); }
    }

    public int contarPesoAdecuado() {
        List<Niño> lista = leerTodos();
        int c = 0;
        for (Niño n : lista) if (n.pesoAdecuado()) c++;
        return c;
    }

    public List<Niño> listarNoAdecuados() {
        List<Niño> lista = leerTodos();
        List<Niño> res = new ArrayList<>();
        for (Niño n : lista) if (!n.pesoAdecuado() || !n.tallaAdecuada()) res.add(n);
        return res;
    }

    public double promedioEdad() {
        List<Niño> lista = leerTodos();
        if (lista.isEmpty()) return 0;
        double s = 0;
        for (Niño n : lista) s += n.getEdad();
        return s / lista.size();
    }

    public Niño buscarPorCi(int ci) {
        List<Niño> lista = leerTodos();
        for (Niño n : lista) if (n.getCi() == ci) return n;
        return null;
    }

    public List<Niño> tallaMaxima() {
        List<Niño> lista = leerTodos();
        List<Niño> res = new ArrayList<>();
        if (lista.isEmpty()) return res;
        double max = lista.get(0).getTalla();
        for (Niño n : lista) if (n.getTalla() > max) max = n.getTalla();
        for (Niño n : lista) if (n.getTalla() == max) res.add(n);
        return res;
    }
}