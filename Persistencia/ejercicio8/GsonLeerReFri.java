package ejercicio8;

import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import com.google.gson.Gson;

public class GsonLeerReFri {
    public static void main(String[] args) {
        try {
            ArchReFri arch = new ArchReFri("refrigerio.json");
            arch.crearArchivo();

            arch.agregar(new Alimento("Leche", "2025-01-10", 2));
            arch.agregar(new Alimento("Queso", "2024-12-01", 0));
            arch.agregar(new Alimento("Yogurt", "2023-10-05", 5));
            arch.agregar(new Alimento("Pan", "2023-05-20", 1));

            System.out.println("TODOS LOS ALIMENTOS:");
            for (Alimento a : arch.listarTodos()) System.out.println(a);

            arch.modificarPorNombre("Leche", new Alimento("Leche Entera", "2025-01-10", 3));
            System.out.println("\nDESPUÉS DE MODIFICAR 'Leche':");
            for (Alimento a : arch.listarTodos()) System.out.println(a);

            arch.eliminarPorNombre("Pan");
            System.out.println("\nDESPUÉS DE ELIMINAR 'Pan':");
            for (Alimento a : arch.listarTodos()) System.out.println(a);

            System.out.println("\nAlimentos que caducaron antes de 2024-01-01:");
            for (Alimento a : arch.caducaronAntesDe("2024-01-01")) System.out.println(a);

            arch.eliminarCantidadCero();
            System.out.println("\nDespués de eliminar los de cantidad 0:");
            for (Alimento a : arch.listarTodos()) System.out.println(a);

            System.out.println("\nAlimentos vencidos hasta hoy:");
            for (Alimento a : arch.vencidos()) System.out.println(a);

            Alimento mayor = arch.mayorCantidad();
            System.out.println("\nAlimento con mayor cantidad en el refri:");
            System.out.println(mayor);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}