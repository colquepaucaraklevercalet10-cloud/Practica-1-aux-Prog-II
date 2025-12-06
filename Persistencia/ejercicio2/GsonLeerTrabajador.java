package ejercicio2;

import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

import com.google.gson.Gson;

public class GsonLeerTrabajador {
    public static void main(String[] args) {
        try {
            Gson gson = new Gson();

            Reader reader = Files.newBufferedReader(Paths.get("trabajadores.json"));

            Trabajador[] trabajadores = gson.fromJson(reader, Trabajador[].class);

            List<Trabajador> lista = Arrays.asList(trabajadores);

            for (Trabajador t : lista) {
                System.out.println(t.nombre + "  " + t.carnet + "  " + t.salario);
            }

            reader.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}