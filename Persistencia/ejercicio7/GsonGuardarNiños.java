package ejercicio7;

import java.io.FileWriter;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.ArrayList;
import java.util.List;

public class GsonGuardarNiños {
    public static void main(String[] args) {
        try {
            List<Niño> lista = new ArrayList<>();
            lista.add(new Niño(201, "Carlos", "Perez", "Lopez", 3, 13.0, 0.95));
            lista.add(new Niño(202, "Ana", "Gonzales", "Ramos", 5, 18.0, 1.12));
            lista.add(new Niño(203, "Luis", "Mamani", "Quispe", 4, 10.0, 0.90));
            lista.add(new Niño(204, "Sofia", "Alvarez", "Diaz", 7, 26.0, 1.18));
            lista.add(new Niño(205, "Mateo", "Rivera", "Flores", 2, 9.0, 0.82));
            lista.add(new Niño(206, "Elena", "Vargas", "Cano", 6, 16.0, 1.10));
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            String json = gson.toJson(lista);
            FileWriter fw = new FileWriter("ninios.json");
            fw.write(json);
            fw.close();
        } catch (Exception e) { e.printStackTrace(); }
    }
}