package ejercicio6;

import java.io.FileWriter;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class ArchLibro {
    private String nomArch;

    public ArchLibro(String nomArch) { this.nomArch = nomArch; }

    public void crearArchivo() {
        try {
            Files.write(Paths.get(nomArch), "[]".getBytes());
        } catch (Exception e) { e.printStackTrace(); }
    }

    public void guardarLibro(Libro p) {
        try {
            List<Libro> lista = leerTodos();
            lista.add(p);
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            String json = gson.toJson(lista);
            FileWriter fw = new FileWriter(nomArch);
            fw.write(json);
            fw.close();
        } catch (Exception e) { e.printStackTrace(); }
    }

    public List<Libro> leerTodos() {
        try {
            Gson gson = new Gson();
            Reader reader = Files.newBufferedReader(Paths.get(nomArch));
            Libro[] arr = gson.fromJson(reader, Libro[].class);
            reader.close();
            if (arr == null) return new ArrayList<>();
            return new ArrayList<>(Arrays.asList(arr));
        } catch (Exception e) { return new ArrayList<>(); }
    }
}