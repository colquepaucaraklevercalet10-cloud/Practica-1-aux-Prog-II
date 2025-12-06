package ejercicio6;

import java.io.FileWriter;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class ArchCliente {
    private String nomArch;

    public ArchCliente(String nomArch) { this.nomArch = nomArch; }

    public void crearArchivo() {
        try {
            Files.write(Paths.get(nomArch), "[]".getBytes());
        } catch (Exception e) { e.printStackTrace(); }
    }

    public void guardarCliente(Cliente c) {
        try {
            List<Cliente> lista = leerTodos();
            lista.add(c);
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            String json = gson.toJson(lista);
            FileWriter fw = new FileWriter(nomArch);
            fw.write(json);
            fw.close();
        } catch (Exception e) { e.printStackTrace(); }
    }

    public List<Cliente> leerTodos() {
        try {
            Gson gson = new Gson();
            Reader reader = Files.newBufferedReader(Paths.get(nomArch));
            Cliente[] arr = gson.fromJson(reader, Cliente[].class);
            reader.close();
            if (arr == null) return new ArrayList<>();
            return new ArrayList<>(Arrays.asList(arr));
        } catch (Exception e) { return new ArrayList<>(); }
    }
}