package ejercicio1;

import java.nio.file.Files;
import java.nio.file.Paths;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class GsonGuardarCharangos {
    public static void guardar(GestionCharangos g, String archivo) {
        try {
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            String json = gson.toJson(g.getLista());
            Files.write(Paths.get(archivo), json.getBytes());
        } catch (Exception e) {
            System.out.println("Error al guardar");
        }
    }
}