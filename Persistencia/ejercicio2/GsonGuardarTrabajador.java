package ejercicio2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;

public class GsonGuardarTrabajador {
    public static void main(String[] args) {
        try {
            Gson gson = new Gson();

            List<Trabajador> lista = new ArrayList<>();

            lista.add(new Trabajador("Juan", 123, 2500));
            lista.add(new Trabajador("Maria", 456, 3200));
            lista.add(new Trabajador("Luis", 789, 1500));

            String cadena = gson.toJson(lista);

            FileWriter writer = new FileWriter("trabajadores.json");
            writer.write(cadena);
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
