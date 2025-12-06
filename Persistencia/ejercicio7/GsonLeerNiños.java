package ejercicio7;

import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import com.google.gson.Gson;

public class GsonLeerNiños {
    public static void main(String[] args) {
        try {
            ArchNiño an = new ArchNiño("ninios.json");
            an.crearArchivo();
            GsonGuardarNiños.main(null);

            List<Niño> lista = an.leerTodos();

            System.out.println("A) Crear, leer, listar y mostrar:");
            for (Niño n : lista) System.out.println(n);

            System.out.println("\nB) Cantidad de niños con peso adecuado:");
            System.out.println(an.contarPesoAdecuado());

            System.out.println("\nC) Niños que no tienen peso o talla adecuada:");
            List<Niño> noAde = an.listarNoAdecuados();
            for (Niño n : noAde) System.out.println(n);

            System.out.println("\nD) Promedio de edad:");
            System.out.println(an.promedioEdad());

            System.out.println("\nE) Buscar niño por carnet (ci = 204):");
            Niño busc = an.buscarPorCi(204);
            if (busc != null) System.out.println(busc);
            else System.out.println("No encontrado");

            System.out.println("\nF) Niños con la talla más alta:");
            List<Niño> altos = an.tallaMaxima();
            for (Niño n : altos) System.out.println(n);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}