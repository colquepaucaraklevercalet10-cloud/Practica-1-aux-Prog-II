package ejercicio6;

import java.io.FileWriter;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class ArchPrestamo {
    private String nomArch;

    public ArchPrestamo(String nomArch) { this.nomArch = nomArch; }

    public void crearArchivo() {
        try {
            Files.write(Paths.get(nomArch), "[]".getBytes());
        } catch (Exception e) { e.printStackTrace(); }
    }

    public void guardarPrestamo(Prestamo p) {
        try {
            List<Prestamo> lista = leerTodos();
            lista.add(p);
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            String json = gson.toJson(lista);
            FileWriter fw = new FileWriter(nomArch);
            fw.write(json);
            fw.close();
        } catch (Exception e) { e.printStackTrace(); }
    }

    public List<Prestamo> leerTodos() {
        try {
            Gson gson = new Gson();
            Reader reader = Files.newBufferedReader(Paths.get(nomArch));
            Prestamo[] arr = gson.fromJson(reader, Prestamo[].class);
            reader.close();
            if (arr == null) return new ArrayList<>();
            return new ArrayList<>(Arrays.asList(arr));
        } catch (Exception e) { return new ArrayList<>(); }
    }
}