package ejercicio1;

import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import com.google.gson.Gson;

public class GsonLeerCharangos {

    public static void main(String[] args) {
        try {
            GestionCharangos g = new GestionCharangos();

            boolean[] a = { true, true, true, true, true, true, true, true, true, true };
            boolean[] b = { false, false, false, false, false, false, false, true, true, true };
            boolean[] c = { true, false, true, false, true, false, true, false, true, false };

            g.agregar(new Charango("Madera", 10, a));
            g.agregar(new Charango("Nogal", 8, b));
            g.agregar(new Charango("Roble", 12, c));
            g.agregar(new Charango("Madera", 10, c));

            System.out.println("Charangos creados:");
            for (Charango x : g.getLista()) System.out.println(x);

            GsonGuardarCharangos.guardar(g, "charangos.json");
            System.out.println("\nArchivo JSON generado.");

            Reader reader = Files.newBufferedReader(Paths.get("charangos.json"));
            Gson gson = new Gson();
            Charango[] listaLeida = gson.fromJson(reader, Charango[].class);

            System.out.println("\nCharangos leídos del archivo:");
            for (Charango x : listaLeida) System.out.println(x);

            g.eliminarSiMasDe6False();
            System.out.println("\nDespués de eliminar con más de 6 cuerdas en false:");
            for (Charango x : g.getLista()) System.out.println(x);

            System.out.println("\nCharangos de material 'Madera':");
            for (Charango x : g.listarPorMaterial("Madera")) System.out.println(x);

            System.out.println("\nCharangos con 10 cuerdas:");
            for (Charango x : g.buscar10Cuerdas()) System.out.println(x);

            g.ordenarPorMaterial();
            System.out.println("\nCharangos ordenados por material:");
            for (Charango x : g.getLista()) System.out.println(x);

        } catch (Exception e) {
            System.out.println("Error en la ejecución");
        }
    }
}