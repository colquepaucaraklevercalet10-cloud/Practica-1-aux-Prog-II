package ejercicio4;

import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import com.google.gson.Gson;

public class GsonLeerNotas {
    public static void main(String[] args) {
        try {
            ArchiNota arch = new ArchiNota("notas.json");
            arch.crearArchivo();

            Estudiante e1 = new Estudiante(101, "Carlos", "Perez", "Lopez", 20);
            Estudiante e2 = new Estudiante(102, "Maria", "Gomez", "Rios", 22);
            Estudiante e3 = new Estudiante(103, "Luis", "Vargas", "Mamani", 19);

            arch.agregar(new Nota("Matemática", 85, e1));
            arch.agregar(new Nota("Física", 92, e2));
            arch.agregar(new Nota("Matemática", 92, e3));
            arch.agregar(new Nota("Química", 70, e1));

            System.out.println("Estudiantes agregados:");
            for (Nota n : arch.getLista()) System.out.println(n);

            Reader reader = Files.newBufferedReader(Paths.get("notas.json"));
            Gson gson = new Gson();
            Nota[] listaLeida = gson.fromJson(reader, Nota[].class);

            System.out.println("\nNotas leídas del archivo:");
            for (Nota n : listaLeida) System.out.println(n);

            System.out.println("\nPromedio general:");
            System.out.println(arch.promedioNotas());

            System.out.println("\nMejores notas:");
            for (Nota n : arch.mejoresNotas()) System.out.println(n);

            System.out.println("\nEliminando materia Matemática...");
            arch.eliminarMateria("Matemática");

            System.out.println("\nLista final:");
            for (Nota n : arch.getLista()) System.out.println(n);

        } catch (Exception e) {
            System.out.println("Error en ejecución");
        }
    }
}