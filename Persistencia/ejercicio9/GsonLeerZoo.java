package ejercicio9;

import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import com.google.gson.Gson;

public class GsonLeerZoo {
    public static void main(String[] args) {
        try {
            ArchZoo arch = new ArchZoo("zoo.json");
            arch.crearArchivo();

            Animal[] a1 = new Animal[30];
            a1[0] = new Animal("Felino", "Tigre", 2);
            a1[1] = new Animal("Ave", "Loro", 5);

            Animal[] a2 = new Animal[30];
            a2[0] = new Animal("Reptil", "Iguana", 3);

            Animal[] vacio = new Animal[30];

            arch.agregar(new Zoologico(1, "Zoo Central", a1));
            arch.agregar(new Zoologico(2, "Zoo Andino", a2));
            arch.agregar(new Zoologico(3, "Zoo Vacio", vacio));

            System.out.println("TODOS LOS ZOOLÓGICOS:");
            for (Zoologico z : arch.listarTodos()) System.out.println(z);

            System.out.println("\nZoológicos con mayor variedad:");
            for (Zoologico z : arch.mayorVariedad()) System.out.println(z);

            System.out.println("\nZoológicos vacíos:");
            for (Zoologico z : arch.listarVacios()) System.out.println(z);

            arch.eliminarVacios();
            System.out.println("\nDespués de eliminar vacíos y eliminados:");
            for (Zoologico z : arch.listarTodos()) System.out.println(z);

            System.out.println("\nAnimales de especie 'Felino':");
            for (Animal a : arch.animalesDeEspecie("Felino")) System.out.println(a);

            arch.moverAnimales(1, 2);
            System.out.println("\nDespués de mover animales del Zoo 1 al Zoo 2:");
            for (Zoologico z : arch.listarTodos()) System.out.println(z);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}