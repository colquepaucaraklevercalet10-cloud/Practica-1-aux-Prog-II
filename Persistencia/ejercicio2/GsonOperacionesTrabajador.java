package ejercicio2;

import java.io.FileWriter;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

import com.google.gson.Gson;

public class GsonOperacionesTrabajador {

    public static List<Trabajador> leer() {
        try {
            Gson gson = new Gson();
            Reader reader = Files.newBufferedReader(Paths.get("trabajadores.json"));
            Trabajador[] arr = gson.fromJson(reader, Trabajador[].class);
            reader.close();
            return new ArrayList<>(Arrays.asList(arr));
        } catch (Exception e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }

    public static void guardar(List<Trabajador> lista) {
        try {
            Gson gson = new Gson();
            String cadena = gson.toJson(lista);
            FileWriter writer = new FileWriter("trabajadores.json");
            writer.write(cadena);
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void crearArchivo() {
        guardar(new ArrayList<>());
    }

    public static void guardarTrabajador(Trabajador t) {
        List<Trabajador> lista = leer();
        lista.add(t);
        guardar(lista);
    }

    public static void aumentarSalario(int a, Trabajador t) {
        t.salario += a;
    }

    public static Trabajador mayorSalario(List<Trabajador> lista) {
        return lista.stream()
                .max(Comparator.comparingDouble(x -> x.salario))
                .orElse(null);
    }

    public static void ordenarPorSalario(List<Trabajador> lista) {
        lista.sort(Comparator.comparingDouble(x -> x.salario));
    }

    public static void main(String[] args) {

        List<Trabajador> lista = leer();

        System.out.println("\n===== LISTA ORIGINAL =====");
        for (Trabajador t : lista) {
            System.out.println(t.nombre + "  " + t.carnet + "  " + t.salario);
        }

        Trabajador mayor = mayorSalario(lista);
        System.out.println("\n===== TRABAJADOR CON MAYOR SALARIO =====");
        System.out.println(mayor.nombre + " gana " + mayor.salario);

        Trabajador menor = lista.stream()
                .min(Comparator.comparingDouble(x -> x.salario))
                .orElse(null);

        System.out.println("\n===== AUMENTANDO SALARIO =====");
        System.out.println("Antes: " + menor.nombre + " gana " + menor.salario);

        aumentarSalario(300, menor);

        System.out.println("Después: " + menor.nombre + " gana " + menor.salario);

        ordenarPorSalario(lista);

        System.out.println("\n===== ORDENADOS POR SALARIO =====");
        for (Trabajador t : lista) {
            System.out.println(t.nombre + "  " + t.salario);
        }

        guardar(lista);
        System.out.println("\n===== CAMBIOS GUARDADOS EN JSON =====");
    }
}